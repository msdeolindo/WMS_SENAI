package com.mycompany.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */




/**
 *
 * @author mrocha
 */
public class RF27 extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public RF27() {
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

        panel_azul = new javax.swing.JPanel();
        panel_branc = new javax.swing.JPanel();
        bot_entrar = new javax.swing.JButton();
        senha_txt = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        login_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_azul.setBackground(new java.awt.Color(32, 41, 173));

        panel_branc.setBackground(java.awt.Color.white);
        panel_branc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        bot_entrar.setBackground(new java.awt.Color(32, 41, 173));
        bot_entrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bot_entrar.setForeground(new java.awt.Color(255, 255, 255));
        bot_entrar.setText("ENTRAR");
        bot_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_entrarActionPerformed(evt);
            }
        });

        senha_txt.setText("senha_txt");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/main/logo.JPG"))); // NOI18N

        senha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        senha.setText("ESQUECI MINHA SENHA");
        senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhaMouseClicked(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout panel_brancLayout = new javax.swing.GroupLayout(panel_branc);
        panel_branc.setLayout(panel_brancLayout);
        panel_brancLayout.setHorizontalGroup(
            panel_brancLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_brancLayout.createSequentialGroup()
                .addGroup(panel_brancLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_brancLayout.createSequentialGroup()
                        .addGap(754, 754, 754)
                        .addGroup(panel_brancLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(login_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senha_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                    .addGroup(panel_brancLayout.createSequentialGroup()
                        .addGap(815, 815, 815)
                        .addComponent(senha))
                    .addGroup(panel_brancLayout.createSequentialGroup()
                        .addGap(790, 790, 790)
                        .addComponent(bot_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_brancLayout.createSequentialGroup()
                        .addGap(706, 706, 706)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_brancLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1)))
                .addContainerGap(802, Short.MAX_VALUE))
        );
        panel_brancLayout.setVerticalGroup(
            panel_brancLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_brancLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(login_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(senha)
                .addGap(74, 74, 74)
                .addComponent(bot_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout panel_azulLayout = new javax.swing.GroupLayout(panel_azul);
        panel_azul.setLayout(panel_azulLayout);
        panel_azulLayout.setHorizontalGroup(
            panel_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_azulLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel_branc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panel_azulLayout.setVerticalGroup(
            panel_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_azulLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(panel_branc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panel_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaMouseClicked
  RF21 tela_alterar_senha = new RF21();
  tela_alterar_senha.setVisible (true);
  this.dispose();
    }//GEN-LAST:event_senhaMouseClicked

    private void bot_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_entrarActionPerformed
    Connection conexao = null;
        PreparedStatement statement = null;
        
          String url = "jdbc:mysql://localhost:3306/DB_WMS_PRD";
          String usuario = "root";
          String senha= "";
    try{
        Class.forName ("com.mysql.jdbc.Driver");
        conexao = DriverManager.getConnection (url,usuario,senha); 
        String confi = "SELECT * FROM funcionarios WHERE cpf=? AND senha cpf=?"; 
        statement = conexao.prepareStatement(confi);
   statement.setString(1,login_txt.getText());
   statement.setString(2,new String (senha_txt.getPassword()));
   
   ResultSet result = statement.executeQuery();
   boolean val = result.next();
   
   if (val == true) {
       RF30 tela_menu = new RF30 ();
      tela_menu.setVisible (true);
      this.dispose();
   }else{
      JOptionPane.showMessageDialog(rootPane, "Dados invalidos"); 
   }
    
    
    }catch (SQLException ex){
        System.out.print("erro:" + ex.getMessage());

    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(RF27.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        
        
           
    }//GEN-LAST:event_bot_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(RF27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF27().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField login_txt;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel_azul;
    private javax.swing.JPanel panel_branc;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senha_txt;
    // End of variables declaration//GEN-END:variables
}
