/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;

import Models.Administrador;
import Models.Conta;
import Models.DataHorario;
import Models.Registro;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enya
 */
public class PagarConta extends javax.swing.JInternalFrame {

    private Administrador adm;
    private Registro registros;
    private ArrayList<Conta> contasAPagar = new ArrayList<>();

    /**
     * Creates new form PagarConta
     */
    public PagarConta() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui_ = (BasicInternalFrameUI) this.getUI();
        ui_.setNorthPane(null);
    }

    public PagarConta(Administrador adm, Registro registros) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui_ = (BasicInternalFrameUI) this.getUI();
        ui_.setNorthPane(null);
        setAdm(adm);
        setRegistros(registros);
    }

    public Administrador getAdm() {
        return adm;
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }

    public Registro getRegistros() {
        return registros;
    }

    public void setRegistros(Registro registros) {
        this.registros = registros;
    }

    public ArrayList<Conta> getContasAPagar() {
        return contasAPagar;
    }

    public void setContasAPagar(ArrayList<Conta> contasAPagar) {
        this.contasAPagar = contasAPagar;
    }

    public void addContaAPagar(Conta conta) {
        this.contasAPagar.add(conta);
    }

    public Conta getIndex(int index) {
        return contasAPagar.get(index);
    }

    // Subtrai duas datas e retorna a diferen???? em dias
    private long sub2Dates(String date1, String date2) throws ParseException {
        LocalDate dBefore = LocalDate.parse(date1, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate dAfter = LocalDate.parse(date2, DateTimeFormatter.ISO_LOCAL_DATE);
        long diff = dBefore.until(dAfter, ChronoUnit.DAYS);
        return diff;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        combo_box_id = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        combo_box_data_pagamento = new javax.swing.JComboBox<>();

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 52, 55));
        jLabel6.setText("Visualize os vendedor cadastrados no sistema atrav??s da tabela abaixo");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 52, 55));
        jLabel5.setText("Visualizar vendedores");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descri????o", "Data de vencimento", "Valor", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        combo_box_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_box_idMouseClicked(evt);
            }
        });
        combo_box_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_idActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 7, 35));
        jLabel1.setText("Cancelar");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 20, 20));
        jLabel2.setText("Conta:");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1.setText("Pagar");
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

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 20, 20));
        jLabel3.setText("Data de pagamento:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 20, 20));
        jLabel4.setText("Lista de contas:");

        combo_box_data_pagamento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                combo_box_data_pagamentoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(98, 98, 98)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(combo_box_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_box_data_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(combo_box_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_box_data_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
        ArrayList<String[]> contas = new ArrayList<>();
        //Adiciona ao ArrayList contas um array de string para a tabela 
        if (registros.getContas() != null) {
            registros.getContas().forEach((Conta conta) -> {
                String aux[] = new String[5];
                if (!conta.isPaga()) {
                    aux[0] = String.valueOf(conta.getId());
                    aux[1] = conta.getDescricao();
                    aux[2] = conta.getDataVenc().toStringData();
                    aux[3] = Float.toString(conta.getValor());
                    aux[4] = conta.isPaga() ? "Paga" : "?? pagar";
                    contas.add(aux);
                }
            });
        }

        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        contas.forEach(conta -> {
            tbl.addRow(conta);
        });
    }//GEN-LAST:event_jTable1AncestorAdded

    private void combo_box_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_box_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_box_idMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cleanInputs();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(!getContasAPagar().isEmpty()){
            int index = combo_box_id.getSelectedIndex();
            Conta conta = null;

            if(index != -1) { //Verifica????o se foi selecionado algo
                //Pega a conta no index do combo box selecionado
                conta = getContasAPagar().get(index); 
                if (conta != null) { //Verifica????o se foi encontrado uma conta no index

                    //Split para pegar dia, m??s e ano da data de forma separada
                    String[] covertDataArray = String.valueOf(combo_box_data_pagamento.getSelectedItem()).split("/");
                    DataHorario dataPagamento = new DataHorario(Integer.parseInt(covertDataArray[0]),
                            Integer.parseInt(covertDataArray[1]), Integer.parseInt(covertDataArray[2]), 17, 0);
                    if (adm.pagarConta(registros, conta, dataPagamento)) {
                        JOptionPane.showMessageDialog(null, "Conta paga com sucesso. Recarregue a p??gina para atualizar as informa????es.", "Conta paga",
                                JOptionPane.INFORMATION_MESSAGE);
                        cleanInputs();
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro no processo de compra, tente novamente.", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "N??o h?? nanhuma conta para pagar.", "Erro",
                                JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "N??o h?? nanhuma conta para pagar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
            

    }// GEN-LAST:event_jButton1MouseClicked

    private void combo_box_data_pagamentoAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_combo_box_data_pagamentoAncestorAdded
        // TODO add your handling code here:
        boolean haveItem = false;
        //Adiciona as contas n??o paga no atributo (contasAPagar) da classe
        for (Conta conta : registros.getContas()) {
            if (!conta.isPaga()) {
                combo_box_id.addItem("ID:" + conta.getId() + " | Valor: R$" + conta.getValor());
                contasAPagar.add(conta);
                haveItem = true;
            }
        }

        //Se tiver pelo menos uma conta
        if (haveItem) {
            int index = combo_box_id.getSelectedIndex();
            Conta contaSelected = getIndex(index);
            setDataPagamento(contaSelected.getDataVenc().toDateAmericanFormat());
        }
    }// GEN-LAST:event_combo_box_data_pagamentoAncestorAdded

    private void combo_box_idActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_combo_box_idActionPerformed
        // TODO add your handling code here:
        //Tenta inicializar as datas com o primeiro item do combo box
        if (!getContasAPagar().isEmpty()) {
            int index = combo_box_id.getSelectedIndex();
            Conta contaSelected = getIndex(index);
            setDataPagamento(contaSelected.getDataVenc().toDateAmericanFormat());
        }
    }// GEN-LAST:event_combo_box_idActionPerformed

    //Seta os intervalo de datas no combo box
    private void setDataPagamento(String dataVenc) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");// Formato brasileiro da data
        LocalDate diaAtual = LocalDate.now(); // Recebe o dia atual
        long additionalDays = 0;

        try {
            //Subtra????o de dadas
            additionalDays = sub2Dates(diaAtual.toString(), dataVenc);
        } catch (ParseException ex) {
            Logger.getLogger(PagarConta.class.getName()).log(Level.SEVERE, null, ex);
        }

        combo_box_data_pagamento.removeAllItems();

        String diaFormatado;
        if (additionalDays < 0) {// Caso n??o haja dias adicionais o pagamento pode ocorrer apenas no dia atual
            diaFormatado = diaAtual.format(formatter);
            combo_box_data_pagamento.addItem(diaFormatado);
        } else {// Adiciona os demais dias no ComboBox
            for (int i = 0; i <= additionalDays; i++) {
                diaFormatado = diaAtual.plusDays(i).format(formatter);
                combo_box_data_pagamento.addItem(diaFormatado);
            }
        }
    }
    
    private void cleanInputs(){
        if (getContasAPagar().isEmpty()) {
            combo_box_id.setSelectedIndex(-1);
            combo_box_data_pagamento.setSelectedIndex(-1);
        }
        else{
            combo_box_id.setSelectedIndex(0);
            combo_box_data_pagamento.setSelectedIndex(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_box_data_pagamento;
    private javax.swing.JComboBox<String> combo_box_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
