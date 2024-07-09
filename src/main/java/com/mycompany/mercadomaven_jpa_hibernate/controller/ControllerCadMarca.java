package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Marca;
import com.mycompany.mercadomaven_jpa_hibernate.service.MarcaService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaMarca;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraMarca;

public class ControllerCadMarca implements ActionListener {

    CadastraMarca telaCadMarca;
    public static int codigo;
    ControllerCadProduto controllerCadProduto;

    public ControllerCadMarca(CadastraMarca parTelaCadMarca) {

        this.telaCadMarca = parTelaCadMarca;
        this.controllerCadProduto = null;

        telaCadMarca.getjButtonNovo().addActionListener(this);
        telaCadMarca.getjButtonCancela().addActionListener(this);
        telaCadMarca.getjButtonGravar().addActionListener(this);
        telaCadMarca.getjButtonBuscar().addActionListener(this);
        telaCadMarca.getjButtonSair().addActionListener(this);
        telaCadMarca.getjTextFieldID().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadMarca.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadMarca.getjPanelDados());
    }

    public ControllerCadMarca(CadastraMarca parTelaCadMarca, ControllerCadProduto parControllerCadProduto) {

        this.telaCadMarca = parTelaCadMarca;
        this.controllerCadProduto = parControllerCadProduto;

        telaCadMarca.getjButtonNovo().addActionListener(this);
        telaCadMarca.getjButtonCancela().addActionListener(this);
        telaCadMarca.getjButtonGravar().addActionListener(this);
        telaCadMarca.getjButtonBuscar().addActionListener(this);
        telaCadMarca.getjButtonSair().addActionListener(this);
        telaCadMarca.getjTextFieldID().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadMarca.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadMarca.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadMarca.getjButtonNovo()) {
            //ações do botão novo
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadMarca.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadMarca.getjPanelDados());
            telaCadMarca.getjTextFieldDescricao().requestFocus();

        } else if (acao.getSource() == telaCadMarca.getjButtonCancela()) {
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadMarca.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadMarca.getjPanelDados());

        } else if (acao.getSource() == telaCadMarca.getjButtonGravar()) {

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadMarca.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Atributo 'Descrição' é obrigatório!");

            } else {

                Marca marca = new Marca();

                marca.setDescricao(telaCadMarca.getjTextFieldDescricao().getText());

                if (this.telaCadMarca.getjTextFieldID().getText().equalsIgnoreCase("")) {

                    if (MarcaService.buscar(telaCadMarca.getjTextFieldDescricao().getText()) != null) {

                        JOptionPane.showMessageDialog(null, "Marca já cadastrada!");

                    } else {

                        MarcaService.criar(marca);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadMarca.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadMarca.getjPanelDados());

                    }

                } else {

                    marca.setId(Integer.parseInt(telaCadMarca.getjTextFieldID().getText()));
                    MarcaService.atualizar(marca);

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadMarca.getjPanelBotoes());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadMarca.getjPanelDados());

                }

            }

        } else if (acao.getSource() == telaCadMarca.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaMarca buscaMarca = new BuscaMarca(null, true);
            ControllerBuscaMarca controllerBuscaMarca = new ControllerBuscaMarca(buscaMarca);
            buscaMarca.setVisible(true);

            if (this.codigo != 0) {
                
                Marca marca = MarcaService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadMarca.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadMarca.getjPanelDados());
                telaCadMarca.getjTextFieldID().setText(marca.getId() + "");
                telaCadMarca.getjTextFieldDescricao().setText(marca.getDescricao());

            } else {

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadMarca.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadMarca.getjButtonSair()) {

            if (this.controllerCadProduto != null) {

                controllerCadProduto.attComboBox();

            }

            telaCadMarca.dispose();

        } else if (acao.getSource() == telaCadMarca.getjTextFieldID()) {

            if (!telaCadMarca.getjTextFieldID().getText().equalsIgnoreCase("")) {

                Marca marca = MarcaService.buscar(Integer.parseInt(telaCadMarca.getjTextFieldID().getText()));

                if (marca == null) {

                    JOptionPane.showMessageDialog(null, "Marca nº " + telaCadMarca.getjTextFieldID().getText() + " não existe!");

                    telaCadMarca.getjTextFieldID().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadMarca.getjPanelDados());

                } else {

                    telaCadMarca.getjTextFieldDescricao().setText(marca.getDescricao());

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadMarca.getjPanelDados());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadMarca.getjPanelBotoes());

                }

            }

        }

    }

}
