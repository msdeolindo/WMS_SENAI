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
 * @author bpatrocinio
 */
public class RF01 extends javax.swing.JFrame {
        RF15 enviatexto;
    /**
     * Creates new form PROTOTIPAGEM_14
     */
    public RF01() {
        initComponents();
    }
public void PopularJTable (String sql) {
    
       try {
     
            Connection con = (Connection)DriverManager.getConnection ("jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD","dds16_wms","");

            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute();
            
            ResultSet resultado = banco.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel) tbl_TabelaDasCargasArmazenadas.getModel();
            model.setNumRows(0);
            
            while (resultado.next())
            {
                model.addRow(new Object[]
                {
                    resultado.getString("etiqueta"),
                    resultado.getString("agendamento_id"),
                    resultado.getString("carga"),//produto
                    resultado.getString("categoria"),
                    resultado.getString("tipo_carga"),
                    resultado.getString("situacao"),
                    resultado.getString("rua"),
                    resultado.getString("corredor"),
                    resultado.getString("pilha"),
                    resultado.getString("nivel"),
                    resultado.getString("quantidade"),
                    resultado.getString("data_agendamento")
                });
            }
            banco.close();
            con.close();
        
            
        } catch (SQLException ex) {
            Logger.getLogger(RF01.class.getName()).log(Level.SEVERE, null, ex);
        }
   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_PlanoDeFundo = new javax.swing.JPanel();
        pnl_Titulo_ListaDoArmazem = new javax.swing.JPanel();
        lbl_Titulo_ListaDoArmazem = new javax.swing.JLabel();
        lbl_Voltar = new javax.swing.JLabel();
        pnl_Inf_ListaDoArmazen = new javax.swing.JPanel();
        lbl_CodigoDaCarga = new javax.swing.JLabel();
        txt_Categoria = new javax.swing.JTextField();
        lbl_TipoDeCarga = new javax.swing.JLabel();
        txt_CodigoDaCarga = new javax.swing.JTextField();
        lbl_Categoria = new javax.swing.JLabel();
        txt_TipoDeCarga = new javax.swing.JTextField();
        txt_Situacao = new javax.swing.JTextField();
        lbl_Situacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sln_Inf_CargasArmazenadas = new javax.swing.JScrollPane();
        tbl_TabelaDasCargasArmazenadas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnl_PlanoDeFundo.setBackground(new java.awt.Color(217, 217, 217));
        pnl_PlanoDeFundo.setPreferredSize(new java.awt.Dimension(1920, 1080));
        pnl_PlanoDeFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_PlanoDeFundoMouseClicked(evt);
            }
        });

        pnl_Titulo_ListaDoArmazem.setBackground(new java.awt.Color(36, 32, 171));
        pnl_Titulo_ListaDoArmazem.setPreferredSize(new java.awt.Dimension(1920, 100));

        lbl_Titulo_ListaDoArmazem.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Titulo_ListaDoArmazem.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_Titulo_ListaDoArmazem.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Titulo_ListaDoArmazem.setText("LISTA DO ARMAZEM");

        lbl_Voltar.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\icon_back.png")); // NOI18N
        lbl_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_Titulo_ListaDoArmazemLayout = new javax.swing.GroupLayout(pnl_Titulo_ListaDoArmazem);
        pnl_Titulo_ListaDoArmazem.setLayout(pnl_Titulo_ListaDoArmazemLayout);
        pnl_Titulo_ListaDoArmazemLayout.setHorizontalGroup(
            pnl_Titulo_ListaDoArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Titulo_ListaDoArmazemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_Voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Titulo_ListaDoArmazem)
                .addContainerGap(1489, Short.MAX_VALUE))
        );
        pnl_Titulo_ListaDoArmazemLayout.setVerticalGroup(
            pnl_Titulo_ListaDoArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Titulo_ListaDoArmazemLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnl_Titulo_ListaDoArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Titulo_ListaDoArmazem)
                    .addComponent(lbl_Voltar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnl_Inf_ListaDoArmazen.setBackground(new java.awt.Color(203, 200, 200));
        pnl_Inf_ListaDoArmazen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        lbl_CodigoDaCarga.setBackground(new java.awt.Color(255, 255, 255));
        lbl_CodigoDaCarga.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbl_CodigoDaCarga.setText("Codigo da carga");

        txt_Categoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbl_TipoDeCarga.setBackground(new java.awt.Color(255, 255, 255));
        lbl_TipoDeCarga.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbl_TipoDeCarga.setText("Tipo de carga");

        txt_CodigoDaCarga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbl_Categoria.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Categoria.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbl_Categoria.setText("Categoria");

        txt_TipoDeCarga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txt_Situacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Situacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SituacaoActionPerformed(evt);
            }
        });

        lbl_Situacao.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Situacao.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbl_Situacao.setText("Situação");

        jLabel1.setIcon(new javax.swing.ImageIcon("P:\\TURMAS\\HTC-DDS-16\\ícones WMS\\lupa_cinza.png")); // NOI18N

        javax.swing.GroupLayout pnl_Inf_ListaDoArmazenLayout = new javax.swing.GroupLayout(pnl_Inf_ListaDoArmazen);
        pnl_Inf_ListaDoArmazen.setLayout(pnl_Inf_ListaDoArmazenLayout);
        pnl_Inf_ListaDoArmazenLayout.setHorizontalGroup(
            pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Inf_ListaDoArmazenLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CodigoDaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_CodigoDaCarga))
                .addGap(61, 61, 61)
                .addGroup(pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Categoria)
                    .addComponent(lbl_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TipoDeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TipoDeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Inf_ListaDoArmazenLayout.createSequentialGroup()
                        .addComponent(txt_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)))
                .addContainerGap(643, Short.MAX_VALUE))
        );
        pnl_Inf_ListaDoArmazenLayout.setVerticalGroup(
            pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Inf_ListaDoArmazenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TipoDeCarga, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_CodigoDaCarga)
                        .addComponent(lbl_Categoria)
                        .addComponent(lbl_Situacao)))
                .addGap(17, 17, 17)
                .addGroup(pnl_Inf_ListaDoArmazenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_CodigoDaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TipoDeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Inf_ListaDoArmazenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_PlanoDeFundoLayout = new javax.swing.GroupLayout(pnl_PlanoDeFundo);
        pnl_PlanoDeFundo.setLayout(pnl_PlanoDeFundoLayout);
        pnl_PlanoDeFundoLayout.setHorizontalGroup(
            pnl_PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PlanoDeFundoLayout.createSequentialGroup()
                .addComponent(pnl_Titulo_ListaDoArmazem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_PlanoDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_Inf_ListaDoArmazen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_PlanoDeFundoLayout.setVerticalGroup(
            pnl_PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PlanoDeFundoLayout.createSequentialGroup()
                .addComponent(pnl_Titulo_ListaDoArmazem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pnl_Inf_ListaDoArmazen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbl_TabelaDasCargasArmazenadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_TabelaDasCargasArmazenadas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl_TabelaDasCargasArmazenadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Etiqueta ", "Código Agendamento", "Cargas", "Categoria", "Tipo Carga", "Situação", "Rua", "Corredor", "Pilha", "Nível", "Quantidade", "Data de Agendamento"
            }
        ));
        tbl_TabelaDasCargasArmazenadas.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_TabelaDasCargasArmazenadas.setMaximumSize(new java.awt.Dimension(1900, 1000));
        tbl_TabelaDasCargasArmazenadas.setPreferredSize(new java.awt.Dimension(1900, 1000));
        tbl_TabelaDasCargasArmazenadas.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbl_TabelaDasCargasArmazenadas.setShowGrid(true);
        tbl_TabelaDasCargasArmazenadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TabelaDasCargasArmazenadasMouseClicked(evt);
            }
        });
        sln_Inf_CargasArmazenadas.setViewportView(tbl_TabelaDasCargasArmazenadas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sln_Inf_CargasArmazenadas))
                    .addComponent(pnl_PlanoDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1906, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_PlanoDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sln_Inf_CargasArmazenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      Connection conexao = null;
        PreparedStatement statement = null;
        

          String url = "jdbc:mysql://10.145.41.252:3306/DB_WMS_PRD";
          String usuario = "dds16_wms";
          String senha= "";
    try{
        Class.forName ("com.mysql.jdbc.Driver");
        conexao = DriverManager.getConnection (url,usuario,senha); 
        this.PopularJTable ("SELECT * FROM armazem;"); 
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
   //teste
         
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(RF01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    
    }//GEN-LAST:event_formMouseClicked

    private void tbl_TabelaDasCargasArmazenadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TabelaDasCargasArmazenadasMouseClicked
        int linha = tbl_TabelaDasCargasArmazenadas.getSelectedRow();
        
       String TEXTO_a = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,0).toString());
       String TEXTO_b = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,1).toString());
       String TEXTO_c = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,2).toString());
       String TEXTO_d = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,3).toString());
       String TEXTO_e = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,4).toString());
       String TEXTO_f = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,5).toString());
       String TEXTO_g = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,6).toString());
       String TEXTO_h = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,7).toString());
       String TEXTO_i = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,8).toString());
       String TEXTO_j = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,9).toString());
       String TEXTO_k = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,10).toString());
       String TEXTO_l = (tbl_TabelaDasCargasArmazenadas.getValueAt(linha,11).toString());
       enviatexto = new RF15();
       enviatexto.setVisible(true);
       enviatexto.recebendo_valor_tb(TEXTO_a, TEXTO_b, TEXTO_c, TEXTO_d, TEXTO_e, TEXTO_f, TEXTO_g, TEXTO_h, TEXTO_i, TEXTO_j, TEXTO_k, TEXTO_l);
       RF01 jFrame01 = new RF01();
       jFrame01.setVisible(false);
       this.dispose();
       
    }//GEN-LAST:event_tbl_TabelaDasCargasArmazenadasMouseClicked

    private void pnl_PlanoDeFundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_PlanoDeFundoMouseClicked

    }//GEN-LAST:event_pnl_PlanoDeFundoMouseClicked

    private void txt_SituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SituacaoActionPerformed

    private void lbl_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VoltarMouseClicked
        RF30 menu = new RF30();
        menu.setVisible(true);
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
            java.util.logging.Logger.getLogger(RF01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Categoria;
    private javax.swing.JLabel lbl_CodigoDaCarga;
    private javax.swing.JLabel lbl_Situacao;
    private javax.swing.JLabel lbl_TipoDeCarga;
    private javax.swing.JLabel lbl_Titulo_ListaDoArmazem;
    private javax.swing.JLabel lbl_Voltar;
    private javax.swing.JPanel pnl_Inf_ListaDoArmazen;
    private javax.swing.JPanel pnl_PlanoDeFundo;
    private javax.swing.JPanel pnl_Titulo_ListaDoArmazem;
    private javax.swing.JScrollPane sln_Inf_CargasArmazenadas;
    private javax.swing.JTable tbl_TabelaDasCargasArmazenadas;
    private javax.swing.JTextField txt_Categoria;
    private javax.swing.JTextField txt_CodigoDaCarga;
    private javax.swing.JTextField txt_Situacao;
    private javax.swing.JTextField txt_TipoDeCarga;
    // End of variables declaration//GEN-END:variables
}
