package com.mycompany.mercadomaven_jpa_hibernate.view;

import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadEndereco;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastraBairro extends javax.swing.JFrame {

    public CadastraBairro() {
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

    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    public void setjPanelDados(JPanel jPanelDados) {
        this.jPanelDados = jPanelDados;
    }

    public JTextField getjTextFieldDescricao() {
        return jTextFieldDescricao;
    }

    public void setjTextFieldDescricao(JTextField jTextFieldDescricao) {
        this.jTextFieldDescricao = jTextFieldDescricao;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JPanel getjPanelBotoes() {
        return jPanelBotoes;
    }

    public void setjPanelBotoes(JPanel jPanelBotoes) {
        this.jPanelBotoes = jPanelBotoes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo1 = new javax.swing.JPanel();
        jTextFieldTitulo1 = new javax.swing.JTextField();
        jPanelDados = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancela = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(62, 65, 67));
        setForeground(new java.awt.Color(61, 64, 66));
        setName("bairro"); // NOI18N
        setResizable(false);

        jPanelTitulo1.setBackground(new java.awt.Color(61, 64, 66));
        jPanelTitulo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo1.setForeground(new java.awt.Color(188, 188, 188));

        jTextFieldTitulo1.setEditable(false);
        jTextFieldTitulo1.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldTitulo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldTitulo1.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldTitulo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitulo1.setText("Cadastra Bairro");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitulo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelDados.setBackground(new java.awt.Color(61, 64, 66));
        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDados.setForeground(new java.awt.Color(188, 188, 188));
        jPanelDados.setToolTipText("");

        jLabelID.setBackground(new java.awt.Color(61, 64, 66));
        jLabelID.setForeground(new java.awt.Color(188, 188, 188));
        jLabelID.setText("Id");

        jLabelDescricao.setBackground(new java.awt.Color(61, 64, 66));
        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(188, 188, 188));
        jLabelDescricao.setText("* Descrição");

        jTextFieldDescricao.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldDescricao.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldDescricao.setName("1"); // NOI18N
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jTextFieldID.setBackground(new java.awt.Color(61, 64, 66));
        jTextFieldID.setForeground(new java.awt.Color(188, 188, 188));
        jTextFieldID.setName("0"); // NOI18N

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 402, Short.MAX_VALUE))
                    .addComponent(jTextFieldDescricao))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
        jButtonGravar.setMaximumSize(new java.awt.Dimension(61, 23));
        jButtonGravar.setMinimumSize(new java.awt.Dimension(61, 23));
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
            .addComponent(jPanelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Bairro");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulo1ActionPerformed

    }//GEN-LAST:event_jTextFieldTitulo1ActionPerformed


    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed

    }//GEN-LAST:event_jButtonCancelaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraBairro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo1;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldTitulo1;
    // End of variables declaration//GEN-END:variables
}
