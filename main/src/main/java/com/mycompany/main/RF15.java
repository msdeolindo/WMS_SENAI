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
 * @author braya
 */
public class RF15 extends javax.swing.JFrame {

    /**
     * Creates new form Protipagem15_RegistroDeCarga
     */
    public RF15() {
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

        pnl_PlanoDeFundo = new javax.swing.JPanel();
        pnl_TituloPGN = new javax.swing.JPanel();
        lbl_Titulo_RegistroDeCarga = new javax.swing.JLabel();
        lbl_BotaoVolta = new javax.swing.JLabel();
        pnl_Inf_RegistroDeCarga = new javax.swing.JPanel();
        lbl_Produto = new javax.swing.JLabel();
        txt_Produto = new javax.swing.JTextField();
        lbl_CodigoDaCarga = new javax.swing.JLabel();
        txt_CodigoDaEtiqueta = new javax.swing.JTextField();
        lbl_Categoria = new javax.swing.JLabel();
        txt_Categoria = new javax.swing.JTextField();
        lbl_Quantidade = new javax.swing.JLabel();
        txt_Quantidade = new javax.swing.JTextField();
        lbl_TipoDaCarga = new javax.swing.JLabel();
        lbl_Situacao = new javax.swing.JLabel();
        txt_Situacao = new javax.swing.JTextField();
        lbl_Localizacao = new javax.swing.JLabel();
        lbl_Rua = new javax.swing.JLabel();
        lbl_Corredor = new javax.swing.JLabel();
        lbl_Pilha = new javax.swing.JLabel();
        lbl_Nivel = new javax.swing.JLabel();
        txt_Corredor = new javax.swing.JTextField();
        txt_Rua = new javax.swing.JTextField();
        txt_Pilha = new javax.swing.JTextField();
        txt_Nivel = new javax.swing.JTextField();
        txt_tipoCarga = new javax.swing.JTextField();
        btn_Editar = new javax.swing.JButton();
        btn_Retirar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_PlanoDeFundo.setBackground(new java.awt.Color(217, 217, 217));
        pnl_PlanoDeFundo.setPreferredSize(new java.awt.Dimension(1920, 1080));

        pnl_TituloPGN.setBackground(new java.awt.Color(32, 41, 171));

        lbl_Titulo_RegistroDeCarga.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Titulo_RegistroDeCarga.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_Titulo_RegistroDeCarga.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Titulo_RegistroDeCarga.setText("REGISTRO DE CARGA");

        lbl_BotaoVolta.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\icon_back.png")); // NOI18N
        lbl_BotaoVolta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BotaoVoltaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_TituloPGNLayout = new javax.swing.GroupLayout(pnl_TituloPGN);
        pnl_TituloPGN.setLayout(pnl_TituloPGNLayout);
        pnl_TituloPGNLayout.setHorizontalGroup(
            pnl_TituloPGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TituloPGNLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_BotaoVolta)
                .addGap(18, 18, 18)
                .addComponent(lbl_Titulo_RegistroDeCarga)
                .addContainerGap(1442, Short.MAX_VALUE))
        );
        pnl_TituloPGNLayout.setVerticalGroup(
            pnl_TituloPGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TituloPGNLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnl_TituloPGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_BotaoVolta)
                    .addComponent(lbl_Titulo_RegistroDeCarga))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pnl_Inf_RegistroDeCarga.setBackground(new java.awt.Color(203, 200, 200));
        pnl_Inf_RegistroDeCarga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, null));
        pnl_Inf_RegistroDeCarga.setPreferredSize(new java.awt.Dimension(1900, 732));

        lbl_Produto.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Produto.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Produto.setText("Produto");

        txt_Produto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbl_CodigoDaCarga.setBackground(new java.awt.Color(255, 255, 255));
        lbl_CodigoDaCarga.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_CodigoDaCarga.setText("Código da Etiqueta");

        txt_CodigoDaEtiqueta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbl_Categoria.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Categoria.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Categoria.setText("Categoria");

        txt_Categoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbl_Quantidade.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Quantidade.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Quantidade.setText("Quantidade");

        txt_Quantidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbl_TipoDaCarga.setBackground(new java.awt.Color(255, 255, 255));
        lbl_TipoDaCarga.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_TipoDaCarga.setText("Tipo da carga");

        lbl_Situacao.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Situacao.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Situacao.setText("Situação");

        txt_Situacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbl_Localizacao.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Localizacao.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Localizacao.setText("Localização;");

        lbl_Rua.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Rua.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Rua.setText("Rua");

        lbl_Corredor.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Corredor.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Corredor.setText("Corredor");

        lbl_Pilha.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Pilha.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Pilha.setText("Pilha");

        lbl_Nivel.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Nivel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lbl_Nivel.setText("Nível");

        txt_Corredor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txt_Rua.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txt_Pilha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txt_Nivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txt_tipoCarga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnl_Inf_RegistroDeCargaLayout = new javax.swing.GroupLayout(pnl_Inf_RegistroDeCarga);
        pnl_Inf_RegistroDeCarga.setLayout(pnl_Inf_RegistroDeCargaLayout);
        pnl_Inf_RegistroDeCargaLayout.setHorizontalGroup(
            pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                        .addGap(571, 571, 571)
                        .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Localizacao)
                            .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                                .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                                        .addComponent(lbl_Rua)
                                        .addGap(54, 54, 54)
                                        .addComponent(lbl_Corredor)
                                        .addGap(39, 39, 39))
                                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                                        .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Corredor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)))
                                .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Pilha)
                                    .addComponent(txt_Pilha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Nivel))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                        .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Produto)
                            .addComponent(txt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Quantidade)
                            .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(240, 240, 240)
                        .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CodigoDaCarga)
                            .addComponent(txt_CodigoDaEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_TipoDaCarga)
                            .addComponent(txt_tipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Categoria)
                            .addComponent(txt_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(lbl_Situacao)
                            .addComponent(txt_Situacao))
                        .addGap(201, 201, 201))))
        );
        pnl_Inf_RegistroDeCargaLayout.setVerticalGroup(
            pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                        .addComponent(lbl_Categoria)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Categoria))
                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                        .addComponent(lbl_CodigoDaCarga)
                        .addGap(18, 18, 18)
                        .addComponent(txt_CodigoDaEtiqueta))
                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                        .addComponent(lbl_Produto)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Quantidade)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_TipoDaCarga)
                        .addComponent(lbl_Situacao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_tipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addComponent(lbl_Localizacao)
                .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Corredor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Rua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Corredor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(pnl_Inf_RegistroDeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                                .addComponent(lbl_Nivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_Inf_RegistroDeCargaLayout.createSequentialGroup()
                                .addComponent(lbl_Pilha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Pilha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(203, 203, 203))))
        );

        btn_Editar.setBackground(new java.awt.Color(32, 40, 171));
        btn_Editar.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        btn_Editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Retirar.setBackground(new java.awt.Color(32, 40, 171));
        btn_Retirar.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        btn_Retirar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Retirar.setText("Retirar");
        btn_Retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_PlanoDeFundoLayout = new javax.swing.GroupLayout(pnl_PlanoDeFundo);
        pnl_PlanoDeFundo.setLayout(pnl_PlanoDeFundoLayout);
        pnl_PlanoDeFundoLayout.setHorizontalGroup(
            pnl_PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PlanoDeFundoLayout.createSequentialGroup()
                .addComponent(pnl_TituloPGN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(pnl_PlanoDeFundoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(pnl_Inf_RegistroDeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 1848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PlanoDeFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btn_Retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        pnl_PlanoDeFundoLayout.setVerticalGroup(
            pnl_PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PlanoDeFundoLayout.createSequentialGroup()
                .addComponent(pnl_TituloPGN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(pnl_Inf_RegistroDeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnl_PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_PlanoDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_PlanoDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_BotaoVoltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BotaoVoltaMouseClicked
        // TODO add your handling code here:
        RF01 ListaDeArmazem = new RF01();
        ListaDeArmazem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_BotaoVoltaMouseClicked

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        // TODO add your handling code here:
        RF28 MovimentarCarga = new RF28();
        MovimentarCarga.setVisible(true);
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_RetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetirarActionPerformed
        RF02 Agendamento = new RF02();
        Agendamento.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RetirarActionPerformed

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
            java.util.logging.Logger.getLogger(RF15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Retirar;
    private javax.swing.JLabel lbl_BotaoVolta;
    private javax.swing.JLabel lbl_Categoria;
    private javax.swing.JLabel lbl_CodigoDaCarga;
    private javax.swing.JLabel lbl_Corredor;
    private javax.swing.JLabel lbl_Localizacao;
    private javax.swing.JLabel lbl_Nivel;
    private javax.swing.JLabel lbl_Pilha;
    private javax.swing.JLabel lbl_Produto;
    private javax.swing.JLabel lbl_Quantidade;
    private javax.swing.JLabel lbl_Rua;
    private javax.swing.JLabel lbl_Situacao;
    private javax.swing.JLabel lbl_TipoDaCarga;
    private javax.swing.JLabel lbl_Titulo_RegistroDeCarga;
    private javax.swing.JPanel pnl_Inf_RegistroDeCarga;
    private javax.swing.JPanel pnl_PlanoDeFundo;
    private javax.swing.JPanel pnl_TituloPGN;
    private javax.swing.JTextField txt_Categoria;
    private javax.swing.JTextField txt_CodigoDaEtiqueta;
    private javax.swing.JTextField txt_Corredor;
    private javax.swing.JTextField txt_Nivel;
    private javax.swing.JTextField txt_Pilha;
    private javax.swing.JTextField txt_Produto;
    private javax.swing.JTextField txt_Quantidade;
    private javax.swing.JTextField txt_Rua;
    private javax.swing.JTextField txt_Situacao;
    private javax.swing.JTextField txt_tipoCarga;
    // End of variables declaration//GEN-END:variables
void recebendo_valor_tb(String text_a, String text_b, String text_c, String text_d, String text_e, String text_f, String text_g, String text_h, String text_i, String text_j, String text_k) {
        txt_CodigoDaEtiqueta.setText(text_a);
        txt_Produto.setText(text_c);
        txt_Categoria.setText(text_d);
        txt_Quantidade.setText(text_i);
        txt_tipoCarga.setText(text_e);
        txt_Situacao.setText(text_f);
        txt_Rua.setText(text_g);
        txt_Corredor.setText(text_h);
        txt_Pilha.setText(text_i);
        txt_Nivel.setText(text_k);
        
    }
}
