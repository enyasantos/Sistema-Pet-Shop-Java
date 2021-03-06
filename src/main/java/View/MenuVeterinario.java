/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Content.ListarClientes;
import Content.VisualizarOrdemServico;
import Models.Veterinario;
import Models.Registro;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author enya
 */
public class MenuVeterinario extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdministrados
     */
    private Veterinario vet;
    private Registro reg;
    VisualizarOrdemServico tela;

    public MenuVeterinario() {
        initComponents();
    }

    public MenuVeterinario(Veterinario vet, Registro reg) {
        initComponents();
        this.vet = vet;
        this.reg = reg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j_content = new javax.swing.JDesktopPane();
        panel_menu = new javax.swing.JPanel();
        lbl_sair = new javax.swing.JLabel();
        lbl_title_happetsy = new javax.swing.JLabel();
        lbl_version = new javax.swing.JLabel();
        lvl_sistema_gerenciamento = new javax.swing.JLabel();
        pnl_ordem_servico = new javax.swing.JPanel();
        lbl_visualizar_ordem_servico = new javax.swing.JLabel();
        btn_v_ordem_servico = new javax.swing.JPanel();
        pnl_gerar_relatorio = new javax.swing.JPanel();
        lbl_gerar_relatorio = new javax.swing.JLabel();
        btn_gerar_relatorio = new javax.swing.JPanel();
        pnl_visualizar_clientes = new javax.swing.JPanel();
        lbl_visualizar_clientes = new javax.swing.JLabel();
        btn_v_clientes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout j_contentLayout = new javax.swing.GroupLayout(j_content);
        j_content.setLayout(j_contentLayout);
        j_contentLayout.setHorizontalGroup(
            j_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        j_contentLayout.setVerticalGroup(
            j_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_menu.setBackground(new java.awt.Color(13, 36, 51));

        lbl_sair.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_sair.setForeground(new java.awt.Color(254, 254, 254));
        lbl_sair.setText("Sair");
        lbl_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sairMouseClicked(evt);
            }
        });

        lbl_title_happetsy.setBackground(new java.awt.Color(254, 254, 255));
        lbl_title_happetsy.setFont(new java.awt.Font("URW Gothic L", 1, 20)); // NOI18N
        lbl_title_happetsy.setForeground(new java.awt.Color(254, 254, 254));
        lbl_title_happetsy.setText("H A P P E T S Y");

        lbl_version.setFont(new java.awt.Font("URW Gothic L", 0, 12)); // NOI18N
        lbl_version.setForeground(new java.awt.Color(188, 193, 195));
        lbl_version.setText("v0.1");

        lvl_sistema_gerenciamento.setFont(new java.awt.Font("URW Gothic L", 0, 12)); // NOI18N
        lvl_sistema_gerenciamento.setForeground(new java.awt.Color(207, 212, 213));
        lvl_sistema_gerenciamento.setText("Sistema de gerenciamento");

        pnl_ordem_servico.setBackground(new java.awt.Color(13, 36, 51));

        lbl_visualizar_ordem_servico.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_visualizar_ordem_servico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_visualizar_ordem_servico.setText("Visulizar Ordem de Servi??o");
        lbl_visualizar_ordem_servico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_visualizar_ordem_servicoMouseClicked(evt);
            }
        });

        btn_v_ordem_servico.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_v_ordem_servicoLayout = new javax.swing.GroupLayout(btn_v_ordem_servico);
        btn_v_ordem_servico.setLayout(btn_v_ordem_servicoLayout);
        btn_v_ordem_servicoLayout.setHorizontalGroup(
            btn_v_ordem_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        btn_v_ordem_servicoLayout.setVerticalGroup(
            btn_v_ordem_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_ordem_servicoLayout = new javax.swing.GroupLayout(pnl_ordem_servico);
        pnl_ordem_servico.setLayout(pnl_ordem_servicoLayout);
        pnl_ordem_servicoLayout.setHorizontalGroup(
            pnl_ordem_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ordem_servicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_v_ordem_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_visualizar_ordem_servico, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnl_ordem_servicoLayout.setVerticalGroup(
            pnl_ordem_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_visualizar_ordem_servico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_ordem_servicoLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(btn_v_ordem_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_gerar_relatorio.setBackground(new java.awt.Color(13, 36, 51));

        lbl_gerar_relatorio.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_gerar_relatorio.setForeground(new java.awt.Color(255, 255, 255));
        lbl_gerar_relatorio.setText("Gerar Relat??rio");
        lbl_gerar_relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_gerar_relatorioMouseClicked(evt);
            }
        });

        btn_gerar_relatorio.setBackground(new java.awt.Color(13, 36, 51));
        btn_gerar_relatorio.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout btn_gerar_relatorioLayout = new javax.swing.GroupLayout(btn_gerar_relatorio);
        btn_gerar_relatorio.setLayout(btn_gerar_relatorioLayout);
        btn_gerar_relatorioLayout.setHorizontalGroup(
            btn_gerar_relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        btn_gerar_relatorioLayout.setVerticalGroup(
            btn_gerar_relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_gerar_relatorioLayout = new javax.swing.GroupLayout(pnl_gerar_relatorio);
        pnl_gerar_relatorio.setLayout(pnl_gerar_relatorioLayout);
        pnl_gerar_relatorioLayout.setHorizontalGroup(
            pnl_gerar_relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gerar_relatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_gerar_relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_gerar_relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_gerar_relatorioLayout.setVerticalGroup(
            pnl_gerar_relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gerar_relatorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_gerar_relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_gerar_relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbl_gerar_relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_visualizar_clientes.setBackground(new java.awt.Color(13, 36, 51));

        lbl_visualizar_clientes.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_visualizar_clientes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_visualizar_clientes.setText("Visualizar Clientes");
        lbl_visualizar_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_visualizar_clientesMouseClicked(evt);
            }
        });

        btn_v_clientes.setBackground(new java.awt.Color(13, 36, 51));
        btn_v_clientes.setPreferredSize(new java.awt.Dimension(5, 11));

        javax.swing.GroupLayout btn_v_clientesLayout = new javax.swing.GroupLayout(btn_v_clientes);
        btn_v_clientes.setLayout(btn_v_clientesLayout);
        btn_v_clientesLayout.setHorizontalGroup(
            btn_v_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        btn_v_clientesLayout.setVerticalGroup(
            btn_v_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_visualizar_clientesLayout = new javax.swing.GroupLayout(pnl_visualizar_clientes);
        pnl_visualizar_clientes.setLayout(pnl_visualizar_clientesLayout);
        pnl_visualizar_clientesLayout.setHorizontalGroup(
            pnl_visualizar_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_visualizar_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_v_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_visualizar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_visualizar_clientesLayout.setVerticalGroup(
            pnl_visualizar_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_visualizar_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(btn_v_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_visualizar_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_gerar_relatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnl_ordem_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_menuLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lbl_sair))
                            .addGroup(panel_menuLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvl_sistema_gerenciamento)
                                    .addGroup(panel_menuLayout.createSequentialGroup()
                                        .addComponent(lbl_title_happetsy)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_version)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title_happetsy)
                    .addComponent(lbl_version))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvl_sistema_gerenciamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(pnl_ordem_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_gerar_relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_visualizar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lbl_sair)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(j_content))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(j_content)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_visualizar_ordem_servicoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_visualizar_ordem_servicoMouseClicked
        setColor(btn_v_ordem_servico);
        resetColor(btn_gerar_relatorio);
        resetColor(btn_v_clientes);
        tela = new VisualizarOrdemServico(vet, reg);

        tela.visualizarOrdem();
        j_content.removeAll();
        j_content.add(tela).setVisible(true);

    }// GEN-LAST:event_lbl_visualizar_ordem_servicoMouseClicked

    private void lbl_gerar_relatorioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_gerar_relatorioMouseClicked
        setColor(btn_gerar_relatorio);
        resetColor(btn_v_ordem_servico);
        resetColor(btn_v_clientes);
        tela = new VisualizarOrdemServico(vet, reg);

        tela.GerarRelatorio_OrdemServico();
        j_content.removeAll();
        j_content.add(tela).setVisible(true);

    }// GEN-LAST:event_lbl_gerar_relatorioMouseClicked

    private void lbl_visualizar_clientesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_visualizar_clientesMouseClicked
        setColor(btn_v_clientes);
        resetColor(btn_v_ordem_servico);
        resetColor(btn_gerar_relatorio);

        ListarClientes listarClientes = new ListarClientes(reg);
        j_content.removeAll();
        j_content.add(listarClientes).setVisible(true);
    }// GEN-LAST:event_lbl_visualizar_clientesMouseClicked

    private void lbl_sairMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_sairMouseClicked
        this.dispose();
    }// GEN-LAST:event_lbl_sairMouseClicked

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(13, 36, 51));
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(254, 254, 254));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVeterinario.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVeterinario.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVeterinario.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVeterinario.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVeterinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_gerar_relatorio;
    private javax.swing.JPanel btn_v_clientes;
    private javax.swing.JPanel btn_v_ordem_servico;
    private javax.swing.JDesktopPane j_content;
    private javax.swing.JLabel lbl_gerar_relatorio;
    private javax.swing.JLabel lbl_sair;
    private javax.swing.JLabel lbl_title_happetsy;
    private javax.swing.JLabel lbl_version;
    private javax.swing.JLabel lbl_visualizar_clientes;
    private javax.swing.JLabel lbl_visualizar_ordem_servico;
    private javax.swing.JLabel lvl_sistema_gerenciamento;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel pnl_gerar_relatorio;
    private javax.swing.JPanel pnl_ordem_servico;
    private javax.swing.JPanel pnl_visualizar_clientes;
    // End of variables declaration//GEN-END:variables
}
