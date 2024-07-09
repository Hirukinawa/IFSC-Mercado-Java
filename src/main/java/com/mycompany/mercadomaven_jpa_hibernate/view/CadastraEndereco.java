package com.mycompany.mercadomaven_jpa_hibernate.view;

import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerBuscaBairro;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerBuscaCidade;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadBairro;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadCidade;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.mycompany.mercadomaven_jpa_hibernate.model.DAO.BairroDAO;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;

public class CadastraEndereco extends javax.swing.JFrame {

    public CadastraEndereco() {
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

        jButtonAddBairro.setContentAreaFilled(false);
        jButtonAddBairro.setBackground(Color.DARK_GRAY);

        jButtonAddCidade.setContentAreaFilled(false);
        jButtonAddCidade.setBackground(Color.DARK_GRAY);
    }

    public JButton getjButtonAddBairro() {
        return jButtonAddBairro;
    }

    public void setjButtonAddBairro(JButton jButtonAddBairro) {
        this.jButtonAddBairro = jButtonAddBairro;
    }

    public JButton getjButtonAddCidade() {
        return jButtonAddCidade;
    }

    public void setjButtonAddCidade(JButton jButtonAddCidade) {
        this.jButtonAddCidade = jButtonAddCidade;
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

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JTextField getjTextFieldLogradouro() {
        return jTextFieldLogradouro;
    }

    public void setjTextFieldLogradouro(JTextField jTextFieldLogradouro) {
        this.jTextFieldLogradouro = jTextFieldLogradouro;
    }

    public JFormattedTextField getjFormattedTextFieldCEP() {
        return jFormattedTextFieldCEP;
    }

    public void setjFormattedTextFieldCEP(JFormattedTextField jFormattedTextFieldCEP) {
        this.jFormattedTextFieldCEP = jFormattedTextFieldCEP;
    }

    public JTextArea getjTextAreaObs() {
        return jTextAreaObs;
    }

    public void setjTextAreaObs(JTextArea jTextAreaObs) {
        this.jTextAreaObs = jTextAreaObs;
    }

    public JTextField getjTextFieldStatus() {
        return jTextFieldStatus;
    }

    public void setjTextFieldStatus(JTextField jTextFieldStatus) {
        this.jTextFieldStatus = jTextFieldStatus;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jPanelDados = new javax.swing.JPanel();
        jLabelLogradouro = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jLabelBairro = new javax.swing.JLabel();
        jButtonAddBairro = new javax.swing.JButton();
        jLabelCidade = new javax.swing.JLabel();
        jButtonAddCidade = new javax.swing.JButton();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancela = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(61, 64, 66));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo.setForeground(new java.awt.Color(188, 188, 188));

        jTextFieldTitulo.setEditable(false);
        jTextFieldTitulo.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldTitulo.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitulo.setText("Cadastra Endereço");
        jTextFieldTitulo.setBorder(null);
        jTextFieldTitulo.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldTitulo)
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelDados.setBackground(new java.awt.Color(61, 64, 66));
        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDados.setForeground(new java.awt.Color(188, 188, 188));
        jPanelDados.setToolTipText("");

        jLabelLogradouro.setBackground(new java.awt.Color(61, 64, 66));
        jLabelLogradouro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLogradouro.setForeground(new java.awt.Color(188, 188, 188));
        jLabelLogradouro.setText("Logradouro*");

        jLabelID.setBackground(new java.awt.Color(61, 64, 66));
        jLabelID.setForeground(new java.awt.Color(188, 188, 188));
        jLabelID.setText("Id");

        jTextFieldLogradouro.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldLogradouro.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldLogradouro.setName("1"); // NOI18N

        jTextFieldID.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldID.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldID.setName("0"); // NOI18N

        jLabelCep.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCep.setText("CEP*");

        jFormattedTextFieldCEP.setBackground(new java.awt.Color(61, 64, 66));
        jFormattedTextFieldCEP.setForeground(new java.awt.Color(188, 188, 188));
        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.setCaretColor(new java.awt.Color(188, 188, 188));
        jFormattedTextFieldCEP.setMinimumSize(new java.awt.Dimension(5, 24));
        jFormattedTextFieldCEP.setName("1"); // NOI18N
        jFormattedTextFieldCEP.setPreferredSize(new java.awt.Dimension(38, 24));
        jFormattedTextFieldCEP.setSelectedTextColor(new java.awt.Color(188, 188, 188));

        jLabelBairro.setBackground(new java.awt.Color(61, 64, 66));
        jLabelBairro.setForeground(new java.awt.Color(188, 188, 188));
        jLabelBairro.setText("Bairro");

        jButtonAddBairro.setBackground(new java.awt.Color(61, 62, 66));
        jButtonAddBairro.setForeground(new java.awt.Color(188, 188, 188));
        jButtonAddBairro.setText("+");
        jButtonAddBairro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddBairro.setName("1"); // NOI18N
        jButtonAddBairro.setPreferredSize(new java.awt.Dimension(16, 24));
        jButtonAddBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBairroActionPerformed(evt);
            }
        });

        jLabelCidade.setBackground(new java.awt.Color(61, 64, 66));
        jLabelCidade.setForeground(new java.awt.Color(188, 188, 188));
        jLabelCidade.setText("Cidade");

        jButtonAddCidade.setBackground(new java.awt.Color(61, 62, 66));
        jButtonAddCidade.setForeground(new java.awt.Color(188, 188, 188));
        jButtonAddCidade.setText("+");
        jButtonAddCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAddCidade.setName("1"); // NOI18N
        jButtonAddCidade.setPreferredSize(new java.awt.Dimension(16, 24));
        jButtonAddCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCidadeActionPerformed(evt);
            }
        });

        jComboBoxCidade.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxCidade.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxCidade.setName("1"); // NOI18N

        jComboBoxBairro.setBackground(new java.awt.Color(61, 64, 66));
        jComboBoxBairro.setForeground(new java.awt.Color(188, 188, 188));
        jComboBoxBairro.setName("1"); // NOI18N
        jComboBoxBairro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxBairroItemStateChanged(evt);
            }
        });

        jTextAreaObs.setBackground(new java.awt.Color(61, 64, 66));
        jTextAreaObs.setColumns(20);
        jTextAreaObs.setForeground(new java.awt.Color(188, 188, 188));
        jTextAreaObs.setRows(5);
        jTextAreaObs.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextAreaObs.setDisabledTextColor(new java.awt.Color(154, 154, 154));
        jTextAreaObs.setName("2"); // NOI18N
        jTextAreaObs.setSelectedTextColor(new java.awt.Color(188, 188, 188));
        jScrollPane1.setViewportView(jTextAreaObs);

        jLabel1.setBackground(new java.awt.Color(61, 64, 66));
        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setText("Observações");

        jTextFieldStatus.setEditable(false);
        jTextFieldStatus.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldStatus.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldStatus.setName("3"); // NOI18N

        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setText("Status");

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAddBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAddCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed


    }//GEN-LAST:event_jButtonCancelaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonAddBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBairroActionPerformed
        
    }//GEN-LAST:event_jButtonAddBairroActionPerformed

    private void jButtonAddCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCidadeActionPerformed
        
    }//GEN-LAST:event_jButtonAddCidadeActionPerformed

    private void jComboBoxBairroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxBairroItemStateChanged
        // Aqui
    }//GEN-LAST:event_jComboBoxBairroItemStateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastraEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBairro;
    private javax.swing.JButton jButtonAddCidade;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
