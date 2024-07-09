package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Endereco;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import com.mycompany.mercadomaven_jpa_hibernate.service.BairroService;
import com.mycompany.mercadomaven_jpa_hibernate.service.CidadeService;
import com.mycompany.mercadomaven_jpa_hibernate.service.EnderecoService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaEndereco;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraBairro;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraCidade;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraEndereco;

public class ControllerCadEndereco implements ActionListener {

    public CadastraEndereco telaCadEndereco;
    public static int codigo;
    ControllerCadCliente controllerCadCliente;
    ControllerCadColaborador controllerCadColaborador;
    ControllerCadFornecedor controllerCadFornecedor;

    public ControllerCadEndereco(CadastraEndereco parTelaCadEndereco) {

        this.telaCadEndereco = parTelaCadEndereco;
        this.controllerCadCliente = null;
        this.controllerCadColaborador = null;
        this.controllerCadFornecedor = null;

        telaCadEndereco.getjButtonNovo().addActionListener(this);
        telaCadEndereco.getjButtonCancela().addActionListener(this);
        telaCadEndereco.getjButtonGravar().addActionListener(this);
        telaCadEndereco.getjButtonBuscar().addActionListener(this);
        telaCadEndereco.getjButtonSair().addActionListener(this);
        telaCadEndereco.getjTextFieldID().addActionListener(this);

        telaCadEndereco.getjButtonAddBairro().addActionListener(this);
        telaCadEndereco.getjButtonAddCidade().addActionListener(this);

        attComboBox();

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadEndereco.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadEndereco.getjPanelDados());

    }

    public ControllerCadEndereco(CadastraEndereco parTelaCadEndereco, ControllerCadCliente parControllerCadCliente) {

        this.telaCadEndereco = parTelaCadEndereco;
        this.controllerCadCliente = parControllerCadCliente;
        this.controllerCadColaborador = null;
        this.controllerCadFornecedor = null;

        telaCadEndereco.getjButtonNovo().addActionListener(this);
        telaCadEndereco.getjButtonCancela().addActionListener(this);
        telaCadEndereco.getjButtonGravar().addActionListener(this);
        telaCadEndereco.getjButtonBuscar().addActionListener(this);
        telaCadEndereco.getjButtonSair().addActionListener(this);
        telaCadEndereco.getjTextFieldID().addActionListener(this);

        telaCadEndereco.getjButtonAddBairro().addActionListener(this);
        telaCadEndereco.getjButtonAddCidade().addActionListener(this);

        attComboBox();

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadEndereco.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadEndereco.getjPanelDados());

    }

    public ControllerCadEndereco(CadastraEndereco parTelaCadEndereco, ControllerCadColaborador parControllerCadColaborador) {

        this.telaCadEndereco = parTelaCadEndereco;
        this.controllerCadCliente = null;
        this.controllerCadColaborador = parControllerCadColaborador;
        this.controllerCadFornecedor = null;

        telaCadEndereco.getjButtonNovo().addActionListener(this);
        telaCadEndereco.getjButtonCancela().addActionListener(this);
        telaCadEndereco.getjButtonGravar().addActionListener(this);
        telaCadEndereco.getjButtonBuscar().addActionListener(this);
        telaCadEndereco.getjButtonSair().addActionListener(this);
        telaCadEndereco.getjTextFieldID().addActionListener(this);

        telaCadEndereco.getjButtonAddBairro().addActionListener(this);
        telaCadEndereco.getjButtonAddCidade().addActionListener(this);

        attComboBox();

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadEndereco.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadEndereco.getjPanelDados());

    }

    public ControllerCadEndereco(CadastraEndereco parTelaCadEndereco, ControllerCadFornecedor parControllerCadFornecedor) {

        this.telaCadEndereco = parTelaCadEndereco;
        this.controllerCadCliente = null;
        this.controllerCadColaborador = null;
        this.controllerCadFornecedor = parControllerCadFornecedor;

        telaCadEndereco.getjButtonNovo().addActionListener(this);
        telaCadEndereco.getjButtonCancela().addActionListener(this);
        telaCadEndereco.getjButtonGravar().addActionListener(this);
        telaCadEndereco.getjButtonBuscar().addActionListener(this);
        telaCadEndereco.getjButtonSair().addActionListener(this);
        telaCadEndereco.getjTextFieldID().addActionListener(this);

        telaCadEndereco.getjButtonAddBairro().addActionListener(this);
        telaCadEndereco.getjButtonAddCidade().addActionListener(this);

        attComboBox();

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadEndereco.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadEndereco.getjPanelDados());

    }

    public void attComboBox() {

        telaCadEndereco.getjComboBoxBairro().removeAllItems();
        telaCadEndereco.getjComboBoxCidade().removeAllItems();

        for (Bairro comboBoxItensBairro : BairroService.buscar()) {

            telaCadEndereco.getjComboBoxBairro().addItem(comboBoxItensBairro.getDescricao());

        }

        for (Cidade comboBoxItensCidade : CidadeService.buscar()) {

            telaCadEndereco.getjComboBoxCidade().addItem(comboBoxItensCidade.getDescricao());

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCadEndereco.getjButtonNovo()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadEndereco.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadEndereco.getjPanelDados());
            telaCadEndereco.getjTextFieldLogradouro().requestFocus();

            telaCadEndereco.getjTextFieldStatus().setText("A");

        } else if (acao.getSource() == telaCadEndereco.getjButtonCancela()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadEndereco.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadEndereco.getjPanelDados());

        } else if (acao.getSource() == telaCadEndereco.getjButtonGravar()) {

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadEndereco.getjPanelDados()) > 0 ) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else if (telaCadEndereco.getjFormattedTextFieldCEP().getText().equalsIgnoreCase("     -   ")) {
            
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");
            
            } else {

                Endereco endereco = new Endereco();

                endereco.setLogradouro(telaCadEndereco.getjTextFieldLogradouro().getText());
                endereco.setCep(telaCadEndereco.getjFormattedTextFieldCEP().getText());
                endereco.setObservacao(telaCadEndereco.getjTextAreaObs().getText());
                endereco.setStatus(telaCadEndereco.getjTextFieldStatus().getText());

                Bairro bairro = BairroService.buscar(telaCadEndereco.getjComboBoxBairro().getSelectedItem().toString());
                Cidade cidade = CidadeService.buscar(telaCadEndereco.getjComboBoxCidade().getSelectedItem().toString());

                endereco.setBairro(bairro);
                endereco.setCidade(cidade);

                if (this.telaCadEndereco.getjTextFieldID().getText().equalsIgnoreCase("")) {

                    EnderecoService.criar(endereco);

                } else {

                    endereco.setId(Integer.parseInt(telaCadEndereco.getjTextFieldID().getText()));

                    EnderecoService.atualizar(endereco);

                }

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadEndereco.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadEndereco.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadEndereco.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.setVisible(true);

            if (this.codigo != 0) {
                
                Endereco endereco = EnderecoService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadEndereco.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadEndereco.getjPanelDados());
                telaCadEndereco.getjTextFieldID().setText(endereco.getId() + "");
                telaCadEndereco.getjFormattedTextFieldCEP().setText(endereco.getCep());
                telaCadEndereco.getjTextFieldLogradouro().setText(endereco.getLogradouro());
                telaCadEndereco.getjTextFieldStatus().setText(endereco.getStatus());
                telaCadEndereco.getjTextAreaObs().setText(endereco.getObservacao());
                telaCadEndereco.getjComboBoxBairro().setSelectedItem(endereco.getBairro().getDescricao());
                telaCadEndereco.getjComboBoxCidade().setSelectedItem(endereco.getCidade().getDescricao());

            } else {

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadEndereco.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadEndereco.getjButtonSair()) {

            if (controllerCadCliente != null) {

                controllerCadCliente.attComboBox();

            } else if (controllerCadColaborador != null) {

                controllerCadColaborador.attCombobox();

            } else if (controllerCadFornecedor != null) {

                controllerCadFornecedor.attComboBox();

            }

            telaCadEndereco.dispose();

        } else if (acao.getSource() == telaCadEndereco.getjButtonAddBairro()) {

            CadastraBairro cadBairro = new CadastraBairro();
            ControllerCadBairro controllerCadBairro = new ControllerCadBairro(cadBairro, this);
            cadBairro.setVisible(true);

        } else if (acao.getSource() == telaCadEndereco.getjButtonAddCidade()) {

            CadastraCidade cadCidade = new CadastraCidade();
            ControllerCadCidade controllerCadCidade = new ControllerCadCidade(cadCidade, this);
            cadCidade.setVisible(true);

        } else if (acao.getSource() == telaCadEndereco.getjTextFieldID()) {

            if (!telaCadEndereco.getjTextFieldID().getText().equalsIgnoreCase("")) {

                Endereco endereco = EnderecoService.buscar(Integer.parseInt(telaCadEndereco.getjTextFieldID().getText()));

                if (endereco == null) {

                    JOptionPane.showMessageDialog(null, "Endereço nº " + telaCadEndereco.getjTextFieldID().getText() + " não existe!");

                    telaCadEndereco.getjTextFieldID().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadEndereco.getjPanelDados());

                } else {

                    telaCadEndereco.getjFormattedTextFieldCEP().setText(endereco.getCep());
                    telaCadEndereco.getjTextFieldLogradouro().setText(endereco.getLogradouro());
                    telaCadEndereco.getjComboBoxBairro().setSelectedItem(endereco.getBairro().getDescricao());
                    telaCadEndereco.getjComboBoxCidade().setSelectedItem(endereco.getCidade().getDescricao());
                    telaCadEndereco.getjTextFieldStatus().setText(endereco.getStatus());
                    telaCadEndereco.getjTextAreaObs().setText(endereco.getObservacao());

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadEndereco.getjPanelBotoes());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadEndereco.getjPanelDados());

                }

            }

        }

    }

}
