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
 * @author miril
 */
public class RF11 extends javax.swing.JFrame {
    RF08 enviatexto;
    /**
     * Creates new form lista_funcionarios
     */
    public RF11() {
        initComponents();
    }
    
    public void PopularJTable (String sql){
        
        Connection Con = null;
        
        try {
        
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         
        String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
        String user = "dds16_wms";
        String senha = "";
        
         
          Con = DriverManager.getConnection(url,user,senha);
          PreparedStatement banco = Con.prepareStatement(sql);
          banco.execute();
          
           ResultSet resultado = banco.executeQuery(sql);
           
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.setNumRows(0);
            
            
             while(resultado.next()) {
                 model.addRow(new Object[]
                 {
                         
                         resultado.getString("nome"),
                         resultado.getString("cargo"),
                         resultado.getString("cpf"),
                         resultado.getString("contato"),
                         resultado.getString("email"),
                         resultado.getString("rg"),
                         resultado.getString("endereco"),
                         resultado.getString("senha"),
                         resultado.getString("data_nascimento"),
                         resultado.getString("data_admissao"),
                         resultado.getString("escolaridade"),
                         resultado.getString("estado_civil")
                         
                 });       
           
             }
                 
             banco.close();
        
            Con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RF11.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(RF11.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        
        
    }
    
    public void PopularJTableParametro (String sql ){
        
         Connection Con = null;
         
         
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
        String user = "dds16_wms";
        String senha = "";
        
          Con = DriverManager.getConnection(url,user,senha);
          PreparedStatement banco = Con.prepareStatement(sql);
          banco.execute();
          
          
          ResultSet resultado = banco.executeQuery(sql);
          
          DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.setNumRows(0);
            
            
             while(resultado.next()) {
                 model.addRow(new Object[]
                 {
                         
                         resultado.getString("nome"),
                         resultado.getString("cargo"),
                         resultado.getString("cpf"),
                         resultado.getString("contato"),
                         resultado.getString("email"),
                         resultado.getString("rg"),
                         resultado.getString("endereco"),
                         resultado.getString("senha"),
                         resultado.getString("data_nascimento"),
                         resultado.getString("data_admissao"),
                         resultado.getString("escolaridade"),
                         resultado.getString("estado_civil")
                        
                 });       
             }
             
            banco.close();
            Con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RF11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RF11.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        LabelT = new javax.swing.JLabel();
        LabelBack = new javax.swing.JLabel();
        Bt_Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botao_novo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LabelCargo = new javax.swing.JLabel();
        LabelN = new javax.swing.JLabel();
        lbl_cpf = new javax.swing.JLabel();
        TextCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btn_Pes = new javax.swing.JLabel();
        Bt_Novo = new javax.swing.JButton();
        cbxCargo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        LabelT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelT.setForeground(new java.awt.Color(255, 255, 255));
        LabelT.setText("LISTA DE FUNCIONÁRIOS");

        Bt_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_BackMouseClicked(evt);
            }
        });

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        botao_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/img/icon_back.png"))); // NOI18N
        botao_novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_novoMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\icon_back.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelBack)
                    .addComponent(Bt_Back)
                    .addComponent(botao_novo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(LabelT))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_Back)
                    .addComponent(LabelBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelT)
                    .addComponent(jLabel2)
                    .addComponent(botao_novo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCargo.setText("Cargo:");

        LabelN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelN.setText("Nome:");

        lbl_cpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_cpf.setText("CPF:");

        TextCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_Pes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PesMouseClicked(evt);
            }
        });

        Bt_Novo.setBackground(new java.awt.Color(32, 41, 173));
        Bt_Novo.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Novo.setText("Novo");
        Bt_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_NovoActionPerformed(evt);
            }
        });

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Supervisor", "Coordenador Inventário", "Operador Empilhadeira", "Conferente", "Auxiliar Armazém" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelN)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCargo)
                    .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cpf)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_Pes)
                        .addGap(107, 107, 107)
                        .addComponent(Bt_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cpf)
                            .addComponent(LabelCargo)
                            .addComponent(LabelN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bt_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxCargo)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_Pes)
                        .addGap(2, 2, 2)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "CPF", "Contato", "E-mail", "RG", "Endereço", "Senha", "dat.nascimento", "dat.Admissão", "Escolaridade:", "Estado Civil"
            }
        ));
        Table.setGridColor(new java.awt.Color(0, 0, 0));
        Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Table.setShowGrid(true);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1914, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_BackMouseClicked
        RF30 novoFrame = new RF30();
        novoFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bt_BackMouseClicked

    private void Bt_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_NovoActionPerformed
        RF08 novoFrame = new RF08();
        novoFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bt_NovoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Connection Con = null;
            
            
         
                Class.forName("com.mysql.cj.jdbc.Driver");
           
            
        String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
        String user = "dds16_wms";
        String senha = "";
            
            Con = DriverManager.getConnection(url,user,senha);
            
            this.PopularJTable("SELECT * FROM funcionarios ORDER BY Nome ");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RF11.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
                Logger.getLogger(RF11.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_PesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PesMouseClicked
       // NOME FILTROS
       //CARGO FILTROS
       //CPF FILTROS/ 
       
            
        String nome = this.txtNome.getText();
        String cargo = this.cbxCargo.getSelectedItem().toString();
        String cpf = this.TextCpf.getText();
        
        
        if (nome != null){
             this.PopularJTableParametro(" SELECT * FROM funcionarios WHERE nome='" + nome +"'");
        }
        if(cargo != null){
             this.PopularJTableParametro(" SELECT * FROM funcionarios WHERE cargo='" + cargo+"'");        
        }
        if (cpf != null){
            this.PopularJTableParametro(" SELECT * FROM funcionarios WHERE ='" + cpf+"'");
        }
        
     
       
    }//GEN-LAST:event_btn_PesMouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int linha = Table.getSelectedRow();
        String texto_a = Table.getValueAt(linha,0).toString();
        String texto_b = Table.getValueAt(linha,1).toString();
        String texto_c =  Table.getValueAt(linha,2).toString();
        String texto_d =  Table.getValueAt(linha,3).toString();
        String texto_e =  Table.getValueAt(linha,4).toString();
        String texto_f =  Table.getValueAt(linha,5).toString();
        String texto_g =  Table.getValueAt(linha,6).toString();
        String texto_h =  Table.getValueAt(linha,7).toString();
        String texto_i =  Table.getValueAt(linha,8).toString();
        String texto_j =  Table.getValueAt(linha,9).toString();
        String texto_k =  Table.getValueAt(linha,10).toString();
        String texto_l =  Table.getValueAt(linha,11).toString();
        
        
        
        
        enviatexto = new RF08();
        enviatexto.setVisible(true);
        enviatexto.recebendo(texto_a,texto_b, texto_c, texto_d, texto_e,texto_f,texto_g,texto_h,texto_i,texto_j,texto_k,texto_l); 
        this.dispose();
        
        
        
    }//GEN-LAST:event_TableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        RF30 FrameMenu = new RF30();
        FrameMenu.setVisible(true);
        this.dispose();  
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void botao_novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_novoMouseClicked
         RF30 menu = new RF30();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_novoMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       RF30 menu = new RF30();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(RF11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bt_Back;
    private javax.swing.JButton Bt_Novo;
    private javax.swing.JLabel LabelBack;
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelN;
    private javax.swing.JLabel LabelT;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextCpf;
    private javax.swing.JLabel botao_novo;
    private javax.swing.JLabel btn_Pes;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
