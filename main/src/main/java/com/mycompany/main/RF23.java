/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pmedeiros
 */
public class RF23 extends javax.swing.JFrame {

    /**
     * Creates new form RF23
     */
    public RF23() {
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

        Pnl_principal = new javax.swing.JPanel();
        Pnl_barraAzul = new javax.swing.JPanel();
        Lbl_localização = new javax.swing.JLabel();
        Lbl_quantidade = new javax.swing.JLabel();
        Lbl_rua = new javax.swing.JLabel();
        Lbl_pilha = new javax.swing.JLabel();
        Lbl_corredor = new javax.swing.JLabel();
        Lbl_nivel = new javax.swing.JLabel();
        Tfd_quantidade = new javax.swing.JTextField();
        Tfd_pilha = new javax.swing.JTextField();
        Tfd_rua = new javax.swing.JTextField();
        Tfd_corredor = new javax.swing.JTextField();
        Tfd_nivel = new javax.swing.JTextField();
        Btn_salvar = new javax.swing.JButton();
        Lbl_contagem = new javax.swing.JLabel();
        Lbl_numeroContagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_principal.setBackground(new java.awt.Color(203, 200, 200));

        Pnl_barraAzul.setBackground(new java.awt.Color(32, 41, 173));

        Lbl_localização.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_localização.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lbl_localização.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_localização.setText("LOCALIZAÇÃO");

        javax.swing.GroupLayout Pnl_barraAzulLayout = new javax.swing.GroupLayout(Pnl_barraAzul);
        Pnl_barraAzul.setLayout(Pnl_barraAzulLayout);
        Pnl_barraAzulLayout.setHorizontalGroup(
            Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Lbl_localização)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_barraAzulLayout.setVerticalGroup(
            Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Lbl_localização)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Lbl_quantidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_quantidade.setText("Quantidade");

        Lbl_rua.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_rua.setText("Rua");

        Lbl_pilha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_pilha.setText("Pilha");

        Lbl_corredor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_corredor.setText("Corredor");

        Lbl_nivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_nivel.setText("Nivel");

        Btn_salvar.setBackground(new java.awt.Color(32, 41, 173));
        Btn_salvar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Btn_salvar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_salvar.setText("Salvar");

        Lbl_contagem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_contagem.setText("Contagem : ");

        Lbl_numeroContagem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_numeroContagem.setForeground(new java.awt.Color(240, 10, 16));
        Lbl_numeroContagem.setText("100");

        javax.swing.GroupLayout Pnl_principalLayout = new javax.swing.GroupLayout(Pnl_principal);
        Pnl_principal.setLayout(Pnl_principalLayout);
        Pnl_principalLayout.setHorizontalGroup(
            Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_barraAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Pnl_principalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Pnl_principalLayout.createSequentialGroup()
                        .addComponent(Lbl_quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tfd_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lbl_contagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_numeroContagem))
                    .addGroup(Pnl_principalLayout.createSequentialGroup()
                        .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pnl_principalLayout.createSequentialGroup()
                                .addComponent(Lbl_rua)
                                .addGap(18, 18, 18)
                                .addComponent(Tfd_rua))
                            .addGroup(Pnl_principalLayout.createSequentialGroup()
                                .addComponent(Lbl_pilha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tfd_pilha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_corredor)
                            .addComponent(Lbl_nivel))
                        .addGap(18, 18, 18)
                        .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tfd_corredor)
                            .addComponent(Tfd_nivel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addComponent(Btn_salvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        Pnl_principalLayout.setVerticalGroup(
            Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_principalLayout.createSequentialGroup()
                .addComponent(Pnl_barraAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_quantidade)
                    .addComponent(Tfd_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_contagem)
                    .addComponent(Lbl_numeroContagem))
                .addGap(63, 63, 63)
                .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_rua)
                    .addComponent(Lbl_corredor)
                    .addComponent(Tfd_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tfd_corredor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_pilha)
                    .addComponent(Lbl_nivel)
                    .addComponent(Tfd_pilha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tfd_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Btn_salvar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RF23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF23().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_salvar;
    private javax.swing.JLabel Lbl_contagem;
    private javax.swing.JLabel Lbl_corredor;
    private javax.swing.JLabel Lbl_localização;
    private javax.swing.JLabel Lbl_nivel;
    private javax.swing.JLabel Lbl_numeroContagem;
    private javax.swing.JLabel Lbl_pilha;
    private javax.swing.JLabel Lbl_quantidade;
    private javax.swing.JLabel Lbl_rua;
    private javax.swing.JPanel Pnl_barraAzul;
    private javax.swing.JPanel Pnl_principal;
    private javax.swing.JTextField Tfd_corredor;
    private javax.swing.JTextField Tfd_nivel;
    private javax.swing.JTextField Tfd_pilha;
    private javax.swing.JTextField Tfd_quantidade;
    private javax.swing.JTextField Tfd_rua;
    // End of variables declaration//GEN-END:variables
}
