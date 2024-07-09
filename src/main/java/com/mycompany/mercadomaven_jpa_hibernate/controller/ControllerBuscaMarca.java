package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Marca;
import com.mycompany.mercadomaven_jpa_hibernate.service.MarcaService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaMarca;

public class ControllerBuscaMarca implements ActionListener {

    BuscaMarca telaBuscaMarca;

    public ControllerBuscaMarca(BuscaMarca parTelaBuscaMarca) {

        this.telaBuscaMarca = parTelaBuscaMarca;

        telaBuscaMarca.getjButtonCarregar().addActionListener(this);
        telaBuscaMarca.getjButtonSair().addActionListener(this);

        //carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaMarca.getjTableBusca().getModel();

        for (Marca objetoAtualDaLista : MarcaService.buscar()) {

            tabela.addRow(new Object[]{
                objetoAtualDaLista.getId(),
                objetoAtualDaLista.getDescricao()});

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaMarca.getjButtonCarregar()) {

            if (this.telaBuscaMarca.getjTableBusca().getValueAt(this.telaBuscaMarca.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadMarca.codigo = (int) this.telaBuscaMarca.getjTableBusca().getValueAt(this.telaBuscaMarca.getjTableBusca().getSelectedRow(), 0);
                telaBuscaMarca.dispose();
            }

        } else if (acao.getSource() == telaBuscaMarca.getjButtonSair()) {

            telaBuscaMarca.dispose();

        } 

    }
    
}
