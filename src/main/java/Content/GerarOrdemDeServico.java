/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;
import Models.Registro;
import Models.Vendedor;
import Models.Cliente;
import Models.Conta;
import Models.DataHorario;
import Models.OrdemServico;
import Models.Servico;
import Models.Venda;

import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.ZoneId;
/**
 *
 * @author Vitoria
 */
public class GerarOrdemDeServico extends javax.swing.JInternalFrame {
        
    /**
     * Creates new form GerarOrdemDeServico
     */
    private Registro registros;
    private Vendedor vend;
    
    public GerarOrdemDeServico() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }
    
    public GerarOrdemDeServico(Vendedor vend, Registro reg) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        this.vend = vend;
        this.registros = reg;
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
        btn_gerar = new javax.swing.JButton();
        lbl_endereco1 = new javax.swing.JLabel();
        combo_box_serv = new javax.swing.JComboBox<>();
        field_data = new com.toedter.calendar.JDateChooser();
        lbl_endereco2 = new javax.swing.JLabel();
        lbl_endereco3 = new javax.swing.JLabel();
        combo_box_animal = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lbl_endereco8 = new javax.swing.JLabel();
        field_hora = new javax.swing.JFormattedTextField();
        lbl_subt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_clientes = new javax.swing.JTable();
        combo_cliente = new javax.swing.JComboBox<>();

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
        lbl_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cancelarMouseClicked(evt);
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

        btn_gerar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btn_gerar.setText("Gerar");
        btn_gerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gerarMouseClicked(evt);
            }
        });
        btn_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarActionPerformed(evt);
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

        combo_box_serv.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        combo_box_serv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Banho e Tosa", "Consulta" }));
        combo_box_serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_servActionPerformed(evt);
            }
        });

        field_data.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

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

        combo_box_animal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        combo_box_animal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cachorro", "Gato", "Passaro" }));
        combo_box_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_animalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 22, 22));
        jLabel9.setText("Animal:");

        lbl_endereco8.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_endereco8.setForeground(new java.awt.Color(24, 24, 24));
        lbl_endereco8.setText("Cliente:");
        lbl_endereco8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_endereco8AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        try {
            field_hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        field_hora.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        field_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_horaActionPerformed(evt);
            }
        });

        lbl_subt.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_subt.setForeground(new java.awt.Color(24, 24, 24));
        lbl_subt.setText("Clientes");
        lbl_subt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_subtAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        table_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_clientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table_clientesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(table_clientes);

        combo_cliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                combo_clienteAncestorAdded(evt);
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
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_titulo)
                    .addComponent(lbl_subtitulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(combo_box_serv, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbl_endereco2)
                                    .addGap(80, 80, 80)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_data, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_endereco))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_hora)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_endereco3)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_endereco8)
                                        .addComponent(combo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(106, 106, 106)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(combo_box_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_subt)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_cancelar)
                                    .addGap(166, 166, 166)
                                    .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_endereco1))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_subtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_endereco)
                            .addComponent(lbl_endereco2)
                            .addComponent(lbl_endereco3))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(field_data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_box_serv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                    .addComponent(field_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_subt)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbl_endereco1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_endereco8))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_box_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cancelar))
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void btn_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gerarActionPerformed

    private void lbl_endereco1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco1AncestorAdded

    private void combo_box_servActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_servActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_box_servActionPerformed

    private void lbl_endereco2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco2AncestorAdded

    private void lbl_endereco3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco3AncestorAdded

    private void combo_box_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_animalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_box_animalActionPerformed

    private void lbl_endereco8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_endereco8AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_endereco8AncestorAdded

    private void field_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_horaActionPerformed

    private void lbl_subtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_subtAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_subtAncestorAdded

    private void table_clientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_clientesAncestorAdded
        // TODO add your handling code here:
        ArrayList<String[]> clientes = new ArrayList<>();
        if (registros.getClientes() != null) {
            registros.getClientes().forEach((Cliente cliente) -> {
                String aux[] = new String[3];
                aux[0] = String.valueOf(cliente.getId());
                aux[1] = cliente.getNome();
                aux[2] = cliente.getEndereco();
                clientes.add(aux);
            });
        }

        DefaultTableModel tbl = (DefaultTableModel) table_clientes.getModel();
        clientes.forEach(cliente -> {
            tbl.addRow(cliente);
        });
    }//GEN-LAST:event_table_clientesAncestorAdded

    private void btn_gerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gerarMouseClicked
        // TODO add your handling code here:
        String tipoServ = String.valueOf(combo_box_serv.getSelectedItem());
        String animal = String.valueOf(combo_box_animal.getSelectedItem());
        int index = combo_cliente.getSelectedIndex();
                
        String hora = field_hora.getText();

        //Converte o tipo Date para LocalDate
        LocalDate data = LocalDate.ofInstant(field_data.getDate().toInstant(), ZoneId.systemDefault());
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();
       
        String [] horaMinuto = hora.split(":");
        
        DataHorario datatime = new DataHorario(dia, mes, ano, Integer.parseInt(horaMinuto[0]), Integer.parseInt(horaMinuto[1]));
