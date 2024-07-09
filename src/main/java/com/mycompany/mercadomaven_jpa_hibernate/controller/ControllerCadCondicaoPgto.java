package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.CondicaoPgto;
import com.mycompany.mercadomaven_jpa_hibernate.service.CondicaoPgtoService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaCondicaoPgto;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraCondicaoPgto;

public class ControllerCadCondicaoPgto implements ActionListener {

    CadastraCondicaoPgto telaCadCondicaoPagto;
    public static int codigo;

    public ControllerCadCondicaoPgto(CadastraCondicaoPgto parTelaCadCondicaoPagto) {

        this.telaCadCondicaoPagto = parTelaCadCondicaoPagto;

        telaCadCondicaoPagto.getjButtonNovo().addActionListener(this);
        telaCadCondicaoPagto.getjButtonCancela().addActionListener(this);
        telaCadCondicaoPagto.getjButtonGravar().addActionListener(this);
        telaCadCondicaoPagto.getjButtonBuscar().addActionListener(this);
        telaCadCondicaoPagto.getjButtonSair().addActionListener(this);
        telaCadCondicaoPagto.getjTextFieldId().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCondicaoPagto.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagto.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadCondicaoPagto.getjButtonNovo()) {
            //ações do botão novo
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCondicaoPagto.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadCondicaoPagto.getjPanelDados());
            telaCadCondicaoPagto.getjTextFieldDescricao().requestFocus();

            telaCadCondicaoPagto.getjTextFieldStatus().setText("A");

        } else if (acao.getSource() == telaCadCondicaoPagto.getjButtonCancela()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCondicaoPagto.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagto.getjPanelDados());

        } else if (acao.getSource() == telaCadCondicaoPagto.getjButtonGravar()) {

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadCondicaoPagto.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");

            } else if (Integer.parseInt(telaCadCondicaoPagto.getjTextFieldNumParcelas().getText()) < 1) {

                JOptionPane.showMessageDialog(null, "Atributo 'Número de parcelas' não pode ser menor que 1");

            } else if (Integer.parseInt(telaCadCondicaoPagto.getjTextFieldDiasPrimeiraParcela().getText()) < 1
                    || Integer.parseInt(telaCadCondicaoPagto.getjTextFieldDiasPrimeiraParcela().getText()) > 31) {

                JOptionPane.showMessageDialog(null, "Atributo 'Dia da 1ª Parcela' não pode ser menor que 1 ou maior que 31");

            } else if (Integer.parseInt(telaCadCondicaoPagto.getjTextFieldDiasEntreParcelas().getText()) < 1) {

                JOptionPane.showMessageDialog(null, "Atributo 'Dias entre parcelas' não pode ser menor que 1");

            } else {

                CondicaoPgto condicaoPgto = new CondicaoPgto();

                condicaoPgto.setDescricaoCondicao(telaCadCondicaoPagto.getjTextFieldDescricao().getText());

                condicaoPgto.setNumeroParcelas(Integer.parseInt(telaCadCondicaoPagto.getjTextFieldNumParcelas().getText()));
                condicaoPgto.setDiasPrimeiraParcela(Integer.parseInt(telaCadCondicaoPagto.getjTextFieldDiasPrimeiraParcela().getText()));
                condicaoPgto.setDiasEntreParcela(Integer.parseInt(telaCadCondicaoPagto.getjTextFieldDiasEntreParcelas().getText()));
                condicaoPgto.setStatus(telaCadCondicaoPagto.getjTextFieldStatus().getText());

                if (telaCadCondicaoPagto.getjTextFieldId().getText().trim().equalsIgnoreCase("")) {

                    if (CondicaoPgtoService.buscar(telaCadCondicaoPagto.getjTextFieldDescricao().getText()) != null) {

                        JOptionPane.showMessageDialog(null, "Condição já cadastrada!");

                    } else {

                        CondicaoPgtoService.criar(condicaoPgto);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCondicaoPagto.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagto.getjPanelDados());

                    }

                } else {

                    condicaoPgto.setId(Integer.parseInt(telaCadCondicaoPagto.getjTextFieldId().getText()));

                    CondicaoPgtoService.atualizar(condicaoPgto);

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCondicaoPagto.getjPanelBotoes());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagto.getjPanelDados());

                }

            }

        } else if (acao.getSource() == telaCadCondicaoPagto.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaCondicaoPgto buscaCondicaoPagto = new BuscaCondicaoPgto(null, true);
            ControllerBuscaCondicaoPgto controllerBuscaCondicaoPagto = new ControllerBuscaCondicaoPgto(buscaCondicaoPagto);
            buscaCondicaoPagto.setVisible(true);

            if (this.codigo != 0) {

                CondicaoPgto condicaoPgto = CondicaoPgtoService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCondicaoPagto.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadCondicaoPagto.getjPanelDados());
                telaCadCondicaoPagto.getjTextFieldId().setText(condicaoPgto.getId() + "");
                telaCadCondicaoPagto.getjTextFieldDescricao().setText(condicaoPgto.getDescricaoCondicao());
                telaCadCondicaoPagto.getjTextFieldNumParcelas().setText(condicaoPgto.getNumeroParcelas() + "");
                telaCadCondicaoPagto.getjTextFieldDiasPrimeiraParcela().setText(condicaoPgto.getDiasPrimeiraParcela() + "");
                telaCadCondicaoPagto.getjTextFieldDiasEntreParcelas().setText(condicaoPgto.getDiasEntreParcela() + "");
                telaCadCondicaoPagto.getjTextFieldStatus().setText(condicaoPgto.getStatus());

            } else {

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagto.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadCondicaoPagto.getjButtonSair()) {

            telaCadCondicaoPagto.dispose();

        } else if (acao.getSource() == telaCadCondicaoPagto.getjTextFieldId()) {

            if (!telaCadCondicaoPagto.getjTextFieldId().getText().equalsIgnoreCase("")) {

                CondicaoPgto condicaoPgto = CondicaoPgtoService.buscar(Integer.parseInt(telaCadCondicaoPagto.getjTextFieldId().getText()));

                if (condicaoPgto == null) {

                    JOptionPane.showMessageDialog(null, "Condição nº " + telaCadCondicaoPagto.getjTextFieldId().getText() + " não existe!");

                    telaCadCondicaoPagto.getjTextFieldId().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCondicaoPagto.getjPanelDados());

                } else {

                    telaCadCondicaoPagto.getjTextFieldDescricao().setText(condicaoPgto.getDescricaoCondicao());
                    telaCadCondicaoPagto.getjTextFieldNumParcelas().setText(condicaoPgto.getNumeroParcelas() + "");
                    telaCadCondicaoPagto.getjTextFieldDiasPrimeiraParcela().setText(condicaoPgto.getDiasPrimeiraParcela() + "");
                    telaCadCondicaoPagto.getjTextFieldDiasEntreParcelas().setText(condicaoPgto.getDiasEntreParcela() + "");
                    telaCadCondicaoPagto.getjTextFieldStatus().setText(condicaoPgto.getStatus());

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadCondicaoPagto.getjPanelDados());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCondicaoPagto.getjPanelBotoes());

                }

            }

        }

    }

}
