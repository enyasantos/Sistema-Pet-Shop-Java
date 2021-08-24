/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;
import Models.Produto;
import Models.Registro;
import Models.Vendedor;
import Models.Venda;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vitoria
 */
public class Vender extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vender
     */
    
    private Registro registros;
    private Vendedor vend;
    
    public Vender() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }
    
    public Vender(Registro reg, Vendedor vend) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
        this.registros = reg;
        this.vend = vend;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_separador = new javax.swing.JSeparator();
        lbl_subtitulo = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_titulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_produtos = new javax.swing.JTable();
        lbl_titulo2 = new javax.swing.JLabel();
        lbl_titulo3 = new javax.swing.JLabel();
        lbl_cancelar = new javax.swing.JLabel();
        btn_venda = new javax.swing.JButton();
        field_quant = new javax.swing.JTextField();
        combo_produto = new javax.swing.JComboBox<>();

        lbl_subtitulo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbl_subtitulo.setForeground(new java.awt.Color(24, 24, 24));
        lbl_subtitulo.setText("Venda um produto através do formulário abaixo.");
        lbl_subtitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_subtituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbl_titulo.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(24, 24, 24));
        lbl_titulo.setText("Produtos");
        lbl_titulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_tituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbl_titulo1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_titulo1.setForeground(new java.awt.Color(24, 24, 24));
        lbl_titulo1.setText("Vender produto");
        lbl_titulo1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_titulo1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        table_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_produtos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table_produtosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(table_produtos);

        lbl_titulo2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_titulo2.setForeground(new java.awt.Color(24, 24, 24));
        lbl_titulo2.setText("Produto:");
        lbl_titulo2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_titulo2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbl_titulo3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_titulo3.setForeground(new java.awt.Color(24, 24, 24));
        lbl_titulo3.setText("Quantidade:");
        lbl_titulo3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_titulo3AncestorAdded(evt);
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

        btn_venda.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btn_venda.setText("Vender");
        btn_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vendaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_vendaMousePressed(evt);
            }
        });
        btn_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vendaActionPerformed(evt);
            }
        });

        field_quant.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        field_quant.setPreferredSize(new java.awt.Dimension(30, 22));
        field_quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_quantActionPerformed(evt);
            }
        });

        combo_produto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                combo_produtoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_titulo1)
                            .addComponent(lbl_subtitulo)
                            .addComponent(lbl_separador)
                            .addComponent(lbl_titulo)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_titulo2)
                                    .addComponent(combo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(field_quant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbl_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbl_titulo1)
                .addGap(6, 6, 6)
                .addComponent(lbl_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(field_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_titulo2)
                            .addComponent(lbl_titulo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cancelar)
                    .addComponent(btn_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_subtituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_subtituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_subtituloAncestorAdded

    private void lbl_tituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_tituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_tituloAncestorAdded

    private void lbl_titulo1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_titulo1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_titulo1AncestorAdded

    private void lbl_titulo2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_titulo2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_titulo2AncestorAdded

    private void lbl_titulo3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_titulo3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_titulo3AncestorAdded

    private void lbl_cancelarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_cancelarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_cancelarAncestorAdded

    private void btn_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vendaActionPerformed

    private void btn_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendaMouseClicked
        // TODO add your handling code here:
        int id = combo_produto.getSelectedIndex();
        int quant = Integer.parseInt(field_quant.getText());
      
        if(vend.getProdutoByID(registros.getProdutos(), id) != null){
            float valor = (vend.getProdutoByID(registros.getProdutos(), id)).getValor();

            Venda nVenda = new Venda(vend.getProdutoByID(registros.getProdutos(), id), valor, vend.getId());
            if(vend.realizarVenda(registros, nVenda, registros.getProdutos(), quant, id)){
                JOptionPane.showMessageDialog(null, "Venda realizada com sucesso.", "Venda realizada", JOptionPane.INFORMATION_MESSAGE);
                cleanInputs();
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro no processo de venda, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Produto não cadastrado, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE); 
    }//GEN-LAST:event_btn_vendaMouseClicked

    private void field_quantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_quantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_quantActionPerformed

    private void table_produtosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_produtosAncestorAdded
        // TODO add your handling code here:
        
        ArrayList<String[]> produtos = new ArrayList<>();
        if (registros.getProdutos() != null) {
            registros.getProdutos().forEach((Produto produto) -> {
                String aux[] = new String[4];
                aux[0] = String.valueOf(produto.getId());
                aux[1] = produto.getNome();
                aux[2] = String.valueOf(produto.getQuantidade());
                aux[3] = Float.toString(produto.getValor());
                    
                produtos.add(aux);
            });
        }

        DefaultTableModel tbl = (DefaultTableModel) table_produtos.getModel();
        produtos.forEach(produto -> {
            tbl.addRow(produto);
        });
    }//GEN-LAST:event_table_produtosAncestorAdded

    private void btn_vendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendaMousePressed
        // TODO add your handling code here:
        int id = combo_produto.getSelectedIndex();
        int quant = Integer.parseInt(field_quant.getText());
//        if (id.isEmpty() || quant.isEmpty()){
//            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrar!", "Alerta", JOptionPane.WARNING_MESSAGE);
//        }
//        else{
            if(vend.getProdutoByID(registros.getProdutos(), id) != null){
                float valor = (vend.getProdutoByID(registros.getProdutos(), id)).getValor();
                Venda nVenda = new Venda(vend.getProdutoByID(registros.getProdutos(), id), valor, vend.getId());
                if(vend.realizarVenda(registros, nVenda, registros.getProdutos(), quant, (id + 1))){
                    JOptionPane.showMessageDialog(null, "Venda realizada com sucesso, recarregue a página para atualizar quantidade.", "Venda realizada", JOptionPane.INFORMATION_MESSAGE);
                    cleanInputs();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no processo de venda, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Produto não cadastrado, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE); 
        //}
    }//GEN-LAST:event_btn_vendaMousePressed

    private void combo_produtoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_combo_produtoAncestorAdded
        // TODO add your handling code here:
        registros.getProdutos().forEach(produto -> {
            combo_produto.addItem("ID:" + produto.getId() + " | " + produto.getNome());
        });
    }//GEN-LAST:event_combo_produtoAncestorAdded
    
    public void cleanInputs() {
        combo_produto.setSelectedIndex(0);
        field_quant.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_venda;
    private javax.swing.JComboBox<String> combo_produto;
    private javax.swing.JTextField field_quant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cancelar;
    private javax.swing.JSeparator lbl_separador;
    private javax.swing.JLabel lbl_subtitulo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo1;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JLabel lbl_titulo3;
    private javax.swing.JTable table_produtos;
    // End of variables declaration//GEN-END:variables
}
