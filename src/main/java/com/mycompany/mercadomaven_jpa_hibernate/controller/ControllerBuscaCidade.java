package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import com.mycompany.mercadomaven_jpa_hibernate.service.CidadeService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaCidade;

public class ControllerBuscaCidade implements ActionListener {

    BuscaCidade telaBuscaCidade;

    public ControllerBuscaCidade(BuscaCidade parTelaBuscaCidade) {

        this.telaBuscaCidade = parTelaBuscaCidade;

        telaBuscaCidade.getjButtonCarregar().addActionListener(this);
        telaBuscaCidade.getjButtonSair().addActionListener(this);

        //carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCidade.getjTableBusca().getModel();


        for (Cidade objetoAtualDaLista : CidadeService.buscar()) {

            tabela.addRow(new Object[]{objetoAtualDaLista.getId(),
                objetoAtualDaLista.getDescricao()});

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaCidade.getjButtonCarregar()) {

            if (this.telaBuscaCidade.getjTableBusca().getValueAt(this.telaBuscaCidade.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadCidade.codigo = (int) this.telaBuscaCidade.getjTableBusca().getValueAt(this.telaBuscaCidade.getjTableBusca().getSelectedRow(), 0);
                telaBuscaCidade.dispose();
            }

        } else if (acao.getSource() == telaBuscaCidade.getjButtonSair()) {

            telaBuscaCidade.dispose();

        }

    }

}
