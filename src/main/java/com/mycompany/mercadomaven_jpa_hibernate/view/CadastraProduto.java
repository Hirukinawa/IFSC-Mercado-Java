package com.mycompany.mercadomaven_jpa_hibernate.view;

import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerBuscaClasse;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadClasse;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadMarca;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastraProduto extends javax.swing.JFrame {

    public CadastraProduto() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.DARK_GRAY);

        jButtonNovo.setContentAreaFilled(false);
        jButtonNovo.setBackground(Color.DARK_GRAY);

        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setBackground(Color.DARK_GRAY);

        jButtonCancela.setContentAreaFilled(false);
        jButtonCancela.setBackground(Color.DARK_GRAY);

        jButtonGravar.setContentAreaFilled(false);
        jButtonGravar.setBackground(Color.DARK_GRAY);

        jButtonSair.setContentAreaFilled(false);
        jButtonSair.setBackground(Color.DARK_GRAY);

        jButtonAddMarca.setContentAreaFilled(false);
        jButtonAddMarca.setBackground(Color.DARK_GRAY);

        jButtonAddClasse.setContentAreaFilled(false);
        jButtonAddClasse.setBackground(Color.DARK_GRAY);
    }

    public JButton getjButtonAddClasse() {
        return jButtonAddClasse;
    }

    public void setjButtonAddClasse(JButton jButtonAddClasse) {
        this.jButtonAddClasse = jButtonAddClasse;
    }

    public JButton getjButtonAddMarca() {
        return jButtonAddMarca;
    }

    public void setjButtonAddMarca(JButton jButtonAddMarca) {
        this.jButtonAddMarca = jButtonAddMarca;
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public void setjButtonBuscar(JButton jButtonBuscar) {
        this.jButtonBuscar = jButtonBuscar;
    }

    public JButton getjButtonCancela() {
        return jButtonCancela;
    }

    public void setjButtonCancela(JButton jButtonCancela) {
        this.jButtonCancela = jButtonCancela;
    }

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public void setjButtonGravar(JButton jButtonGravar) {
        this.jButtonGravar = jButtonGravar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public void setjButtonNovo(JButton jButtonNovo) {
        this.jButtonNovo = jButtonNovo;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public void setjButtonSair(JButton jButtonSair) {
        this.jButtonSair = jButtonSair;
    }

    public JComboBox<String> getjComboBoxClasse() {
        return jComboBoxClasse;
    }

    public void setjComboBoxClasse(JComboBox<String> jComboBoxClasse) {
        this.jComboBoxClasse = jComboBoxClasse;
    }

    public JComboBox<String> getjComboBoxMarca() {
        return jComboBoxMarca;
    }

    public void setjComboBoxMarca(JComboBox<String> jComboBoxMarca) {
        this.jComboBoxMarca = jComboBoxMarca;
    }

    public JFormattedTextField getjFormattedTextFieldDataCadastro() {
        return jFormattedTextFieldDataCadastro;
    }

    public void setjFormattedTextFieldDataCadastro(JFormattedTextField jFormattedTextFieldDataCadastro) {
        this.jFormattedTextFieldDataCadastro = jFormattedTextFieldDataCadastro;
    }

    public JFormattedTextField getjFormattedTextFieldValorCompra() {
        return jFormattedTextFieldValorCompra;
    }

    public void setjFormattedTextFieldValorCompra(JFormattedTextField jFormattedTextFieldValorCompra) {
        this.jFormattedTextFieldValorCompra = jFormattedTextFieldValorCompra;
    }

    public JFormattedTextField getjFormattedTextFieldValorVenda() {
        return jFormattedTextFieldValorVenda;
    }

    public void setjFormattedTextFieldValorVenda(JFormattedTextField jFormattedTextFieldValorVenda) {
        this.jFormattedTextFieldValorVenda = jFormattedTextFieldValorVenda;
    }

    public JPanel getjPanelBotoes() {
        return jPanelBotoes;
    }

    public void setjPanelBotoes(JPanel jPanelBotoes) {
        this.jPanelBotoes = jPanelBotoes;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    public void setjPanelDados(JPanel jPanelDados) {
        this.jPanelDados = jPanelDados;
    }

    public JTextField getjTextFieldBarraEntrada() {
        return jTextFieldBarraEntrada;
    }

    public void setjTextFieldBarraEntrada(JTextField jTextFieldBarraEntrada) {
        this.jTextFieldBarraEntrada = jTextFieldBarraEntrada;
    }

    public JTextField getjTextFieldBarraSaida() {
        return jTextFieldBarraSaida;
    }

    public void setjTextFieldBarraSaida(JTextField jTextFieldBarraSaida) {
        this.jTextFieldBarraSaida = jTextFieldBarraSaida;
    }

    public JTextField getjTextFieldDescricao() {
        return jTextFieldDescricao;
    }

    public void setjTextFieldDescricao(JTextField jTextFieldDescricao) {
        this.jTextFieldDescricao = jTextFieldDescricao;
    }

    public JTextField getjTextFieldEstoqueMax() {
        return jTextFieldEstoqueMax;
    }

    public void setjTextFieldEstoqueMax(JTextField jTextFieldEstoqueMax) {
        this.jTextFieldEstoqueMax = jTextFieldEstoqueMax;
    }

    public JTextField getjTextFieldFatorConversao() {
        return jTextFieldFatorConversao;
    }

    public void setjTextFieldFatorConversao(JTextField jTextFieldFatorConversao) {
        this.jTextFieldFatorConversao = jTextFieldFatorConversao;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JTextField getjTextFieldStatus() {
        return jTextFieldStatus;
    }

    public void setjTextFieldStatus(JTextField jTextFieldStatus) {
        this.jTextFieldStatus = jTextFieldStatus;
    }

    public JTextField getjTextFieldUndCompra() {
        return jTextFieldUndCompra;
    }

    public void setjTextFieldUndCompra(JTextField jTextFieldUndCompra) {
        this.jTextFieldUndCompra = jTextFieldUndCompra;
    }

    public JTextField getjTextFieldUndVenda() {
        return jTextFieldUndVenda;
    }

    public void setjTextFieldUndVenda(JTextField jTextFieldUndVenda) {
        this.jTextFieldUndVenda = jTextFieldUndVenda;
    }

    public JTextField getjTextFieldEstoqueMin() {
        return jTextFieldEstoqueMin;
    }

    public void setjTextFieldEstoqueMin(JTextField jTextFieldEstoqueMin) {
        this.jTextFieldEstoqueMin = jTextFieldEstoqueMin;
    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo1 = new javax.swing.JPanel();
        jTextFieldTitulo1 = new javax.swing.JTextField();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancela = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelDados = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jButtonAddMarca = new javax.swing.JButton();
        jLabelClasse = new javax.swing.JLabel();
        jButtonAddClasse = new javax.swing.JButton();
        jLabelValorVenda = new javax.swing.JLabel();
        jTextFieldUndCompra = new javax.swing.JTextField();
        jLabelFatorConversao = new javax.swing.JLabel();
        jLabelUndVenda = new javax.swing.JLabel();
        jLabelValorCompra = new javax.swing.JLabel();
        jTextFieldUndVenda = new javax.swing.JTextField();
        jFormattedTextFieldValorCompra = new javax.swing.JFormattedTextField();
        jTextFieldFatorConversao = new javax.swing.JTextField();
        jFormattedTextFieldValorVenda = new javax.swing.JFormattedTextField();
        jLabelUndCompra = new javax.swing.JLabel();
        jLabelBarraEntrada = new javax.swing.JLabel();
        jTextFieldBarraEntrada = new javax.swing.JTextField();
        jLabelBarraSaida = new javax.swing.JLabel();
        jTextFieldBarraSaida = new javax.swing.JTextField();
        jTextFieldEstoqueMin = new javax.swing.JTextField();
        jLabelEstoqueMin = new javax.swing.JLabel();
        jLabelEstoqueMax = new javax.swing.JLabel();
        jTextFieldEstoqueMax = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabelDtCadastro = new javax.swing.JLabel();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jComboBoxClasse = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelTitulo1.setBackground(new java.awt.Color(61, 64, 66));
        jPanelTitulo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo1.setForeground(new java.awt.Color(188, 188, 188));

        jTextFieldTitulo1.setEditable(false);
        jTextFieldTitulo1.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldTitulo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldTitulo1.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldTitulo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitulo1.setText("Cadastra Produto");
        jTextFieldTitulo1.setBorder(null);
        jTextFieldTitulo1.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextFieldTitulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitulo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitulo1Layout = new javax.swing.GroupLayout(jPanelTitulo1);
        jPanelTitulo1.setLayout(jPanelTitulo1Layout);
        jPanelTitulo1Layout.setHorizontalGroup(
            jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldTitulo1)
        );
        jPanelTitulo1Layout.setVerticalGroup(
            jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBotoes.setBackground(new java.awt.Color(61, 64, 66));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBotoes.setForeground(new java.awt.Color(188, 188, 188));

        jButtonNovo.setBackground(new java.awt.Color(61, 64, 66));
        jButtonNovo.setForeground(new java.awt.Color(188, 188, 188));
        jButtonNovo.setMnemonic('n');
        jButtonNovo.setText("Novo");
        jButtonNovo.setActionCommand("0");
        jButtonNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(81, 32));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

        jButtonCancela.setBackground(new java.awt.Color(61, 64, 66));
        jButtonCancela.setForeground(new java.awt.Color(188, 188, 188));
        jButtonCancela.setMnemonic('c');
        jButtonCancela.setText("Cancelar");
        jButtonCancela.setActionCommand("1");
        jButtonCancela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancela.setEnabled(false);
        jButtonCancela.setFocusable(false);
        jButtonCancela.setPreferredSize(new java.awt.Dimension(81, 32));
        jButtonCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelaActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonCancela);

        jButtonGravar.setBackground(new java.awt.Color(61, 64, 66));
        jButtonGravar.setForeground(new java.awt.Color(188, 188, 188));
        jButtonGravar.setMnemonic('g');
        jButtonGravar.setText("Gravar");
        jButtonGravar.setActionCommand("1");
        jButtonGravar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGravar.setEnabled(false);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(81, 32));
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonGravar);

        jButtonBuscar.setBackground(new java.awt.Color(61, 64, 66));
        jButtonBuscar.setForeground(new java.awt.Color(188, 188, 188));
        jButtonBuscar.setMnemonic('b');
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("0");
        jButtonBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(81, 32));
        jPanelBotoes.add(jButtonBuscar);

        jButtonSair.setBackground(new java.awt.Color(61, 64, 66));
        jButtonSair.setForeground(new java.awt.Color(188, 188, 188));
        jButtonSair.setMnemonic('s');
        jButtonSair.setText("Sair");
        jButtonSair.setActionCommand("0");
        jButtonSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSair.setPreferredSize(new java.awt.Dimension(81, 32));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonSair);

        jPanelDados.setBackground(new java.awt.Color(61, 64, 66));
        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDados.setForeground(new java.awt.Color(188, 188, 188));
        jPanelDados.setToolTipText("");
        jPanelDados.setName(""); // NOI18N

        jLabelID.setBackground(new java.awt.Color(61, 64, 66));
        jLabelID.setForeground(new java.awt.Color(188, 188, 188));
        jLabelID.setText("Id");

        jTextFieldID.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldID.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldID.setEnabled(false);
        jTextFieldID.setName("0"); // NOI18N

        jTextFieldDescricao.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldDescricao.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldDescricao.setName("1"); // NOI18N

        jLabelDescricao.setBackground(new java.awt.Color(61, 64, 66));
        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(188, 188, 188));
        jLabelDescricao.setText("Descrição*");

        jLabelMarca.setBackground(new java.awt.Color(61, 64, 66));
        jLabelMarca.setForeground(new java.awt.Color(188, 188, 188));
        jLabelMarca.setText("Marca");

        jButtonAddMarca.setBackground(new java.awt.Color(61, 62, 66));
        jButtonAddMarca.setForeground(new java.awt.Color(188, 188, 188));
        jButtonAddMarca.setText("+");
        jButtonAddMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddMarca.setName("1"); // NOI18N
        jButtonAddMarca.setPreferredSize(new java.awt.Dimension(16, 24));
        jButtonAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMarcaActionPerformed(evt);
            }
        });

        jLabelClasse.setBackground(new java.awt.Color(61, 64, 66));
        jLabelClasse.setForeground(new java.awt.Color(188, 188, 188));
        jLabelClasse.setText("Classe");

        jButtonAddClasse.setBackground(new java.awt.Color(61, 62, 66));
        jButtonAddClasse.setForeground(new java.awt.Color(188, 188, 188));
        jButtonAddClasse.setText("+");
        jButtonAddClasse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddClasse.setName("1"); // NOI18N
        jButtonAddClasse.setPreferredSize(new java.awt.Dimension(16, 24));
        jButtonAddClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddClasseActionPerformed(evt);
            }
        });

        jLabelValorVenda.setBackground(new java.awt.Color(61, 64, 66));
        jLabelValorVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelValorVenda.setForeground(new java.awt.Color(188, 188, 188));
        jLabelValorVenda.setText("Valor de Venda*");

        jTextFieldUndCompra.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldUndCompra.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldUndCompra.setName("1"); // NOI18N

        jLabelFatorConversao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFatorConversao.setForeground(new java.awt.Color(188, 188, 188));
        jLabelFatorConversao.setText("Fator de Conversão*");

        jLabelUndVenda.setBackground(new java.awt.Color(61, 64, 66));
        jLabelUndVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUndVenda.setForeground(new java.awt.Color(188, 188, 188));
        jLabelUndVenda.setText("Unidade de Venda*");

        jLabelValorCompra.setBackground(new java.awt.Color(61, 64, 66));
        jLabelValorCompra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelValorCompra.setForeground(new java.awt.Color(188, 188, 188));
        jLabelValorCompra.setText("Valor de Compra*");

        jTextFieldUndVenda.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldUndVenda.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldUndVenda.setName("1"); // NOI18N

        jFormattedTextFieldValorCompra.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldValorCompra.setForeground(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldValorCompra.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldValorCompra.setDisabledTextColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldValorCompra.setName("1"); // NOI18N

        jTextFieldFatorConversao.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldFatorConversao.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldFatorConversao.setName("1"); // NOI18N

        jFormattedTextFieldValorVenda.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldValorVenda.setForeground(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldValorVenda.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldValorVenda.setName("1"); // NOI18N
        jFormattedTextFieldValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldValorVendaActionPerformed(evt);
            }
        });

        jLabelUndCompra.setBackground(new java.awt.Color(61, 64, 66));
        jLabelUndCompra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUndCompra.setForeground(new java.awt.Color(188, 188, 188));
        jLabelUndCompra.setText("Unidade de Compra*");

        jLabelBarraEntrada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBarraEntrada.setForeground(new java.awt.Color(188, 188, 188));
        jLabelBarraEntrada.setText("Código de barras de entrada*");

        jTextFieldBarraEntrada.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldBarraEntrada.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldBarraEntrada.setName("1"); // NOI18N

        jLabelBarraSaida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBarraSaida.setForeground(new java.awt.Color(188, 188, 188));
        jLabelBarraSaida.setText("Código de barras de saída*");

        jTextFieldBarraSaida.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldBarraSaida.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldBarraSaida.setName("1"); // NOI18N

        jTextFieldEstoqueMin.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldEstoqueMin.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldEstoqueMin.setName("1"); // NOI18N

        jLabelEstoqueMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEstoqueMin.setForeground(new java.awt.Color(188, 188, 188));
        jLabelEstoqueMin.setText("Estoque Mínimo*");

        jLabelEstoqueMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEstoqueMax.setForeground(new java.awt.Color(188, 188, 188));
        jLabelEstoqueMax.setText("Estoque Máximo*");

        jTextFieldEstoqueMax.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldEstoqueMax.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldEstoqueMax.setName("1"); // NOI18N

        jLabelStatus.setBackground(new java.awt.Color(61, 64, 66));
        jLabelStatus.setForeground(new java.awt.Color(188, 188, 188));
        jLabelStatus.setText("Status");

        jTextFieldStatus.setEditable(false);
        jTextFieldStatus.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldStatus.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldStatus.setName("3"); // NOI18N

        jLabelDtCadastro.setBackground(new java.awt.Color(61, 64, 66));
        jLabelDtCadastro.setForeground(new java.awt.Color(188, 188, 188));
        jLabelDtCadastro.setText("Data do Cadastro");

        jFormattedTextFieldDataCadastro.setEditable(false);
        jFormattedTextFieldDataCadastro.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldDataCadastro.setForeground(new java.awt.Color(188, 188, 188));
        try {
            jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCadastro.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldDataCadastro.setMinimumSize(new java.awt.Dimension(5, 24));
        jFormattedTextFieldDataCadastro.setName("3"); // NOI18N
        jFormattedTextFieldDataCadastro.setPreferredSize(new java.awt.Dimension(38, 22));
        jFormattedTextFieldDataCadastro.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jComboBoxMarca.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxMarca.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxMarca.setName("1"); // NOI18N

        jComboBoxClasse.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxClasse.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxClasse.setName("1"); // NOI18N

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabelClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAddClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelValorCompra)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addComponent(jFormattedTextFieldValorCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorVenda)
                            .addComponent(jFormattedTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUndCompra)
                            .addComponent(jTextFieldUndCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUndVenda)
                            .addComponent(jTextFieldUndVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFatorConversao)
                            .addComponent(jTextFieldFatorConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBarraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBarraEntrada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelBarraSaida)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldBarraSaida)))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstoqueMax)
                            .addComponent(jTextFieldEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                            .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID)
                            .addComponent(jLabelDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonAddClasse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelMarca)
                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                            .addComponent(jLabelClasse)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 16, 16)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValorCompra)
                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jFormattedTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorVenda)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jFormattedTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jTextFieldUndCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldUndVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldFatorConversao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelUndCompra)
                                .addComponent(jLabelUndVenda)
                                .addComponent(jLabelFatorConversao))
                            .addGap(26, 26, 26))))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBarraEntrada)
                    .addComponent(jLabelBarraSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBarraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBarraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelEstoqueMin)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelEstoqueMax)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStatus)
                            .addComponent(jLabelDtCadastro))
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulo1ActionPerformed

    }//GEN-LAST:event_jTextFieldTitulo1ActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed

    }//GEN-LAST:event_jButtonCancelaActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jFormattedTextFieldValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldValorVendaActionPerformed

    private void jButtonAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMarcaActionPerformed

    }//GEN-LAST:event_jButtonAddMarcaActionPerformed

    private void jButtonAddClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddClasseActionPerformed

    }//GEN-LAST:event_jButtonAddClasseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddClasse;
    private javax.swing.JButton jButtonAddMarca;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxClasse;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorCompra;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorVenda;
    private javax.swing.JLabel jLabelBarraEntrada;
    private javax.swing.JLabel jLabelBarraSaida;
    private javax.swing.JLabel jLabelClasse;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelDtCadastro;
    private javax.swing.JLabel jLabelEstoqueMax;
    private javax.swing.JLabel jLabelEstoqueMin;
    private javax.swing.JLabel jLabelFatorConversao;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelUndCompra;
    private javax.swing.JLabel jLabelUndVenda;
    private javax.swing.JLabel jLabelValorCompra;
    private javax.swing.JLabel jLabelValorVenda;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo1;
    private javax.swing.JTextField jTextFieldBarraEntrada;
    private javax.swing.JTextField jTextFieldBarraSaida;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEstoqueMax;
    private javax.swing.JTextField jTextFieldEstoqueMin;
    private javax.swing.JTextField jTextFieldFatorConversao;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldTitulo1;
    private javax.swing.JTextField jTextFieldUndCompra;
    private javax.swing.JTextField jTextFieldUndVenda;
    // End of variables declaration//GEN-END:variables
}
