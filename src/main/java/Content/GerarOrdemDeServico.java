/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;
import javax.swing.plaf.basic.BasicInternalFrameUI;
/**
 *
 * @author Vitoria
 */
public class GerarOrdemDeServico extends javax.swing.JInternalFrame {

    /**
     * Creates new form GerarOrdemDeServico
     */
    public GerarOrdemDeServico() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_subtitulo = new javax.swing.JLabel();
        lbl_separador = new javax.swing.JSeparator();
        lbl_cancelar = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        btn_cadastro = new javax.swing.JButton();
        lbl_endereco1 = new javax.swing.JLabel();
        j_servicos = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lbl_endereco2 = new javax.swing.JLabel();
        lbl_endereco3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        j_servicos1 = new javax.swing.JComboBox<>();
        lbl_endereco8 = new javax.swing.JLabel();
        j_hora = new javax.swing.JFormattedTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(24, 24, 24));
        lbl_titulo.setText("Gerar ordem de serviço");
        lbl_titulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_tituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 35, -1, -1));

        lbl_subtitulo.setFont(new java.awt.Font("URW Gothic L", 0, 14)); // NOI18N
        lbl_subtitulo.setForeground(new java.awt.Color(24, 24, 24));
        lbl_subtitulo.setText("Gere uma nova ordem de serviço preenchendo o formulário abaixo.");
        lbl_subtitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_subtituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbl_subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 77, -1, -1));
        getContentPane().add(lbl_separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 101, 427, 10));

        lbl_cancelar.setFont(new java.awt.Font("URW Gothic L", 1, 16)); // NOI18N
        lbl_cancelar.setForeground(new java.awt.Color(201, 17, 22));
        lbl_cancelar.setText("Cancelar");
        lbl_cancelar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_cancelarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbl_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 402, -1, -1));

        lbl_endereco.setFont(new java.awt.Font("URW Gothic L", 0, 16)); // NOI18N
        lbl_endereco.setForeground(new java.awt.Color(24, 24, 24));
        lbl_endereco.setText("Data do serviço:");
        lbl_endereco.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_enderecoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbl_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 129, -1, -1));

        btn_cadastro.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_cadastro.setText("Cadastrar");
        btn_cadastro.setPreferredSize(new java.awt.Dimension(101, 29));
        btn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 391, 205, 45));

        lbl_endereco1.setFont(new java.awt.Font("URW Gothic L", 0, 16)); // NOI18N
        lbl_endereco1.setForeground(new java.awt.Color(24, 24, 24));
        lbl_endereco1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_endereco1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbl_endereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 258, -1, -1));

        j_servicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        j_servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_servicosActionPerformed(evt);
            }
        });
        getContentPane().add(j_servicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 156, 160, 47));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 156, 177, 47));

        lbl_endereco2.setFont(new java.awt.Font("URW Gothic L", 0, 16)); // NOI18N
        lbl_endereco2.setForeground(new java.awt.Color(24, 24, 24));
        lbl_endereco2.setText("Tipo de serviço:");
        lbl_endereco2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_endereco2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbl_endereco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 129, -1, -1));

        lbl_endereco3.setFont(new java.awt.Font("URW Gothic L", 0, 16)); // NOI18N
        lbl_endereco3.setForeground(new java.awt.Color(24, 24, 24));
        lbl_endereco3.setText("Hora:");
        lbl_endereco3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_endereco3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbl_endereco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 129, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cachorro", "Gato", "Passaro" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 253, 157, 47));

        jLabel9.setFont(new java.awt.Font("URW Gothic L", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 22, 22));
        jLabel9.setText("Animal:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 227, -1, 20));

        j_servicos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        j_servicos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_servicos1ActionPerformed(evt);
            }
        });
        getContentPane().add(j_servicos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 253, 262, 47));

        lbl_endereco8.setFont(new java.awt.Font("URW Gothic L", 0, 16)); // NOI18N
        lbl_endereco8.setForeground(new java.awt.Color(24, 24, 24));
        lbl_endereco8.setText("Cliente");
        lbl_endereco8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_endereco8AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbl_endereco8, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 221, -1, -1));

        j_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_horaActionPerformed(evt);
            }
        });
        getContentPane().add(j_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 156, 84, 47));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_tituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_tituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_tituloAncestorAdded

    private void lbl_subtituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_subtituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_subtituloAncestorAdded

    private void lbl_cancelarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_cancelarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_cancelarAncestorAdded

    private void lbl_enderecoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_enderecoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_enderecoAncestorAdded

    private void btn_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cadastroActionPerformed

    private void lbl_endereco1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco1AncestorAdded

    private void j_servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_servicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_servicosActionPerformed

    private void lbl_endereco2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco2AncestorAdded

    private void lbl_endereco3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco3AncestorAdded

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void j_servicos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_servicos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_servicos1ActionPerformed

    private void lbl_endereco8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco8AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco8AncestorAdded

    private void j_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_horaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastro;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField j_hora;
    private javax.swing.JComboBox<String> j_servicos;
    private javax.swing.JComboBox<String> j_servicos1;
    private javax.swing.JLabel lbl_cancelar;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_endereco1;
    private javax.swing.JLabel lbl_endereco2;
    private javax.swing.JLabel lbl_endereco3;
    private javax.swing.JLabel lbl_endereco8;
    private javax.swing.JSeparator lbl_separador;
    private javax.swing.JLabel lbl_subtitulo;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
