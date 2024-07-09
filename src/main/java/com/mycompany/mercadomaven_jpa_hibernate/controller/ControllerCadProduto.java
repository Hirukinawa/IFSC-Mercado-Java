package com.mycompany.mercadomaven_jpa_hibernate.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Classe;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Marca;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Produto;
import com.mycompany.mercadomaven_jpa_hibernate.service.ClasseService;
import com.mycompany.mercadomaven_jpa_hibernate.service.MarcaService;
import com.mycompany.mercadomaven_jpa_hibernate.service.ProdutoService;
import com.mycompany.mercadomaven_jpa_hibernate.view.BuscaProduto;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraClasse;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraMarca;
import com.mycompany.mercadomaven_jpa_hibernate.view.CadastraProduto;
import java.text.ParseException;
import java.util.TimeZone;

public class ControllerCadProduto implements ActionListener {

    CadastraProduto telaCadProduto;
    public static int codigo;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo.");

    public ControllerCadProduto(CadastraProduto parTelaCadProduto) {

        this.telaCadProduto = parTelaCadProduto;

        telaCadProduto.getjButtonNovo().addActionListener(this);
        telaCadProduto.getjButtonCancela().addActionListener(this);
        telaCadProduto.getjButtonGravar().addActionListener(this);
        telaCadProduto.getjButtonBuscar().addActionListener(this);
        telaCadProduto.getjButtonSair().addActionListener(this);
        telaCadProduto.getjTextFieldID().addActionListener(this);

        telaCadProduto.getjButtonAddClasse().addActionListener(this);
        telaCadProduto.getjButtonAddMarca().addActionListener(this);

        attComboBox();

        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadProduto.getjPanelBotoes());
        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadProduto.getjPanelDados());
    }

    public void attComboBox() {

        telaCadProduto.getjComboBoxClasse().removeAllItems();
        telaCadProduto.getjComboBoxMarca().removeAllItems();

        for (Marca comboBoxItensMarca : MarcaService.buscar()) {

            telaCadProduto.getjComboBoxMarca().addItem(comboBoxItensMarca.getDescricao());

        }

        for (Classe comboBoxItensClasse : ClasseService.buscar()) {

            telaCadProduto.getjComboBoxClasse().addItem(comboBoxItensClasse.getDescricao());

        }

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadProduto.getjButtonNovo()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadProduto.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadProduto.getjPanelDados());
            telaCadProduto.getjTextFieldID().setEnabled(false);
            telaCadProduto.getjTextFieldDescricao().requestFocus();

            telaCadProduto.getjFormattedTextFieldDataCadastro().setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));

            telaCadProduto.getjTextFieldStatus().setText("A");

        } else if (acao.getSource() == telaCadProduto.getjButtonCancela()) {

            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadProduto.getjPanelBotoes());
            com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadProduto.getjPanelDados());

        } else if (acao.getSource() == telaCadProduto.getjButtonGravar()) {

            if (com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.confereCampoVazio(telaCadProduto.getjPanelDados()) > 0) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!!");

            } else {

                Produto produto = new Produto();

                produto.setDescricao(telaCadProduto.getjTextFieldDescricao().getText());

                produto.setValorCompra(Float.parseFloat(telaCadProduto.getjFormattedTextFieldValorCompra().getText()));
                produto.setValorVenda(Float.parseFloat(telaCadProduto.getjFormattedTextFieldValorVenda().getText()));
                produto.setUndCompra(telaCadProduto.getjTextFieldUndCompra().getText());
                produto.setUndVenda(telaCadProduto.getjTextFieldUndVenda().getText());
                produto.setFatorConversao(Integer.parseInt(telaCadProduto.getjTextFieldFatorConversao().getText()));

                produto.setBarraEntrada(telaCadProduto.getjTextFieldBarraEntrada().getText());
                produto.setBarraSaida(telaCadProduto.getjTextFieldBarraSaida().getText());

                produto.setStatus(telaCadProduto.getjTextFieldStatus().getText());

                produto.setEstoqueMinimo(Float.parseFloat(telaCadProduto.getjTextFieldEstoqueMin().getText()));
                produto.setEstoqueMaximo(Float.parseFloat(telaCadProduto.getjTextFieldEstoqueMax().getText()));

                Classe classe = ClasseService.buscar(telaCadProduto.getjComboBoxClasse().getSelectedItem().toString());
                Marca marca = MarcaService.buscar(telaCadProduto.getjComboBoxMarca().getSelectedItem().toString());

                String dataCadastro = produto.stringToDate(telaCadProduto.getjFormattedTextFieldDataCadastro().getText());

                try {
                    produto.setDataCadastro(dateFormat.parse(dataCadastro));
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Data de Cadastro errada!");
                }

                produto.setMarca(marca);
                produto.setClasse(classe);

                if (this.telaCadProduto.getjTextFieldID().getText().equalsIgnoreCase("")) {

                    if (ProdutoService.verificar(telaCadProduto.getjTextFieldDescricao().getText(), produto.getMarca().getId()) != null) {

                        JOptionPane.showMessageDialog(null, "Produto já cadastrado");

                    } else {

                        ProdutoService.criar(produto);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadProduto.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadProduto.getjPanelDados());

                    }

                } else {

                    produto.setId(Integer.parseInt(telaCadProduto.getjTextFieldID().getText()));

                    if (ProdutoService.verificarAtualizar(telaCadProduto.getjTextFieldDescricao().getText(), produto.getMarca().getId(), produto.getId()) != null) {

                        JOptionPane.showMessageDialog(null, "Produto já cadastrado");

                    } else {

                        ProdutoService.atualizar(produto);

                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(true, telaCadProduto.getjPanelBotoes());
                        com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadProduto.getjPanelDados());

                    }

                }

            }

        } else if (acao.getSource() == telaCadProduto.getjButtonBuscar()) {

            this.codigo = 0;

            BuscaProduto buscaProduto = new BuscaProduto(null, true);
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(buscaProduto);
            buscaProduto.setVisible(true);

            if (this.codigo != 0) {
                
                Produto produto = ProdutoService.buscar(codigo);

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadProduto.getjPanelBotoes());
                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(true, telaCadProduto.getjPanelDados());
                telaCadProduto.getjTextFieldID().setText(produto.getId() + "");
                telaCadProduto.getjTextFieldDescricao().setText(produto.getDescricao());
                telaCadProduto.getjComboBoxClasse().setSelectedItem(produto.getClasse().getDescricao());
                telaCadProduto.getjComboBoxMarca().setSelectedItem(produto.getMarca().getDescricao());
                telaCadProduto.getjFormattedTextFieldValorCompra().setText(produto.getValorCompra() + "");
                telaCadProduto.getjFormattedTextFieldValorVenda().setText(produto.getValorVenda() + "");
                telaCadProduto.getjTextFieldUndCompra().setText(produto.getUndCompra());
                telaCadProduto.getjTextFieldUndVenda().setText(produto.getUndVenda());
                telaCadProduto.getjTextFieldFatorConversao().setText(produto.getFatorConversao() + "");
                telaCadProduto.getjTextFieldBarraEntrada().setText(produto.getBarraEntrada());
                telaCadProduto.getjTextFieldBarraSaida().setText(produto.getBarraSaida());
                telaCadProduto.getjTextFieldEstoqueMin().setText(produto.getEstoqueMinimo() + "");
                telaCadProduto.getjTextFieldEstoqueMax().setText(produto.getEstoqueMaximo() + "");
                telaCadProduto.getjTextFieldStatus().setText(produto.getStatus());

                Date cadastroBanco = produto.getDataCadastro();
                dateFormat.setTimeZone(timeZone);
                String cadFormatado = dateFormat.format(cadastroBanco);
                telaCadProduto.getjFormattedTextFieldDataCadastro().setText(produto.dateToString(cadFormatado));

            } else {

                com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadProduto.getjPanelDados());

            }

        } else if (acao.getSource() == telaCadProduto.getjButtonSair()) {

            telaCadProduto.dispose();

        } else if (acao.getSource() == telaCadProduto.getjButtonAddClasse()) {

            CadastraClasse cadClasse = new CadastraClasse();
            ControllerCadClasse controllerCadClasse = new ControllerCadClasse(cadClasse, this);
            cadClasse.setVisible(true);

        } else if (acao.getSource() == telaCadProduto.getjButtonAddMarca()) {

            CadastraMarca cadMarca = new CadastraMarca();
            ControllerCadMarca controllerCadMarca = new ControllerCadMarca(cadMarca, this);
            cadMarca.setVisible(true);

        } else if (acao.getSource() == telaCadProduto.getjTextFieldID()) {

            if (!telaCadProduto.getjTextFieldID().getText().isBlank()) {

                Produto produto = ProdutoService.buscar(Integer.parseInt(telaCadProduto.getjTextFieldID().getText()));

                if (produto == null) {

                    JOptionPane.showMessageDialog(null, "Produto nº " + telaCadProduto.getjTextFieldID().getText() + " não existe!");

                    telaCadProduto.getjTextFieldID().setText("");
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ligaDesliga(false, telaCadProduto.getjPanelDados());;

                } else {

                    telaCadProduto.getjTextFieldDescricao().setText(produto.getDescricao());
                    telaCadProduto.getjComboBoxClasse().setSelectedItem(produto.getClasse().getDescricao());
                    telaCadProduto.getjComboBoxMarca().setSelectedItem(produto.getMarca().getDescricao());
                    telaCadProduto.getjFormattedTextFieldValorCompra().setText(produto.getValorCompra() + "");
                    telaCadProduto.getjFormattedTextFieldValorVenda().setText(produto.getValorVenda() + "");
                    telaCadProduto.getjTextFieldUndCompra().setText(produto.getUndCompra());
                    telaCadProduto.getjTextFieldUndVenda().setText(produto.getUndVenda());
                    telaCadProduto.getjTextFieldFatorConversao().setText(produto.getFatorConversao() + "");
                    telaCadProduto.getjTextFieldBarraEntrada().setText(produto.getBarraEntrada());
                    telaCadProduto.getjTextFieldBarraSaida().setText(produto.getBarraSaida());
                    telaCadProduto.getjTextFieldEstoqueMin().setText(produto.getEstoqueMinimo() + "");
                    telaCadProduto.getjTextFieldEstoqueMax().setText(produto.getEstoqueMaximo() + "");
                    telaCadProduto.getjTextFieldStatus().setText(produto.getStatus());

                    Date cadastroBanco = produto.getDataCadastro();
                    dateFormat.setTimeZone(timeZone);
                    String cadFormatado = dateFormat.format(cadastroBanco);
                    telaCadProduto.getjFormattedTextFieldDataCadastro().setText(cadFormatado);

                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.editar(true, telaCadProduto.getjPanelDados());
                    com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils.ativa(false, telaCadProduto.getjPanelBotoes());

                }

            }

        }

    }

}
