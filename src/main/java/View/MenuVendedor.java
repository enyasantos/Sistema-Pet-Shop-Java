/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Content.CadastrarCliente;
import Content.GerarOrdemDeServico;
import Content.GerarOrdemDeServicoSemCadastro;
import Content.Vender;

import java.awt.Color;
import javax.swing.JPanel;

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
        lbl_sair = new javax.swing.JLabel();
        lbl_ordem_servico_cad1 = new javax.swing.JLabel();
        lbl_ordem_servico_sem_cad = new javax.swing.JLabel();
        btn_cadastrar_cliente = new javax.swing.JPanel();
        btn_cadastrar_cliente_aux = new javax.swing.JPanel();
        lbl_cadastrar_cliente = new javax.swing.JLabel();
        btn_venda = new javax.swing.JPanel();
        btn_venda_aux = new javax.swing.JPanel();
        lbl_venda = new javax.swing.JLabel();
        btn_gerar_ordem_serv = new javax.swing.JPanel();
        lbl_gerar_ordem_serv = new javax.swing.JLabel();
        btn_gerar_ordem_serv_aux = new javax.swing.JPanel();
        j_content = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_menu.setBackground(new java.awt.Color(13, 36, 51));
        panel_menu.setPreferredSize(new java.awt.Dimension(271, 713));
        panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title_happetsy.setBackground(new java.awt.Color(254, 254, 255));
        lbl_title_happetsy.setFont(new java.awt.Font("URW Gothic L", 1, 20)); // NOI18N
        lbl_title_happetsy.setForeground(new java.awt.Color(254, 254, 254));
        lbl_title_happetsy.setText("H A P P E T S Y");
        panel_menu.add(lbl_title_happetsy, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lvl_sistema_gerenciamento.setFont(new java.awt.Font("URW Gothic L", 0, 12)); // NOI18N
        lvl_sistema_gerenciamento.setForeground(new java.awt.Color(207, 212, 213));
        lvl_sistema_gerenciamento.setText("Sistema de gerenciamento");
        panel_menu.add(lvl_sistema_gerenciamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        lbl_version.setFont(new java.awt.Font("URW Gothic L", 0, 12)); // NOI18N
        lbl_version.setForeground(new java.awt.Color(188, 193, 195));
        lbl_version.setText("v0.1");
        panel_menu.add(lbl_version, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        lbl_sair.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_sair.setForeground(new java.awt.Color(254, 254, 254));
        lbl_sair.setText("Sair");
        panel_menu.add(lbl_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 475, -1, -1));

        lbl_ordem_servico_cad1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_ordem_servico_cad1.setForeground(new java.awt.Color(254, 254, 254));
        lbl_ordem_servico_cad1.setText("Cliente cadastrado");
        lbl_ordem_servico_cad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ordem_servico_cad1MouseClicked(evt);
            }
        });
        panel_menu.add(lbl_ordem_servico_cad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        lbl_ordem_servico_sem_cad.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_ordem_servico_sem_cad.setForeground(new java.awt.Color(254, 254, 254));
        lbl_ordem_servico_sem_cad.setText("Cliente sem cadastro");
        lbl_ordem_servico_sem_cad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ordem_servico_sem_cadMouseClicked(evt);
            }
        });
        panel_menu.add(lbl_ordem_servico_sem_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 30));

        btn_cadastrar_cliente.setBackground(new java.awt.Color(13, 36, 51));
        btn_cadastrar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_cadastrar_clienteMousePressed(evt);
            }
        });

        btn_cadastrar_cliente_aux.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_cadastrar_cliente_auxLayout = new javax.swing.GroupLayout(btn_cadastrar_cliente_aux);
        btn_cadastrar_cliente_aux.setLayout(btn_cadastrar_cliente_auxLayout);
        btn_cadastrar_cliente_auxLayout.setHorizontalGroup(
            btn_cadastrar_cliente_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        btn_cadastrar_cliente_auxLayout.setVerticalGroup(
            btn_cadastrar_cliente_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_cadastrar_cliente.setFont(new java.awt.Font("URW Gothic L", 1, 16)); // NOI18N
        lbl_cadastrar_cliente.setForeground(new java.awt.Color(254, 254, 254));
        lbl_cadastrar_cliente.setText("Cadastrar cliente");
        lbl_cadastrar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cadastrar_clienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_cadastrar_clienteLayout = new javax.swing.GroupLayout(btn_cadastrar_cliente);
        btn_cadastrar_cliente.setLayout(btn_cadastrar_clienteLayout);
        btn_cadastrar_clienteLayout.setHorizontalGroup(
            btn_cadastrar_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_cadastrar_clienteLayout.createSequentialGroup()
                .addComponent(btn_cadastrar_cliente_aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btn_cadastrar_clienteLayout.setVerticalGroup(
            btn_cadastrar_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cadastrar_cliente_aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_cadastrar_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cadastrar_cliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_menu.add(btn_cadastrar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        btn_venda.setBackground(new java.awt.Color(13, 36, 51));
        btn_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_vendaMousePressed(evt);
            }
        });

        btn_venda_aux.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_venda_auxLayout = new javax.swing.GroupLayout(btn_venda_aux);
        btn_venda_aux.setLayout(btn_venda_auxLayout);
        btn_venda_auxLayout.setHorizontalGroup(
            btn_venda_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        btn_venda_auxLayout.setVerticalGroup(
            btn_venda_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_venda.setFont(new java.awt.Font("URW Gothic L", 1, 16)); // NOI18N
        lbl_venda.setForeground(new java.awt.Color(254, 254, 254));
        lbl_venda.setText("Realizar venda de produto");
        lbl_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_vendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_vendaLayout = new javax.swing.GroupLayout(btn_venda);
        btn_venda.setLayout(btn_vendaLayout);
        btn_vendaLayout.setHorizontalGroup(
            btn_vendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_vendaLayout.createSequentialGroup()
                .addComponent(btn_venda_aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btn_vendaLayout.setVerticalGroup(
            btn_vendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_venda_aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_vendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_venda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_menu.add(btn_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, -1));

        btn_gerar_ordem_serv.setBackground(new java.awt.Color(13, 36, 51));
        btn_gerar_ordem_serv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_gerar_ordem_servMousePressed(evt);
            }
        });

        lbl_gerar_ordem_serv.setFont(new java.awt.Font("URW Gothic L", 1, 16)); // NOI18N
        lbl_gerar_ordem_serv.setForeground(new java.awt.Color(254, 254, 254));
        lbl_gerar_ordem_serv.setText("Gerar ordem de serviço");
        lbl_gerar_ordem_serv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_gerar_ordem_servMouseClicked(evt);
            }
        });

        btn_gerar_ordem_serv_aux.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_gerar_ordem_serv_auxLayout = new javax.swing.GroupLayout(btn_gerar_ordem_serv_aux);
        btn_gerar_ordem_serv_aux.setLayout(btn_gerar_ordem_serv_auxLayout);
        btn_gerar_ordem_serv_auxLayout.setHorizontalGroup(
            btn_gerar_ordem_serv_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        btn_gerar_ordem_serv_auxLayout.setVerticalGroup(
            btn_gerar_ordem_serv_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_gerar_ordem_servLayout = new javax.swing.GroupLayout(btn_gerar_ordem_serv);
        btn_gerar_ordem_serv.setLayout(btn_gerar_ordem_servLayout);
        btn_gerar_ordem_servLayout.setHorizontalGroup(
            btn_gerar_ordem_servLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_gerar_ordem_servLayout.createSequentialGroup()
                .addComponent(btn_gerar_ordem_serv_aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_gerar_ordem_serv, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btn_gerar_ordem_servLayout.setVerticalGroup(
            btn_gerar_ordem_servLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_gerar_ordem_serv_aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_gerar_ordem_servLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_gerar_ordem_serv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_menu.add(btn_gerar_ordem_serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        j_content.setBackground(new java.awt.Color(244, 244, 244));
        j_content.setPreferredSize(new java.awt.Dimension(678, 536));

        javax.swing.GroupLayout j_contentLayout = new javax.swing.GroupLayout(j_content);
        j_content.setLayout(j_contentLayout);
        j_contentLayout.setHorizontalGroup(
            j_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        j_contentLayout.setVerticalGroup(
            j_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(j_content, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
            .addComponent(j_content, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(13, 36, 51));
    }
    
    void setColor(JPanel panel) {
        panel.setBackground(new Color(254, 254, 254));
    }
    
    private void lbl_ordem_servico_sem_cadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ordem_servico_sem_cadMouseClicked
        // TODO add your handling code here:
        GerarOrdemDeServicoSemCadastro ordem = new GerarOrdemDeServicoSemCadastro();
        j_content.removeAll();
        j_content.add(ordem).setVisible(true);

        resetColor(btn_cadastrar_cliente_aux);
        resetColor(btn_venda_aux);
        setColor(btn_gerar_ordem_serv_aux);
    }//GEN-LAST:event_lbl_ordem_servico_sem_cadMouseClicked

    private void lbl_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_vendaMouseClicked
        // TODO add your handling code here:
        Vender venda = new Vender();
        j_content.removeAll();
        j_content.add(venda).setVisible(true);

        resetColor(btn_cadastrar_cliente_aux);
        setColor(btn_venda_aux);
        resetColor(btn_gerar_ordem_serv_aux);
    }//GEN-LAST:event_lbl_vendaMouseClicked

    private void btn_vendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendaMousePressed
        // TODO add your handling code here:
        Vender venda = new Vender();
        j_content.removeAll();
        j_content.add(venda).setVisible(true);

        resetColor(btn_cadastrar_cliente_aux);
        setColor(btn_venda_aux);
        resetColor(btn_gerar_ordem_serv_aux);
    }//GEN-LAST:event_btn_vendaMousePressed

    private void lbl_gerar_ordem_servMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_gerar_ordem_servMouseClicked
        // TODO add your handling code here:
        resetColor(btn_cadastrar_cliente_aux);
        resetColor(btn_venda_aux);
        setColor(btn_gerar_ordem_serv_aux);
    }//GEN-LAST:event_lbl_gerar_ordem_servMouseClicked

    private void btn_gerar_ordem_servMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gerar_ordem_servMousePressed
        // TODO add your handling code here:
        resetColor(btn_cadastrar_cliente_aux);
        resetColor(btn_venda_aux);
        setColor(btn_gerar_ordem_serv_aux);
    }//GEN-LAST:event_btn_gerar_ordem_servMousePressed

    private void lbl_ordem_servico_cad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ordem_servico_cad1MouseClicked
        // TODO add your handling code here:
        GerarOrdemDeServico ordem = new GerarOrdemDeServico();
        j_content.removeAll();
        j_content.add(ordem).setVisible(true);

        resetColor(btn_cadastrar_cliente_aux);
        resetColor(btn_venda_aux);
        setColor(btn_gerar_ordem_serv_aux);
    }//GEN-LAST:event_lbl_ordem_servico_cad1MouseClicked

    private void lbl_cadastrar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cadastrar_clienteMouseClicked
        // TODO add your handling code here:
        CadastrarCliente cadastro = new CadastrarCliente();
        j_content.removeAll();
        j_content.add(cadastro).setVisible(true);

        setColor(btn_cadastrar_cliente_aux);
        resetColor(btn_venda_aux);
        resetColor(btn_gerar_ordem_serv_aux);
    }//GEN-LAST:event_lbl_cadastrar_clienteMouseClicked

    private void btn_cadastrar_clienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrar_clienteMousePressed
        // TODO add your handling code here:
        CadastrarCliente cadastro = new CadastrarCliente();
        j_content.removeAll();
        j_content.add(cadastro).setVisible(true);

        setColor(btn_cadastrar_cliente_aux);
        resetColor(btn_venda_aux);
        resetColor(btn_gerar_ordem_serv_aux);
    }//GEN-LAST:event_btn_cadastrar_clienteMousePressed

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
    private javax.swing.JPanel btn_cadastrar_cliente;
    private javax.swing.JPanel btn_cadastrar_cliente_aux;
    private javax.swing.JPanel btn_gerar_ordem_serv;
    private javax.swing.JPanel btn_gerar_ordem_serv_aux;
    private javax.swing.JPanel btn_venda;
    private javax.swing.JPanel btn_venda_aux;
    private javax.swing.JDesktopPane j_content;
    private javax.swing.JLabel lbl_cadastrar_cliente;
    private javax.swing.JLabel lbl_gerar_ordem_serv;
    private javax.swing.JLabel lbl_ordem_servico_cad1;
    private javax.swing.JLabel lbl_ordem_servico_sem_cad;
    private javax.swing.JLabel lbl_sair;
    private javax.swing.JLabel lbl_title_happetsy;
    private javax.swing.JLabel lbl_venda;
    private javax.swing.JLabel lbl_version;
    private javax.swing.JLabel lvl_sistema_gerenciamento;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}
