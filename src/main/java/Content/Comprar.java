/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;

import Models.Administrador;
import Models.Conta;
import Models.DataHorario;
import Models.Produto;
import Models.Registro;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author enya
 */
public class Comprar extends javax.swing.JInternalFrame {

    private Administrador adm;
    private Registro registros;

    /**
     * Creates new form Comprar
     */
    public Comprar() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    public Comprar(Administrador adm, Registro registros) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setAdministrador(adm);
        setRegistros(registros);
    }

    private void setAdministrador(Administrador adm) {
        this.adm = adm;
    }

    private Administrador getAdministrador() {
        return this.adm;
    }

    private void setRegistros(Registro registros) {
        this.registros = registros;
    }

    private Registro getRegistros() {
        return this.registros;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        input_nome = new javax.swing.JTextField();
        combo_box_animal = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        input_valor = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        input_data = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_text_descricao = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        input_qtd = new javax.swing.JFormattedTextField();

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.setForeground(new java.awt.Color(11, 11, 11));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 52, 55));
        jLabel5.setText("Comprar produto");
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 52, 55));
        jLabel6.setText("Compre um novo produto através do formulário abaixo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 510, 10));

        input_nome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel2.add(input_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 270, -1));

        combo_box_animal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        combo_box_animal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cachorro", "Gato", "Passaro" }));
        jPanel2.add(combo_box_animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 200, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 22, 22));
        jLabel1.setText("Valor und.:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(22, 22, 22));
        jLabel2.setText("Nome:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButton1.setText("Comprar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 270, 40));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(201, 17, 22));
        jLabel7.setText("Cancelar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        input_valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        input_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_valorActionPerformed(evt);
            }
        });
        jPanel2.add(input_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 150, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(22, 22, 22));
        jLabel3.setText("Data de pagamento:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, 20));
        jPanel2.add(input_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 200, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 22, 22));
        jLabel4.setText("Descrição do produto:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 22, 22));
        jLabel8.setText("Quantidade:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 20));

        input_text_descricao.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(input_text_descricao);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 510, 60));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 22, 22));
        jLabel9.setText("Animal:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, 20));

        input_qtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel2.add(input_qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 110, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5AncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_jLabel5AncestorAdded
        // TODO add your handling code here:
    }// GEN-LAST:event_jLabel5AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed

    private void input_valorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_input_valorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_input_valorActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String nome = input_nome.getText();
        String animal = String.valueOf(combo_box_animal.getSelectedItem());
        String descricao = input_text_descricao.getText();
        int qtd = Integer.parseInt(input_qtd.getText());
        Float valor = Float.parseFloat(input_valor.getValue().toString());
        //Converte o tipo Date para LocalDate
        LocalDate data = LocalDate.ofInstant(input_data.getDate().toInstant(), ZoneId.systemDefault());
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();
        
        DataHorario dataVenc = new DataHorario(dia, mes, ano, 0, 0);
        String descricaoConta = "Compra do produto " + nome + " para " + animal;
        Conta conta = new Conta(dataVenc, descricaoConta, (valor * qtd));
        Produto produto = new Produto(qtd, valor, nome, animal, descricao);

        if (getAdministrador().comprar(this.getRegistros(), conta, produto)) {
            JOptionPane.showMessageDialog(null, "Compra registrada com sucesso.", "Compra registrada",
                    JOptionPane.INFORMATION_MESSAGE);
            cleanInputs();
        } else {
            JOptionPane.showMessageDialog(null, "Erro no processo de compra, tente novamente.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jButton1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        cleanInputs();
    }// GEN-LAST:event_jLabel7MouseClicked
    
    private void cleanInputs() {
        input_nome.setText("");
        combo_box_animal.setSelectedIndex(0);
        input_text_descricao.setText("");
        input_qtd.setText("");
        input_valor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_box_animal;
    private com.toedter.calendar.JDateChooser input_data;
    private javax.swing.JTextField input_nome;
    private javax.swing.JFormattedTextField input_qtd;
    private javax.swing.JTextPane input_text_descricao;
    private javax.swing.JFormattedTextField input_valor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
