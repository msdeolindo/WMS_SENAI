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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JulioBasso
 */
public class RF16_LIST extends javax.swing.JFrame {
        RF16_POP enviatexto;
    /**
     * Creates new form RF_16
     */
    public RF16_LIST() {
        initComponents();
    }
    
    public void PopularJtable(String sql){
        
        try {
            String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
            String usuario = "dds16_wms";
            String senha = "";
            
            
            Connection con=(Connection)DriverManager.getConnection(url,usuario,senha);
            PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
            
            ResultSet resultado = banco.executeQuery(sql);
          
            DefaultTableModel model = (DefaultTableModel) tb_Endereco.getModel();
            model.setNumRows(0);
            
            while(resultado.next())
            {
                
                model.addRow(new Object[]
                {
                    //retorna os dados da tabela do BD, cada campo e uma coluna.
                    resultado.getString("id"),
                    resultado.getString("rua"),
                    resultado.getString("corredor"),
                    resultado.getString("pilha"),
                    resultado.getString("nivel"),
                    resultado.getString("endereco")
                    
                });
            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RF16_LIST.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        pBody = new javax.swing.JPanel();
        bt_Novo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Endereco = new javax.swing.JTable();
        paTitulo = new javax.swing.JPanel();
        lb_Titulo = new javax.swing.JLabel();
        lbl_Voltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE ARMAZENAGEM");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bt_Novo.setText("Novo");
        bt_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_NovoActionPerformed(evt);
            }
        });

        tb_Endereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Rua", "Corredor", "Pilha", "Nivel", "Endereco"
            }
        ));
        tb_Endereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_EnderecoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Endereco);

        javax.swing.GroupLayout pBodyLayout = new javax.swing.GroupLayout(pBody);
        pBody.setLayout(pBodyLayout);
        pBodyLayout.setHorizontalGroup(
            pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pBodyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bt_Novo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBodyLayout.setVerticalGroup(
            pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBodyLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(bt_Novo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paTitulo.setBackground(new java.awt.Color(0, 51, 153));
        paTitulo.setPreferredSize(new java.awt.Dimension(444, 100));

        lb_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        lb_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_Titulo.setText("ENDEREÇO DE ARMAZENAGEM");

        lbl_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VoltarMouseClicked(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout paTituloLayout = new javax.swing.GroupLayout(paTitulo);
        paTitulo.setLayout(paTituloLayout);
        paTituloLayout.setHorizontalGroup(
            paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paTituloLayout.createSequentialGroup()
                .addGroup(paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Voltar))
                    .addGroup(paTituloLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paTituloLayout.setVerticalGroup(
            paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paTituloLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(lbl_Voltar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBody, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_NovoActionPerformed
        // TODO add your handling code here:
        RF16_POP jFrame16_POP = new RF16_POP();
        jFrame16_POP.setVisible(true);
        
    }//GEN-LAST:event_bt_NovoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Connection conexao = null;
            PreparedStatement statement = null;
            
            String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
            String usuario = "dds16_wms";
            String senha = "";
            
            Connection con=(Connection)DriverManager.getConnection(url,usuario,senha);
            
            this.PopularJtable("SELECT * FROM enderecos ORDER BY id DESC");
        } catch (SQLException ex) {
            Logger.getLogger(RF16_LIST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void tb_EnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_EnderecoMouseClicked
        int linha = tb_Endereco.getSelectedRow();
       
       String TEXTO_a = (tb_Endereco.getValueAt(linha,0).toString());
       String TEXTO_b = (tb_Endereco.getValueAt(linha,1).toString());
       String TEXTO_c = (tb_Endereco.getValueAt(linha,2).toString());
       String TEXTO_d = (tb_Endereco.getValueAt(linha,3).toString());
       String TEXTO_e = (tb_Endereco.getValueAt(linha,4).toString());
       String TEXTO_f = (tb_Endereco.getValueAt(linha,5).toString());
       enviatexto = new RF16_POP();
       enviatexto.setVisible(true);
       enviatexto.recebendo_valor_tb(TEXTO_a, TEXTO_b, TEXTO_c, TEXTO_d, TEXTO_e, TEXTO_f);
       RF16_LIST jFrame16_List = new RF16_LIST();
       jFrame16_List.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_tb_EnderecoMouseClicked

    private void lbl_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VoltarMouseClicked
        RF30 jFrame30 = new RF30();
        jFrame30.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_VoltarMouseClicked

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
            java.util.logging.Logger.getLogger(RF16_LIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF16_LIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF16_LIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF16_LIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF16_LIST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Novo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JLabel lbl_Voltar;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel paTitulo;
    private javax.swing.JTable tb_Endereco;
    // End of variables declaration//GEN-END:variables
}
