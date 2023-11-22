/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
     int id;
     String situacao;
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
        Pnl_conteudoCentral = new javax.swing.JPanel();
        Lbl_cliente = new javax.swing.JLabel();
        Tfd_cliente = new javax.swing.JTextField();
        Lbl_nomeResponsalvel = new javax.swing.JLabel();
        Tfd_nomeResponsavel = new javax.swing.JTextField();
        Lbl_dataAgendamento = new javax.swing.JLabel();
        Tfd_dataAgendamento = new javax.swing.JTextField();
        Lbl_categoria = new javax.swing.JLabel();
        Tfd_categoria = new javax.swing.JTextField();
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
        Btn_situacao = new javax.swing.JButton();
        Pnl_barraAzul = new javax.swing.JPanel();
        Lbl_nomeAgendamento = new javax.swing.JLabel();
        Lbl_iconeBotaoVoltar = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_principal.setBackground(new java.awt.Color(217, 217, 217));

        Pnl_conteudoCentral.setBackground(new java.awt.Color(203, 200, 200));

        Lbl_cliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_cliente.setText("Cliente");

        Tfd_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Lbl_nomeResponsalvel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_nomeResponsalvel.setText("Nome do Responsável");

        Tfd_nomeResponsavel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Lbl_dataAgendamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_dataAgendamento.setText("Data agendamento");

        Tfd_dataAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Lbl_categoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_categoria.setText("Categoria");

        Tfd_categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Lbl_carga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_carga.setText("Carga");

        Tfd_carga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Lbl_quantidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_quantidade.setText("Quantidade");

        Tfd_quantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tfd_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tfd_quantidadeActionPerformed(evt);
            }
        });

        Lbl_transportadora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_transportadora.setText("Transportadora");

        Tfd_transportadora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Lbl_tipoAgendamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_tipoAgendamento.setText("Tipo de agendamento");

        Cbx_tipoAgendamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cbx_tipoAgendamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída", " ", " " }));

        Lbl_tipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lbl_tipo.setText("Tipo");

        Cbx_tipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cbx_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paletizada", "Manual", " " }));

        Tfd_codCarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                                            .addComponent(Tfd_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Lbl_categoria))
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
                            .addComponent(Lbl_categoria)
                            .addComponent(Lbl_carga))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tfd_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_conteudoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tfd_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tfd_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        Btn_situacao.setBackground(new java.awt.Color(32, 41, 173));
        Btn_situacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_situacao.setForeground(new java.awt.Color(255, 255, 255));
        Btn_situacao.setText("Finalizar");
        Btn_situacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_situacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_principalLayout = new javax.swing.GroupLayout(Pnl_principal);
        Pnl_principal.setLayout(Pnl_principalLayout);
        Pnl_principalLayout.setHorizontalGroup(
            Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_principalLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pnl_conteudoCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_principalLayout.createSequentialGroup()
                        .addComponent(Btn_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        Pnl_principalLayout.setVerticalGroup(
            Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_principalLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(Pnl_conteudoCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(Pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

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

        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });

        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/main/ícones WMS/icon_back.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\icon_back.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pnl_barraAzulLayout = new javax.swing.GroupLayout(Pnl_barraAzul);
        Pnl_barraAzul.setLayout(Pnl_barraAzulLayout);
        Pnl_barraAzulLayout.setHorizontalGroup(
            Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btn_back)
                .addGroup(Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(8, 8, 8)
                .addComponent(Lbl_nomeAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_iconeBotaoVoltar)
                .addContainerGap(1650, Short.MAX_VALUE))
        );
        Pnl_barraAzulLayout.setVerticalGroup(
            Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_barraAzulLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addGroup(Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                                .addComponent(Lbl_iconeBotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(Pnl_barraAzulLayout.createSequentialGroup()
                        .addGroup(Pnl_barraAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(Lbl_nomeAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pnl_barraAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_barraAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_iconeBotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_iconeBotaoVoltarMouseClicked


        
    }//GEN-LAST:event_Lbl_iconeBotaoVoltarMouseClicked

    private void Tfd_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tfd_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tfd_quantidadeActionPerformed

    private void Btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalvarActionPerformed
       
        Connection conn;
        PreparedStatement statement;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD","dds16_wms","");
           
            statement = conn.prepareStatement ("INSERT INTO agendamentos (cliente_id,data_agendamento,categoria,carga,quantidade,transportadora,tipo_agendamento,tipo_carga) VALUES (?,?,?,?,?,?,?,?)");
                    statement.setInt(1, Integer.parseInt(Tfd_cliente.getText()));
                    statement.setString(2, Tfd_dataAgendamento.getText());
                    statement.setString(3, Tfd_categoria.getText());
                    statement.setString(4, Tfd_carga.getText());
                    statement.setInt(5, Integer.parseInt(Tfd_quantidade.getText()));
                    statement.setString(6, Tfd_transportadora.getText());
                    statement.setString(7, (String) Cbx_tipoAgendamento.getSelectedItem());
                    statement.setString(8,(String) Cbx_tipo.getSelectedItem());
        
                    statement.execute();
                    statement.close();
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(RF02.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        JOptionPane.showMessageDialog(Pnl_principal,"Agendamento salvo!!");
        
        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SalvarActionPerformed

    private void Btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_editarActionPerformed
       
        Connection conn ;
        PreparedStatement statement;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD","dds16_wms","");

            statement = conn.prepareStatement ("UPDATE agendamentos SET cliente_id = ?, data_agendamento = ?, categoria = ?, carga = ?, quantidade = ?, transportadora = ?,tipo_agendamento = ?,tipo_carga = ? WHERE id = ?");
            
                    statement.setInt(1, Integer.parseInt(Tfd_cliente.getText()));
                    statement.setString(2, Tfd_dataAgendamento.getText());
                    statement.setString(3, Tfd_categoria.getText());
                    statement.setString(4, Tfd_carga.getText());
                    statement.setInt(5, Integer.parseInt(Tfd_quantidade.getText()));
                    statement.setString(6, Tfd_transportadora.getText());
                    statement.setString(7, (String) Cbx_tipoAgendamento.getSelectedItem());
                    statement.setString(8,(String) Cbx_tipo.getSelectedItem());
                    statement.setInt(9, Integer.parseInt(Tfd_nomeResponsavel.getText()));
                    
                    statement.execute();
                    statement.close();
                         
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(RF02.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        JOptionPane.showMessageDialog(Pnl_principal,"Agendamento Atualizado!!");


        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_editarActionPerformed

    private void Btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cancelarActionPerformed
               
        Connection conn ;
        PreparedStatement statement;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD","dds16_wms","");
           statement = conn.prepareStatement("DELETE FROM agendamentos WHERE id ="+id );
        
             statement.execute();
             statement.close();
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(RF02.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        JOptionPane.showMessageDialog(Pnl_principal,"Agendamento cancelado!!");
            

        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_cancelarActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
        RF30 FrameMenu = new RF30();
        FrameMenu.setVisible(true);
        this.dispose();

        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Btn_situacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_situacaoActionPerformed
        Connection conn ;
        PreparedStatement statement;
        String situaca = "finalizado";
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD","dds16_wms","");      
            statement = conn.prepareStatement("UPDATE agendamentos SET situacao = '"+situaca+"' WHERE id ="+id);
             statement.execute();
             statement.close();
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(RF02.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        JOptionPane.showMessageDialog(Pnl_principal,"Situação mudada para 'finalizado'!!");
     
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_situacaoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        RF14 agendamentos = new RF14();
        agendamentos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
    private javax.swing.JButton Btn_situacao;
    private javax.swing.JComboBox<String> Cbx_tipo;
    private javax.swing.JComboBox<String> Cbx_tipoAgendamento;
    private javax.swing.JLabel Lbl_carga;
    private javax.swing.JLabel Lbl_categoria;
    private javax.swing.JLabel Lbl_cliente;
    private javax.swing.JLabel Lbl_codCarga;
    private javax.swing.JLabel Lbl_dataAgendamento;
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
    private javax.swing.JTextField Tfd_categoria;
    private javax.swing.JTextField Tfd_cliente;
    private javax.swing.JTextField Tfd_codCarga;
    private javax.swing.JTextField Tfd_dataAgendamento;
    private javax.swing.JTextField Tfd_nomeResponsavel;
    private javax.swing.JTextField Tfd_quantidade;
    private javax.swing.JTextField Tfd_transportadora;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    public void recebendo(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j){
        Tfd_codCarga.setText(a);
        Tfd_cliente.setText(b);
        Tfd_nomeResponsavel.setText(b);
        Tfd_categoria.setText(c);
        Tfd_carga.setText(d);
        Tfd_quantidade.setText(e);
        Tfd_transportadora.setText(f);
        Tfd_dataAgendamento.setText(g);
        Cbx_tipoAgendamento.setSelectedItem(h);
        Cbx_tipo.setSelectedItem(i);
        
        id = Integer.parseInt(j);
        
    }

}
