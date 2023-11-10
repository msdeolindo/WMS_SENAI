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
 * @author jsantos
 */
public class RF28 extends javax.swing.JFrame {

    /**
     * Creates new form PROTOTIPAGEM_28_TELA
     */
    public RF28() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NUN_CARGA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ORIGEM_RUA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ORIGEM_CORREDOR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ORINGEM_PILHA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ORIGEM_NIVEL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DESTINO_RUA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        DESTINO_CORREDOR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DESTINO_PILHA = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DESTINO_NIVEL = new javax.swing.JTextField();
        REGISTRAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        VOLTAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("Localização de Origem:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("RUA:");

        NUN_CARGA.setBackground(new java.awt.Color(228, 217, 217));
        NUN_CARGA.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        NUN_CARGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUN_CARGAActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setText("CARGA:");

        ORIGEM_RUA.setBackground(new java.awt.Color(228, 217, 217));
        ORIGEM_RUA.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        ORIGEM_RUA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ORIGEM_RUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORIGEM_RUAActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setText("CORREDOR:");

        ORIGEM_CORREDOR.setBackground(new java.awt.Color(228, 217, 217));
        ORIGEM_CORREDOR.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        ORIGEM_CORREDOR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ORIGEM_CORREDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORIGEM_CORREDORActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setText("PILHA:");

        ORINGEM_PILHA.setBackground(new java.awt.Color(228, 217, 217));
        ORINGEM_PILHA.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        ORINGEM_PILHA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ORINGEM_PILHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORINGEM_PILHAActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setText("NIVEL:");

        ORIGEM_NIVEL.setBackground(new java.awt.Color(228, 217, 217));
        ORIGEM_NIVEL.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        ORIGEM_NIVEL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ORIGEM_NIVEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORIGEM_NIVELActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setText("Localização de Destino:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel9.setText("RUA:");

        DESTINO_RUA.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        DESTINO_RUA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DESTINO_RUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESTINO_RUAActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel10.setText("CORREDOR:");

        DESTINO_CORREDOR.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        DESTINO_CORREDOR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DESTINO_CORREDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESTINO_CORREDORActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel11.setText("PILHA:");

        DESTINO_PILHA.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        DESTINO_PILHA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DESTINO_PILHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESTINO_PILHAActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel12.setText("NIVEL:");

        DESTINO_NIVEL.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        DESTINO_NIVEL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DESTINO_NIVEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESTINO_NIVELActionPerformed(evt);
            }
        });

        REGISTRAR.setBackground(new java.awt.Color(32, 38, 173));
        REGISTRAR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        REGISTRAR.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRAR.setText("Registrar");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });
        REGISTRAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                REGISTRARKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(32, 41, 173));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MOVIMENTAÇÃO DE ESTOQUE");

        VOLTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLTARMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VOLTAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VOLTAR))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NUN_CARGA))
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(1, 1, 1)
                                        .addComponent(ORIGEM_RUA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addGap(12, 12, 12)
                                        .addComponent(ORIGEM_CORREDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ORINGEM_PILHA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ORIGEM_NIVEL, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(REGISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(1, 1, 1)
                                .addComponent(DESTINO_RUA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addGap(12, 12, 12)
                                .addComponent(DESTINO_CORREDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DESTINO_PILHA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DESTINO_NIVEL, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(NUN_CARGA)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ORIGEM_RUA)
                    .addComponent(jLabel5)
                    .addComponent(ORIGEM_CORREDOR)
                    .addComponent(jLabel6)
                    .addComponent(ORINGEM_PILHA)
                    .addComponent(jLabel7)
                    .addComponent(ORIGEM_NIVEL))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(DESTINO_RUA)
                    .addComponent(jLabel10)
                    .addComponent(DESTINO_CORREDOR)
                    .addComponent(jLabel11)
                    .addComponent(DESTINO_PILHA)
                    .addComponent(jLabel12)
                    .addComponent(DESTINO_NIVEL))
                .addGap(34, 34, 34)
                .addComponent(REGISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NUN_CARGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUN_CARGAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUN_CARGAActionPerformed

    private void ORIGEM_RUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORIGEM_RUAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ORIGEM_RUAActionPerformed

    private void ORIGEM_CORREDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORIGEM_CORREDORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ORIGEM_CORREDORActionPerformed

    private void ORINGEM_PILHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORINGEM_PILHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ORINGEM_PILHAActionPerformed

    private void ORIGEM_NIVELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORIGEM_NIVELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ORIGEM_NIVELActionPerformed

    private void DESTINO_RUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESTINO_RUAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESTINO_RUAActionPerformed

    private void DESTINO_CORREDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESTINO_CORREDORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESTINO_CORREDORActionPerformed

    private void DESTINO_PILHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESTINO_PILHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESTINO_PILHAActionPerformed

    private void DESTINO_NIVELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESTINO_NIVELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESTINO_NIVELActionPerformed

    private void VOLTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLTARMouseClicked
        // TODO add your handling code here:
        RF15 FrameRegistroDeCarga = new RF15();
        FrameRegistroDeCarga.setVisible (true);
        this.dispose();
        
    }//GEN-LAST:event_VOLTARMouseClicked

    private void REGISTRARKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_REGISTRARKeyPressed
        // TODO add your handling code here:
        RF25 REGISTRAR = new RF25();
        REGISTRAR.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_REGISTRARKeyPressed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_WMS_PRD", "root", "");
            PreparedStatement statement;
            statement = conn.prepareStatement("UPDATE cargas SET rua = ?,corredor = ?,pilha = ?,nivel = ?, WHERE id = ?");
            
            
            statement.setString(1,DESTINO_RUA.getText());
            statement.setString(2,DESTINO_CORREDOR.getText());
            statement.setString(3,DESTINO_PILHA.getText());
            statement.setString(4,DESTINO_NIVEL.getText());
            statement.setString(5,NUN_CARGA.getText());
            
            
            statement.execute();
            statement.close();
            JOptionPane.showMessageDialog(rootPane, " ATUALIZADO");
            
            
            
        } catch (SQLException ex) {
                System.out.println("erro !!!!!!!!!!!!!"+ex);
        }  
        // TODO add your handling code here:
    }//GEN-LAST:event_REGISTRARActionPerformed

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
            java.util.logging.Logger.getLogger(RF28.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF28.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF28.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF28.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF28().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DESTINO_CORREDOR;
    private javax.swing.JTextField DESTINO_NIVEL;
    private javax.swing.JTextField DESTINO_PILHA;
    private javax.swing.JTextField DESTINO_RUA;
    private javax.swing.JTextField NUN_CARGA;
    private javax.swing.JTextField ORIGEM_CORREDOR;
    private javax.swing.JTextField ORIGEM_NIVEL;
    private javax.swing.JTextField ORIGEM_RUA;
    private javax.swing.JTextField ORINGEM_PILHA;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JLabel VOLTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
