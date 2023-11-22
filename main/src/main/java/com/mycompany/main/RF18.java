package com.mycompany.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    RF23 enviatexto;
    
    public RF18() {
        initComponents();
    }
    
    
        public void PopularJTable(String sql) {
        

        
        try {
            String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
            String usuario = "dds16_wms";
            String senha = "";
            
            Connection con = (Connection)DriverManager.getConnection(url,usuario,senha);
            
            PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
            
            banco.execute();
            
            
            ResultSet resultado = banco.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            
            model.setNumRows(0);
            
            while(resultado.next())
            {
                model.addRow(new Object[]
                {
                    resultado.getString("cliente_id"),
                    resultado.getString("tipo_agendamento"),
                    resultado.getString("transportadora"),
                    resultado.getString("categoria"),
                    resultado.getString("data_agendamento")    
                });
                
            }
            
            banco.close();      
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RF18.class.getName()).log(Level.SEVERE, null, ex);
        }
       
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
        jsp_tabela_agendamento = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel_topo_azul = new javax.swing.JPanel();
        lbl_recebimento = new javax.swing.JLabel();
        lbl_icone_voltar = new javax.swing.JLabel();
        lbl_BotaoVolta1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_tela_informação = new javax.swing.JPanel();
        lbl_obeservação = new javax.swing.JLabel();
        lbl_avarias = new javax.swing.JLabel();
        lbl_quantidade_avarias = new javax.swing.JLabel();
        bt_salvar = new javax.swing.JButton();
        tf_quantidade = new javax.swing.JTextField();
        tf_avarias = new javax.swing.JTextField();
        tf_observacao = new javax.swing.JTextField();
        bt_devolução = new javax.swing.JButton();
        tf_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        setBackground(new java.awt.Color(240, 240, 240));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jPanel_topo_azul.setBackground(new java.awt.Color(32, 41, 171));

        lbl_recebimento.setBackground(new java.awt.Color(255, 255, 255));
        lbl_recebimento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_recebimento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_recebimento.setText("RECEBIMENTO");

        lbl_icone_voltar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_icone_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_icone_voltarMouseClicked(evt);
            }
        });

        lbl_BotaoVolta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BotaoVolta1MouseClicked(evt);
            }
        });

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/img/icon_back.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_topo_azulLayout = new javax.swing.GroupLayout(jPanel_topo_azul);
        jPanel_topo_azul.setLayout(jPanel_topo_azulLayout);
        jPanel_topo_azulLayout.setHorizontalGroup(
            jPanel_topo_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_topo_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_icone_voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_BotaoVolta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_topo_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addComponent(lbl_recebimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_topo_azulLayout.setVerticalGroup(
            jPanel_topo_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_topo_azulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_topo_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_BotaoVolta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_icone_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_topo_azulLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(lbl_recebimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tf_quantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantidadeActionPerformed(evt);
            }
        });

        tf_avarias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_avarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_avariasActionPerformed(evt);
            }
        });

        tf_observacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_observacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_observacaoActionPerformed(evt);
            }
        });

        bt_devolução.setBackground(new java.awt.Color(32, 41, 171));
        bt_devolução.setForeground(new java.awt.Color(255, 255, 255));
        bt_devolução.setText("DEVOLUÇÃO");
        bt_devolução.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_devoluçãoMouseClicked(evt);
            }
        });
        bt_devolução.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_devoluçãoActionPerformed(evt);
            }
        });

        tf_codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEndereco.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEndereco.setText("CODIGO DA CARGA:");

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_tela_informaçãoLayout = new javax.swing.GroupLayout(jPanel_tela_informação);
        jPanel_tela_informação.setLayout(jPanel_tela_informaçãoLayout);
        jPanel_tela_informaçãoLayout.setHorizontalGroup(
            jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_avarias, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_avarias))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_obeservação)
                            .addComponent(tf_observacao, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_quantidade_avarias)))
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(bt_devolução, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)))
                .addContainerGap(661, Short.MAX_VALUE))
        );
        jPanel_tela_informaçãoLayout.setVerticalGroup(
            jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel_tela_informaçãoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_avarias)
                    .addComponent(lbl_obeservação)
                    .addComponent(lbl_quantidade_avarias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_observacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_avarias)
                    .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel_tela_informaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_devolução, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(557, 557, 557))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_topo_azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsp_tabela_agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 1664, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_tela_informação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_topo_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(jPanel_tela_informação, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jsp_tabela_agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        //RF23 FrameLocalizacao = new RF23();
        //FrameLocalizacao.setVisible(true);
        //this.dispose();
        // TODO add your handling code here:
        
        enviatexto = new RF23();
        enviatexto.setVisible(true);
        enviatexto.recebendo(tf_quantidade.getText());
        enviatexto.etiqueta(tf_codigo.getText());
        
        Connection conexao = null;
         
        
             String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
            String usuario = "dds16_wms";
            String senha = "";
        
        try {        
            conexao = DriverManager.getConnection(url,usuario,senha);
            
            String sql = "UPDATE agendamentos SET quantidade_avarias = ?,observacao = ?,quantidade_recebida = ? WHERE id = ?";
           
            PreparedStatement statement = conexao.prepareStatement(sql);
             
            statement.setInt(1,Integer.parseInt(tf_avarias.getText()));
            statement.setString(2,tf_observacao.getText());
            statement.setInt(3,Integer.parseInt(tf_quantidade.getText()));
            statement.setInt(4,Integer.parseInt(tf_codigo.getText()));
            
            
           JOptionPane.showMessageDialog(rootPane,"Recebimento salvo.");
           
           statement.execute();
           statement.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(RF18.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
            
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void tf_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quantidadeActionPerformed

    private void tf_avariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_avariasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_avariasActionPerformed

    private void tf_observacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_observacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_observacaoActionPerformed

    private void bt_devoluçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_devoluçãoActionPerformed
        RF22 FrameDevolucao = new RF22();
        FrameDevolucao.setVisible(true);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_bt_devoluçãoActionPerformed

    private void lbl_icone_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icone_voltarMouseClicked

        //vazio!
        
    }//GEN-LAST:event_lbl_icone_voltarMouseClicked

    private void bt_devoluçãoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_devoluçãoMouseClicked
       
    }//GEN-LAST:event_bt_devoluçãoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
   try {
            Connection conexao = null;
            PreparedStatement statement = null;
            
           String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
            String usuario = "dds16_wms";
            String senha = "";
            
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            this.PopularJTable("SELECT * FROM agendamentos ORDER BY ID DESC");
            
          
            
        } catch (SQLException ex) {
            Logger.getLogger(RF18.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      
        this.PopularJTable("SELECT * FROM agendamentos WHERE id = "+this.tf_codigo.getText());
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void lbl_BotaoVolta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BotaoVolta1MouseClicked
       
    }//GEN-LAST:event_lbl_BotaoVolta1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        RF30 FrameMenu = new RF30();
        FrameMenu.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     RF30 menu = new RF30();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_tela_informação;
    private javax.swing.JPanel jPanel_topo_azul;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane jsp_tabela_agendamento;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lbl_BotaoVolta1;
    private javax.swing.JLabel lbl_avarias;
    private javax.swing.JLabel lbl_icone_voltar;
    private javax.swing.JLabel lbl_obeservação;
    private javax.swing.JLabel lbl_quantidade_avarias;
    private javax.swing.JLabel lbl_recebimento;
    private javax.swing.JTextField tf_avarias;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_observacao;
    private javax.swing.JTextField tf_quantidade;
    // End of variables declaration//GEN-END:variables
}