//        if (tipoServ.isEmpty() || animal.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de gerar a ordem de serviço!", "Alerta", JOptionPane.WARNING_MESSAGE);
//        }
//        else{ 
            if(vend.getClienteById(registros.getClientes(), index) != null){
                float valor = (float)0;

                if(tipoServ.equals("Banho e Tosa"))
                    valor = (float)80.0;
                else if (tipoServ.equals("Consulta"))
                    valor = (float)90.0;

                Servico servico = new Servico(tipoServ, valor);
                Venda nVenda = new Venda(servico, valor, vend.getId());
                OrdemServico nOrdem = new OrdemServico(servico, datatime, vend.getClienteById(registros.getClientes(), index), animal);
                if(vend.realizarOrdemServico(registros, nOrdem, nVenda, servico)){
                    JOptionPane.showMessageDialog(null, "Ordem de serviço realizada com sucesso.", "Ordem de serviço realizada", JOptionPane.INFORMATION_MESSAGE);
                    cleanInputs();
                }
                else 
                    JOptionPane.showMessageDialog(null, "Erro no processo de geração de ordem de serviço, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null, "Cliente não existente, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
        //}
    }//GEN-LAST:event_btn_gerarMouseClicked

    private void combo_clienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_combo_clienteAncestorAdded
        // TODO add your handling code here:
        registros.getClientes().forEach(cliente -> {
            combo_cliente.addItem("ID:" + cliente.getId() + " | " + cliente.getNome());
        });
    }//GEN-LAST:event_combo_clienteAncestorAdded

    private void lbl_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancelarMouseClicked
        // TODO add your handling code here:
        cleanInputs();
    }//GEN-LAST:event_lbl_cancelarMouseClicked
    
    private void cleanInputs(){
        combo_box_serv.setSelectedIndex(0);
        combo_box_animal.setSelectedIndex(0);
        combo_cliente.setSelectedIndex(0);
        field_hora.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gerar;
    private javax.swing.JComboBox<String> combo_box_animal;
    private javax.swing.JComboBox<String> combo_box_serv;
    private javax.swing.JComboBox<String> combo_cliente;
    private com.toedter.calendar.JDateChooser field_data;
    private javax.swing.JFormattedTextField field_hora;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cancelar;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_endereco1;
    private javax.swing.JLabel lbl_endereco2;
    private javax.swing.JLabel lbl_endereco3;
    private javax.swing.JLabel lbl_endereco8;
    private javax.swing.JSeparator lbl_separador;
    private javax.swing.JLabel lbl_subt;
    private javax.swing.JLabel lbl_subtitulo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable table_clientes;
    // End of variables declaration//GEN-END:variables
}
