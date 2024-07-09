package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Fornecedor;
import com.mycompany.mercadomaven_jpa_hibernate.service.FornecedorService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener {

    BuscaFornecedor telaBuscaFornecedor;

    public ControllerBuscaFornecedor(BuscaFornecedor parTelaBuscaFornecedor) {

        this.telaBuscaFornecedor = parTelaBuscaFornecedor;

        telaBuscaFornecedor.getjButtonCarregar().addActionListener(this);
        telaBuscaFornecedor.getjButtonSair().addActionListener(this);
        telaBuscaFornecedor.getjButtonTrocaStatus().addActionListener(this);
        telaBuscaFornecedor.getjComboBoxAtivos().addActionListener(this);

        this.attTable();

    }

    public void attTable() {

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFornecedor.getjTableBusca().getModel();
        
        tabela.setRowCount(0);

        for (Fornecedor fornecedorAtual : FornecedorService.buscar()) {

            if (telaBuscaFornecedor.getjComboBoxAtivos().getSelectedIndex() > 0) {

                char status = telaBuscaFornecedor.getjComboBoxAtivos().getSelectedItem().toString().charAt(0);

                if (fornecedorAtual.getStatus().equals(status + "")) {

                    tabela.addRow(new Object[]{
                        fornecedorAtual.getId(),
                        fornecedorAtual.getNome(),
                        fornecedorAtual.getEmail(),
                        fornecedorAtual.getContato(),
                        fornecedorAtual.getStatus()});
                }

            } else {
                
                tabela.addRow(new Object[]{
                        fornecedorAtual.getId(),
                        fornecedorAtual.getNome(),
                        fornecedorAtual.getEmail(),
                        fornecedorAtual.getContato(),
                        fornecedorAtual.getStatus()});
                
            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaFornecedor.getjButtonCarregar()) {

            if (this.telaBuscaFornecedor.getjTableBusca().getValueAt(this.telaBuscaFornecedor.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadFornecedor.codigo = (int) this.telaBuscaFornecedor.getjTableBusca().getValueAt(this.telaBuscaFornecedor.getjTableBusca().getSelectedRow(), 0);
                telaBuscaFornecedor.dispose();
            }

        } else if (acao.getSource() == telaBuscaFornecedor.getjButtonSair()) {

            telaBuscaFornecedor.dispose();

        } else if (acao.getSource() == telaBuscaFornecedor.getjButtonTrocaStatus()) {

            Fornecedor fornecedor = FornecedorService.buscar((int) this.telaBuscaFornecedor.getjTableBusca().getValueAt(this.telaBuscaFornecedor.getjTableBusca().getSelectedRow(), 0));

            if (fornecedor.getStatus().equals("I")) {

                fornecedor.setStatus("A");

            } else {

                fornecedor.setStatus("I");

            }

            FornecedorService.atualizar(fornecedor);
            this.attTable();

        } else if (acao.getSource() == telaBuscaFornecedor.getjComboBoxAtivos()) {

            this.attTable();

        }

    }

}
