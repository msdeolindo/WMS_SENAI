/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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

/**
 *
 * @author m.sousa
 */
public class RF14 extends javax.swing.JFrame {
    RF02 enviartexto;
   
    /**
     * Creates new form agendamento_tela
     */
    public RF14() {
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
        LabelT = new javax.swing.JLabel();
        botao_novo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelCargo = new javax.swing.JLabel();
        LabelN = new javax.swing.JLabel();
        LabelCpf = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        txt_Agen = new javax.swing.JTextField();
        txt_Cod = new javax.swing.JTextField();
        cbx_Situacao = new javax.swing.JComboBox<>();
        LabelCpf1 = new javax.swing.JLabel();
        btn_Pes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        LabelT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelT.setForeground(new java.awt.Color(255, 255, 255));
        LabelT.setText("AGENDAMENTOS");

        botao_novo.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\icon_back.png")); // NOI18N
        botao_novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_novoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(botao_novo)
                .addGap(18, 18, 18)
                .addComponent(LabelT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_novo)
                    .addComponent(LabelT))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCargo.setText("Código da carga");

        LabelN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelN.setText("Período agendamento");

        LabelCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCpf.setText("Situação");

        txt_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_Agen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_Cod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx_Situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agendado", "Finalizado", "Cancelado" }));
        cbx_Situacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_SituacaoActionPerformed(evt);
            }
        });

        LabelCpf1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCpf1.setText("Cliente");

        btn_Pes.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\lupa_cinza.png")); // NOI18N
        btn_Pes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PesMouseClicked(evt);
            }
        });

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelN)
                    .addComponent(txt_Agen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCargo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCpf1)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbx_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89)
                        .addComponent(btn_Pes))
                    .addComponent(LabelCpf))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelN)
                    .addComponent(LabelCargo)
                    .addComponent(LabelCpf)
                    .addComponent(LabelCpf1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Agen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Pes)
                    .addComponent(jLabel2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código da carga", "Cliente", "Categoria", "Carga", "Quantidade", "Transportadora", "Data agendamento", "Tipo agendamento", "Tipo", "ID", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1662, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     public void PopularjTable1(String sql) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
       String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
       String usuario = "dds16_wms";
       String senha = "";
            
              Connection con=(Connection)DriverManager.getConnection(url,usuario,senha);
            //Connection con = (Connection)DriverManager.getConnection(url,usuario,senha);
            PreparedStatement banco = con.prepareStatement(sql);
            banco.execute();
            
            ResultSet resultado = banco.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setNumRows(0);
            
            while(resultado.next())
            {
                model.addRow(new Object[]
                {
                    resultado.getInt("carga_id"),
                    resultado.getString("cliente_id"),
                    resultado.getString("categoria"),
                    resultado.getString("carga"),
                    resultado.getString("quantidade"),
                    resultado.getString("transportadora"),
                    resultado.getString("data_agendamento"),
                    resultado.getString("tipo_agendamento"),
                    resultado.getString("tipo_carga"),
                    resultado.getString("id"),
                    resultado.getString("situacao")
                });
            }
            
            banco.execute();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RF14.class.getName()).log(Level.SEVERE, null, ex);
        }
           
      
    }
    
    private void cbx_SituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_SituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_SituacaoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        
        String texto_a = jTable1.getValueAt(linha,0).toString();
        String texto_b = jTable1.getValueAt(linha,1).toString();
        String texto_c = jTable1.getValueAt(linha,2).toString();
        String texto_d = jTable1.getValueAt(linha,3).toString();
        String texto_e = jTable1.getValueAt(linha,4).toString();
        String texto_f = jTable1.getValueAt(linha,5).toString();
        String texto_g = jTable1.getValueAt(linha,6).toString();
        String texto_h = jTable1.getValueAt(linha,7).toString();
        String texto_i = jTable1.getValueAt(linha,8).toString(); 
        String texto_j = jTable1.getValueAt(linha,9).toString(); 
        
        enviartexto = new RF02();
        enviartexto.setVisible(true);
        enviartexto.recebendo(texto_a,texto_b,texto_c,texto_d,texto_e,texto_f,texto_g,texto_h,texto_i,texto_j);     
        this.dispose();
           
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_PesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PesMouseClicked
        
      String id = txt_Cod.getText();
      String data = txt_Agen.getText();
      String cliente = txt_cliente.getText();
      String situacao = cbx_Situacao.getSelectedItem().toString();
      
      //this.PopularjTable1("SELECT * FROM lista_agendamentos WHERE data_agendamento='" + data + "' AND id=" + id + " AND nome_fantasia=" + cliente);
        if (!data.isEmpty()) {
        this.PopularjTable1("SELECT * FROM agendamentos WHERE data_agendamento='" + data + "'");
    } else if (!id.isEmpty()) {
        this.PopularjTable1("SELECT * FROM agendamentos WHERE carga_id=" + id);
    } else if (!cliente.isEmpty()) {
        this.PopularjTable1("SELECT * FROM agendamentos WHERE cliente_id=" + cliente);
    } else if (!situacao.isEmpty()) {
       this.PopularjTable1("SELECT * FROM agendamentos WHERE situacao ='" + situacao+"'");   
    } else {
        this.PopularjTable1("SELECT * FROM agendamentos WHERE data_agendamento='" + data + "' AND carga_id=" + id + " AND cliente_id="+cliente+" situacao='"+situacao+"'");
    }

        
       // TODO add your handling code here:
    }//GEN-LAST:event_btn_PesMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Connection conexao = null;
        
       String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
       String usuario = "dds16_wms";
       String senha = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
          conexao = DriverManager.getConnection(url,usuario,senha);
            this.PopularjTable1("SELECT * FROM agendamentos order by id ASC");
            
            } catch (SQLException ex) {
            Logger.getLogger(RF14.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RF14.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void botao_novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_novoMouseClicked
         RF30 menu = new RF30();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_novoMouseClicked

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
            java.util.logging.Logger.getLogger(RF14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelCpf;
    private javax.swing.JLabel LabelCpf1;
    private javax.swing.JLabel LabelN;
    private javax.swing.JLabel LabelT;
    private javax.swing.JLabel botao_novo;
    private javax.swing.JLabel btn_Pes;
    private javax.swing.JComboBox<String> cbx_Situacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_Agen;
    private javax.swing.JTextField txt_Cod;
    private javax.swing.JTextField txt_cliente;
    // End of variables declaration//GEN-END:variables
}
