package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Produto;
import com.mycompany.mercadomaven_jpa_hibernate.service.ProdutoService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaProduto;

public class ControllerBuscaProduto implements ActionListener {

    BuscaProduto telaBuscaProduto;

    public ControllerBuscaProduto(BuscaProduto parTelaBuscaProduto) {

        this.telaBuscaProduto = parTelaBuscaProduto;

        telaBuscaProduto.getjButtonCarregar().addActionListener(this);
        telaBuscaProduto.getjButtonSair().addActionListener(this);
        telaBuscaProduto.getjButtonTrocaStatus().addActionListener(this);
        telaBuscaProduto.getjComboBoxAtivos().addActionListener(this);

        this.attTable();

    }

    public void attTable() {

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaProduto.getjTableBusca().getModel();
        
        tabela.setRowCount(0);

        for (Produto produtoAtual : ProdutoService.buscar()) {

            if (telaBuscaProduto.getjComboBoxAtivos().getSelectedIndex() > 0) {

                char status = telaBuscaProduto.getjComboBoxAtivos().getSelectedItem().toString().charAt(0);

                if (produtoAtual.getStatus().equals(status + "")) {

                    tabela.addRow(new Object[]{
                        produtoAtual.getId(),
                        produtoAtual.getDescricao(),
                        produtoAtual.getMarca().getDescricao(),
                        produtoAtual.getClasse().getDescricao(),
                        produtoAtual.getUndCompra(),
                        produtoAtual.getUndVenda(),
                        produtoAtual.getStatus()});
                }

            } else {

                tabela.addRow(new Object[]{
                    produtoAtual.getId(),
                    produtoAtual.getDescricao(),
                    produtoAtual.getMarca().getDescricao(),
                    produtoAtual.getClasse().getDescricao(),
                    produtoAtual.getUndCompra(),
                    produtoAtual.getUndVenda(),
                    produtoAtual.getStatus()});

            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaBuscaProduto.getjButtonCarregar()) {

            if (this.telaBuscaProduto.getjTableBusca().getValueAt(this.telaBuscaProduto.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadProduto.codigo = (int) this.telaBuscaProduto.getjTableBusca().getValueAt(this.telaBuscaProduto.getjTableBusca().getSelectedRow(), 0);
                telaBuscaProduto.dispose();
            }

        } else if (acao.getSource() == telaBuscaProduto.getjButtonSair()) {

            telaBuscaProduto.dispose();

        } else if (acao.getSource() == telaBuscaProduto.getjButtonTrocaStatus()) {

            Produto produto = ProdutoService.buscar((int) this.telaBuscaProduto.getjTableBusca().getValueAt(this.telaBuscaProduto.getjTableBusca().getSelectedRow(), 0));

            if (produto.getStatus().equals("I")) {

                produto.setStatus("A");

            } else {

                produto.setStatus("I");

            }

            ProdutoService.atualizar(produto);
            this.attTable();

        } else if (acao.getSource() == telaBuscaProduto.getjComboBoxAtivos()) {

            this.attTable();

        }

    }

}
