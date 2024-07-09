package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import com.mycompany.mercadomaven_jpa_hibernate.service.CidadeService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaCidade;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraCidade;

public class ControllerCadCidade implements ActionListener {

    CadastraCidade telaCadCidade;
    public static int codigo;
    ControllerCadEndereco controllerCadEndereco;

    public ControllerCadCidade(CadastraCidade parTelaCadCidade) {

        this.telaCadCidade = parTelaCadCidade;
        this.controllerCadEndereco = null;

        telaCadCidade.getjButtonNovo().addActionListener(this);
        telaCadCidade.getjButtonCancela().addActionListener(this);
        telaCadCidade.getjButtonGravar().addActionListener(this);
        telaCadCidade.getjButtonBuscar().addActionListener(this);
        telaCadCidade.getjButtonSair().addActionListener(this);
        telaCadCidade.getjTextFieldID().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCidade.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCidade.getjPanelDados());
        
    }

    public ControllerCadCidade(CadastraCidade parTelaCadCidade, ControllerCadEndereco parControllerCadEndereco) {

        this.telaCadCidade = parTelaCadCidade;
        this.controllerCadEndereco = parControllerCadEndereco;

        telaCadCidade.getjButtonNovo().addActionListener(this);
        telaCadCidade.getjButtonCancela().addActionListener(this);
        telaCadCidade.getjButtonGravar().addActionListener(this);
        telaCadCidade.getjButtonBuscar().addActionListener(this);
        telaCadCidade.getjButtonSair().addActionListener(this);
        telaCadCidade.getjTextFieldID().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCidade.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCidade.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadCidade.getjButtonNovo()) {
            //ações do botão novo
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCidade.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadCidade.getjPanelDados());
            telaCadCidade.getjTextFieldDescricao().requestFocus();

        } else if (acao.getSource() == telaCadCidade.getjButtonCancela()) {
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCidade.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCidade.getjPanelDados());

        } else if (acao.getSource() == telaCadCidade.getjButtonGravar()) {
            //após a validação e a persistencia de dados
            //dispara a formatação da parte gráfica

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadCidade.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Atributo 'Descrição' é obrigatório!!");

            } else {

                Cidade cidade = new Cidade();

                cidade.setDescricao(telaCadCidade.getjTextFieldDescricao().getText());


                if (CidadeService.buscar(telaCadCidade.getjTextFieldDescricao().getText()) != null) {

                    JOptionPane.showMessageDialog(null, "Cidade já cadastrada!");

                } else {

                    if (this.telaCadCidade.getjTextFieldID().getText().equalsIgnoreCase("")) {

                        CidadeService.criar(cidade);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCidade.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCidade.getjPanelDados());

                    } else {

                        cidade.setId(Integer.parseInt(telaCadCidade.getjTextFieldID().getText()));

                        CidadeService.atualizar(cidade);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCidade.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCidade.getjPanelDados());

                    }

                }

            }

        } else if (acao.getSource() == telaCadCidade.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaCidade buscaCidade = new BuscaCidade(null, true);
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            buscaCidade.setVisible(true);

            if (this.codigo != 0) {

                Cidade cidade = CidadeService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCidade.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadCidade.getjPanelDados());
                telaCadCidade.getjTextFieldID().setText(cidade.getId() + "");
                telaCadCidade.getjTextFieldDescricao().setText(cidade.getDescricao());

            }

        } else if (acao.getSource() == telaCadCidade.getjButtonSair()) {

            if (controllerCadEndereco != null) {

                controllerCadEndereco.attComboBox();

            }

            telaCadCidade.dispose();

        } else if (acao.getSource() == telaCadCidade.getjTextFieldID()) {

            if (!telaCadCidade.getjTextFieldID().getText().equalsIgnoreCase("")) {

                Cidade cidade = CidadeService.buscar(Integer.parseInt(telaCadCidade.getjTextFieldID().getText()));

                if (cidade == null) {

                    JOptionPane.showMessageDialog(null, "Cidade nº " + telaCadCidade.getjTextFieldID().getText() + " não existe!");
                    
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCidade.getjPanelDados());

                } else {

                    this.telaCadCidade.getjTextFieldDescricao().setText(cidade.getDescricao());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadCidade.getjPanelDados());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCidade.getjPanelBotoes());

                }

            }

        }

    }

}
