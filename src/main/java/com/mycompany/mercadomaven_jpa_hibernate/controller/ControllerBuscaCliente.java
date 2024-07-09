package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cliente;
import com.mycompany.mercadomaven_jpa_hibernate.service.ClienteService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaCliente;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ControllerBuscaCliente implements ActionListener {

    BuscaCliente telaBuscaCliente;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo.");

    public ControllerBuscaCliente(BuscaCliente parTelaBuscaCliente) {

        this.telaBuscaCliente = parTelaBuscaCliente;

        telaBuscaCliente.getjButtonCarregar().addActionListener(this);
        telaBuscaCliente.getjButtonSair().addActionListener(this);
        telaBuscaCliente.getjButtonTrocaStatus().addActionListener(this);
        telaBuscaCliente.getjComboBoxAtivos().addActionListener(this);

        attTable();

    }

    public void attTable() {

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCliente.getjTableBusca().getModel();

        tabela.setRowCount(0);

        for (Cliente objetoAtualDaLista : ClienteService.buscar()) {

            if (telaBuscaCliente.getjComboBoxAtivos().getSelectedIndex() != 0) {

                char status = telaBuscaCliente.getjComboBoxAtivos().getSelectedItem().toString().charAt(0);

                if (objetoAtualDaLista.getStatus().equals(status + "")) {

                    Date bancoNascimento = objetoAtualDaLista.getDtNascimento();
                    dateFormat.setTimeZone(timeZone);
                    String dataFormatada = dateFormat.format(bancoNascimento);

                    tabela.addRow(new Object[]{
                        objetoAtualDaLista.getId(),
                        objetoAtualDaLista.getNome(),
                        objetoAtualDaLista.getSexo(),
                        objetoAtualDaLista.getEndereco().getCep(),
                        objetoAtualDaLista.dateToString(dataFormatada),
                        objetoAtualDaLista.getStatus()});

                }

            } else {

                Date bancoNascimento = objetoAtualDaLista.getDtNascimento();
                dateFormat.setTimeZone(timeZone);
                String dataFormatada = dateFormat.format(bancoNascimento);

                tabela.addRow(new Object[]{
                    objetoAtualDaLista.getId(),
                    objetoAtualDaLista.getNome(),
                    objetoAtualDaLista.getSexo(),
                    objetoAtualDaLista.getEndereco().getCep(),
                    objetoAtualDaLista.dateToString(dataFormatada),
                    objetoAtualDaLista.getStatus()});

            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaCliente.getjButtonCarregar()) {

            if (this.telaBuscaCliente.getjTableBusca().getValueAt(this.telaBuscaCliente.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadCliente.codigo = (int) this.telaBuscaCliente.getjTableBusca().getValueAt(this.telaBuscaCliente.getjTableBusca().getSelectedRow(), 0);
                telaBuscaCliente.dispose();
            }

        } else if (acao.getSource() == telaBuscaCliente.getjButtonSair()) {

            telaBuscaCliente.dispose();

        } else if (acao.getSource() == telaBuscaCliente.getjButtonTrocaStatus()) {

            Cliente cliente = ClienteService.buscar((int) this.telaBuscaCliente.getjTableBusca().getValueAt(this.telaBuscaCliente.getjTableBusca().getSelectedRow(), 0));

            if (cliente.getStatus().equals("I")) {

                cliente.setStatus("A");

            } else {

                cliente.setStatus("I");

            }

            ClienteService.atualizar(cliente);
            this.attTable();

        } else if (acao.getSource() == telaBuscaCliente.getjComboBoxAtivos()) {

            this.attTable();

        }

    }

}
