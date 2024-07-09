package com.mycompany.mercadomaven_jpa_hibernate.controller;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cliente;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Endereco;
import com.mycompany.mercadomaven_jpa_hibernate.service.BairroService;
import com.mycompany.mercadomaven_jpa_hibernate.service.CidadeService;
import com.mycompany.mercadomaven_jpa_hibernate.service.ClienteService;
import com.mycompany.mercadomaven_jpa_hibernate.service.EnderecoService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaCliente;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraCliente;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraEndereco;
import java.text.ParseException;
import java.util.TimeZone;

public class ControllerCadCliente implements ActionListener {

    CadastraCliente telaCadCliente;
    public static int codigo;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo.");

    public ControllerCadCliente(CadastraCliente parTelaCadCliente) {
        this.telaCadCliente = parTelaCadCliente;

        telaCadCliente.getjButtonNovo().addActionListener(this);
        telaCadCliente.getjButtonCancela().addActionListener(this);
        telaCadCliente.getjButtonGravar().addActionListener(this);
        telaCadCliente.getjButtonBuscar().addActionListener(this);
        telaCadCliente.getjButtonSair().addActionListener(this);

        telaCadCliente.getjButtonAddCep().addActionListener(this);
        telaCadCliente.getjComboBoxCep().addActionListener(this);
        telaCadCliente.getjComboBoxCidade().addActionListener(this);
        telaCadCliente.getjComboBoxBairro().addActionListener(this);
        telaCadCliente.getjComboBoxLogradouro().addActionListener(this);
        telaCadCliente.getjTextFieldID().addActionListener(this);
        
        //telaCadCliente.getjTextAreaObs().setEnabled(false);

        attComboBox();

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCliente.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCliente.getjPanelDados());

    }

    public void attComboBox() {

        telaCadCliente.getjComboBoxCep().removeAllItems();

        for (String comboBoxItensEndereco : EnderecoService.listaCeps()) {

            telaCadCliente.getjComboBoxCep().addItem(comboBoxItensEndereco);

        }

    }

    public void attComboBoxCidade(String cep) {

        telaCadCliente.getjComboBoxCidade().removeAllItems();

        for (Cidade comboBoxItensEndereco : EnderecoService.listaCidades(cep)) {

            telaCadCliente.getjComboBoxCidade().addItem(comboBoxItensEndereco.getDescricao());

        }

    }

    public void attComboBoxBairro(String cep, int cidade_id) {

        telaCadCliente.getjComboBoxBairro().removeAllItems();

        for (Bairro comboBoxItensEndereco : EnderecoService.listaBairros(cep, cidade_id)) {

            telaCadCliente.getjComboBoxBairro().addItem(comboBoxItensEndereco.getDescricao());

        }

    }

    public void attComboBoxLogradouro(String cep, int cidade_id, int bairro_id) {

        telaCadCliente.getjComboBoxLogradouro().removeAllItems();

        for (Endereco comboBoxItensEndereco : EnderecoService.listaLogradouros(cep, cidade_id, bairro_id)) {

            telaCadCliente.getjComboBoxLogradouro().addItem(comboBoxItensEndereco.getLogradouro());

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadCliente.getjButtonNovo()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCliente.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadCliente.getjPanelDados());
            telaCadCliente.getjTextFieldNome().requestFocus();

            telaCadCliente.getjFormattedTextFieldDataCadastro().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));

            telaCadCliente.getjTextFieldStatus().setText("A");

        } else if (acao.getSource() == telaCadCliente.getjButtonCancela()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCliente.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCliente.getjPanelDados());

        } else if (acao.getSource() == telaCadCliente.getjButtonGravar()) {

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadCliente.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (telaCadCliente.getjFormattedTextFieldCPF().getText().equalsIgnoreCase("   .   .   -  ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (telaCadCliente.getjFormattedTextFieldDataNascimento().getText().equalsIgnoreCase("  /  /    ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (telaCadCliente.getjFormattedTextFieldFone1().getText().equalsIgnoreCase("(  )      -    ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (!telaCadCliente.getjTextFieldEmail().getText().trim().contains("@")) {

                JOptionPane.showMessageDialog(null, "Atributo 'E-mail' Incorreto!");

            } else {

                Cliente cliente = new Cliente();

                cliente.setNome(telaCadCliente.getjTextFieldNome().getText());

                cliente.setCpf(telaCadCliente.getjFormattedTextFieldCPF().getText());
                cliente.setRg(telaCadCliente.getjTextFieldRG().getText());
                cliente.setSexo(telaCadCliente.getjComboBoxSexo().getSelectedItem().toString());

                String dataNascimento = cliente.stringToDate(telaCadCliente.getjFormattedTextFieldDataNascimento().getText());

                try {
                    cliente.setDtNascimento(dateFormat.parse(dataNascimento));
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao formatar a data de cadastro");
                }

                cliente.setFone1(telaCadCliente.getjFormattedTextFieldFone1().getText());
                cliente.setFone2(telaCadCliente.getjFormattedTextFieldFone2().getText());
                cliente.setEmail(telaCadCliente.getjTextFieldEmail().getText());
                cliente.setObservacao(telaCadCliente.getjTextAreaObs().getText());
                cliente.setStatus(telaCadCliente.getjTextFieldStatus().getText());
                cliente.setComplementoEndereco(telaCadCliente.getjTextFieldComplementoEndereco().getText());

                String dataCadastro = cliente.stringToDate(telaCadCliente.getjFormattedTextFieldDataCadastro().getText());

                try {
                    cliente.setDtCadastro(dateFormat.parse(dataCadastro));
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao formatar a data de nascimento");
                }

                Endereco endereco = null;

                if (telaCadCliente.getjComboBoxLogradouro().getSelectedIndex() != -1) {

                    Cidade cidade = CidadeService.buscar(telaCadCliente.getjComboBoxCidade().getSelectedItem().toString());
                    Bairro bairro = BairroService.buscar(telaCadCliente.getjComboBoxBairro().getSelectedItem().toString());

                    endereco = EnderecoService.procuraEndereco(telaCadCliente.getjComboBoxCep().getSelectedItem().toString(), cidade.getId(), bairro.getId(), telaCadCliente.getjComboBoxLogradouro().getSelectedItem().toString());

                }

                if (endereco == null) {

                    JOptionPane.showMessageDialog(null, "Endereço não existente no banco de dados!");

                } else {

                    cliente.setEndereco(endereco);
                    
                    if (this.telaCadCliente.getjTextFieldID().getText().equalsIgnoreCase("")) {

                        if (ClienteService.buscar(telaCadCliente.getjFormattedTextFieldCPF().getText()) != null) {

                            JOptionPane.showMessageDialog(null, "CPF já cadastrado!");

                        } else {

                            ClienteService.criar(cliente);

                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCliente.getjPanelBotoes());
                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCliente.getjPanelDados());

                        }

                    } else {

                        cliente.setId(Integer.parseInt(telaCadCliente.getjTextFieldID().getText()));

                        if (ClienteService.verificarAtualizar(telaCadCliente.getjFormattedTextFieldCPF().getText(), cliente.getId()) != null) {

                            JOptionPane.showMessageDialog(null, "CPF já cadastrado!");

                        } else {

                            ClienteService.atualizar(cliente);

                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadCliente.getjPanelBotoes());
                            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCliente.getjPanelDados());

                        }

                    }

                }

            }

        } else if (acao.getSource() == telaCadCliente.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaCliente buscaCliente = new BuscaCliente(null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
            buscaCliente.setVisible(true);

            if (this.codigo != 0) {

                Cliente cliente = ClienteService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCliente.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadCliente.getjPanelDados());

                telaCadCliente.getjTextFieldID().setText(cliente.getId() + "");
                telaCadCliente.getjTextFieldNome().setText(cliente.getNome());
                telaCadCliente.getjFormattedTextFieldCPF().setText(cliente.getCpf());
                telaCadCliente.getjTextFieldRG().setText(cliente.getRg());
                telaCadCliente.getjComboBoxSexo().setSelectedItem(cliente.getSexo());
                telaCadCliente.getjFormattedTextFieldFone1().setText(cliente.getFone1());
                telaCadCliente.getjFormattedTextFieldFone2().setText(cliente.getFone2());
                telaCadCliente.getjTextFieldEmail().setText(cliente.getEmail());
                telaCadCliente.getjTextFieldComplementoEndereco().setText(cliente.getComplementoEndereco());
                telaCadCliente.getjTextAreaObs().setText(cliente.getObservacao());
                telaCadCliente.getjTextFieldStatus().setText(cliente.getStatus());

                Date bancoNascimento = cliente.getDtNascimento();
                Date bancoCadastro = cliente.getDtCadastro();
                dateFormat.setTimeZone(timeZone);
                String nascFormatado = dateFormat.format(bancoNascimento);
                String cadFormatado = dateFormat.format(bancoCadastro);

                telaCadCliente.getjFormattedTextFieldDataNascimento().setText(cliente.dateToString(nascFormatado));
                telaCadCliente.getjFormattedTextFieldDataCadastro().setText(cliente.dateToString(cadFormatado));

                telaCadCliente.getjComboBoxCep().setSelectedItem(cliente.getEndereco().getCep());
                telaCadCliente.getjComboBoxCidade().setSelectedItem(cliente.getEndereco().getCidade().getDescricao());
                telaCadCliente.getjComboBoxBairro().setSelectedItem(cliente.getEndereco().getBairro().getDescricao());
                telaCadCliente.getjComboBoxLogradouro().setSelectedItem(cliente.getEndereco().getLogradouro());

                /*
                Date bancoCadastro = cliente.getDtCadastro();
                dateFormat.setTimeZone(timeZone);
                String cadFormatado = dateFormat.format(bancoCadastro);
                telaCadCliente.getjFormattedTextFieldDataCadastro().setText(cliente.dateToString(cadFormatado));
                 */
            } else {

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCliente.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadCliente.getjButtonSair()) {

            telaCadCliente.dispose();

        } else if (acao.getSource() == telaCadCliente.getjButtonAddCep()) {

            CadastraEndereco cadEndereco = new CadastraEndereco();
            ControllerCadEndereco controllerCadEndereco = new ControllerCadEndereco(cadEndereco, this);
            cadEndereco.setVisible(true);

        } else if (acao.getSource() == telaCadCliente.getjComboBoxCep()) {

            if (telaCadCliente.getjComboBoxCep().getSelectedIndex() != -1) {

                attComboBoxCidade(telaCadCliente.getjComboBoxCep().getSelectedItem().toString());
            }

        } else if (acao.getSource() == telaCadCliente.getjComboBoxCidade()) {

            if (telaCadCliente.getjComboBoxCidade().getSelectedIndex() != -1) {

                Cidade cidade = CidadeService.buscar(telaCadCliente.getjComboBoxCidade().getSelectedItem().toString());

                attComboBoxBairro(telaCadCliente.getjComboBoxCep().getSelectedItem().toString(), cidade.getId());
            }

        } else if (acao.getSource() == telaCadCliente.getjComboBoxBairro()) {

            if (telaCadCliente.getjComboBoxBairro().getSelectedIndex() != -1) {

                Cidade cidade = CidadeService.buscar(telaCadCliente.getjComboBoxCidade().getSelectedItem().toString());
                Bairro bairro = BairroService.buscar(telaCadCliente.getjComboBoxBairro().getSelectedItem().toString());

                attComboBoxLogradouro(telaCadCliente.getjComboBoxCep().getSelectedItem().toString(), cidade.getId(), bairro.getId());
            }

        } else if (acao.getSource() == telaCadCliente.getjTextFieldID()) {

            if (!telaCadCliente.getjTextFieldID().getText().equalsIgnoreCase("")) {

                Cliente cliente = ClienteService.buscar(Integer.parseInt(telaCadCliente.getjTextFieldID().getText()));

                if (cliente == null) {

                    JOptionPane.showMessageDialog(null, "Cliente nº " + telaCadCliente.getjTextFieldID().getText() + " não existe!");

                    telaCadCliente.getjTextFieldID().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadCliente.getjPanelDados());

                } else {

                    telaCadCliente.getjTextFieldNome().setText(cliente.getNome());
                    telaCadCliente.getjFormattedTextFieldCPF().setText(cliente.getCpf());
                    telaCadCliente.getjTextFieldRG().setText(cliente.getRg());
                    telaCadCliente.getjComboBoxSexo().setSelectedItem(cliente.getSexo());
                    telaCadCliente.getjFormattedTextFieldFone1().setText(cliente.getFone1());
                    telaCadCliente.getjFormattedTextFieldFone2().setText(cliente.getFone2());
                    telaCadCliente.getjTextFieldEmail().setText(cliente.getEmail());
                    telaCadCliente.getjComboBoxCep().setSelectedItem(cliente.getEndereco().getCep());
                    telaCadCliente.getjTextFieldComplementoEndereco().setText(cliente.getComplementoEndereco());
                    telaCadCliente.getjTextAreaObs().setText(cliente.getObservacao());
                    telaCadCliente.getjTextFieldStatus().setText(cliente.getStatus());

                    Date bancoNascimento = cliente.getDtNascimento();
                    Date bancoCadastro = cliente.getDtCadastro();
                    dateFormat.setTimeZone(timeZone);
                    String nascFormatado = dateFormat.format(bancoNascimento);
                    String cadFormatado = dateFormat.format(bancoCadastro);

                    telaCadCliente.getjFormattedTextFieldDataNascimento().setText(cliente.dateToString(nascFormatado));
                    telaCadCliente.getjFormattedTextFieldDataCadastro().setText(cliente.dateToString(cadFormatado));

                    telaCadCliente.getjComboBoxCidade().setSelectedItem(cliente.getEndereco().getCidade().getDescricao());
                    telaCadCliente.getjComboBoxBairro().setSelectedItem(cliente.getEndereco().getBairro().getDescricao());
                    telaCadCliente.getjComboBoxLogradouro().setSelectedItem(cliente.getEndereco().getLogradouro());

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadCliente.getjPanelDados());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadCliente.getjPanelBotoes());

                }

            }

        }

    }

}
