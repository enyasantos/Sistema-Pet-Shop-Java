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
public class GerarOrdemDeServicoSemCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form GerarOrdemDeServico
     */
    public GerarOrdemDeServicoSemCadastro() {
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
        lbl_endereco2 = new javax.swing.JLabel();
        lbl_endereco3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lbl_endereco8 = new javax.swing.JLabel();
        j_sim = new javax.swing.JRadioButton();
        j_nao = new javax.swing.JRadioButton();
        j_servicos = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        j_hora = new javax.swing.JFormattedTextField();

        lbl_titulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
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

        lbl_subtitulo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
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

        lbl_cancelar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
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

        lbl_endereco.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
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

        btn_cadastro.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btn_cadastro.setText("Cadastrar");
        btn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroActionPerformed(evt);
            }
        });

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

        lbl_endereco2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
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

        lbl_endereco3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
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

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cachorro", "Gato", "Passaro" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 22, 22));
        jLabel9.setText("Animal:");

        lbl_endereco8.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_endereco8.setForeground(new java.awt.Color(24, 24, 24));
        lbl_endereco8.setText("Deseja cadastrar?");
        lbl_endereco8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_endereco8AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        j_sim.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        j_sim.setText("Sim");
        j_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_simActionPerformed(evt);
            }
        });

        j_nao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        j_nao.setText("Não");
        j_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_naoActionPerformed(evt);
            }
        });

        j_servicos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        j_servicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        j_servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_servicosActionPerformed(evt);
            }
        });

        jDateChooser1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        j_hora.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        j_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_horaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lbl_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_endereco2)
                        .addGap(386, 386, 386))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(j_servicos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_endereco))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_endereco3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(j_hora))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(176, 176, 176))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(j_sim)
                                .addGap(29, 29, 29)
                                .addComponent(j_nao))
                            .addComponent(lbl_endereco8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(71, 71, 71)
                        .addComponent(lbl_endereco1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_titulo)
                            .addComponent(lbl_subtitulo)
                            .addComponent(lbl_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 65, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lbl_endereco1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_endereco2)
                                    .addComponent(lbl_endereco)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_endereco3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(j_servicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(j_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_endereco8)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(j_sim)
                                    .addComponent(j_nao)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cancelar))
                        .addGap(94, 94, 94))))
        );

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

    private void lbl_endereco2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco2AncestorAdded

    private void lbl_endereco3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco3AncestorAdded

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void lbl_endereco8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco8AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco8AncestorAdded

    private void j_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_simActionPerformed

    private void j_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_naoActionPerformed

    private void j_servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_servicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_servicosActionPerformed

    private void j_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_horaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastro;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField j_hora;
    private javax.swing.JRadioButton j_nao;
    private javax.swing.JComboBox<String> j_servicos;
    private javax.swing.JRadioButton j_sim;
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
