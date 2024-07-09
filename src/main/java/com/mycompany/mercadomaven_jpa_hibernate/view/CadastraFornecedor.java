package com.mycompany.mercadomaven_jpa_hibernate.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastraFornecedor extends javax.swing.JFrame {

    public CadastraFornecedor() {
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

    /*public JTextField getjTextFieldBairro() {
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

    public JFormattedTextField getjFormattedTextFieldCNPJ() {
        return jFormattedTextFieldCNPJ;
    }

    public void setjFormattedTextFieldCNPJ(JFormattedTextField jFormattedTextFieldCNPJ) {
        this.jFormattedTextFieldCNPJ = jFormattedTextFieldCNPJ;
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

    public JLabel getjLabelID() {
        return jLabelID;
    }

    public void setjLabelID(JLabel jLabelID) {
        this.jLabelID = jLabelID;
    }

    public JTextArea getjTextAreaObs() {
        return jTextAreaObs;
    }

    public void setjTextAreaObs(JTextArea jTextAreaObs) {
        this.jTextAreaObs = jTextAreaObs;
    }

    public JTextField getjTextFieldContato() {
        return jTextFieldContato;
    }

    public void setjTextFieldContato(JTextField jTextFieldContato) {
        this.jTextFieldContato = jTextFieldContato;
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

    public JTextField getjTextFieldInscEstadual() {
        return jTextFieldInscEstadual;
    }

    public void setjTextFieldInscEstadual(JTextField jTextFieldInscEstadual) {
        this.jTextFieldInscEstadual = jTextFieldInscEstadual;
    }

    /*public JTextField getjTextFieldLogradouro() {
        return jTextFieldLogradouro;
    }

    public void setjTextFieldLogradouro(JTextField jTextFieldLogradouro) {
        this.jTextFieldLogradouro = jTextFieldLogradouro;
    }*/

    public JTextField getjTextFieldRG() {
        return jTextFieldRG;
    }

    public void setjTextFieldRG(JTextField jTextFieldRG) {
        this.jTextFieldRG = jTextFieldRG;
    }

    public JTextField getjTextFieldRazaoSocial() {
        return jTextFieldRazaoSocial;
    }

    public void setjTextFieldRazaoSocial(JTextField jTextFieldRazaoSocial) {
        this.jTextFieldRazaoSocial = jTextFieldRazaoSocial;
    }

    public JTextField getjTextFieldStatus() {
        return jTextFieldStatus;
    }

    public void setjTextFieldStatus(JTextField jTextFieldStatus) {
        this.jTextFieldStatus = jTextFieldStatus;
    }

    public JTextField getjTextFieldTitulo1() {
        return jTextFieldTitulo1;
    }

    public void setjTextFieldTitulo1(JTextField jTextFieldTitulo1) {
        this.jTextFieldTitulo1 = jTextFieldTitulo1;
    }

    public JTextField getjTextFieldComplementoEndereco() {
        return jTextFieldComplementoEndereco;
    }

    public void setjTextFieldComplementoEndereco(JTextField jTextFieldComplementoEndereco) {
        this.jTextFieldComplementoEndereco = jTextFieldComplementoEndereco;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JCheckBox getjCheckBoxRural() {
        return jCheckBoxRural;
    }

    public void setjCheckBoxRural(JCheckBox jCheckBoxRural) {
        this.jCheckBoxRural = jCheckBoxRural;
    }

    public JLabel getjLabelCNPJ() {
        return jLabelCNPJ;
    }

    public void setjLabelCNPJ(JLabel jLabelCNPJ) {
        this.jLabelCNPJ = jLabelCNPJ;
    }

    public JLabel getjLabelCPF() {
        return jLabelCPF;
    }

    public void setjLabelCPF(JLabel jLabelCPF) {
        this.jLabelCPF = jLabelCPF;
    }

    public JLabel getjLabelInsEstadual() {
        return jLabelInsEstadual;
    }

    public void setjLabelInsEstadual(JLabel jLabelInsEstadual) {
        this.jLabelInsEstadual = jLabelInsEstadual;
    }

    public JLabel getjLabelNome() {
        return jLabelNome;
    }

    public void setjLabelNome(JLabel jLabelNome) {
        this.jLabelNome = jLabelNome;
    }

    public JLabel getjLabelRazaoSocial() {
        return jLabelRazaoSocial;
    }

    public void setjLabelRazaoSocial(JLabel jLabelRazaoSocial) {
        this.jLabelRazaoSocial = jLabelRazaoSocial;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    public void setjPanelDados(JPanel jPanelDados) {
        this.jPanelDados = jPanelDados;
    }

    public JPanel getjPanelBotoes() {
        return jPanelBotoes;
    }

    public void setjPanelBotoes(JPanel jPanelBotoes) {
        this.jPanelBotoes = jPanelBotoes;
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
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldContato = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabelInsEstadual = new javax.swing.JLabel();
        jTextFieldInscEstadual = new javax.swing.JTextField();
        jFormattedTextFieldCNPJ = new javax.swing.JFormattedTextField();
        jLabelCNPJ = new javax.swing.JLabel();
        jLabelContato = new javax.swing.JLabel();
        jLabelFone1 = new javax.swing.JLabel();
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
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelRG = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jFormattedTextFieldFone1 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFone2 = new javax.swing.JFormattedTextField();
        jTextFieldComplementoEndereco = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jComboBoxCep = new javax.swing.JComboBox<>();
        jCheckBoxRural = new javax.swing.JCheckBox();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jComboBoxCidade = new javax.swing.JComboBox<>();
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
        jTextFieldTitulo1.setText("Cadastra Fornecedor");
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
            .addGroup(jPanelTitulo1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jTextFieldTitulo1)
                .addGap(159, 159, 159))
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

        jLabelRazaoSocial.setBackground(new java.awt.Color(61, 64, 66));
        jLabelRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabelRazaoSocial.setForeground(new java.awt.Color(188, 188, 188));
        jLabelRazaoSocial.setText("Razão Social*");

        jTextFieldContato.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldContato.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldContato.setName("1"); // NOI18N
        jTextFieldContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContatoActionPerformed(evt);
            }
        });

        jTextFieldID.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldID.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldID.setName("0"); // NOI18N

        jLabelInsEstadual.setBackground(new java.awt.Color(61, 64, 66));
        jLabelInsEstadual.setForeground(new java.awt.Color(188, 188, 188));
        jLabelInsEstadual.setText("Inscrição Estadual");

        jTextFieldInscEstadual.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldInscEstadual.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldInscEstadual.setName("2"); // NOI18N

        jFormattedTextFieldCNPJ.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldCNPJ.setForeground(new java.awt.Color(188, 188, 188));
        try {
            jFormattedTextFieldCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCNPJ.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldCNPJ.setMinimumSize(new java.awt.Dimension(5, 24));
        jFormattedTextFieldCNPJ.setName("2"); // NOI18N
        jFormattedTextFieldCNPJ.setPreferredSize(new java.awt.Dimension(38, 24));
        jFormattedTextFieldCNPJ.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jLabelCNPJ.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCNPJ.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCNPJ.setText("CNPJ");

        jLabelContato.setBackground(new java.awt.Color(61, 64, 66));
        jLabelContato.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelContato.setForeground(new java.awt.Color(188, 188, 188));
        jLabelContato.setText("Contato*");

        jLabelFone1.setBackground(new java.awt.Color(61, 64, 66));
        jLabelFone1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFone1.setForeground(new java.awt.Color(188, 188, 188));
        jLabelFone1.setText("Telefone 1*");

        jLabelFone2.setBackground(new java.awt.Color(61, 64, 66));
        jLabelFone2.setForeground(new java.awt.Color(188, 188, 188));
        jLabelFone2.setText("Telefone 2");

        jTextFieldEmail.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldEmail.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldEmail.setName("1"); // NOI18N

        jLabelEmail.setBackground(new java.awt.Color(61, 64, 66));
        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(188, 188, 188));
        jLabelEmail.setText("E-mail*");

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

        jLabelCPF.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCPF.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCPF.setText("CPF");

        jFormattedTextFieldCPF.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldCPF.setForeground(new java.awt.Color(188, 188, 188));
        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldCPF.setMinimumSize(new java.awt.Dimension(5, 24));
        jFormattedTextFieldCPF.setName("2"); // NOI18N
        jFormattedTextFieldCPF.setPreferredSize(new java.awt.Dimension(38, 24));
        jFormattedTextFieldCPF.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jLabelRG.setBackground(new java.awt.Color(61, 64, 66));
        jLabelRG.setForeground(new java.awt.Color(188, 188, 188));
        jLabelRG.setText("RG");

        jTextFieldRG.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldRG.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldRG.setName("2"); // NOI18N

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

        jTextFieldComplementoEndereco.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldComplementoEndereco.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldComplementoEndereco.setName("2"); // NOI18N

        jLabelComplemento.setForeground(new java.awt.Color(188, 188, 188));
        jLabelComplemento.setText("Complemento do endereço");

        jTextFieldNome.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldNome.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldNome.setName("1"); // NOI18N

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(188, 188, 188));
        jLabelNome.setText("Nome*");

        jComboBoxCep.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxCep.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxCep.setName("1"); // NOI18N

        jCheckBoxRural.setBackground(new java.awt.Color(61, 64, 66));
        jCheckBoxRural.setForeground(new java.awt.Color(188, 188, 188));
        jCheckBoxRural.setText("CPF");
        jCheckBoxRural.setName("1"); // NOI18N

        jTextFieldRazaoSocial.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldRazaoSocial.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldRazaoSocial.setName("1"); // NOI18N
        jTextFieldRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRazaoSocialActionPerformed(evt);
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

        jComboBoxCidade.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxCidade.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxCidade.setName("1"); // NOI18N
        jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadeActionPerformed(evt);
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
                        .addComponent(jLabelObs, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(616, 616, 616))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInsEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldInscEstadual)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jLabelContato)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jTextFieldContato)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRG, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldEmail)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jLabelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111))
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jComboBoxCep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonAddCep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129))
                                    .addComponent(jComboBoxBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldStatus)
                                    .addComponent(jLabelDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelComplemento)
                                    .addComponent(jTextFieldComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jCheckBoxRural)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxRural)
                .addGap(2, 2, 2)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelInsEstadual)
                    .addComponent(jLabelRazaoSocial)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelContato)
                            .addComponent(jLabelCPF)
                            .addComponent(jLabelRG)
                            .addComponent(jLabelCNPJ))
                        .addGap(4, 4, 4)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldContato)
                            .addComponent(jFormattedTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelFone1)
                        .addGap(28, 28, 28))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFone2)
                            .addComponent(jLabelEmail))
                        .addGap(4, 4, 4)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBairro)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCep)
                        .addComponent(jLabelCidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldComplementoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabelDtCadastro)
                        .addGap(4, 4, 4)
                        .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextFieldRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRazaoSocialActionPerformed

    private void jTextFieldContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContatoActionPerformed

    private void jComboBoxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBairroActionPerformed

    private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCidadeActionPerformed

    private void jComboBoxLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLogradouroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraFornecedor().setVisible(true);
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
    private javax.swing.JCheckBox jCheckBoxRural;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxCep;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxLogradouro;
    private javax.swing.JFormattedTextField jFormattedTextFieldCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone1;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelContato;
    private javax.swing.JLabel jLabelDtCadastro;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFone1;
    private javax.swing.JLabel jLabelFone2;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelInsEstadual;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldComplementoEndereco;
    private javax.swing.JTextField jTextFieldContato;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldInscEstadual;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldTitulo1;
    // End of variables declaration//GEN-END:variables
}
