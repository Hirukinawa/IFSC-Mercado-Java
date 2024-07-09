package com.mycompany.mercadomaven_jpa_hibernate.controller;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Endereco;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Fornecedor;
import com.mycompany.mercadomaven_jpa_hibernate.service.BairroService;
import com.mycompany.mercadomaven_jpa_hibernate.service.CidadeService;
import com.mycompany.mercadomaven_jpa_hibernate.service.EnderecoService;
import com.mycompany.mercadomaven_jpa_hibernate.service.FornecedorService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaFornecedor;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraEndereco;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraFornecedor;
import java.text.ParseException;
import java.util.TimeZone;

public class ControllerCadFornecedor implements ActionListener {

    CadastraFornecedor telaCadFornecedor;
    public static int codigo;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo.");

    public ControllerCadFornecedor(CadastraFornecedor parTelaCadFornecedor) {
        this.telaCadFornecedor = parTelaCadFornecedor;

        telaCadFornecedor.getjButtonNovo().addActionListener(this);
        telaCadFornecedor.getjButtonCancela().addActionListener(this);
        telaCadFornecedor.getjButtonGravar().addActionListener(this);
        telaCadFornecedor.getjButtonBuscar().addActionListener(this);
        telaCadFornecedor.getjButtonSair().addActionListener(this);

        telaCadFornecedor.getjButtonAddCep().addActionListener(this);
        telaCadFornecedor.getjComboBoxCep().addActionListener(this);
        telaCadFornecedor.getjComboBoxCidade().addActionListener(this);
        telaCadFornecedor.getjComboBoxBairro().addActionListener(this);
        telaCadFornecedor.getjComboBoxLogradouro().addActionListener(this);
        telaCadFornecedor.getjTextFieldID().addActionListener(this);
        telaCadFornecedor.getjCheckBoxRural().addActionListener(this);

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadFornecedor.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getjPanelDados());

