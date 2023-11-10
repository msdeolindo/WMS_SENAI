/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jbasso
 */
public class RF16_POP extends javax.swing.JFrame {

    /**
     * Creates new form RF_16_novo
     */
    public RF16_POP() {
        initComponents();
        lbl_id.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Rua = new javax.swing.JLabel();
        lbl_Corredor = new javax.swing.JLabel();
        lbl_Nivel = new javax.swing.JLabel();
        lbl_Endereco = new javax.swing.JLabel();
        txt_Rua = new javax.swing.JTextField();
        txt_Corredor = new javax.swing.JTextField();
        txt_Pilha = new javax.swing.JTextField();
        txt_Nivel = new javax.swing.JTextField();
        btn_Salvar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        lbl_categoria = new javax.swing.JLabel();
        lbl_tipoCarga = new javax.swing.JLabel();
        cbx_tipoCarga = new javax.swing.JComboBox<>();
        cbx_categoria = new javax.swing.JComboBox<>();
        btn_Excluir = new javax.swing.JButton();
        lbl_Pilha = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        lbl_id = new javax.swing.JTextField();
        paTitulo = new javax.swing.JPanel();
        lb_Titulo = new javax.swing.JLabel();
        lb_Voltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE ENDEREÇO DE ARMAZENAGEM");

        lbl_Rua.setText("RUA");

        lbl_Corredor.setText("CORREDOR");

        lbl_Nivel.setText("NIVEL");

        lbl_Endereco.setText("ENDERECO");

        txt_Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RuaActionPerformed(evt);
            }
        });

        btn_Salvar.setText("SALVAR");
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        btn_Editar.setText("EDITAR");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        lbl_categoria.setText("CATEGORIA");

        lbl_tipoCarga.setText("TIPO DE CARGA");

        cbx_tipoCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paletizada", "Normal" }));
        cbx_tipoCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoCargaActionPerformed(evt);
            }
        });

        cbx_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A granel", "Secas", "Frágeis" }));

        btn_Excluir.setText("EXCLUIR");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        lbl_Pilha.setText("PILHA");

        lbl_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Pilha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Pilha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbx_categoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_Rua)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(91, 91, 91))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_categoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Nivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Nivel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tipoCarga)
                            .addComponent(cbx_tipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_Corredor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Corredor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))))
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Endereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Editar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Excluir)
                        .addGap(90, 90, 90)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_categoria)
                    .addComponent(lbl_tipoCarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_tipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Rua)
                    .addComponent(txt_Corredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Corredor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Pilha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Pilha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salvar)
                    .addComponent(btn_Editar)
                    .addComponent(btn_Excluir)
                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        paTitulo.setBackground(new java.awt.Color(0, 51, 153));
        paTitulo.setPreferredSize(new java.awt.Dimension(651, 100));

        lb_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        lb_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_Titulo.setText("Cadastro de Armazenagem");

        lb_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_VoltarMouseClicked(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout paTituloLayout = new javax.swing.GroupLayout(paTitulo);
        paTitulo.setLayout(paTituloLayout);
        paTituloLayout.setHorizontalGroup(
            paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paTituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lb_Voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );
        paTituloLayout.setVerticalGroup(
            paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lb_Voltar)
                        .addComponent(lb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(paTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(paTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_WMS_PRD", "root", "");
            PreparedStatement statement;
            statement = conn.prepareStatement("DELETE FROM enderecos WHERE id = ?");
            statement.setInt(1,Integer.parseInt(lbl_id.getText()));
            statement.execute();
            statement.close();
            
            JOptionPane.showMessageDialog(rootPane, "local excluido");
        } catch (SQLException ex) {
            Logger.getLogger(RF16_POP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void cbx_tipoCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tipoCargaActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        /*try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/DB_WMS_PRD", "root", "");
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE cadastro_de_endereco SET rua='"
                    +this.txt_Rua.getText() + "',corredor='"
                    +this.txt_Corredor.getText() + "',pilha='"
                    +this.txt_Pilha.getText() + "',nivel='"
                    +this.txt_Nivel.getText()
                    +"'WHERE id_endereco='" + this.lbl_id.getText()+"'");
            JOptionPane.showMessageDialog(rootPane, "Endereço Atualizado");
        } catch (SQLException ex) {
            Logger.getLogger(RF16_POP.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_wms_prd", "root", "");
            PreparedStatement statement;
            
            statement = conn.prepareStatement("UPDATE enderecos SET categoria=?, tipo_carga=?, rua=?, corredor=?, pilha=?, nivel=? WHERE id = ?");
            
            statement.setString(1, cbx_categoria.getSelectedItem().toString());
            statement.setString(2, cbx_tipoCarga.getSelectedItem().toString());
            statement.setInt(3, Integer.parseInt(txt_Rua.getText()));
            statement.setInt(4, Integer.parseInt(txt_Corredor.getText()));
            statement.setInt(5, Integer.parseInt(txt_Pilha.getText()));
            statement.setInt(6, Integer.parseInt(txt_Nivel.getText()));
            statement.setInt(7, Integer.parseInt(lbl_id.getText()));
            
            statement.execute();
            statement.close();
            JOptionPane.showMessageDialog(rootPane, "Endereço atualizado");
        } catch (SQLException ex) {
            Logger.getLogger(RF16_POP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void txt_RuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RuaActionPerformed

    private void lb_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_VoltarMouseClicked
        // TODO add your handling code here:

        RF16_LIST jFrame16_List = new RF16_LIST();
        jFrame16_List.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lb_VoltarMouseClicked

    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_WMS_PRD", "root", "");
            PreparedStatement statement;
            statement = conn.prepareStatement("INSERT INTO enderecos(categoria, tipo_carga, rua, corredor, pilha, nivel) VALUES (?, ?, ?, ?, ?, ?)");
            
            statement.setString(1, cbx_categoria.getSelectedItem().toString());
            statement.setString(2, cbx_tipoCarga.getSelectedItem().toString());
            statement.setInt(3, Integer.parseInt(txt_Rua.getText()));
            statement.setInt(4, Integer.parseInt(txt_Corredor.getText()));
            statement.setInt(5, Integer.parseInt(txt_Pilha.getText()));
            statement.setInt(6, Integer.parseInt(txt_Nivel.getText()));
            
            statement.execute();
            statement.close();
            JOptionPane.showMessageDialog(rootPane, "Endereço inserido");
        } catch (SQLException ex) {
            Logger.getLogger(RF16_POP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_SalvarActionPerformed

    private void lbl_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_idActionPerformed
        
    }//GEN-LAST:event_lbl_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RF16_POP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF16_POP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF16_POP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF16_POP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF16_POP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JComboBox<String> cbx_categoria;
    private javax.swing.JComboBox<String> cbx_tipoCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JLabel lb_Voltar;
    private javax.swing.JLabel lbl_Corredor;
    private javax.swing.JLabel lbl_Endereco;
    private javax.swing.JLabel lbl_Nivel;
    private javax.swing.JLabel lbl_Pilha;
    private javax.swing.JLabel lbl_Rua;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JTextField lbl_id;
    private javax.swing.JLabel lbl_tipoCarga;
    private javax.swing.JPanel paTitulo;
    private javax.swing.JTextField txt_Corredor;
    private javax.swing.JTextField txt_Nivel;
    private javax.swing.JTextField txt_Pilha;
    private javax.swing.JTextField txt_Rua;
    private javax.swing.JTextField txt_endereco;
    // End of variables declaration//GEN-END:variables
}
