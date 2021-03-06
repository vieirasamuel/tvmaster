/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Canal;
import model.Categoria;

/**
 *
 * @author Samuel Vieira
 */
public class TelaCategoriaResultado extends javax.swing.JFrame {
    Categoria categoria;
    boolean salvar = true;
    /**
     * Creates new form TelaCategoriaResultado
     */
    public TelaCategoriaResultado(Categoria categoria){
        initComponents();
        this.categoria = categoria;
    }
    public TelaCategoriaResultado() {
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

        mainPanel = new javax.swing.JPanel();
        jPanelResultado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditarSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        mainPanel.setMaximumSize(new java.awt.Dimension(900, 600));
        mainPanel.setMinimumSize(new java.awt.Dimension(900, 600));
        mainPanel.setName(""); // NOI18N
        mainPanel.setLayout(new java.awt.CardLayout());

        jPanelResultado.setBackground(new java.awt.Color(65, 167, 255));
        jPanelResultado.setName(""); // NOI18N
        jPanelResultado.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel4.setBackground(new java.awt.Color(255, 127, 65));
        jPanel4.setMaximumSize(new java.awt.Dimension(250, 600));
        jPanel4.setMinimumSize(new java.awt.Dimension(250, 600));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TV MASTER");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("NOVA CATEGORIA");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PESQUISAR CATEGORIA");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Wide Latin", 0, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(55, 55, 55))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(80, 80, 80)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LOGOUT");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RESULTADO DA PESQUISA");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NOME:");

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setEnabled(false);

        jButtonExcluir.setBackground(new java.awt.Color(255, 127, 65));
        jButtonExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.setMaximumSize(new java.awt.Dimension(145, 40));
        jButtonExcluir.setMinimumSize(new java.awt.Dimension(145, 40));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditarSalvar.setBackground(new java.awt.Color(255, 127, 65));
        jButtonEditarSalvar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonEditarSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarSalvar.setText("EDITAR");
        jButtonEditarSalvar.setMaximumSize(new java.awt.Dimension(145, 40));
        jButtonEditarSalvar.setMinimumSize(new java.awt.Dimension(145, 40));
        jButtonEditarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelResultadoLayout = new javax.swing.GroupLayout(jPanelResultado);
        jPanelResultado.setLayout(jPanelResultadoLayout);
        jPanelResultadoLayout.setHorizontalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultadoLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResultadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResultadoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResultadoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(158, 158, 158))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResultadoLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(jButtonEditarSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        jPanelResultadoLayout.setVerticalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(53, 53, 53)
                .addComponent(jLabel13)
                .addGap(75, 75, 75)
                .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(jPanelResultado, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarSalvarActionPerformed
        if(salvar == true){
            salvar = false;
            jButtonEditarSalvar.setText("SALVAR");
            jTextNome.setEnabled(true);
        } else {
            categoria.setNome(jTextNome.getText());
            if(categoria.atualizar()){
                salvar = true;
                jButtonEditarSalvar.setText("EDITAR");
                jTextNome.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane, "Atualizado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Problemas na atualização!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonEditarSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane,
            "Você tem certeza que deseja excluir a categoria?",
            "Confirmar exclusão da categoria",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(option == 0){
            Canal canal = new Canal();
            ArrayList<Canal> canais = canal.pesquisarCategoria(categoria.getNome());
            if(!canais.isEmpty()){    
                option = JOptionPane.showConfirmDialog(rootPane,
                        "Há canais associados a esta categoria. Você deseja excluí-la assim mesmo?"
                                + "Note que todos os canais também serão excluídos!",
                        "Confirmar exclusão da categoria",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(option == 0){
                    if(!canal.excluirCanais(categoria.getId())){
                        JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir os canais associados à categoria",
                                "Falha ao excluir canais", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            if(option == 0){
                if (categoria.excluir()){
                    JOptionPane.showMessageDialog(rootPane, "Categoria excluída com sucesso.");
                    TelaCategoriaPesquisar t = new TelaCategoriaPesquisar();
                    mainPanel.removeAll();
                    mainPanel.add(t.getPanel());
                    mainPanel.repaint();
                    mainPanel.revalidate();
                } else{
                    JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir a categoria. Podem haver planos associados a ela.",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        TelaLogin t = new TelaLogin();
        mainPanel.add(t.getPanel());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        TelaMenuAtendente t = new TelaMenuAtendente();
        mainPanel.removeAll();
        mainPanel.add(t.getPanel());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        TelaCategoriaPesquisar t = new TelaCategoriaPesquisar();
        mainPanel.add(t.getPanel());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        TelaCategoriaNova t = new TelaCategoriaNova();
        mainPanel.add(t.getPanel());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jLabel9MouseClicked

    public JPanel getPanel(){
        return mainPanel;
    }
    
    public void setTextFields(){
        jTextNome.setText(categoria.getNome());
    }
    
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
            java.util.logging.Logger.getLogger(TelaCategoriaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategoriaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategoriaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategoriaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCategoriaResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditarSalvar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelResultado;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
