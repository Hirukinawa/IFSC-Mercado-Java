package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Endereco;
import com.mycompany.mercadomaven_jpa_hibernate.service.EnderecoService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaEndereco;

public class ControllerBuscaEndereco implements ActionListener {

    BuscaEndereco telaBuscaEndereco;

    public ControllerBuscaEndereco(BuscaEndereco parTelaBuscaEndereco) {

        this.telaBuscaEndereco = parTelaBuscaEndereco;

        telaBuscaEndereco.getjButtonCarregar().addActionListener(this);
        telaBuscaEndereco.getjButtonSair().addActionListener(this);
        telaBuscaEndereco.getjButtonTrocaStatus().addActionListener(this);
        telaBuscaEndereco.getjComboBoxAtivos().addActionListener(this);

        attTable();

    }

    public void attTable() {

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaEndereco.getjTableBusca().getModel();

        tabela.setRowCount(0);

        for (Endereco objetoAtualDaLista : EnderecoService.buscar()) {

            if (telaBuscaEndereco.getjComboBoxAtivos().getSelectedIndex() != 0) {

                char status = telaBuscaEndereco.getjComboBoxAtivos().getSelectedItem().toString().charAt(0);

                if (objetoAtualDaLista.getStatus().equals(status + "")) {
                    tabela.addRow(new Object[]{
                        objetoAtualDaLista.getId(),
                        objetoAtualDaLista.getLogradouro(),
                        objetoAtualDaLista.getCep(),
                        objetoAtualDaLista.getBairro().getDescricao(),
                        objetoAtualDaLista.getCidade().getDescricao(),
                        objetoAtualDaLista.getStatus()});
                }

            } else {

                tabela.addRow(new Object[]{
                    objetoAtualDaLista.getId(),
                    objetoAtualDaLista.getLogradouro(),
                    objetoAtualDaLista.getCep(),
                    objetoAtualDaLista.getBairro().getDescricao(),
                    objetoAtualDaLista.getCidade().getDescricao(),
                    objetoAtualDaLista.getStatus()});

            }
            
        }
}

@Override
public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaBuscaEndereco.getjButtonCarregar()) {

            if (this.telaBuscaEndereco.getjTableBusca().getValueAt(this.telaBuscaEndereco.getjTableBusca().getSelectedRow(), 0) != null) {
                ControllerCadEndereco.codigo = (int) this.telaBuscaEndereco.getjTableBusca().getValueAt(this.telaBuscaEndereco.getjTableBusca().getSelectedRow(), 0);
                telaBuscaEndereco.dispose();
            }

        } else if (acao.getSource() == telaBuscaEndereco.getjButtonSair()) {

            telaBuscaEndereco.dispose();

        } else if (acao.getSource() == telaBuscaEndereco.getjButtonTrocaStatus()) {

            Endereco endereco = EnderecoService.buscar((int) this.telaBuscaEndereco.getjTableBusca().getValueAt(this.telaBuscaEndereco.getjTableBusca().getSelectedRow(), 0));

            if (endereco.getStatus().equals("I")) {

                endereco.setStatus("A");

            } else {

                /*if (ClienteService.verificarEndereco(endereco.getId()) > 0 || ColaboradorService.verificarEndereco(endereco.getId()) > 0 || FornecedorService.verificarEndereco(endereco.getId()) > 0) {

                    JOptionPane.showMessageDialog(null, "Endereço já está sendo utilizado em outros cadastros!!");

                } else {*/

                    endereco.setStatus("I");

                //}

            }

            EnderecoService.atualizar(endereco);
            this.attTable();

        } else if (acao.getSource() == telaBuscaEndereco.getjComboBoxAtivos()) {

            this.attTable();

        }

    }

}
