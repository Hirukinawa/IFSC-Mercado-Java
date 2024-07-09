package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Classe;
import com.mycompany.mercadomaven_jpa_hibernate.service.ClasseService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaClasse;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraClasse;

public class ControllerCadClasse implements ActionListener {

    CadastraClasse telaCadClasse;
    public static int codigo;
    ControllerCadProduto controllerCadProduto;

    public ControllerCadClasse(CadastraClasse parTelaCadClasse) {

        this.telaCadClasse = parTelaCadClasse;
        this.controllerCadProduto = null;

        telaCadClasse.getjButtonNovo().addActionListener(this);
        telaCadClasse.getjButtonCancela().addActionListener(this);
        telaCadClasse.getjButtonGravar().addActionListener(this);
        telaCadClasse.getjButtonBuscar().addActionListener(this);
        telaCadClasse.getjButtonSair().addActionListener(this);
        telaCadClasse.getjTextFieldID().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadClasse.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadClasse.getjPanelDados());
    }

    public ControllerCadClasse(CadastraClasse parTelaCadClasse, ControllerCadProduto parControllerCadProduto) {

        this.telaCadClasse = parTelaCadClasse;
        this.controllerCadProduto = parControllerCadProduto;

        telaCadClasse.getjButtonNovo().addActionListener(this);
        telaCadClasse.getjButtonCancela().addActionListener(this);
        telaCadClasse.getjButtonGravar().addActionListener(this);
        telaCadClasse.getjButtonBuscar().addActionListener(this);
        telaCadClasse.getjButtonSair().addActionListener(this);
        telaCadClasse.getjTextFieldID().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadClasse.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadClasse.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadClasse.getjButtonNovo()) {
            //ações do botão novo
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadClasse.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadClasse.getjPanelDados());
            telaCadClasse.getjTextFieldDescricao().requestFocus();

        } else if (acao.getSource() == telaCadClasse.getjButtonCancela()) {
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadClasse.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadClasse.getjPanelDados());

        } else if (acao.getSource() == telaCadClasse.getjButtonGravar()) {
            //após a validação e a persistencia de dados
            //dispara a formatação da parte gráfica

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadClasse.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Atributo 'Descrição' é obrigatório!!");

            } else {

                Classe classe = new Classe();
                

                classe.setDescricao(telaCadClasse.getjTextFieldDescricao().getText());

                if (ClasseService.buscar(classe.getDescricao()) != null) {

                    JOptionPane.showMessageDialog(null, "Classe já cadastrada!");

                } else {

                    if (this.telaCadClasse.getjTextFieldID().getText().equalsIgnoreCase("")) {

                        ClasseService.criar(classe);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadClasse.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadClasse.getjPanelDados());

                    } else {

                        classe.setId(Integer.parseInt(telaCadClasse.getjTextFieldID().getText()));
                        ClasseService.atualizar(classe);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadClasse.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadClasse.getjPanelDados());
                    }

                }

            }

        } else if (acao.getSource() == telaCadClasse.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaClasse buscaClasse = new BuscaClasse(null, true);
            ControllerBuscaClasse controllerBuscaClasse = new ControllerBuscaClasse(buscaClasse);
            buscaClasse.setVisible(true);

            if (this.codigo != 0) {
                
                Classe classe = ClasseService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadClasse.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadClasse.getjPanelDados());
                telaCadClasse.getjTextFieldID().setText(classe.getId() + "");
                telaCadClasse.getjTextFieldDescricao().setText(classe.getDescricao());

            } else {

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadClasse.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadClasse.getjButtonSair()) {

            if (this.controllerCadProduto != null) {

                controllerCadProduto.attComboBox();

            }

            telaCadClasse.dispose();

        } else if (acao.getSource() == telaCadClasse.getjTextFieldID()) {

            if (!telaCadClasse.getjTextFieldID().getText().equalsIgnoreCase("")) {

                Classe classe = ClasseService.buscar(Integer.parseInt(telaCadClasse.getjTextFieldID().getText()));

                if (classe == null) {

                    JOptionPane.showMessageDialog(null, "Classe nº " + telaCadClasse.getjTextFieldID().getText() + " não existe!");

                    telaCadClasse.getjTextFieldID().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadClasse.getjPanelDados());

                } else {

                    this.telaCadClasse.getjTextFieldDescricao().setText(classe.getDescricao());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadClasse.getjPanelDados());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadClasse.getjPanelBotoes());

                }

            }

        }

    }

}
