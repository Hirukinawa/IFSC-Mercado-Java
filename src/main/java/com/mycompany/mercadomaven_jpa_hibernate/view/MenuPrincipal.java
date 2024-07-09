package com.mycompany.mercadomaven_jpa_hibernate.view;

import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadBairro;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadCidade;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadClasse;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadCliente;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadColaborador;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadCondicaoPgto;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadEndereco;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadFornecedor;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadMarca;
import com.mycompany.mercadomaven_jpa_hibernate.controller.ControllerCadProduto;
import java.awt.Color;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.DARK_GRAY);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBarBarraMenu = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemBairros = new javax.swing.JMenuItem();
        jMenuItemCidades = new javax.swing.JMenuItem();
        jMenuItemEnderecos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemColaboradores = new javax.swing.JMenuItem();
        jMenuItemFornecedores = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemClasse = new javax.swing.JMenuItem();
        jMenuItemMarca = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCondicaoPagto = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuMovimentos = new javax.swing.JMenu();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(61, 64, 66));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(61, 64, 66));
        jPanel1.setForeground(new java.awt.Color(188, 188, 188));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        jMenuBarBarraMenu.setBackground(new java.awt.Color(61, 64, 66));
        jMenuBarBarraMenu.setForeground(new java.awt.Color(188, 188, 188));

        jMenuCadastros.setMnemonic('c');
        jMenuCadastros.setText("Cadastros");

        jMenuItemBairros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemBairros.setText("Bairros");
        jMenuItemBairros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBairrosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemBairros);

        jMenuItemCidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemCidades.setText("Cidades");
        jMenuItemCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCidades);

        jMenuItemEnderecos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemEnderecos.setText("Endereços");
        jMenuItemEnderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnderecosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemEnderecos);
        jMenuCadastros.add(jSeparator1);

        jMenuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemCliente.setText("Clientes");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCliente);

        jMenuItemColaboradores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemColaboradores.setText("Colaboradores");
        jMenuItemColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColaboradoresActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemColaboradores);

        jMenuItemFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemFornecedores.setText("Fornecedores");
        jMenuItemFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedoresActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFornecedores);
        jMenuCadastros.add(jSeparator2);

        jMenuItemClasse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemClasse.setText("Classe");
        jMenuItemClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClasseActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemClasse);

        jMenuItemMarca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemMarca.setText("Marca");
        jMenuItemMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemMarca);

        jMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemProduto);
        jMenuCadastros.add(jSeparator3);

        jMenuItemCondicaoPagto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemCondicaoPagto.setText("Condições de Pagamento");
        jMenuItemCondicaoPagto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCondicaoPagtoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCondicaoPagto);
        jMenuCadastros.add(jSeparator4);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemSair);

        jMenuBarBarraMenu.add(jMenuCadastros);

        jMenuMovimentos.setMnemonic('m');
        jMenuMovimentos.setText("Movimentos");
        jMenuBarBarraMenu.add(jMenuMovimentos);

        jMenuRelatorios.setMnemonic('r');
        jMenuRelatorios.setText("Relatórios");
        jMenuBarBarraMenu.add(jMenuRelatorios);

        jMenuAjuda.setMnemonic('a');
        jMenuAjuda.setText("Ajuda");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Sobre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItem3);

        jMenuBarBarraMenu.add(jMenuAjuda);

        setJMenuBar(jMenuBarBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        CadastraCliente cadCliente = new CadastraCliente();
        ControllerCadCliente controllerCadCliente = new ControllerCadCliente(cadCliente);
        cadCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedoresActionPerformed
        CadastraFornecedor cadFornecedor = new CadastraFornecedor();
        ControllerCadFornecedor controllerCadFornecedor = new ControllerCadFornecedor(cadFornecedor);
        cadFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItemFornecedoresActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemBairrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBairrosActionPerformed
        CadastraBairro cadBairro = new CadastraBairro();
        ControllerCadBairro controllerCadBairro = new ControllerCadBairro(cadBairro);
        cadBairro.setVisible(true);
    }//GEN-LAST:event_jMenuItemBairrosActionPerformed

    private void jMenuItemCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadesActionPerformed
        CadastraCidade cadCidade = new CadastraCidade();
        ControllerCadCidade controllerCadCidade = new ControllerCadCidade(cadCidade);
        cadCidade.setVisible(true);
    }//GEN-LAST:event_jMenuItemCidadesActionPerformed

    private void jMenuItemEnderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnderecosActionPerformed
        CadastraEndereco cadEndereco = new CadastraEndereco();
        ControllerCadEndereco controllerCadEndereco = new ControllerCadEndereco(cadEndereco);
        cadEndereco.setVisible(true);
    }//GEN-LAST:event_jMenuItemEnderecosActionPerformed

    private void jMenuItemClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClasseActionPerformed
        CadastraClasse cadClasse = new CadastraClasse();
        ControllerCadClasse controllerCadClasse = new ControllerCadClasse(cadClasse);
        cadClasse.setVisible(true);
    }//GEN-LAST:event_jMenuItemClasseActionPerformed

    private void jMenuItemMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaActionPerformed
        CadastraMarca cadMarca = new CadastraMarca();
        ControllerCadMarca controllerCadMarca = new ControllerCadMarca(cadMarca);
        cadMarca.setVisible(true);
    }//GEN-LAST:event_jMenuItemMarcaActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        CadastraProduto cadProduto = new CadastraProduto();
        ControllerCadProduto controllerCadProduto = new ControllerCadProduto(cadProduto);
        cadProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColaboradoresActionPerformed
        CadastraColaborador cadColaborador = new CadastraColaborador();
        ControllerCadColaborador controllerCadColaborador = new ControllerCadColaborador(cadColaborador);
        cadColaborador.setVisible(true);
    }//GEN-LAST:event_jMenuItemColaboradoresActionPerformed

    private void jMenuItemCondicaoPagtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCondicaoPagtoActionPerformed
        CadastraCondicaoPgto cadCondicaoPagto = new CadastraCondicaoPgto();
        ControllerCadCondicaoPgto controllerCadCondicaoPagto = new ControllerCadCondicaoPgto(cadCondicaoPagto);
        cadCondicaoPagto.setVisible(true);
    }//GEN-LAST:event_jMenuItemCondicaoPagtoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarBarraMenu;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemBairros;
    private javax.swing.JMenuItem jMenuItemCidades;
    private javax.swing.JMenuItem jMenuItemClasse;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemColaboradores;
    private javax.swing.JMenuItem jMenuItemCondicaoPagto;
    private javax.swing.JMenuItem jMenuItemEnderecos;
    private javax.swing.JMenuItem jMenuItemFornecedores;
    private javax.swing.JMenuItem jMenuItemMarca;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuMovimentos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
