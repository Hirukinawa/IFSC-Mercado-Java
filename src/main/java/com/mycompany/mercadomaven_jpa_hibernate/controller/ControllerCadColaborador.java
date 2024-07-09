package com.mycompany.mercadomaven_jpa_hibernate.controller;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Endereco;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Colaborador;
import com.mycompany.mercadomaven_jpa_hibernate.service.BairroService;
import com.mycompany.mercadomaven_jpa_hibernate.service.CidadeService;
import com.mycompany.mercadomaven_jpa_hibernate.service.ColaboradorService;
import com.mycompany.mercadomaven_jpa_hibernate.service.EnderecoService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaColaborador;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraColaborador;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraEndereco;
import java.text.ParseException;
import java.util.TimeZone;

public class ControllerCadColaborador implements ActionListener {

    CadastraColaborador telaCadColaborador;
    public static int codigo;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo.");

    public ControllerCadColaborador(CadastraColaborador parTelaCadColaborador) {
        this.telaCadColaborador = parTelaCadColaborador;

        telaCadColaborador.getjButtonNovo().addActionListener(this);
        telaCadColaborador.getjButtonCancela().addActionListener(this);
        telaCadColaborador.getjButtonGravar().addActionListener(this);
        telaCadColaborador.getjButtonBuscar().addActionListener(this);
        telaCadColaborador.getjButtonSair().addActionListener(this);

        telaCadColaborador.getjButtonAddCep().addActionListener(this);
        telaCadColaborador.getjComboBoxCep().addActionListener(this);
        telaCadColaborador.getjComboBoxCidade().addActionListener(this);
        telaCadColaborador.getjComboBoxBairro().addActionListener(this);
        telaCadColaborador.getjComboBoxLogradouro().addActionListener(this);
        telaCadColaborador.getjTextFieldID().addActionListener(this);

        attCombobox();

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadColaborador.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadColaborador.getjPanelDados());
    }

    public void attCombobox() {

        telaCadColaborador.getjComboBoxCep().removeAllItems();

        for (String comboBoxItensEndereco : EnderecoService.listaCeps()) {

            telaCadColaborador.getjComboBoxCep().addItem(comboBoxItensEndereco);

        }

    }

    public void attComboBoxCidade(String cep) {

        telaCadColaborador.getjComboBoxCidade().removeAllItems();

        for (Cidade comboBoxItensEndereco : EnderecoService.listaCidades(cep)) {

            telaCadColaborador.getjComboBoxCidade().addItem(comboBoxItensEndereco.getDescricao());

        }

    }

    public void attComboBoxBairro(String cep, int cidade_id) {

        telaCadColaborador.getjComboBoxBairro().removeAllItems();

        for (Bairro comboBoxItensEndereco : EnderecoService.listaBairros(cep, cidade_id)) {

            telaCadColaborador.getjComboBoxBairro().addItem(comboBoxItensEndereco.getDescricao());

        }

    }

    public void attComboBoxLogradouro(String cep, int cidade_id, int bairro_id) {

        telaCadColaborador.getjComboBoxLogradouro().removeAllItems();

        for (Endereco comboBoxItensEndereco : EnderecoService.listaLogradouros(cep, cidade_id, bairro_id)) {

            telaCadColaborador.getjComboBoxLogradouro().addItem(comboBoxItensEndereco.getLogradouro());

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCadColaborador.getjButtonNovo()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadColaborador.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadColaborador.getjPanelDados());
            telaCadColaborador.getjTextFieldNome().requestFocus();

            telaCadColaborador.getjFormattedTextFieldDataCadastro().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));

            telaCadColaborador.getjTextFieldStatus().setText("A");

        } else if (acao.getSource() == telaCadColaborador.getjButtonCancela()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadColaborador.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadColaborador.getjPanelDados());

        } else if (acao.getSource() == telaCadColaborador.getjButtonGravar()) {

            if (!telaCadColaborador.getjPasswordFieldConfirmaSenha().getText().equals(telaCadColaborador.getjPasswordFieldSenha().getText())) {

                JOptionPane.showMessageDialog(null, "As senhas devem ser iguais!");

            } else if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadColaborador.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (telaCadColaborador.getjFormattedTextFieldFone1().getText().equalsIgnoreCase("(  )      -    ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (!telaCadColaborador.getjTextFieldEmail().getText().trim().contains("@")) {

                JOptionPane.showMessageDialog(null, "Atributo 'E-mail' Incorreto!");

            } else {

                Colaborador colaborador = new Colaborador();

                colaborador.setNome(telaCadColaborador.getjTextFieldNome().getText());

                colaborador.setFone1(telaCadColaborador.getjFormattedTextFieldFone1().getText());
                colaborador.setFone2(telaCadColaborador.getjFormattedTextFieldFone2().getText());
                colaborador.setEmail(telaCadColaborador.getjTextFieldEmail().getText());

                colaborador.setLogin(telaCadColaborador.getjTextFieldLogin().getText());
                colaborador.setSenha(telaCadColaborador.getjPasswordFieldSenha().getText());

                colaborador.setObservacao(telaCadColaborador.getjTextAreaObs().getText());
                colaborador.setStatus(telaCadColaborador.getjTextFieldStatus().getText());

                colaborador.setComplementoEndereco(telaCadColaborador.getjTextFieldComplementoEndereco().getText());

                String dataCadastro = colaborador.stringToDate(telaCadColaborador.getjFormattedTextFieldDataCadastro().getText());

                try {
                    colaborador.setDtCadastro(dateFormat.parse(dataCadastro));
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Data de Cadastro errada!");
                }

                Endereco endereco = new Endereco();

                if (telaCadColaborador.getjComboBoxLogradouro().getSelectedIndex() != -1) {

                    Cidade cidade = CidadeService.buscar(telaCadColaborador.getjComboBoxCidade().getSelectedItem().toString());
                    Bairro bairro = BairroService.buscar(telaCadColaborador.getjComboBoxBairro().getSelectedItem().toString());

                    endereco = EnderecoService.procuraEndereco(telaCadColaborador.getjComboBoxCep().getSelectedItem().toString(), cidade.getId(), bairro.getId(), telaCadColaborador.getjComboBoxLogradouro().getSelectedItem().toString());

                }

                if (endereco == null) {

                    JOptionPane.showMessageDialog(null, "Endereço não existente no banco de dados!");

                } else {
                    
                    colaborador.setEndereco(endereco);

                    if (this.telaCadColaborador.getjTextFieldID().getText().equalsIgnoreCase("")) {

                        if (ColaboradorService.buscar(telaCadColaborador.getjTextFieldLogin().getText()) != null) {

                            JOptionPane.showMessageDialog(null, "Login já cadastrado!");

                        } else {

                            ColaboradorService.criar(colaborador);

                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadColaborador.getjPanelBotoes());
                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadColaborador.getjPanelDados());

                        }

                    } else {

                        colaborador.setId(Integer.parseInt(telaCadColaborador.getjTextFieldID().getText()));

                        if (ColaboradorService.verificarAtualizar(telaCadColaborador.getjTextFieldLogin().getText(), colaborador.getId()) != null) {

                            JOptionPane.showMessageDialog(null, "Login já cadastrado!");

                        } else {

                            ColaboradorService.atualizar(colaborador);

                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadColaborador.getjPanelBotoes());
                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadColaborador.getjPanelDados());

                        }

                    }

                }

            }

        } else if (acao.getSource() == telaCadColaborador.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaColaborador buscaColaborador = new BuscaColaborador(null, true);
            ControllerBuscaColaborador controllerBuscaColaborador = new ControllerBuscaColaborador(buscaColaborador);
            buscaColaborador.setVisible(true);

            if (this.codigo != 0) {

                Colaborador colaborador = ColaboradorService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadColaborador.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadColaborador.getjPanelDados());

                telaCadColaborador.getjTextFieldID().setText(colaborador.getId() + "");
                telaCadColaborador.getjTextFieldNome().setText(colaborador.getNome());
                telaCadColaborador.getjTextFieldEmail().setText(colaborador.getEmail());
                telaCadColaborador.getjFormattedTextFieldFone1().setText(colaborador.getFone1());
                telaCadColaborador.getjFormattedTextFieldFone2().setText(colaborador.getFone2());
                telaCadColaborador.getjTextFieldStatus().setText(colaborador.getStatus());
                telaCadColaborador.getjTextFieldLogin().setText(colaborador.getLogin());
                telaCadColaborador.getjPasswordFieldSenha().setText(colaborador.getSenha());
                telaCadColaborador.getjComboBoxCep().setSelectedItem(colaborador.getEndereco().getCep());
                telaCadColaborador.getjTextFieldComplementoEndereco().setText(colaborador.getComplementoEndereco());
                telaCadColaborador.getjTextAreaObs().setText(colaborador.getObservacao());

                telaCadColaborador.getjComboBoxCidade().setSelectedItem(colaborador.getEndereco().getCidade().getDescricao());
                telaCadColaborador.getjComboBoxBairro().setSelectedItem(colaborador.getEndereco().getBairro().getDescricao());
                telaCadColaborador.getjComboBoxLogradouro().setSelectedItem(colaborador.getEndereco().getLogradouro());

                Date bancoCadastro = colaborador.getDtCadastro();
                dateFormat.setTimeZone(timeZone);
                String cadFormatado = dateFormat.format(bancoCadastro);
                telaCadColaborador.getjFormattedTextFieldDataCadastro().setText(colaborador.dateToString(cadFormatado));

            }

        } else if (acao.getSource() == telaCadColaborador.getjButtonSair()) {

            telaCadColaborador.dispose();

        } else if (acao.getSource() == telaCadColaborador.getjButtonAddCep()) {

            CadastraEndereco cadEndereco = new CadastraEndereco();
            ControllerCadEndereco controllerCadEndereco = new ControllerCadEndereco(cadEndereco, this);
            cadEndereco.setVisible(true);

        } else if (acao.getSource() == telaCadColaborador.getjComboBoxCep()) {

            if (telaCadColaborador.getjComboBoxCep().getSelectedIndex() != -1) {

                attComboBoxCidade(telaCadColaborador.getjComboBoxCep().getSelectedItem().toString());
            }

        } else if (acao.getSource() == telaCadColaborador.getjComboBoxCidade()) {

            if (telaCadColaborador.getjComboBoxCidade().getSelectedIndex() != -1) {

                Cidade cidade = CidadeService.buscar(telaCadColaborador.getjComboBoxCidade().getSelectedItem().toString());

                attComboBoxBairro(telaCadColaborador.getjComboBoxCep().getSelectedItem().toString(), cidade.getId());
            }

        } else if (acao.getSource() == telaCadColaborador.getjComboBoxBairro()) {

            if (telaCadColaborador.getjComboBoxBairro().getSelectedIndex() != -1) {

                Cidade cidade = CidadeService.buscar(telaCadColaborador.getjComboBoxCidade().getSelectedItem().toString());
                Bairro bairro = BairroService.buscar(telaCadColaborador.getjComboBoxBairro().getSelectedItem().toString());

                attComboBoxLogradouro(telaCadColaborador.getjComboBoxCep().getSelectedItem().toString(), cidade.getId(), bairro.getId());
            }

        } else if (acao.getSource() == telaCadColaborador.getjTextFieldID()) {

            if (!telaCadColaborador.getjTextFieldID().getText().equalsIgnoreCase("")) {

                Colaborador colaborador = ColaboradorService.buscar(Integer.parseInt(telaCadColaborador.getjTextFieldID().getText()));

                if (colaborador == null) {

                    JOptionPane.showMessageDialog(null, "Colaborador nº " + telaCadColaborador.getjTextFieldID().getText() + " não existe!");

                    telaCadColaborador.getjTextFieldID().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadColaborador.getjPanelDados());

                } else {

                    telaCadColaborador.getjTextFieldNome().setText(colaborador.getNome());
                    telaCadColaborador.getjTextFieldEmail().setText(colaborador.getEmail());
                    telaCadColaborador.getjFormattedTextFieldFone1().setText(colaborador.getFone1());
                    telaCadColaborador.getjFormattedTextFieldFone2().setText(colaborador.getFone2());
                    telaCadColaborador.getjTextFieldStatus().setText(colaborador.getStatus());
                    telaCadColaborador.getjTextFieldLogin().setText(colaborador.getLogin());
                    telaCadColaborador.getjPasswordFieldSenha().setText(colaborador.getSenha());
                    telaCadColaborador.getjComboBoxCep().setSelectedItem(colaborador.getEndereco().getCep());
                    telaCadColaborador.getjTextFieldComplementoEndereco().setText(colaborador.getComplementoEndereco());
                    telaCadColaborador.getjTextAreaObs().setText(colaborador.getObservacao());

                    Date bancoCadastro = colaborador.getDtCadastro();
                    dateFormat.setTimeZone(timeZone);
                    String cadFormatado = dateFormat.format(bancoCadastro);
                    telaCadColaborador.getjFormattedTextFieldDataCadastro().setText(colaborador.dateToString(cadFormatado));

                    telaCadColaborador.getjComboBoxCidade().setSelectedItem(colaborador.getEndereco().getCidade().getDescricao());
                    telaCadColaborador.getjComboBoxBairro().setSelectedItem(colaborador.getEndereco().getBairro().getDescricao());
                    telaCadColaborador.getjComboBoxLogradouro().setSelectedItem(colaborador.getEndereco().getLogradouro());

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadColaborador.getjPanelDados());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadColaborador.getjPanelBotoes());

                }

            }

        }

    }

}
