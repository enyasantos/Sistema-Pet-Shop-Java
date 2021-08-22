/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import Models.OrdemServico;
import Models.Registro;
import Models.Veterinario;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thayn
 */
public class VisualizarOrdemServico extends javax.swing.JInternalFrame {

    /**
     * Creates new form VisualizarOrdemServico
     */
    Veterinario vet;
    Registro reg;
    ArrayList<OrdemServico> ordens;
    private static VisualizarOrdemServico tela;

    public VisualizarOrdemServico() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    public VisualizarOrdemServico(Veterinario vet, Registro reg) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        this.vet = vet;
        this.reg = reg;
        this.ordens = this.reg.getOrdemServicos();       
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

        jTextField8 = new javax.swing.JTextField();
        pnl_principal = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_titulo = new javax.swing.JLabel();
        lbl_comboBox = new javax.swing.JLabel();
        pnl_cliente = new javax.swing.JPanel();
        lbl_dados_cliente = new javax.swing.JLabel();
        lbl_id_cliente = new javax.swing.JLabel();
        lbl_nome_cliente = new javax.swing.JLabel();
        lbl_endereco_cliente = new javax.swing.JLabel();
        txt_id_cliente = new javax.swing.JTextField();
        txt_nome_cliente = new javax.swing.JTextField();
        txt_endereco_cliente = new javax.swing.JTextField();
        pnl_servico = new javax.swing.JPanel();
        lbl_subTitulo_Servico = new javax.swing.JLabel();
        lbl_id_servico = new javax.swing.JLabel();
        lbl_nome_servico = new javax.swing.JLabel();
        lbl_valor_servico = new javax.swing.JLabel();
        lbl_animal_servico = new javax.swing.JLabel();
        lbl_relatorio_servico = new javax.swing.JLabel();
        lbl_data_servico = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_nome_servico = new javax.swing.JTextField();
        txt_id_servico = new javax.swing.JTextField();
        txt_animal_servico = new javax.swing.JTextField();
        txt_relatorio_servico = new javax.swing.JTextField();
        txt_valor_servico = new javax.swing.JTextField();
        txt_data_servico = new javax.swing.JTextField();
        cmb_OrdemServico = new javax.swing.JComboBox<>();

        pnl_principal.setBackground(new java.awt.Color(238, 238, 238));

