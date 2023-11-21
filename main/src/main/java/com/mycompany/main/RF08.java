/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Jamille Galazzi
 */
public class RF08 extends javax.swing.JFrame {

    /**
     * Creates new form janela
     */
    public RF08() {
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

        pnlMenuSuperior = new javax.swing.JPanel();
        lblCadastramentoDeFuncionarios = new javax.swing.JLabel();
        lbl_VoltarMenuPrincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlInformacoes = new javax.swing.JPanel();
        lblDataDeNascimento = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JTextField();
        lblNomeCompleto = new javax.swing.JLabel();
        txtDataDeNascimento = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        lblEscolaridade = new javax.swing.JLabel();
        cbxEscolaridade = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        lblDataDeAdmissao = new javax.swing.JLabel();
        txtDataDeAdmissao = new javax.swing.JTextField();
        lblSenhaParaLogin = new javax.swing.JLabel();
        pwdSenhaParaLogin = new javax.swing.JPasswordField();
        btn_editar_CadastroDeFuncionarios = new javax.swing.JButton();
        btn_excluir_CadastroDeFuncionarios = new javax.swing.JButton();
        tbn_salvar_CadastroDeFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastramento de funcionários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));

        pnlMenuSuperior.setBackground(new java.awt.Color(32, 41, 173));
        pnlMenuSuperior.setToolTipText("pnlMenuSuperior");

        lblCadastramentoDeFuncionarios.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblCadastramentoDeFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastramentoDeFuncionarios.setText("CADASTRAMENTO DE FUNCIONÁRIOS");

        lbl_VoltarMenuPrincipal.setToolTipText("");
        lbl_VoltarMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VoltarMenuPrincipalMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\icon_back.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuSuperiorLayout = new javax.swing.GroupLayout(pnlMenuSuperior);
        pnlMenuSuperior.setLayout(pnlMenuSuperiorLayout);
        pnlMenuSuperiorLayout.setHorizontalGroup(
            pnlMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCadastramentoDeFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_VoltarMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuSuperiorLayout.setVerticalGroup(
            pnlMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuSuperiorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlMenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_VoltarMenuPrincipal)
                    .addComponent(lblCadastramentoDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pnlInformacoes.setBackground(new java.awt.Color(204, 204, 204));
        pnlInformacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlInformacoes.setPreferredSize(new java.awt.Dimension(1665, 816));

        lblDataDeNascimento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblDataDeNascimento.setText("Data de nascimento:");

        txtNomeCompleto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNomeCompleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNomeCompleto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblNomeCompleto.setText("Nome completo:");

        txtDataDeNascimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDataDeNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCPF.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCPF.setText("CPF:");

        txtCPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRG.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblRG.setText("RG:");

        txtRG.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtRG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEndereco.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEndereco.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTelefone.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTelefone.setText("Telefone:");

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEmail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCargo.setText("Cargo:");

        cbxCargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Supervisor", "Coordenador Inventário", "Operador Empilhadeira", "Conferente", "Auxiliar Armazém" }));
        cbxCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxCargo.setPreferredSize(new java.awt.Dimension(88, 28));

        lblEscolaridade.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEscolaridade.setText("Escolaridade:");

        cbxEscolaridade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fundamental incompleto", "Ensino médio incompleto", "Ensino médio completo", "Superior incompleto", "Superior completo" }));
        cbxEscolaridade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxEscolaridade.setPreferredSize(new java.awt.Dimension(88, 28));

        lblEstadoCivil.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEstadoCivil.setText("Estado civil:");

        cbxEstadoCivil.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo" }));
        cbxEstadoCivil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxEstadoCivil.setPreferredSize(new java.awt.Dimension(88, 28));

        lblDataDeAdmissao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblDataDeAdmissao.setText("Data de admissão:");

        txtDataDeAdmissao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDataDeAdmissao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSenhaParaLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSenhaParaLogin.setText("Senha para login:");

        pwdSenhaParaLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pwdSenhaParaLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pwdSenhaParaLogin.setMinimumSize(new java.awt.Dimension(64, 30));
        pwdSenhaParaLogin.setPreferredSize(new java.awt.Dimension(64, 30));

        javax.swing.GroupLayout pnlInformacoesLayout = new javax.swing.GroupLayout(pnlInformacoes);
        pnlInformacoes.setLayout(pnlInformacoesLayout);
        pnlInformacoesLayout.setHorizontalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCompleto)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscolaridade)
                    .addComponent(cbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDataDeNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblTelefone)
                    .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCPF)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRG)
                                    .addComponent(txtRG)
                                    .addComponent(lblCargo)
                                    .addComponent(cbxCargo, 0, 221, Short.MAX_VALUE))))
                        .addGap(103, 103, 103))
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataDeAdmissao)
                            .addComponent(txtDataDeAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdSenhaParaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenhaParaLogin))
                        .addContainerGap(141, Short.MAX_VALUE))))
        );
        pnlInformacoesLayout.setVerticalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDeNascimento)
                    .addComponent(lblCPF)
                    .addComponent(lblRG)
                    .addComponent(lblNomeCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEndereco)
                    .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefone)
                        .addComponent(lblEmail)
                        .addComponent(lblCargo)))
                .addGap(7, 7, 7)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(131, 131, 131)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEscolaridade)
                    .addComponent(lblEstadoCivil)
                    .addComponent(lblDataDeAdmissao)
                    .addComponent(lblSenhaParaLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDataDeAdmissao)
                        .addComponent(pwdSenhaParaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxEscolaridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        btn_editar_CadastroDeFuncionarios.setBackground(new java.awt.Color(32, 41, 173));
        btn_editar_CadastroDeFuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_editar_CadastroDeFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar_CadastroDeFuncionarios.setText("Editar");
        btn_editar_CadastroDeFuncionarios.setPreferredSize(new java.awt.Dimension(170, 35));
        btn_editar_CadastroDeFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_CadastroDeFuncionariosActionPerformed(evt);
            }
        });

        btn_excluir_CadastroDeFuncionarios.setBackground(new java.awt.Color(32, 41, 173));
        btn_excluir_CadastroDeFuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_excluir_CadastroDeFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir_CadastroDeFuncionarios.setText("Excluir");
        btn_excluir_CadastroDeFuncionarios.setPreferredSize(new java.awt.Dimension(170, 35));
        btn_excluir_CadastroDeFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_CadastroDeFuncionariosActionPerformed(evt);
            }
        });

        tbn_salvar_CadastroDeFuncionarios.setBackground(new java.awt.Color(32, 41, 173));
        tbn_salvar_CadastroDeFuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tbn_salvar_CadastroDeFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        tbn_salvar_CadastroDeFuncionarios.setText("Salvar");
        tbn_salvar_CadastroDeFuncionarios.setPreferredSize(new java.awt.Dimension(170, 35));
        tbn_salvar_CadastroDeFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_salvar_CadastroDeFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_editar_CadastroDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btn_excluir_CadastroDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbn_salvar_CadastroDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 1589, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenuSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbn_salvar_CadastroDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir_CadastroDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_CadastroDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pnlMenuSuperior.getAccessibleContext().setAccessibleName("");
        pnlMenuSuperior.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluir_CadastroDeFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_CadastroDeFuncionariosActionPerformed
        // TODO add your handling code here:
         Connection conn;
        try {
        conn = DriverManager.getConnection("jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD","dds16_wms","");
        java.sql.Statement st;
        st = conn.createStatement();
        st.executeUpdate("DELETE FROM funcionarios WHERE cpf='"+this.txtCPF.getText()+"'");
        
         JOptionPane.showMessageDialog(rootPane,"Funcionario Demitido.");
        
        } catch (SQLException ex) {
            Logger.getLogger(RF08.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_excluir_CadastroDeFuncionariosActionPerformed

    private void tbn_salvar_CadastroDeFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_salvar_CadastroDeFuncionariosActionPerformed

             Connection conexao=null;
             
            String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
            String user = "dds16_wms";
            String senha = "";

             Connection conn;
        try {
                conexao = DriverManager.getConnection(url,user,senha);
                Class.forName("com.mysql.cj.jdbc.Driver");
                
               String sql = "INSERT INTO funcionarios (nome,data_nascimento,cpf,rg,endereco,contato,email, cargo ,escolaridade,estado_civil,data_admissao,senha  ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                       
                PreparedStatement statement = conexao.prepareStatement(sql);
               
               statement.setString(1, txtNomeCompleto.getText());
               statement.setString(2, txtDataDeNascimento.getText());
               statement.setString(3, txtCPF.getText());
               statement.setString(4, txtRG.getText());
               statement.setString(5, txtEndereco.getText());
               statement.setString(6, txtTelefone.getText());
               statement.setString(7, txtEmail.getText());
               statement.setString(8, cbxCargo.getSelectedItem().toString());
               statement.setString(9, cbxEscolaridade.getSelectedItem().toString());
               statement.setString(10, cbxEstadoCivil.getSelectedItem().toString());
               statement.setString(11, txtDataDeAdmissao.getText());
               statement.setString(12, pwdSenhaParaLogin.getText());
                   
               statement.execute();
               statement.close();
               JOptionPane.showMessageDialog(rootPane,"Funcionario Inserido.");
               
            } catch (SQLException ex) {
                Logger.getLogger(RF08.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(RF08.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        // TODO add your handling code here:
    }//GEN-LAST:event_tbn_salvar_CadastroDeFuncionariosActionPerformed

    private void lbl_VoltarMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VoltarMenuPrincipalMouseClicked
        // TODO add your handling code here:
        RF30 Frame_RF30 = new RF30();
        Frame_RF30.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_VoltarMenuPrincipalMouseClicked

    private void btn_editar_CadastroDeFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_CadastroDeFuncionariosActionPerformed
        // TODO add your handling code here:
        
        Connection conn;
        
        String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
        String user = "dds16_wms";
        String senha = "";
        try {
            
            Connection conexao = DriverManager.getConnection(url,user,senha);
            
            String sql = "UPDATE funcionarios SET nome= ?,data_nascimento=?,rg=?,endereco=?,contato=?,email=?, cargo=?, escolaridade=?, estado_civil=?,data_admissao=?,senha=? WHERE cpf=?; ";
                
               PreparedStatement statement = conexao.prepareStatement(sql);
                    
               statement.setString(1, txtNomeCompleto.getText());
               statement.setString(2, txtDataDeNascimento.getText());
               statement.setString(3, txtRG.getText());
               statement.setString(4, txtEndereco.getText());
               statement.setString(5, txtTelefone.getText());
               statement.setString(6, txtEmail.getText());
               statement.setString(7, cbxCargo.getSelectedItem().toString());
               statement.setString(8, cbxEscolaridade.getSelectedItem().toString());
               statement.setString(9, cbxEstadoCivil.getSelectedItem().toString());
               statement.setString(10, txtDataDeAdmissao.getText());
               statement.setString(11, pwdSenhaParaLogin.getText());
               statement.setString(12, txtCPF.getText());
                   
               statement.execute();
               statement.close();
                    
            
            JOptionPane.showMessageDialog(rootPane, "Funcionario atualizado");
            
         } catch (SQLException ex) {
            Logger.getLogger(RF08.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editar_CadastroDeFuncionariosActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        RF30 Frame_RF30 = new RF30();
        Frame_RF30.setVisible(true);
        this.dispose();
        //botao voltar
        
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(RF08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF08().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar_CadastroDeFuncionarios;
    private javax.swing.JButton btn_excluir_CadastroDeFuncionarios;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JComboBox<String> cbxEscolaridade;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastramentoDeFuncionarios;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblDataDeAdmissao;
    private javax.swing.JLabel lblDataDeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEscolaridade;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSenhaParaLogin;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lbl_VoltarMenuPrincipal;
    private javax.swing.JPanel pnlInformacoes;
    private javax.swing.JPanel pnlMenuSuperior;
    private javax.swing.JPasswordField pwdSenhaParaLogin;
    private javax.swing.JButton tbn_salvar_CadastroDeFuncionarios;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDataDeAdmissao;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    public void recebendo (String texto_a, String texto_b, String texto_c, String texto_d, String texto_e,String texto_f,String texto_g,String texto_h,String texto_i,String texto_j,String texto_k,String texto_l) {
        
        txtNomeCompleto.setText(texto_a);
        cbxCargo.setSelectedItem(texto_b);
        txtCPF.setText(texto_c);
        txtTelefone.setText(texto_d);
        txtEmail.setText(texto_e);
        txtRG.setText(texto_f);
        txtEndereco.setText(texto_g);
        pwdSenhaParaLogin.setText(texto_h);
        txtDataDeNascimento.setText(texto_i);
        txtDataDeAdmissao.setText(texto_j);
        cbxEscolaridade.setSelectedItem(texto_k);
        cbxEstadoCivil.setSelectedItem(texto_l);
        
    }
}
