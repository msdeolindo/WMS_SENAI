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
        Bt_Back = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        LabelT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelT.setForeground(new java.awt.Color(255, 255, 255));
        LabelT.setText("AGENDAMENTOS");

        Bt_Back.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\icon_back.png")); // NOI18N
        Bt_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bt_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCargo.setText("Código");

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
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbx_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_Pes))
                    .addComponent(LabelCpf))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelN)
                    .addComponent(LabelCargo)
                    .addComponent(LabelCpf)
                    .addComponent(LabelCpf1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_Situacao)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Agen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Pes))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Data agendamento", "Tipo de carga", "Tipo", "Situação", "Transportadora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     public void PopularjTable1(String sql) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/DB_WMS_PRD";
            String usuario = "root";
            String senha = "";
            
            Connection con = (Connection)DriverManager.getConnection(url,usuario,senha);
            PreparedStatement banco = con.prepareStatement(sql);
            banco.execute();
            
            ResultSet resultado = banco.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setNumRows(0);
            
            while(resultado.next())
            {
                model.addRow(new Object[]
                {
                    resultado.getString("id"),
                    resultado.getString("cliente_id"),
                    resultado.getString("data_agendamento"),
                    resultado.getString("tipo_carga"),
                    resultado.getString("id"),
                    resultado.getString("situacao"),
                    resultado.getString("transportadora")
                });
            }
            
            banco.execute();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RF14.class.getName()).log(Level.SEVERE, null, ex);
        }
           
      
    }
     
     public void Filtrar(String filtro){
         Connection conexao = null;
          
          String url = "jdbc:mysql://localhost:3306/DB_WMS_PRD";
          String usuario = "root";
          String senha = "";
          
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
       
            Class.forName("com.mysql.cj.jdbc.Driver");
          
            Connection conn;
          
            String sql = "SELECT * FROM agendamentos WHERE data_agendamento=? AND id=? AND cliente_id=? AND situacao=?";
          
            PreparedStatement statement = conexao.prepareStatement(sql);
          
            statement.setString(1,txt_Agen.getText());
            statement.setInt(2,Integer.parseInt(txt_Cod.getText()));
            statement.setInt(3,Integer.parseInt(txt_cliente.getText()));
            statement.setString(4,cbx_Situacao.getSelectedItem().toString());
            
            statement.execute();
            statement.close();
        JOptionPane.showMessageDialog(rootPane,"Boa.");
        
         } catch (SQLException ex) {
            Logger.getLogger(RF14.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RF14.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    private void cbx_SituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_SituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_SituacaoActionPerformed

    private void Bt_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_BackMouseClicked
        RF30 novoFrame = new RF30();
        novoFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bt_BackMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_PesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PesMouseClicked
        
        this.Filtrar("SELECT * FROM agendamentos WHERE data_agendamento=? AND id=? AND cliente_id=? AND situacao=? ORDER BY id ASC");
        
        //this.PopularjTable1("SELECT * FROM agendamentos WHERE data_agendamento AND id AND cliente_id AND situacao ORDER BY id ASC");
         
        /*int lin } catch (SQLException ex) {
            Logger.getLogger(RF14.class.getName()).log(Level.SEVERE, null, ex);
        }ha = jTable1.getSelectedRow(); 
        txt_Agen.setText(jTable1.getValueAt(linha,0).toString());
        txt_Cod.setText(jTable1.getValueAt(linha,1).toString());
        txt_cliente.setText(jTable1.getValueAt(linha,2).toString());*/

        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PesMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Connection conexao = null;
        
        String url ="jdbc:mysql://localhost:3306/DB_WMS_PRD";
        String usuario = "root";
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
    private javax.swing.JLabel Bt_Back;
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelCpf;
    private javax.swing.JLabel LabelCpf1;
    private javax.swing.JLabel LabelN;
    private javax.swing.JLabel LabelT;
    private javax.swing.JLabel btn_Pes;
    private javax.swing.JComboBox<String> cbx_Situacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_Agen;
    private javax.swing.JTextField txt_Cod;
    private javax.swing.JTextField txt_cliente;
    // End of variables declaration//GEN-END:variables
}