        lbl_titulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(13, 36, 51));
        lbl_titulo.setText("Ordem de Serviço");

        lbl_comboBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbl_comboBox.setText("Selecione a ordem de serviço:");

        lbl_dados_cliente.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_dados_cliente.setText("Dados do Cliente");
        lbl_dados_cliente.setMaximumSize(new java.awt.Dimension(106, 15));
        lbl_dados_cliente.setMinimumSize(new java.awt.Dimension(106, 15));

        lbl_id_cliente.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_id_cliente.setText("ID:");

        lbl_nome_cliente.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_nome_cliente.setText("Nome:");

        lbl_endereco_cliente.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_endereco_cliente.setText("Endereço:");

        txt_id_cliente.setEnabled(false);
        txt_id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_clienteActionPerformed(evt);
            }
        });

        txt_nome_cliente.setEnabled(false);
        txt_nome_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_clienteActionPerformed(evt);
            }
        });

        txt_endereco_cliente.setEnabled(false);

        javax.swing.GroupLayout pnl_clienteLayout = new javax.swing.GroupLayout(pnl_cliente);
        pnl_cliente.setLayout(pnl_clienteLayout);
        pnl_clienteLayout.setHorizontalGroup(
            pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clienteLayout.createSequentialGroup()
                .addGroup(pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_clienteLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_nome_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_endereco_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_id_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id_cliente)
                            .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_endereco_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_clienteLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(lbl_dados_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_clienteLayout.setVerticalGroup(
            pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clienteLayout.createSequentialGroup()
                .addGroup(pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_clienteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_endereco_cliente)
                            .addComponent(txt_endereco_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_clienteLayout.createSequentialGroup()
                        .addGroup(pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_clienteLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_id_cliente)
                                    .addComponent(txt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(pnl_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_nome_cliente)))
                            .addComponent(lbl_dados_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lbl_subTitulo_Servico.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_subTitulo_Servico.setText("Dados do Serviço");

        lbl_id_servico.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_id_servico.setText("ID:");

        lbl_nome_servico.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_nome_servico.setText("Nome:");

        lbl_valor_servico.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_valor_servico.setText("Valor:");

        lbl_animal_servico.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_animal_servico.setText("Animal:");

        lbl_relatorio_servico.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_relatorio_servico.setText("Relatório:");

        lbl_data_servico.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_data_servico.setText("Data:");

        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salvarMouseClicked(evt);
            }
        });
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_nome_servico.setEnabled(false);
        txt_nome_servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_servicoActionPerformed(evt);
            }
        });

        txt_id_servico.setEnabled(false);
        txt_id_servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_servicoActionPerformed(evt);
            }
        });

        txt_animal_servico.setEnabled(false);

        txt_relatorio_servico.setEnabled(false);

        txt_valor_servico.setEnabled(false);

        javax.swing.GroupLayout pnl_servicoLayout = new javax.swing.GroupLayout(pnl_servico);
        pnl_servico.setLayout(pnl_servicoLayout);
        pnl_servicoLayout.setHorizontalGroup(
            pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_servicoLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(lbl_subTitulo_Servico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_servicoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_servicoLayout.createSequentialGroup()
                        .addComponent(lbl_id_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_servicoLayout.createSequentialGroup()
                        .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_animal_servico)
                                .addComponent(lbl_valor_servico)
                                .addComponent(lbl_relatorio_servico))
                            .addGroup(pnl_servicoLayout.createSequentialGroup()
                                .addComponent(lbl_nome_servico)
                                .addGap(26, 26, 26)))
                        .addGap(28, 28, 28)
                        .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_servicoLayout.createSequentialGroup()
                                .addComponent(txt_nome_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnl_servicoLayout.createSequentialGroup()
                                .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_servicoLayout.createSequentialGroup()
                                        .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_valor_servico)
                                            .addComponent(txt_animal_servico, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_data_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_data_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_servicoLayout.createSequentialGroup()
                                        .addComponent(btn_cancelar)
                                        .addGap(31, 31, 31)
                                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_id_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_relatorio_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 57, Short.MAX_VALUE))))))
        );
        pnl_servicoLayout.setVerticalGroup(
            pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_servicoLayout.createSequentialGroup()
                .addComponent(lbl_subTitulo_Servico)
                .addGap(18, 18, 18)
                .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome_servico))
                .addGap(18, 18, 18)
                .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_valor_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valor_servico))
                .addGap(18, 18, 18)
                .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_animal_servico)
                    .addComponent(lbl_data_servico)
                    .addComponent(txt_animal_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_data_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_relatorio_servico)
                    .addComponent(txt_relatorio_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(pnl_servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        cmb_OrdemServico.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cmb_OrdemServicoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cmb_OrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_OrdemServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(pnl_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_servico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmb_OrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_principalLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_principalLayout.createSequentialGroup()
                            .addGap(248, 248, 248)
                            .addComponent(lbl_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_OrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(pnl_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_relatorio_servicoActionPerformed(evt);
    }

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_clienteActionPerformed

    private void txt_nome_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_clienteActionPerformed

    private void txt_nome_servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_servicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_servicoActionPerformed

    private void txt_id_servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_servicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_servicoActionPerformed

    private void cmb_OrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_OrdemServicoActionPerformed
        mostrarDados();
    }//GEN-LAST:event_cmb_OrdemServicoActionPerformed

    private void btn_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvarMouseClicked
        System.out.println(txt_relatorio_servico.getText());
        vet.cadastrarRelatorioOrdem(reg, txt_relatorio_servico.getText(), cmb_OrdemServico.getSelectedIndex());
        JOptionPane.showMessageDialog(null, "Relatório Salvo!");
    }//GEN-LAST:event_btn_salvarMouseClicked

    private void cmb_OrdemServicoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cmb_OrdemServicoAncestorAdded
        if (!ordens.isEmpty()) {
            ordens.forEach(ordem -> {
                cmb_OrdemServico.addItem("ID:" + ordem.getId() + " | Cliente: " + ordem.getCliente().getNome());
            });
        }
    }//GEN-LAST:event_cmb_OrdemServicoAncestorAdded

 
    public void mostrarDados() {

        OrdemServico ordemAux = ordens.get(cmb_OrdemServico.getSelectedIndex());

        txt_id_cliente.setText(String.valueOf(ordemAux.getCliente().getId()));
        txt_id_cliente.setEnabled(true);
        txt_id_cliente.setEditable(false);
        txt_nome_cliente.setText(ordemAux.getCliente().getNome());
        txt_nome_cliente.setEnabled(true);
        txt_nome_cliente.setEditable(false);
        txt_endereco_cliente.setText(ordemAux.getCliente().getEndereco());
        txt_endereco_cliente.setEnabled(true);
        txt_endereco_cliente.setEditable(false);

        txt_id_servico.setText(String.valueOf(ordemAux.getServico().getId()));
        txt_id_servico.setEnabled(true);
        txt_id_servico.setEditable(false);
        txt_nome_servico.setText(ordemAux.getServico().getNome());
        txt_nome_servico.setEnabled(true);
        txt_animal_servico.setText(ordemAux.getAnimal());
        txt_animal_servico.setEnabled(true);
        txt_animal_servico.setEditable(false);

        txt_data_servico.setText(ordemAux.getDatatime().toString());
        txt_data_servico.setEnabled(true);
        txt_data_servico.setEditable(false);

        txt_valor_servico.setText(String.valueOf(ordemAux.getServico().getValor()));
        txt_valor_servico.setEnabled(true);
        txt_valor_servico.setEditable(false);
        
        txt_relatorio_servico.setText(ordemAux.getRelatorio());
        
        btn_cancelar.setEnabled(true);
        btn_cancelar.setVisible(true);
    }

    public void visualizarOrdem() {
        lbl_titulo.setText("Ordem de Serviço");


        txt_relatorio_servico.setEnabled(false);
        txt_relatorio_servico.setEditable(false);
        btn_salvar.setEnabled(false);
        btn_salvar.setVisible(false);
        btn_cancelar.setText("Voltar");
    }

    public void GerarRelatorio_OrdemServico() {
        lbl_titulo.setText("Gerar Relatório da Ordem de Serviço");


        txt_relatorio_servico.setEnabled(true);
        txt_relatorio_servico.setEditable(true);

        btn_salvar.setEnabled(true);
        btn_salvar.setVisible(true);
        btn_cancelar.setText("Cancelar");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cmb_OrdemServico;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lbl_animal_servico;
    private javax.swing.JLabel lbl_comboBox;
    private javax.swing.JLabel lbl_dados_cliente;
    private javax.swing.JLabel lbl_data_servico;
    private javax.swing.JLabel lbl_endereco_cliente;
    private javax.swing.JLabel lbl_id_cliente;
    private javax.swing.JLabel lbl_id_servico;
    private javax.swing.JLabel lbl_nome_cliente;
    private javax.swing.JLabel lbl_nome_servico;
    private javax.swing.JLabel lbl_relatorio_servico;
    private javax.swing.JLabel lbl_subTitulo_Servico;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_valor_servico;
    private javax.swing.JPanel pnl_cliente;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JPanel pnl_servico;
    private javax.swing.JTextField txt_animal_servico;
    private javax.swing.JTextField txt_data_servico;
    private javax.swing.JTextField txt_endereco_cliente;
    private javax.swing.JTextField txt_id_cliente;
    private javax.swing.JTextField txt_id_servico;
    private javax.swing.JTextField txt_nome_cliente;
    private javax.swing.JTextField txt_nome_servico;
    private javax.swing.JTextField txt_relatorio_servico;
    private javax.swing.JTextField txt_valor_servico;
    // End of variables declaration//GEN-END:variables

    private void txt_relatorio_servicoActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
