package com.mycompany.main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aoliveira
 */
public class RF18 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public RF18() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel_principal = new javax.swing.JPanel();
        jPanel_topo_azul = new javax.swing.JPanel();
        lbl_recebimento = new javax.swing.JLabel();
        lbl_icone_voltar = new javax.swing.JLabel();
        jPanel_tela_informação = new javax.swing.JPanel();
        lbl_obeservação = new javax.swing.JLabel();
        lbl_avarias = new javax.swing.JLabel();
        lbl_quantidade_avarias = new javax.swing.JLabel();
        bt_salvar = new javax.swing.JButton();
        tf_quantidade = new javax.swing.JTextField();
        tf_avarias = new javax.swing.JTextField();
        tf_observação = new javax.swing.JTextField();
        bt_devolução = new javax.swing.JButton();
        tf_codigo = new javax.swing.JTextField();
        jsp_tabela_agendamento = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_principal.setBackground(new java.awt.Color(217, 217, 217));
        jPanel_principal.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel_topo_azul.setBackground(new java.awt.Color(32, 41, 171));

        lbl_recebimento.setBackground(new java.awt.Color(255, 255, 255));
        lbl_recebimento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_recebimento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_recebimento.setText("RECEBIMENTO");

        lbl_icone_voltar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_icone_voltar.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\icon_back.png")); // NOI18N
        lbl_icone_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_icone_voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_topo_azulLayout = new javax.swing.GroupLayout(jPanel_topo_azul);
        jPanel_topo_azul.setLayout(jPanel_topo_azulLayout);
        jPanel_topo_azulLayout.setHorizontalGroup(
            jPanel_topo_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_topo_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_icone_voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_recebimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_topo_azulLayout.setVerticalGroup(
            jPanel_topo_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_topo_azulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_topo_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_recebimento)
                    .addComponent(lbl_icone_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbl_recebimento.getAccessibleContext().setAccessibleDescription("lbl_recebimento");

        jPanel_tela_informação.setBackground(new java.awt.Color(203, 200, 200));
        jPanel_tela_informação.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_obeservação.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_obeservação.setText("OBS:");

        lbl_avarias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_avarias.setText("AVARIAS:");

        lbl_quantidade_avarias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_quantidade_avarias.setText("QTD:");

        bt_salvar.setBackground(new java.awt.Color(32, 41, 171));
        bt_salvar.setForeground(new java.awt.Color(255, 255, 255));
        bt_salvar.setText("SALVAR");
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        tf_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantidadeActionPerformed(evt);
            }
        });

        tf_avarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_avariasActionPerformed(evt);
            }
        });

        tf_observação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_observaçãoActionPerformed(evt);
            }
        });

        bt_devolução.setBackground(new java.awt.Color(32, 41, 171));
        bt_devolução.setForeground(new java.awt.Color(255, 255, 255));
        bt_devolução.setText("DEVOLUÇÃO");
        bt_devolução.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_devoluçãoActionPerformed(evt);
            }
        });

        tf_codigo.setText("12357985");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", ""},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CLIENTE", "TIPO", "TRANSPORTADORA", "ESPECIFICAÇÂO", "DATA"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jsp_tabela_agendamento.setViewportView(jTable2);

        jLabel2.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\lupa_cinza4.0.png")); // NOI18N

        lblEndereco.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEndereco.setText("CODIGO DA CARGA:");

        javax.swing.GroupLayout jPanel_tela_informaçãoLayout = new javax.swing.GroupLayout(jPanel_tela_informação);
        jPanel_tela_informação.setLayout(jPanel_tela_informaçãoLayout);
        jPanel_tela_informaçãoLayout.setHorizontalGroup(
            jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsp_tabela_agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 1515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_avarias, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_avarias))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_obeservação)
                                    .addComponent(tf_observação, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_quantidade_avarias)))
                            .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                                .addGap(557, 557, 557)
                                .addComponent(bt_devolução, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)
                                .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel_tela_informaçãoLayout.setVerticalGroup(
            jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jsp_tabela_agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_avarias)
                    .addComponent(lbl_obeservação)
                    .addComponent(lbl_quantidade_avarias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_observação, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_avarias)
                    .addComponent(tf_quantidade))
                .addGap(94, 94, 94)
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_devolução, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(348, 348, 348))
        );

        javax.swing.GroupLayout jPanel_principalLayout = new javax.swing.GroupLayout(jPanel_principal);
        jPanel_principal.setLayout(jPanel_principalLayout);
        jPanel_principalLayout.setHorizontalGroup(
            jPanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_topo_azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_principalLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jPanel_tela_informação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel_principalLayout.setVerticalGroup(
            jPanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_principalLayout.createSequentialGroup()
                .addComponent(jPanel_topo_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(jPanel_tela_informação, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 1927, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        RF23 FrameLocalizacao = new RF23();
        FrameLocalizacao.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void tf_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quantidadeActionPerformed

    private void tf_avariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_avariasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_avariasActionPerformed

    private void tf_observaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_observaçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_observaçãoActionPerformed

    private void bt_devoluçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_devoluçãoActionPerformed
        RF22 FrameDevolucao = new RF22();
        FrameDevolucao.setVisible(true);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_bt_devoluçãoActionPerformed

    private void lbl_icone_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icone_voltarMouseClicked
        RF30 FrameMenu = new RF30();
        FrameMenu.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_lbl_icone_voltarMouseClicked

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
            java.util.logging.Logger.getLogger(RF18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_devolução;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_principal;
    private javax.swing.JPanel jPanel_tela_informação;
    private javax.swing.JPanel jPanel_topo_azul;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane jsp_tabela_agendamento;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lbl_avarias;
    private javax.swing.JLabel lbl_icone_voltar;
    private javax.swing.JLabel lbl_obeservação;
    private javax.swing.JLabel lbl_quantidade_avarias;
    private javax.swing.JLabel lbl_recebimento;
    private javax.swing.JTextField tf_avarias;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_observação;
    private javax.swing.JTextField tf_quantidade;
    // End of variables declaration//GEN-END:variables
}
