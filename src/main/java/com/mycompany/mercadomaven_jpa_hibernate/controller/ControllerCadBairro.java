package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.service.BairroService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaBairro;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraBairro;

public class ControllerCadBairro implements ActionListener {

    CadastraBairro telaCadBairro;
    public static int codigo;
    ControllerCadEndereco controllerCadEndereco;

    public ControllerCadBairro(CadastraBairro parTelaCadBairro) {

        this.telaCadBairro = parTelaCadBairro;
        this.controllerCadEndereco = null;

        telaCadBairro.getjButtonNovo().addActionListener(this);
        telaCadBairro.getjButtonCancela().addActionListener(this);
        telaCadBairro.getjButtonGravar().addActionListener(this);
        telaCadBairro.getjButtonBuscar().addActionListener(this);
        telaCadBairro.getjButtonSair().addActionListener(this);
        telaCadBairro.getjTextFieldID().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadBairro.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadBairro.getjPanelDados());

    }

    public ControllerCadBairro(CadastraBairro parTelaCadBairro, ControllerCadEndereco parControllerCadEndereco) {

        this.telaCadBairro = parTelaCadBairro;
        this.controllerCadEndereco = parControllerCadEndereco;

        telaCadBairro.getjButtonNovo().addActionListener(this);
        telaCadBairro.getjButtonCancela().addActionListener(this);
        telaCadBairro.getjButtonGravar().addActionListener(this);
        telaCadBairro.getjButtonBuscar().addActionListener(this);
        telaCadBairro.getjButtonSair().addActionListener(this);
        telaCadBairro.getjTextFieldID().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadBairro.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadBairro.getjPanelDados());

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadBairro.getjButtonNovo()) {
            
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadBairro.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadBairro.getjPanelDados());
            telaCadBairro.getjTextFieldID().setEnabled(false);
            telaCadBairro.getjTextFieldDescricao().requestFocus();

        } else if (acao.getSource() == telaCadBairro.getjButtonCancela()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadBairro.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadBairro.getjPanelDados());

        } else if (acao.getSource() == telaCadBairro.getjButtonGravar()) {

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadBairro.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Atributo 'Descrição' é obrigatório!!");

            } else {

                Bairro bairro = new Bairro();

                bairro.setDescricao(telaCadBairro.getjTextFieldDescricao().getText());

                if (BairroService.buscar(telaCadBairro.getjTextFieldDescricao().getText()) != null) {

                    JOptionPane.showMessageDialog(null, "Bairro já cadastrado!");

                } else {

                    if (this.telaCadBairro.getjTextFieldID().getText().equalsIgnoreCase("")) {

                        BairroService.criar(bairro);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadBairro.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadBairro.getjPanelDados());

                    } else {

                        bairro.setId(Integer.parseInt(telaCadBairro.getjTextFieldID().getText()));

                        BairroService.atualizar(bairro);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadBairro.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadBairro.getjPanelDados());

                    }

                    telaCadBairro.getjTextFieldID().setEnabled(true);

                }

            }

        } else if (acao.getSource() == telaCadBairro.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaBairro buscaBairro = new BuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);
            buscaBairro.setVisible(true);

            if (this.codigo != 0) {

                Bairro bairro = BairroService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadBairro.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadBairro.getjPanelDados());
                telaCadBairro.getjTextFieldID().setText(bairro.getId() + "");
                telaCadBairro.getjTextFieldDescricao().setText(bairro.getDescricao());

            } else {

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadBairro.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadBairro.getjButtonSair()) {

            if (controllerCadEndereco != null) {

                controllerCadEndereco.attComboBox();

            }

            telaCadBairro.dispose();

        } else if (acao.getSource() == telaCadBairro.getjTextFieldID()) {


            if (!telaCadBairro.getjTextFieldID().getText().trim().equalsIgnoreCase("")) {

                Bairro bairro = BairroService.buscar(Integer.parseInt(telaCadBairro.getjTextFieldID().getText()));

                if (bairro == null) {

                    JOptionPane.showMessageDialog(null, "Bairro nº " + telaCadBairro.getjTextFieldID().getText() + " não existe!");
                    telaCadBairro.getjTextFieldID().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadBairro.getjPanelDados());

                } else {

                    this.telaCadBairro.getjTextFieldDescricao().setText(bairro.getDescricao());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadBairro.getjPanelBotoes());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadBairro.getjPanelDados());

                }

            }

        }

    }

}
