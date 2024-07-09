package com.mycompany.mercadomaven_jpa_hibernate.view;

import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerBuscaEndereco;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadEndereco;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastraCliente extends javax.swing.JFrame {

    public CadastraCliente() {
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

        jButtonAddCep.setContentAreaFilled(false);
        jButtonAddCep.setBackground(Color.DARK_GRAY);

    }

    public JButton getjButtonAddCep() {
        return jButtonAddCep;
    }

    public void setjButtonAddCep(JButton jButtonAddCep) {
        this.jButtonAddCep = jButtonAddCep;
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

    public JComboBox<String> getjComboBoxCep() {
        return jComboBoxCep;
    }

    public void setjComboBoxCep(JComboBox<String> jComboBoxCep) {
        this.jComboBoxCep = jComboBoxCep;
    }

    public JComboBox<String> getjComboBoxSexo() {
        return jComboBoxSexo;
    }

    public void setjComboBoxSexo(JComboBox<String> jComboBoxSexo) {
        this.jComboBoxSexo = jComboBoxSexo;
    }

    public JFormattedTextField getjFormattedTextFieldCPF() {
        return jFormattedTextFieldCPF;
    }

    public void setjFormattedTextFieldCPF(JFormattedTextField jFormattedTextFieldCPF) {
        this.jFormattedTextFieldCPF = jFormattedTextFieldCPF;
    }

    public JFormattedTextField getjFormattedTextFieldDataCadastro() {
        return jFormattedTextFieldDataCadastro;
    }

    public void setjFormattedTextFieldDataCadastro(JFormattedTextField jFormattedTextFieldDataCadastro) {
        this.jFormattedTextFieldDataCadastro = jFormattedTextFieldDataCadastro;
    }

    public JFormattedTextField getjFormattedTextFieldDataNascimento() {
        return jFormattedTextFieldDataNascimento;
    }

    public void setjFormattedTextFieldDataNascimento(JFormattedTextField jFormattedTextFieldDataNascimento) {
        this.jFormattedTextFieldDataNascimento = jFormattedTextFieldDataNascimento;
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
    }
*/
    public JTextField getjTextFieldComplementoEndereco() {
        return jTextFieldComplementoEndereco;
    }

    public void setjTextFieldComplementoEndereco(JTextField jTextFieldComplementoEndereco) {
        this.jTextFieldComplementoEndereco = jTextFieldComplementoEndereco;
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

    public JTextField getjTextFieldRG() {
        return jTextFieldRG;
    }

    public void setjTextFieldRG(JTextField jTextFieldRG) {
        this.jTextFieldRG = jTextFieldRG;
    }

    public JTextField getjTextFieldStatus() {
        return jTextFieldStatus;
    }

    public void setjTextFieldStatus(JTextField jTextFieldStatus) {
        this.jTextFieldStatus = jTextFieldStatus;
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

        jPanelTitulo = new javax.swing.JPanel();
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
        jLabelRG = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jLabelDtNasc = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelFone1 = new javax.swing.JLabel();
        jFormattedTextFieldFone1 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFone2 = new javax.swing.JFormattedTextField();
        jLabelFone2 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelObs = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jButtonAddCep = new javax.swing.JButton();
        jLabelCidade = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelLogradouro = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jLabelDtCadastro = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jTextFieldComplementoEndereco = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jComboBoxCep = new javax.swing.JComboBox<>();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jComboBoxLogradouro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(61, 64, 66));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo.setForeground(new java.awt.Color(188, 188, 188));

        jTextFieldTitulo1.setEditable(false);
        jTextFieldTitulo1.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldTitulo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldTitulo1.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldTitulo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitulo1.setText("Cadastra Cliente");
        jTextFieldTitulo1.setBorder(null);
        jTextFieldTitulo1.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextFieldTitulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitulo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
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
        jLabelNome.setText("* Nome");

        jTextFieldID.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldID.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldID.setName("0"); // NOI18N

        jLabelRG.setBackground(new java.awt.Color(61, 64, 66));
        jLabelRG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRG.setForeground(new java.awt.Color(188, 188, 188));
        jLabelRG.setText("* RG");

        jTextFieldRG.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldRG.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldRG.setName("1"); // NOI18N

        jFormattedTextFieldCPF.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldCPF.setForeground(new java.awt.Color(188, 188, 188));
        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldCPF.setMinimumSize(new java.awt.Dimension(5, 24));
        jFormattedTextFieldCPF.setName("1"); // NOI18N
        jFormattedTextFieldCPF.setPreferredSize(new java.awt.Dimension(38, 24));
        jFormattedTextFieldCPF.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jLabelCPF.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCPF.setText("* CPF");

        jTextFieldNome.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldNome.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldNome.setName("1"); // NOI18N

        jFormattedTextFieldDataNascimento.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldDataNascimento.setForeground(new java.awt.Color(188, 188, 188));
        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldDataNascimento.setMinimumSize(new java.awt.Dimension(5, 24));
        jFormattedTextFieldDataNascimento.setName("1"); // NOI18N
        jFormattedTextFieldDataNascimento.setPreferredSize(new java.awt.Dimension(38, 24));
        jFormattedTextFieldDataNascimento.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jLabelDtNasc.setBackground(new java.awt.Color(61, 64, 66));
        jLabelDtNasc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDtNasc.setForeground(new java.awt.Color(188, 188, 188));
        jLabelDtNasc.setText("* Data Nascimento");

        jLabelSexo.setBackground(new java.awt.Color(61, 64, 66));
        jLabelSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(188, 188, 188));
        jLabelSexo.setText("* Sexo");

        jLabelFone1.setBackground(new java.awt.Color(61, 64, 66));
        jLabelFone1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFone1.setForeground(new java.awt.Color(188, 188, 188));
        jLabelFone1.setText("* Telefone 1");

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

        jLabelFone2.setBackground(new java.awt.Color(61, 64, 66));
        jLabelFone2.setForeground(new java.awt.Color(188, 188, 188));
        jLabelFone2.setText("Telefone 2");

        jTextFieldEmail.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldEmail.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldEmail.setName("1"); // NOI18N

        jLabelEmail.setBackground(new java.awt.Color(61, 64, 66));
        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(188, 188, 188));
        jLabelEmail.setText("* E-mail");

        jLabelObs.setBackground(new java.awt.Color(61, 64, 66));
        jLabelObs.setForeground(new java.awt.Color(188, 188, 188));
        jLabelObs.setText("Observações");

        jLabelCep.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCep.setText("* CEP");

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

        jLabelCidade.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCidade.setText("Cidade*");

        jLabelBairro.setBackground(new java.awt.Color(61, 64, 66));
        jLabelBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(188, 188, 188));
        jLabelBairro.setText("Bairro*");

        jTextAreaObs.setBackground(new java.awt.Color(70, 74, 73));
        jTextAreaObs.setColumns(20);
        jTextAreaObs.setForeground(new java.awt.Color(188, 188, 188));
        jTextAreaObs.setRows(5);
        jTextAreaObs.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextAreaObs.setDisabledTextColor(new java.awt.Color(154, 154, 154));
        jTextAreaObs.setName("2"); // NOI18N
        jTextAreaObs.setSelectedTextColor(new java.awt.Color(188, 188, 188));
        jScrollPane1.setViewportView(jTextAreaObs);

        jLabelLogradouro.setBackground(new java.awt.Color(61, 64, 66));
        jLabelLogradouro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelLogradouro.setForeground(new java.awt.Color(188, 188, 188));
        jLabelLogradouro.setText("Logradouro (Rua, Av., Beco, Vila...)*");

        jTextFieldStatus.setEditable(false);
        jTextFieldStatus.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldStatus.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldStatus.setName("3"); // NOI18N

        jLabelStatus.setBackground(new java.awt.Color(61, 64, 66));
        jLabelStatus.setForeground(new java.awt.Color(188, 188, 188));
        jLabelStatus.setText("Status");

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

        jLabelDtCadastro.setBackground(new java.awt.Color(61, 64, 66));
        jLabelDtCadastro.setForeground(new java.awt.Color(188, 188, 188));
        jLabelDtCadastro.setText("Data do Cadastro");

        jComboBoxSexo.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxSexo.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jComboBoxSexo.setSelectedIndex(-1);
        jComboBoxSexo.setToolTipText("");
        jComboBoxSexo.setName("1"); // NOI18N

        jTextFieldComplementoEndereco.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldComplementoEndereco.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldComplementoEndereco.setName("2"); // NOI18N

        jLabelComplemento.setForeground(new java.awt.Color(188, 188, 188));
        jLabelComplemento.setText("Complemento do endereço");

        jComboBoxCep.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxCep.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxCep.setName("1"); // NOI18N
        jComboBoxCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCepActionPerformed(evt);
            }
        });

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
                                .addComponent(jLabelLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBoxLogradouro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelComplemento)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jTextFieldComplementoEndereco)
                                .addContainerGap())))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelObs, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldStatus)
                                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRG, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRG)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDtNasc)
                                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSexo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jComboBoxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonAddCep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBoxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(163, 163, 163))
                                    .addComponent(jComboBoxBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelRG)
                    .addComponent(jLabelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDtNasc)
                            .addComponent(jLabelSexo)
                            .addComponent(jLabelFone1))
                        .addGap(3, 3, 3)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFone2)
                            .addComponent(jLabelEmail))
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelComplemento))
                .addGap(4, 4, 4)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDtCadastro)
                        .addGap(4, 4, 4)
                        .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
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

    private void jComboBoxCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCepActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraCliente().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone1;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDtCadastro;
    private javax.swing.JLabel jLabelDtNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFone1;
    private javax.swing.JLabel jLabelFone2;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldComplementoEndereco;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldTitulo1;
    // End of variables declaration//GEN-END:variables
}
