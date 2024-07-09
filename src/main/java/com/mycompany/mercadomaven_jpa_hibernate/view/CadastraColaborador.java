package com.mycompany.mercadomaven_jpa_hibernate.view;

import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerBuscaEndereco;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadEndereco;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastraColaborador extends javax.swing.JFrame {

    public CadastraColaborador() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.DARK_GRAY);

        jButtonNovo.setContentAreaFilled(false);
        jButtonNovo.setOpaque(true);
        jButtonNovo.setBackground(Color.DARK_GRAY);

        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setOpaque(true);
        jButtonBuscar.setBackground(Color.DARK_GRAY);

        jButtonCancela.setContentAreaFilled(false);
        jButtonCancela.setOpaque(true);
        jButtonCancela.setBackground(Color.DARK_GRAY);

        jButtonGravar.setContentAreaFilled(false);
        jButtonGravar.setOpaque(true);
        jButtonGravar.setBackground(Color.DARK_GRAY);

        jButtonSair.setContentAreaFilled(false);
        jButtonSair.setOpaque(true);
        jButtonSair.setBackground(Color.DARK_GRAY);

        jButtonAddCep.setContentAreaFilled(false);
        jButtonAddCep.setOpaque(true);
        jButtonAddCep.setBackground(Color.DARK_GRAY);
    }

    public JButton getjButtonAddCep() {
        return jButtonAddCep;
    }

    public void setjButtonAddCep(JButton jButtonAddCep) {
        this.jButtonAddCep = jButtonAddCep;
    }

    public JComboBox<String> getjComboBoxCep() {
        return jComboBoxCep;
    }

    public void setjComboBoxCep(JComboBox<String> jComboBoxCep) {
        this.jComboBoxCep = jComboBoxCep;
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
/*
    public JTextField getjTextFieldBairro() {
        return jTextFieldBairro;
    }

    public void setjTextFieldBairro(JTextField jTextFieldBairro) {
        this.jTextFieldBairro = jTextFieldBairro;
    }

    public JTextField getjTextFieldCidade() {
        return jTextFieldCidade;
    }

    public void setjTextFieldCidade(JTextField jTextFieldCidade) {
        this.jTextFieldCidade = jTextFieldCidade;
    }*/

    public JFormattedTextField getjFormattedTextFieldDataCadastro() {
        return jFormattedTextFieldDataCadastro;
    }

    public void setjFormattedTextFieldDataCadastro(JFormattedTextField jFormattedTextFieldDataCadastro) {
        this.jFormattedTextFieldDataCadastro = jFormattedTextFieldDataCadastro;
    }

    public JFormattedTextField getjFormattedTextFieldFone1() {
        return jFormattedTextFieldFone1;
    }

    public void setjFormattedTextFieldFone1(JFormattedTextField jFormattedTextFieldFone1) {
        this.jFormattedTextFieldFone1 = jFormattedTextFieldFone1;
    }

    public JFormattedTextField getjFormattedTextFieldFone2() {
        return jFormattedTextFieldFone2;
    }

    public void setjFormattedTextFieldFone2(JFormattedTextField jFormattedTextFieldFone2) {
        this.jFormattedTextFieldFone2 = jFormattedTextFieldFone2;
    }

    public JPasswordField getjPasswordFieldConfirmaSenha() {
        return jPasswordFieldConfirmaSenha;
    }

    public void setjPasswordFieldConfirmaSenha(JPasswordField jPasswordFieldConfirmaSenha) {
        this.jPasswordFieldConfirmaSenha = jPasswordFieldConfirmaSenha;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextAreaObs() {
        return jTextAreaObs;
    }

    public void setjTextAreaObs(JTextArea jTextAreaObs) {
        this.jTextAreaObs = jTextAreaObs;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JTextField getjTextFieldLogin() {
        return jTextFieldLogin;
    }

    public void setjTextFieldLogin(JTextField jTextFieldLogin) {
        this.jTextFieldLogin = jTextFieldLogin;
    }
/*
    public JTextField getjTextFieldLogradouro() {
        return jTextFieldLogradouro;
    }

    public void setjTextFieldLogradouro(JTextField jTextFieldLogradouro) {
        this.jTextFieldLogradouro = jTextFieldLogradouro;
    }*/

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldStatus() {
        return jTextFieldStatus;
    }

    public void setjTextFieldStatus(JTextField jTextFieldStatus) {
        this.jTextFieldStatus = jTextFieldStatus;
    }

    public JTextField getjTextFieldComplementoEndereco() {
        return jTextFieldComplementoEndereco;
    }

    public void setjTextFieldComplementoEndereco(JTextField jTextFieldComplementoEndereco) {
        this.jTextFieldComplementoEndereco = jTextFieldComplementoEndereco;
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

    public JComboBox<String> getjComboBoxBairro() {
        return jComboBoxBairro;
    }

    public void setjComboBoxBairro(JComboBox<String> jComboBoxBairro) {
        this.jComboBoxBairro = jComboBoxBairro;
    }

    public JComboBox<String> getjComboBoxCidade() {
        return jComboBoxCidade;
    }

    public void setjComboBoxCidade(JComboBox<String> jComboBoxCidade) {
        this.jComboBoxCidade = jComboBoxCidade;
    }

    public JComboBox<String> getjComboBoxLogradouro() {
        return jComboBoxLogradouro;
    }

    public void setjComboBoxLogradouro(JComboBox<String> jComboBoxLogradouro) {
        this.jComboBoxLogradouro = jComboBoxLogradouro;
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
        jLabelNome = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCPF2 = new javax.swing.JLabel();
        jFormattedTextFieldFone1 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFone2 = new javax.swing.JFormattedTextField();
        jLabelCPF3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCPF4 = new javax.swing.JLabel();
        jLabelObs = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jButtonAddCep = new javax.swing.JButton();
        jLabelCPF6 = new javax.swing.JLabel();
        jLabelCPF7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelCPF8 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabelObs1 = new javax.swing.JLabel();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jLabelID3 = new javax.swing.JLabel();
        jLabelNome1 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelNome2 = new javax.swing.JLabel();
        jLabelNome3 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmaSenha = new javax.swing.JPasswordField();
        jTextFieldComplementoEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxCep = new javax.swing.JComboBox<>();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jComboBoxLogradouro = new javax.swing.JComboBox<>();

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
        jTextFieldTitulo1.setText("Cadastra Colaborador");
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

        jLabelID.setBackground(new java.awt.Color(61, 64, 66));
        jLabelID.setForeground(new java.awt.Color(188, 188, 188));
        jLabelID.setText("Id");

        jLabelNome.setBackground(new java.awt.Color(61, 64, 66));
        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(188, 188, 188));
        jLabelNome.setText("Nome*");

        jTextFieldID.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldID.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldID.setName("0"); // NOI18N

        jTextFieldNome.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldNome.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNome.setName("1"); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelCPF2.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCPF2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCPF2.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCPF2.setText("Telefone 1*");

        jFormattedTextFieldFone1.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldFone1.setForeground(new java.awt.Color(188, 188, 188));
        try {
            jFormattedTextFieldFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldFone1.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldFone1.setMinimumSize(new java.awt.Dimension(5, 24));
        jFormattedTextFieldFone1.setName("1"); // NOI18N
        jFormattedTextFieldFone1.setPreferredSize(new java.awt.Dimension(38, 24));
        jFormattedTextFieldFone1.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jFormattedTextFieldFone2.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldFone2.setForeground(new java.awt.Color(188, 188, 188));
        try {
            jFormattedTextFieldFone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldFone2.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldFone2.setMinimumSize(new java.awt.Dimension(5, 24));
        jFormattedTextFieldFone2.setName("2"); // NOI18N
        jFormattedTextFieldFone2.setPreferredSize(new java.awt.Dimension(38, 24));
        jFormattedTextFieldFone2.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jLabelCPF3.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCPF3.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCPF3.setText("Telefone 2");

        jTextFieldEmail.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldEmail.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldEmail.setName("1"); // NOI18N

        jLabelCPF4.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCPF4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCPF4.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCPF4.setText("E-mail*");

        jLabelObs.setBackground(new java.awt.Color(61, 64, 66));
        jLabelObs.setForeground(new java.awt.Color(188, 188, 188));
        jLabelObs.setText("Observações");

        jLabelCep.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCep.setText("CEP*");

        jButtonAddCep.setBackground(new java.awt.Color(61, 62, 66));
        jButtonAddCep.setForeground(new java.awt.Color(188, 188, 188));
        jButtonAddCep.setText("+");
        jButtonAddCep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddCep.setPreferredSize(new java.awt.Dimension(16, 24));
        jButtonAddCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCepActionPerformed(evt);
            }
        });

        jLabelCPF6.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCPF6.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCPF6.setText("Cidade");

        jLabelCPF7.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCPF7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabelCPF7.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCPF7.setText("Bairro");

        jTextAreaObs.setBackground(new java.awt.Color(70, 74, 73));
        jTextAreaObs.setColumns(20);
        jTextAreaObs.setForeground(new java.awt.Color(188, 188, 188));
        jTextAreaObs.setRows(5);
        jTextAreaObs.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextAreaObs.setDisabledTextColor(new java.awt.Color(154, 154, 154));
        jTextAreaObs.setName("2"); // NOI18N
        jTextAreaObs.setSelectedTextColor(new java.awt.Color(188, 188, 188));
        jScrollPane1.setViewportView(jTextAreaObs);

        jLabelCPF8.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCPF8.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCPF8.setText("Logradouro (Rua, Av., Beco, Vila...)");

        jTextFieldStatus.setEditable(false);
        jTextFieldStatus.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldStatus.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldStatus.setName("3"); // NOI18N

        jLabelObs1.setBackground(new java.awt.Color(61, 64, 66));
        jLabelObs1.setForeground(new java.awt.Color(188, 188, 188));
        jLabelObs1.setText("Status");

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
        jFormattedTextFieldDataCadastro.setPreferredSize(new java.awt.Dimension(38, 24));
        jFormattedTextFieldDataCadastro.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jLabelID3.setBackground(new java.awt.Color(61, 64, 66));
        jLabelID3.setForeground(new java.awt.Color(188, 188, 188));
        jLabelID3.setText("Data do Cadastro");

        jLabelNome1.setBackground(new java.awt.Color(61, 64, 66));
        jLabelNome1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNome1.setForeground(new java.awt.Color(188, 188, 188));
        jLabelNome1.setText("Login*");

        jTextFieldLogin.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldLogin.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldLogin.setName("1"); // NOI18N

        jLabelNome2.setBackground(new java.awt.Color(61, 64, 66));
        jLabelNome2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNome2.setForeground(new java.awt.Color(188, 188, 188));
        jLabelNome2.setText("Senha*");

        jLabelNome3.setBackground(new java.awt.Color(61, 64, 66));
        jLabelNome3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNome3.setForeground(new java.awt.Color(188, 188, 188));
        jLabelNome3.setText("Confirma Senha*");

        jPasswordFieldSenha.setBackground(new java.awt.Color(70, 74, 75));
        jPasswordFieldSenha.setForeground(new java.awt.Color(188, 188, 188));
        jPasswordFieldSenha.setCaretColor(new java.awt.Color(188, 188, 188));
        jPasswordFieldSenha.setDisabledTextColor(new java.awt.Color(154, 154, 154));
        jPasswordFieldSenha.setName("1"); // NOI18N
        jPasswordFieldSenha.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jPasswordFieldConfirmaSenha.setBackground(new java.awt.Color(70, 74, 75));
        jPasswordFieldConfirmaSenha.setForeground(new java.awt.Color(188, 188, 188));
        jPasswordFieldConfirmaSenha.setCaretColor(new java.awt.Color(188, 188, 188));
        jPasswordFieldConfirmaSenha.setDisabledTextColor(new java.awt.Color(154, 154, 154));
        jPasswordFieldConfirmaSenha.setName("1"); // NOI18N
        jPasswordFieldConfirmaSenha.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jTextFieldComplementoEndereco.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldComplementoEndereco.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldComplementoEndereco.setName("2"); // NOI18N

        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setText("Complemento do endereço");

        jComboBoxCep.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxCep.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxCep.setName("1"); // NOI18N

        jComboBoxCidade.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxCidade.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxCidade.setName("1"); // NOI18N
        jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadeActionPerformed(evt);
            }
        });

        jComboBoxBairro.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxBairro.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxBairro.setName("1"); // NOI18N
        jComboBoxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBairroActionPerformed(evt);
            }
        });

        jComboBoxLogradouro.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxLogradouro.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxLogradouro.setName("1"); // NOI18N
        jComboBoxLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLogradouroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPasswordFieldSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250))
                            .addComponent(jPasswordFieldConfirmaSenha)))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPF2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPF3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelObs1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelID3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPF4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelObs, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jComboBoxCep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonAddCep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCPF6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPF7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCPF8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxLogradouro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelCPF4)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelCPF2)
                                .addGap(3, 3, 3)
                                .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelCPF3)
                                .addGap(4, 4, 4)
                                .addComponent(jFormattedTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelObs1)
                            .addComponent(jLabelID3))
                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelNome3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelNome2)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jLabelCPF6)
                    .addComponent(jLabelCPF7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF8)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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
                .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitulo1ActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed

    }//GEN-LAST:event_jButtonCancelaActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAddCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCepActionPerformed
        
    }//GEN-LAST:event_jButtonAddCepActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCidadeActionPerformed

    private void jComboBoxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBairroActionPerformed

    private void jComboBoxLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLogradouroActionPerformed

    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(CadastraColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraColaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCep;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxCep;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxLogradouro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone1;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCPF2;
    private javax.swing.JLabel jLabelCPF3;
    private javax.swing.JLabel jLabelCPF4;
    private javax.swing.JLabel jLabelCPF6;
    private javax.swing.JLabel jLabelCPF7;
    private javax.swing.JLabel jLabelCPF8;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelID3;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNome2;
    private javax.swing.JLabel jLabelNome3;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelObs1;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo1;
    private javax.swing.JPasswordField jPasswordFieldConfirmaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldComplementoEndereco;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldTitulo1;
    // End of variables declaration//GEN-END:variables
}
