package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Colaborador;
import com.mycompany.mercadomaven_jpa_hibernate.service.ColaboradorService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaColaborador;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ControllerBuscaColaborador implements ActionListener {

    BuscaColaborador telaBuscaColaborador;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo.");

    public ControllerBuscaColaborador(BuscaColaborador parTelaBuscaColaborador) {

        this.telaBuscaColaborador = parTelaBuscaColaborador;

        telaBuscaColaborador.getjButtonCarregar().addActionListener(this);
        telaBuscaColaborador.getjButtonSair().addActionListener(this);
        telaBuscaColaborador.getjButtonTrocaStatus().addActionListener(this);
        telaBuscaColaborador.getjComboBoxAtivos().addActionListener(this);

        attTable();

    }

    public void attTable() {

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaColaborador.getjTableBusca().getModel();

        tabela.setRowCount(0);

        for (Colaborador objetoAtualDaLista : ColaboradorService.buscar()) {

            if (telaBuscaColaborador.getjComboBoxAtivos().getSelectedIndex() != 0) {

                char status = telaBuscaColaborador.getjComboBoxAtivos().getSelectedItem().toString().charAt(0);

                if (objetoAtualDaLista.getStatus().equals(status + "")) {

                    Date bancoCadastro = objetoAtualDaLista.getDtCadastro();
                    dateFormat.setTimeZone(timeZone);
                    String dataFormatada = dateFormat.format(bancoCadastro);

                    tabela.addRow(new Object[]{
                        objetoAtualDaLista.getId(),
                        objetoAtualDaLista.getNome(),
                        objetoAtualDaLista.getLogin(),
                        objetoAtualDaLista.getEndereco().getCep(),
                        objetoAtualDaLista.dateToString(dataFormatada),
                        objetoAtualDaLista.getStatus()});
                }

            } else {

                Date bancoCadastro = objetoAtualDaLista.getDtCadastro();
                dateFormat.setTimeZone(timeZone);
                String dataFormatada = dateFormat.format(bancoCadastro);

                tabela.addRow(new Object[]{
                    objetoAtualDaLista.getId(),
                    objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getLogin(),
                    objetoAtualDaLista.getEndereco().getCep(),
                    objetoAtualDaLista.dateToString(dataFormatada),
                    objetoAtualDaLista.getStatus()});

            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaColaborador.getjButtonCarregar()) {

            if (this.telaBuscaColaborador.getjTableBusca().getValueAt(this.telaBuscaColaborador.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadColaborador.codigo = (int) this.telaBuscaColaborador.getjTableBusca().getValueAt(this.telaBuscaColaborador.getjTableBusca().getSelectedRow(), 0);
                telaBuscaColaborador.dispose();
            }

        } else if (acao.getSource() == telaBuscaColaborador.getjButtonSair()) {

            telaBuscaColaborador.dispose();

        } else if (acao.getSource() == telaBuscaColaborador.getjButtonTrocaStatus()) {

            Colaborador colaborador = ColaboradorService.buscar((int) this.telaBuscaColaborador.getjTableBusca().getValueAt(this.telaBuscaColaborador.getjTableBusca().getSelectedRow(), 0));

            if (colaborador.getStatus().equals("I")) {

                colaborador.setStatus("A");

            } else {

                colaborador.setStatus("I");

            }

            ColaboradorService.atualizar(colaborador);
            this.attTable();

        } else if (acao.getSource() == telaBuscaColaborador.getjComboBoxAtivos()) {

            this.attTable();

        }

    }

}
