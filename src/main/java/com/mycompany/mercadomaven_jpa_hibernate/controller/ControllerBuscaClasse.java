package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Classe;
import com.mycompany.mercadomaven_jpa_hibernate.service.ClasseService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaClasse;

public class ControllerBuscaClasse implements ActionListener {

    BuscaClasse telaBuscaClasse;

    public ControllerBuscaClasse(BuscaClasse parTelaBuscaClasse) {

        this.telaBuscaClasse = parTelaBuscaClasse;

        telaBuscaClasse.getjButtonCarregar().addActionListener(this);
        telaBuscaClasse.getjButtonSair().addActionListener(this);

        //carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaClasse.getjTableBusca().getModel();


        for (Classe objetoAtualDaLista : ClasseService.buscar()) {

            tabela.addRow(new Object[]{objetoAtualDaLista.getId(),
                objetoAtualDaLista.getDescricao()});

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaClasse.getjButtonCarregar()) {

            if (this.telaBuscaClasse.getjTableBusca().getValueAt(this.telaBuscaClasse.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadClasse.codigo = (int) this.telaBuscaClasse.getjTableBusca().getValueAt(this.telaBuscaClasse.getjTableBusca().getSelectedRow(), 0);
                telaBuscaClasse.dispose();
            }

        } else if (acao.getSource() == telaBuscaClasse.getjButtonSair()) {

            telaBuscaClasse.dispose();

        }

    }

}
