/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Content.CadastrarCliente;
import Content.GerarOrdemDeServico;
import Content.Vender;

/**
 *
 * @author Vitoria
 */
public class MenuVendedor extends javax.swing.JFrame {

    /**
     * Creates new form MenuVendedor
     */
    public MenuVendedor() {
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

        panel_menu = new javax.swing.JPanel();
        lbl_title_happetsy = new javax.swing.JLabel();
        lvl_sistema_gerenciamento = new javax.swing.JLabel();
        lbl_version = new javax.swing.JLabel();
        lbl_cadastrar_cliente = new javax.swing.JLabel();
        lbl_gerar_ordem_servico = new javax.swing.JLabel();
        lbl_venda_produt = new javax.swing.JLabel();
        lbl_sair = new javax.swing.JLabel();
        j_content = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(906, 529));

        panel_menu.setBackground(new java.awt.Color(13, 36, 51));
        panel_menu.setPreferredSize(new java.awt.Dimension(271, 713));

        lbl_title_happetsy.setBackground(new java.awt.Color(254, 254, 255));
        lbl_title_happetsy.setFont(new java.awt.Font("URW Gothic L", 1, 20)); // NOI18N
        lbl_title_happetsy.setForeground(new java.awt.Color(254, 254, 254));
        lbl_title_happetsy.setText("H A P P E T S Y");

        lvl_sistema_gerenciamento.setFont(new java.awt.Font("URW Gothic L", 0, 12)); // NOI18N
        lvl_sistema_gerenciamento.setForeground(new java.awt.Color(207, 212, 213));
        lvl_sistema_gerenciamento.setText("Sistema de gerenciamento");

        lbl_version.setFont(new java.awt.Font("URW Gothic L", 0, 12)); // NOI18N
        lbl_version.setForeground(new java.awt.Color(188, 193, 195));
        lbl_version.setText("v0.1");

        lbl_cadastrar_cliente.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_cadastrar_cliente.setForeground(new java.awt.Color(254, 254, 254));
        lbl_cadastrar_cliente.setText("Cadastrar cliente");

        lbl_gerar_ordem_servico.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_gerar_ordem_servico.setForeground(new java.awt.Color(254, 254, 254));
        lbl_gerar_ordem_servico.setText("Gerar ordem de serviço");

        lbl_venda_produt.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_venda_produt.setForeground(new java.awt.Color(254, 254, 254));
        lbl_venda_produt.setText("Realizar venda de produto");

        lbl_sair.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_sair.setForeground(new java.awt.Color(254, 254, 254));
        lbl_sair.setText("Sair");

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvl_sistema_gerenciamento)
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addComponent(lbl_title_happetsy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_version)))
                .addGap(41, 41, 41))
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_sair)
                    .addComponent(lbl_venda_produt)
                    .addComponent(lbl_gerar_ordem_servico)
                    .addComponent(lbl_cadastrar_cliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title_happetsy)
                    .addComponent(lbl_version))
                .addGap(2, 2, 2)
                .addComponent(lvl_sistema_gerenciamento)
                .addGap(40, 40, 40)
                .addComponent(lbl_cadastrar_cliente)
                .addGap(24, 24, 24)
                .addComponent(lbl_venda_produt)
                .addGap(27, 27, 27)
                .addComponent(lbl_gerar_ordem_servico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(lbl_sair)
                .addGap(33, 33, 33))
        );

        j_content.setBackground(new java.awt.Color(244, 244, 244));
        j_content.setPreferredSize(new java.awt.Dimension(678, 536));

        javax.swing.GroupLayout j_contentLayout = new javax.swing.GroupLayout(j_content);
        j_content.setLayout(j_contentLayout);
        j_contentLayout.setHorizontalGroup(
            j_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        j_contentLayout.setVerticalGroup(
            j_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
            .addComponent(j_content, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane j_content;
    private javax.swing.JLabel lbl_cadastrar_cliente;
    private javax.swing.JLabel lbl_gerar_ordem_servico;
    private javax.swing.JLabel lbl_sair;
    private javax.swing.JLabel lbl_title_happetsy;
    private javax.swing.JLabel lbl_venda_produt;
    private javax.swing.JLabel lbl_version;
    private javax.swing.JLabel lvl_sistema_gerenciamento;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}
