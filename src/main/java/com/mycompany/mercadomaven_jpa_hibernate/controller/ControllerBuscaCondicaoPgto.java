package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.CondicaoPgto;
import com.mycompany.mercadomaven_jpa_hibernate.service.CondicaoPgtoService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaCondicaoPgto;

public class ControllerBuscaCondicaoPgto implements ActionListener {

    BuscaCondicaoPgto telaBuscaCondicaoPgto;

    public ControllerBuscaCondicaoPgto(BuscaCondicaoPgto parTelaBuscaCondicaoPagto) {

        this.telaBuscaCondicaoPgto = parTelaBuscaCondicaoPagto;

        telaBuscaCondicaoPgto.getjButtonCarregar().addActionListener(this);
        telaBuscaCondicaoPgto.getjButtonSair().addActionListener(this);
        telaBuscaCondicaoPgto.getjButtonTrocaStatus().addActionListener(this);
        telaBuscaCondicaoPgto.getjComboBoxAtivos().addActionListener(this);

        this.attTable();

    }

    public void attTable() {

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCondicaoPgto.getjTableBuscaCond().getModel();

        tabela.setRowCount(0);

        for (CondicaoPgto condicaoAtual : CondicaoPgtoService.buscar()) {

            if (telaBuscaCondicaoPgto.getjComboBoxAtivos().getSelectedIndex() > 0) {

                char status = telaBuscaCondicaoPgto.getjComboBoxAtivos().getSelectedItem().toString().charAt(0);

                if (condicaoAtual.getStatus().equals(status + ""))  {

                    tabela.addRow(new Object[]{
                        condicaoAtual.getId(),
                        condicaoAtual.getDescricaoCondicao(),
                        condicaoAtual.getNumeroParcelas(),
                        condicaoAtual.getDiasPrimeiraParcela(),
                        condicaoAtual.getDiasEntreParcela(),
                        condicaoAtual.getStatus()});

                }

            } else {
                
                tabela.addRow(new Object[]{
                        condicaoAtual.getId(),
                        condicaoAtual.getDescricaoCondicao(),
                        condicaoAtual.getNumeroParcelas(),
                        condicaoAtual.getDiasPrimeiraParcela(),
                        condicaoAtual.getDiasEntreParcela(),
                        condicaoAtual.getStatus()});
                
            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaCondicaoPgto.getjButtonCarregar()) {

            if (this.telaBuscaCondicaoPgto.getjTableBuscaCond().getValueAt(this.telaBuscaCondicaoPgto.getjTableBuscaCond().getSelectedRow(), 0) != null) {
                ControllerCadCondicaoPgto.codigo = (int) this.telaBuscaCondicaoPgto.getjTableBuscaCond().getValueAt(this.telaBuscaCondicaoPgto.getjTableBuscaCond().getSelectedRow(), 0);
                telaBuscaCondicaoPgto.dispose();
            }

        } else if (acao.getSource() == telaBuscaCondicaoPgto.getjButtonSair()) {

            telaBuscaCondicaoPgto.dispose();

        } else if (acao.getSource() == telaBuscaCondicaoPgto.getjButtonTrocaStatus()) {

            CondicaoPgto condicao = CondicaoPgtoService.buscar((int) this.telaBuscaCondicaoPgto.getjTableBuscaCond().getValueAt(this.telaBuscaCondicaoPgto.getjTableBuscaCond().getSelectedRow(), 0));

            if (condicao.getStatus().equals("I")) {

                condicao.setStatus("A");

            } else {

                condicao.setStatus("I");

            }

            CondicaoPgtoService.atualizar(condicao);
            
            this.attTable();

        } else if (acao.getSource() == telaBuscaCondicaoPgto.getjComboBoxAtivos()) {

            this.attTable();

        }

    }

}