        attComboBox();

    }

    public void attComboBox() {

        telaCadFornecedor.getjComboBoxCep().removeAllItems();

        for (String comboBoxItensEndereco : EnderecoService.listaCeps()) {

            telaCadFornecedor.getjComboBoxCep().addItem(comboBoxItensEndereco);

        }

    }

    public void attComboBoxCidade(String cep) {

        telaCadFornecedor.getjComboBoxCidade().removeAllItems();

        for (Cidade comboBoxItensEndereco : EnderecoService.listaCidades(cep)) {

            telaCadFornecedor.getjComboBoxCidade().addItem(comboBoxItensEndereco.getDescricao());

        }

    }

    public void attComboBoxBairro(String cep, int cidade_id) {

        telaCadFornecedor.getjComboBoxBairro().removeAllItems();

        for (Bairro comboBoxItensEndereco : EnderecoService.listaBairros(cep, cidade_id)) {

            telaCadFornecedor.getjComboBoxBairro().addItem(comboBoxItensEndereco.getDescricao());

        }

    }

    public void attComboBoxLogradouro(String cep, int cidade_id, int bairro_id) {

        telaCadFornecedor.getjComboBoxLogradouro().removeAllItems();

        for (Endereco comboBoxItensEndereco : EnderecoService.listaLogradouros(cep, cidade_id, bairro_id)) {

            telaCadFornecedor.getjComboBoxLogradouro().addItem(comboBoxItensEndereco.getLogradouro());

        }

    }

    public void attCamposCPF() {

        if (telaCadFornecedor.getjCheckBoxRural().isSelected()) {

            telaCadFornecedor.getjLabelRazaoSocial().setText("Razão Social");

            telaCadFornecedor.getjLabelCPF().setText("CPF*");
            telaCadFornecedor.getjLabelCNPJ().setText("CNPJ");
            telaCadFornecedor.getjLabelInsEstadual().setText("Inscrição Estadual");

            telaCadFornecedor.getjTextFieldRazaoSocial().setName("2");

            telaCadFornecedor.getjFormattedTextFieldCPF().setName("1");
            telaCadFornecedor.getjFormattedTextFieldCNPJ().setName("2");
            telaCadFornecedor.getjTextFieldInscEstadual().setName("2");

            telaCadFornecedor.getjTextFieldRazaoSocial().setEnabled(false);

            telaCadFornecedor.getjFormattedTextFieldCPF().setEnabled(true);
            telaCadFornecedor.getjTextFieldRG().setEnabled(true);
            telaCadFornecedor.getjFormattedTextFieldCNPJ().setEnabled(false);
            telaCadFornecedor.getjTextFieldInscEstadual().setEnabled(false);

        } else {

            telaCadFornecedor.getjLabelRazaoSocial().setText("Razão Social*");

            telaCadFornecedor.getjLabelCPF().setText("CPF");
            telaCadFornecedor.getjLabelCNPJ().setText("CNPJ*");
            telaCadFornecedor.getjLabelInsEstadual().setText("Inscrição Estadual*");

            telaCadFornecedor.getjTextFieldRazaoSocial().setName("1");

            telaCadFornecedor.getjFormattedTextFieldCPF().setName("2");
            telaCadFornecedor.getjFormattedTextFieldCNPJ().setName("1");
            telaCadFornecedor.getjTextFieldInscEstadual().setName("1");

            telaCadFornecedor.getjTextFieldRazaoSocial().setEnabled(true);

            telaCadFornecedor.getjFormattedTextFieldCPF().setEnabled(false);
            telaCadFornecedor.getjTextFieldRG().setEnabled(false);
            telaCadFornecedor.getjFormattedTextFieldCNPJ().setEnabled(true);
            telaCadFornecedor.getjTextFieldInscEstadual().setEnabled(true);

            telaCadFornecedor.getjTextFieldNome().requestFocus();

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCadFornecedor.getjButtonNovo()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadFornecedor.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadFornecedor.getjPanelDados());
            telaCadFornecedor.getjTextFieldNome().requestFocus();

            telaCadFornecedor.getjFormattedTextFieldDataCadastro().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));

            telaCadFornecedor.getjTextFieldStatus().setText("A");

            attCamposCPF();

        } else if (acao.getSource() == telaCadFornecedor.getjButtonCancela()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadFornecedor.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getjPanelDados());

        } else if (acao.getSource() == telaCadFornecedor.getjButtonGravar()) {

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadFornecedor.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (telaCadFornecedor.getjFormattedTextFieldFone1().getText().equalsIgnoreCase("(  )      -    ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (telaCadFornecedor.getjFormattedTextFieldCNPJ().isEnabled() && telaCadFornecedor.getjFormattedTextFieldCNPJ().getText().equalsIgnoreCase("  .   .   /    -  ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (telaCadFornecedor.getjFormattedTextFieldCPF().isEnabled() && telaCadFornecedor.getjFormattedTextFieldCPF().getText().equalsIgnoreCase("   .   .   -  ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (!telaCadFornecedor.getjTextFieldEmail().getText().trim().contains("@")) {

                JOptionPane.showMessageDialog(null, "Atributo 'E-mail' Incorreto!");

            } else {

                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setNome(telaCadFornecedor.getjTextFieldNome().getText());

                fornecedor.setContato(telaCadFornecedor.getjTextFieldContato().getText());
                fornecedor.setFone1(telaCadFornecedor.getjFormattedTextFieldFone1().getText());
                fornecedor.setEmail(telaCadFornecedor.getjTextFieldEmail().getText());
                fornecedor.setObservacao(telaCadFornecedor.getjTextAreaObs().getText());
                fornecedor.setStatus(telaCadFornecedor.getjTextFieldStatus().getText());

                fornecedor.setComplementoEndereco(telaCadFornecedor.getjTextFieldComplementoEndereco().getText());

                String dataCadastro = fornecedor.stringToDate(telaCadFornecedor.getjFormattedTextFieldDataCadastro().getText());

                try {
                    fornecedor.setDtCadastro(dateFormat.parse(dataCadastro));
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Data de Cadastro errada!");
                }

                if (telaCadFornecedor.getjFormattedTextFieldFone2().getText().equalsIgnoreCase("(  )      -    ")) {
                    fornecedor.setFone2(null);
                } else {
                    fornecedor.setFone2(telaCadFornecedor.getjFormattedTextFieldFone2().getText());
                }

                if (telaCadFornecedor.getjCheckBoxRural().isSelected() == true) {

                    fornecedor.setCpf(telaCadFornecedor.getjFormattedTextFieldCPF().getText());
                    fornecedor.setRg(telaCadFornecedor.getjTextFieldRG().getText());

                    fornecedor.setCnpj(null);
                    fornecedor.setInscEstadual(null);
                    fornecedor.setRazaoSocial(null);

                } else {

                    fornecedor.setCpf(null);
                    fornecedor.setRg(null);

                    fornecedor.setCnpj(telaCadFornecedor.getjFormattedTextFieldCNPJ().getText());
                    fornecedor.setInscEstadual(telaCadFornecedor.getjTextFieldInscEstadual().getText());
                    fornecedor.setRazaoSocial(telaCadFornecedor.getjTextFieldRazaoSocial().getText());

                }

                Endereco endereco = new Endereco();

                if (telaCadFornecedor.getjComboBoxLogradouro().getSelectedIndex() != -1) {

                    Cidade cidade = CidadeService.buscar(telaCadFornecedor.getjComboBoxCidade().getSelectedItem().toString());
                    Bairro bairro = BairroService.buscar(telaCadFornecedor.getjComboBoxBairro().getSelectedItem().toString());

                    endereco = EnderecoService.procuraEndereco(telaCadFornecedor.getjComboBoxCep().getSelectedItem().toString(), cidade.getId(), bairro.getId(), telaCadFornecedor.getjComboBoxLogradouro().getSelectedItem().toString());

                }

                if (endereco == null) {

                    JOptionPane.showMessageDialog(null, "Endereço não existente no banco de dados!");

                } else {

                    fornecedor.setEndereco(endereco);

                    if (this.telaCadFornecedor.getjTextFieldID().getText().equalsIgnoreCase("")) {

                        if (FornecedorService.buscar(telaCadFornecedor.getjTextFieldNome().getText()) != null) {

                            JOptionPane.showMessageDialog(null, "Fornecedor já cadastrado!");

                        } else {

                            FornecedorService.criar(fornecedor);

                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadFornecedor.getjPanelBotoes());
                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getjPanelDados());

                        }

                    } else {

                        fornecedor.setId(Integer.parseInt(telaCadFornecedor.getjTextFieldID().getText()));

                        if (FornecedorService.verificarAtualizar(telaCadFornecedor.getjTextFieldNome().getText(), fornecedor.getId()) != null) {

                            JOptionPane.showMessageDialog(null, "Fornecedor já cadastrado!");

                        } else {

                            FornecedorService.atualizar(fornecedor);

                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadFornecedor.getjPanelBotoes());
                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getjPanelDados());

                        }

                    }

                }

            }

        } else if (acao.getSource() == telaCadFornecedor.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaFornecedor buscaFornecedor = new BuscaFornecedor(null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(buscaFornecedor);
            buscaFornecedor.setVisible(true);

            if (this.codigo != 0) {

                Fornecedor fornecedor = FornecedorService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadFornecedor.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadFornecedor.getjPanelDados());
                telaCadFornecedor.getjTextFieldID().setText(fornecedor.getId() + "");
                telaCadFornecedor.getjTextFieldRazaoSocial().setText(fornecedor.getRazaoSocial());
                telaCadFornecedor.getjTextFieldNome().setText(fornecedor.getNome());
                telaCadFornecedor.getjTextFieldInscEstadual().setText(fornecedor.getInscEstadual());
                telaCadFornecedor.getjTextFieldContato().setText(fornecedor.getContato());
                telaCadFornecedor.getjFormattedTextFieldCNPJ().setText(fornecedor.getCnpj());
                telaCadFornecedor.getjFormattedTextFieldCPF().setText(fornecedor.getCpf());
                telaCadFornecedor.getjTextFieldRG().setText(fornecedor.getRg());
                telaCadFornecedor.getjFormattedTextFieldFone1().setText(fornecedor.getFone1());
                telaCadFornecedor.getjFormattedTextFieldFone2().setText(fornecedor.getFone2());
                telaCadFornecedor.getjTextFieldEmail().setText(fornecedor.getEmail());
                telaCadFornecedor.getjComboBoxCep().setSelectedItem(fornecedor.getEndereco().getCep());
                telaCadFornecedor.getjTextFieldComplementoEndereco().setText(fornecedor.getComplementoEndereco());
                telaCadFornecedor.getjTextAreaObs().setText(fornecedor.getObservacao());
                telaCadFornecedor.getjTextFieldStatus().setText(fornecedor.getStatus());

                telaCadFornecedor.getjComboBoxCidade().setSelectedItem(fornecedor.getEndereco().getCidade().getDescricao());
                telaCadFornecedor.getjComboBoxBairro().setSelectedItem(fornecedor.getEndereco().getBairro().getDescricao());
                telaCadFornecedor.getjComboBoxLogradouro().setSelectedItem(fornecedor.getEndereco().getLogradouro());

                Date bancoCadastro = fornecedor.getDtCadastro();
                dateFormat.setTimeZone(timeZone);
                String cadFormatado = dateFormat.format(bancoCadastro);
                telaCadFornecedor.getjFormattedTextFieldDataCadastro().setText(fornecedor.dateToString(cadFormatado));

                if (!telaCadFornecedor.getjFormattedTextFieldCPF().getText().equalsIgnoreCase("   .   .   -  ")) {

                    telaCadFornecedor.getjCheckBoxRural().setSelected(true);

                }

                this.attCamposCPF();

                telaCadFornecedor.getjCheckBoxRural().setEnabled(false);

            } else {

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadFornecedor.getjButtonSair()) {

            telaCadFornecedor.dispose();

        } else if (acao.getSource() == telaCadFornecedor.getjButtonAddCep()) {

            CadastraEndereco cadEndereco = new CadastraEndereco();
            ControllerCadEndereco controllerCadEndereco = new ControllerCadEndereco(cadEndereco, this);
            cadEndereco.setVisible(true);

        } else if (acao.getSource() == telaCadFornecedor.getjComboBoxCep()) {

            if (telaCadFornecedor.getjComboBoxCep().getSelectedIndex() != -1) {

                attComboBoxCidade(telaCadFornecedor.getjComboBoxCep().getSelectedItem().toString());
            }

        } else if (acao.getSource() == telaCadFornecedor.getjComboBoxCidade()) {

            if (telaCadFornecedor.getjComboBoxCidade().getSelectedIndex() != -1) {

                Cidade cidade = CidadeService.buscar(telaCadFornecedor.getjComboBoxCidade().getSelectedItem().toString());

                attComboBoxBairro(telaCadFornecedor.getjComboBoxCep().getSelectedItem().toString(), cidade.getId());
            }

        } else if (acao.getSource() == telaCadFornecedor.getjComboBoxBairro()) {

            if (telaCadFornecedor.getjComboBoxBairro().getSelectedIndex() != -1) {

                Cidade cidade = CidadeService.buscar(telaCadFornecedor.getjComboBoxCidade().getSelectedItem().toString());
                Bairro bairro = BairroService.buscar(telaCadFornecedor.getjComboBoxBairro().getSelectedItem().toString());

                attComboBoxLogradouro(telaCadFornecedor.getjComboBoxCep().getSelectedItem().toString(), cidade.getId(), bairro.getId());
            }

        } else if (acao.getSource() == telaCadFornecedor.getjCheckBoxRural()) {

            this.attCamposCPF();

        } else if (acao.getSource() == telaCadFornecedor.getjTextFieldID()) {

            if (!telaCadFornecedor.getjTextFieldID().getText().equalsIgnoreCase("")) {

                Fornecedor fornecedor = FornecedorService.buscar(Integer.parseInt(telaCadFornecedor.getjTextFieldID().getText()));

                if (fornecedor == null) {

                    JOptionPane.showMessageDialog(null, "Fornecedor nº " + telaCadFornecedor.getjTextFieldID().getText() + " não existe!");

                    telaCadFornecedor.getjTextFieldID().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadFornecedor.getjPanelDados());

                } else {

                    telaCadFornecedor.getjTextFieldRazaoSocial().setText(fornecedor.getRazaoSocial());
                    telaCadFornecedor.getjTextFieldNome().setText(fornecedor.getNome());
                    telaCadFornecedor.getjTextFieldInscEstadual().setText(fornecedor.getInscEstadual());
                    telaCadFornecedor.getjTextFieldContato().setText(fornecedor.getContato());
                    telaCadFornecedor.getjFormattedTextFieldCNPJ().setText(fornecedor.getCnpj());
                    telaCadFornecedor.getjFormattedTextFieldCPF().setText(fornecedor.getCpf());
                    telaCadFornecedor.getjTextFieldRG().setText(fornecedor.getRg());
                    telaCadFornecedor.getjFormattedTextFieldFone1().setText(fornecedor.getFone1());
                    telaCadFornecedor.getjFormattedTextFieldFone2().setText(fornecedor.getFone2());
                    telaCadFornecedor.getjTextFieldEmail().setText(fornecedor.getEmail());
                    telaCadFornecedor.getjComboBoxCep().setSelectedItem(fornecedor.getEndereco().getCep());
                    telaCadFornecedor.getjTextFieldComplementoEndereco().setText(fornecedor.getComplementoEndereco());
                    telaCadFornecedor.getjTextAreaObs().setText(fornecedor.getObservacao());
                    telaCadFornecedor.getjTextFieldStatus().setText(fornecedor.getStatus());

                    Date bancoCadastro = fornecedor.getDtCadastro();
                    dateFormat.setTimeZone(timeZone);
                    String cadFormatado = dateFormat.format(bancoCadastro);
                    telaCadFornecedor.getjFormattedTextFieldDataCadastro().setText(fornecedor.dateToString(cadFormatado));

                    telaCadFornecedor.getjComboBoxCidade().setSelectedItem(fornecedor.getEndereco().getCidade().getDescricao());
                    telaCadFornecedor.getjComboBoxBairro().setSelectedItem(fornecedor.getEndereco().getBairro().getDescricao());
                    telaCadFornecedor.getjComboBoxLogradouro().setSelectedItem(fornecedor.getEndereco().getLogradouro());

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadFornecedor.getjPanelDados());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadFornecedor.getjPanelBotoes());

                }

            }

        }

    }

}
