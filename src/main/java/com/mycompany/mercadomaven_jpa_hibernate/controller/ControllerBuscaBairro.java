package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.service.BairroService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaBairro;

public class ControllerBuscaBairro implements ActionListener {

    BuscaBairro telaBuscaBairro;

    public ControllerBuscaBairro(BuscaBairro parTelaBuscaBairro) {

        this.telaBuscaBairro = parTelaBuscaBairro;

        telaBuscaBairro.getjButtonCarregar().addActionListener(this);
        telaBuscaBairro.getjButtonSair().addActionListener(this);

        // Carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaBairro.getjTableBusca().getModel();

        for (Bairro objetoAtualDaLista : BairroService.buscar()) {

            tabela.addRow(new Object[]{
                objetoAtualDaLista.getId(),
                objetoAtualDaLista.getDescricao()});

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaBairro.getjButtonCarregar()) {

            if (this.telaBuscaBairro.getjTableBusca().getValueAt(this.telaBuscaBairro.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadBairro.codigo = (int) this.telaBuscaBairro.getjTableBusca().getValueAt(this.telaBuscaBairro.getjTableBusca().getSelectedRow(), 0);
                telaBuscaBairro.dispose();
            }

        } else if (acao.getSource() == telaBuscaBairro.getjButtonSair()) {

            telaBuscaBairro.dispose();

        }
        
    }

}
