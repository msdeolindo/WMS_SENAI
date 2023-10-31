/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tripl
 */
public class RF02 extends javax.swing.JFrame {

    /**
     * Creates new form Tela_de_agendamento
     */
    public RF02() {
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
        Lbl_nomeAgendamento = new javax.swing.JLabel();
        Lbl_iconeBotaoVoltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pnl_conteudoCentral = new javax.swing.JPanel();
        Lbl_cliente = new javax.swing.JLabel();
        Tfd_cliente = new javax.swing.JTextField();
        Lbl_nomeResponsalvel = new javax.swing.JLabel();
        Tfd_nomeResponsavel = new javax.swing.JTextField();
        Lbl_dataAgendamento = new javax.swing.JLabel();
        Tfd_dataAgendamento = new javax.swing.JTextField();
        Lbl_especificacao = new javax.swing.JLabel();
        Tfd_especificacao = new javax.swing.JTextField();
        Lbl_carga = new javax.swing.JLabel();
        Tfd_carga = new javax.swing.JTextField();
        Lbl_quantidade = new javax.swing.JLabel();
        Tfd_quantidade = new javax.swing.JTextField();
        Lbl_transportadora = new javax.swing.JLabel();
        Tfd_transportadora = new javax.swing.JTextField();
        Lbl_tipoAgendamento = new javax.swing.JLabel();
        Cbx_tipoAgendamento = new javax.swing.JComboBox<>();
        Lbl_tipo = new javax.swing.JLabel();
        Cbx_tipo = new javax.swing.JComboBox<>();
        Tfd_codCarga = new javax.swing.JTextField();
        Lbl_codCarga = new javax.swing.JLabel();
        Btn_Salvar = new javax.swing.JButton();
        Btn_cancelar = new javax.swing.JButton();
        Btn_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        Pnl_principal.setBackground(new java.awt.Color(217, 217, 217));

        Pnl_barraAzul.setBackground(new java.awt.Color(32, 41, 173));
        Pnl_barraAzul.setPreferredSize(new java.awt.Dimension(1920, 100));

        Lbl_nomeAgendamento.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Lbl_nomeAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_nomeAgendamento.setText("AGENDAMENTO");

        Lbl_iconeBotaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_iconeBotaoVoltarMouseClicked(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout Pnl_barraAzulLayout = new javax.swing.GroupLayout(Pnl_barraAzul);
        Pnl_barraAzul.setLayout(Pnl_barraAzulLayout);
        Pnl_barraAzulLayout.setHorizontalGroup(
            Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Lbl_iconeBotaoVoltar)
                .addGap(18, 18, 18)
                .addComponent(Lbl_nomeAgendamento)
                .addGap(532, 532, 532)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_barraAzulLayout.setVerticalGroup(
            Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_barraAzulLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Lbl_iconeBotaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lbl_nomeAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );

        Pnl_conteudoCentral.setBackground(new java.awt.Color(203, 200, 200));

        Lbl_cliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_cliente.setText("Cliente");

        Lbl_nomeResponsalvel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_nomeResponsalvel.setText("Nome do Responsável");

        Lbl_dataAgendamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_dataAgendamento.setText("Data agendamento");

        Lbl_especificacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_especificacao.setText("Especificação");

        Lbl_carga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_carga.setText("Carga");

        Lbl_quantidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_quantidade.setText("Quantidade");

        Tfd_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tfd_quantidadeActionPerformed(evt);
            }
        });

        Lbl_transportadora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_transportadora.setText("Transportadora");

        Lbl_tipoAgendamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_tipoAgendamento.setText("Tipo de agendamento");

        Cbx_tipoAgendamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cbx_tipoAgendamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída", " ", " " }));

        Lbl_tipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_tipo.setText("Tipo");

        Cbx_tipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cbx_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paletizada", "Manual", " " }));

        Lbl_codCarga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_codCarga.setText("Cod.Carga");

        javax.swing.GroupLayout Pnl_conteudoCentralLayout = new javax.swing.GroupLayout(Pnl_conteudoCentral);
        Pnl_conteudoCentral.setLayout(Pnl_conteudoCentralLayout);
        Pnl_conteudoCentralLayout.setHorizontalGroup(
            Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_conteudoCentralLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_conteudoCentralLayout.createSequentialGroup()
                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pnl_conteudoCentralLayout.createSequentialGroup()
                                .addComponent(Lbl_cliente)
                                .addGap(828, 828, 828)
                                .addComponent(Lbl_tipoAgendamento))
                            .addGroup(Pnl_conteudoCentralLayout.createSequentialGroup()
                                .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Tfd_nomeResponsavel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                                            .addComponent(Tfd_cliente, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(Lbl_nomeResponsalvel))
                                    .addGroup(Pnl_conteudoCentralLayout.createSequentialGroup()
                                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tfd_especificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Lbl_especificacao))
                                        .addGap(36, 36, 36)
                                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lbl_carga)
                                            .addComponent(Tfd_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lbl_quantidade)
                                            .addComponent(Tfd_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pnl_conteudoCentralLayout.createSequentialGroup()
                                        .addComponent(Tfd_transportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Tfd_dataAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(190, 190, 190)
                                .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Lbl_tipo)
                                    .addComponent(Cbx_tipoAgendamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Cbx_tipo, 0, 248, Short.MAX_VALUE)
                                    .addComponent(Tfd_codCarga)
                                    .addComponent(Lbl_codCarga))))
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(Pnl_conteudoCentralLayout.createSequentialGroup()
                        .addComponent(Lbl_transportadora)
                        .addGap(366, 366, 366)
                        .addComponent(Lbl_dataAgendamento)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Pnl_conteudoCentralLayout.setVerticalGroup(
            Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_conteudoCentralLayout.createSequentialGroup()
                .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_conteudoCentralLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_cliente)
                            .addComponent(Lbl_tipoAgendamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tfd_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbx_tipoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_nomeResponsalvel)
                            .addComponent(Lbl_codCarga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tfd_nomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tfd_codCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_quantidade)
                            .addComponent(Lbl_tipo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_conteudoCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_especificacao)
                            .addComponent(Lbl_carga))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tfd_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tfd_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tfd_especificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cbx_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_transportadora)
                    .addComponent(Lbl_dataAgendamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tfd_dataAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tfd_transportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        Btn_Salvar.setBackground(new java.awt.Color(32, 41, 173));
        Btn_Salvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_Salvar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salvar.setText("Salvar");
        Btn_Salvar.setToolTipText("");
        Btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalvarActionPerformed(evt);
            }
        });

        Btn_cancelar.setBackground(new java.awt.Color(32, 41, 173));
        Btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_cancelar.setText("Cancelar");
        Btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cancelarActionPerformed(evt);
            }
        });

        Btn_editar.setBackground(new java.awt.Color(32, 41, 173));
        Btn_editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_editar.setText("Editar");
        Btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_principalLayout = new javax.swing.GroupLayout(Pnl_principal);
        Pnl_principal.setLayout(Pnl_principalLayout);
        Pnl_principalLayout.setHorizontalGroup(
            Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_barraAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Pnl_principalLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pnl_conteudoCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_principalLayout.createSequentialGroup()
                        .addComponent(Btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        Pnl_principalLayout.setVerticalGroup(
            Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_principalLayout.createSequentialGroup()
                .addComponent(Pnl_barraAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(Pnl_conteudoCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_iconeBotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_iconeBotaoVoltarMouseClicked

        RF30 FrameMenu = new RF30();
        FrameMenu.setVisible(true);
        this.dispose();
        

        
    }//GEN-LAST:event_Lbl_iconeBotaoVoltarMouseClicked

    private void Tfd_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tfd_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tfd_quantidadeActionPerformed

    private void Btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalvarActionPerformed
       
        Connection conn = null;
        java.sql.Statement st = null;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_WMS_PRO","root","");
            st = conn.createStatement();

            st.executeUpdate("INSERT INTO agendamento (cliente,nome_responsavel,data_agendamento,especificacao,carga,quantidade,transportadora,tipo_agendamento,cod_carga,tipo_carga) VALUES ('"
                    +this.Tfd_cliente.getText()+"','"
                    +this.Tfd_nomeResponsavel.getText()+"','"
                    +this.Tfd_dataAgendamento.getText()+"','"
                    +this.Tfd_especificacao.getText()+"','"
                    +this.Tfd_carga.getText()+"',"
                    +this.Tfd_quantidade.getText()+",'"
                    +this.Tfd_transportadora.getText()+"','"
                    +this.Cbx_tipoAgendamento.getSelectedItem()+"','"
                    +this.Tfd_codCarga.getText()+"','"
                    +this.Cbx_tipo.getSelectedItem()+"')"        

            );
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(RF02.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        JOptionPane.showMessageDialog(Pnl_principal,"Agendamento salvo!!");
        
        // TODO add your handling code here:
        
            
        
       
        


        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SalvarActionPerformed

    private void Btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_editarActionPerformed
       
        Connection conn = null;
        java.sql.Statement st = null;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_WMS_PRO","root","");
            st = conn.createStatement();

            st.executeUpdate("UPDATE agendamento SET cliente = '"
                    +this.Tfd_cliente.getText()+"',nome_responsavel = '"
                    +this.Tfd_nomeResponsavel.getText()+"',data_agendamento = '"
                    +this.Tfd_dataAgendamento.getText()+"',especificacao = '"
                    +this.Tfd_especificacao.getText()+"',carga = '"
                    +this.Tfd_carga.getText()+"', quantidade = "
                    +this.Tfd_quantidade.getText()+",transportadora = '"
                    +this.Tfd_transportadora.getText()+"',tipo_agendamento = '"
                    +this.Cbx_tipoAgendamento.getSelectedItem()+"',cod_carga = '"
                    +this.Tfd_codCarga.getText()+"',tipo_carga = '"
                    +this.Cbx_tipo.getSelectedItem()+"' WHERE id = 1"        

            );
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(RF02.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        JOptionPane.showMessageDialog(Pnl_principal,"Agendamento Atualizado!!");


        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_editarActionPerformed

    private void Btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cancelarActionPerformed
               
        Connection conn = null;
        java.sql.Statement st = null;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_WMS_PRO","root","");
            st = conn.createStatement();

            st.executeUpdate("DELETE FROM agendamento WHERE id = 1"
                    
            );
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(RF02.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        JOptionPane.showMessageDialog(Pnl_principal,"Agendamento cancelado!!");

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RF02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Salvar;
    private javax.swing.JButton Btn_cancelar;
    private javax.swing.JButton Btn_editar;
    private javax.swing.JComboBox<String> Cbx_tipo;
    private javax.swing.JComboBox<String> Cbx_tipoAgendamento;
    private javax.swing.JLabel Lbl_carga;
    private javax.swing.JLabel Lbl_cliente;
    private javax.swing.JLabel Lbl_codCarga;
    private javax.swing.JLabel Lbl_dataAgendamento;
    private javax.swing.JLabel Lbl_especificacao;
    private javax.swing.JLabel Lbl_iconeBotaoVoltar;
    private javax.swing.JLabel Lbl_nomeAgendamento;
    private javax.swing.JLabel Lbl_nomeResponsalvel;
    private javax.swing.JLabel Lbl_quantidade;
    private javax.swing.JLabel Lbl_tipo;
    private javax.swing.JLabel Lbl_tipoAgendamento;
    private javax.swing.JLabel Lbl_transportadora;
    private javax.swing.JPanel Pnl_barraAzul;
    private javax.swing.JPanel Pnl_conteudoCentral;
    private javax.swing.JPanel Pnl_principal;
    private javax.swing.JTextField Tfd_carga;
    private javax.swing.JTextField Tfd_cliente;
    private javax.swing.JTextField Tfd_codCarga;
    private javax.swing.JTextField Tfd_dataAgendamento;
    private javax.swing.JTextField Tfd_especificacao;
    private javax.swing.JTextField Tfd_nomeResponsavel;
    private javax.swing.JTextField Tfd_quantidade;
    private javax.swing.JTextField Tfd_transportadora;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
