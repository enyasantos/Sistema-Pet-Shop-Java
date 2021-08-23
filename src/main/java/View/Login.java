/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Models.Administrador;
import Models.Cliente;
import Models.DataHorario;
import Models.OrdemServico;
import Models.Registro;
import Models.Servico;
import Models.Venda;
import Models.Veterinario;
import Models.Vendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author enya
 */
public class Login extends javax.swing.JFrame {

    private Registro registros;
    
    /**
     * Creates new form MenuInicial
     */
    public Login() {
        initComponents();
    }

    public Login(Registro registros) {
        initComponents();
        this.setRegistros(registros);
        /*Vendedor vend = new Vendedor("admin", "admin", "admin", (float)100.0, "11111111");
        Veterinario vet = new Veterinario("admin", (float)100.0, "admin", "admin", "11111111");
        Cliente cliente2 = new Cliente("joão", "11111111");
        Cliente cliente1 = new Cliente("maria", "11111111");
        getRegistros().addVendedor(vend);
        getRegistros().addVeterinario(vet);
        getRegistros().addCliente(cliente1);
        getRegistros().addCliente(cliente2);
        
        
        Servico servico = new Servico("Consulta", (float)90);
        DataHorario datatime = new DataHorario(12, 12, 2020, 12, 0);
        Venda nVenda1 = new Venda(servico, (float)90, 0);
        OrdemServico nOrdem = new OrdemServico(servico, datatime, cliente1, "Cachorro");
        getRegistros().addOrdemServico(nOrdem);
        getRegistros().addVenda(nVenda1);
        
        Servico servico1 = new Servico("Banho e tosa", (float)80);
        DataHorario datatime1 = new DataHorario(12, 12, 2020, 12, 0);
        Venda nVenda2 = new Venda(servico1, (float)80, 0);
        OrdemServico nOrdem1 = new OrdemServico(servico1, datatime1, cliente2, "Gato");
        getRegistros().addOrdemServico(nOrdem1);
        getRegistros().addVenda(nVenda2);*/
    }

    public Registro getRegistros() {
        return registros;
    }

    public void setRegistros(Registro registros) {
        this.registros = registros;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title_happetsy = new javax.swing.JLabel();
        lbl_version = new javax.swing.JLabel();
        lvl_sistema_gerenciamento = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_sair = new javax.swing.JButton();
        btn_entrar = new javax.swing.JButton();
        input_senha = new javax.swing.JPasswordField();
        input_usuario = new javax.swing.JTextField();
        combo_box_tipo_usuario = new javax.swing.JComboBox<>();
        lbl_usuario = new javax.swing.JLabel();
        lbl_senha = new javax.swing.JLabel();
        lbl_tipo_usuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 133, 128));

        lbl_title_happetsy.setBackground(new java.awt.Color(254, 254, 255));
        lbl_title_happetsy.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lbl_title_happetsy.setForeground(new java.awt.Color(254, 254, 254));
        lbl_title_happetsy.setText("H A P P E T S Y");

        lbl_version.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbl_version.setForeground(new java.awt.Color(188, 193, 195));
        lbl_version.setText("v0.1");

        lvl_sistema_gerenciamento.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lvl_sistema_gerenciamento.setForeground(new java.awt.Color(207, 212, 213));
        lvl_sistema_gerenciamento.setText("Sistema de gerenciamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lvl_sistema_gerenciamento)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_title_happetsy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_version)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title_happetsy)
                    .addComponent(lbl_version))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvl_sistema_gerenciamento)
                .addGap(218, 218, 218))
        );

        jPanel2.setBackground(new java.awt.Color(17, 20, 36));

        btn_sair.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sairMouseClicked(evt);
            }
        });

        btn_entrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_entrar.setText("Entrar");
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entrarMouseClicked(evt);
            }
        });

        input_senha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        input_senha.setToolTipText("");

        input_usuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        combo_box_tipo_usuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        combo_box_tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Administrador", "Vendedor", "Veterinário" }));

        lbl_usuario.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(246, 246, 246));
        lbl_usuario.setText("Usuário:");

        lbl_senha.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(246, 246, 246));
        lbl_senha.setText("Senha:");

        lbl_tipo_usuario.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_tipo_usuario.setForeground(new java.awt.Color(246, 246, 246));
        lbl_tipo_usuario.setText("Fazer login como:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("L O G I N");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(input_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_usuario)
                            .addComponent(lbl_senha)
                            .addComponent(lbl_tipo_usuario)
                            .addComponent(combo_box_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(148, 148, 148))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(lbl_tipo_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_box_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbl_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void alertaLogin(String usuario, String senha) {
        if (usuario.equals("")) {
            JOptionPane.showMessageDialog(null, "Tanso, preencha o campo usuário!", "Erro", JOptionPane.WARNING_MESSAGE);
        } else if (senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Tanso, preencha o campo senha!", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btn_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseClicked
        // TODO add your handling code here:
        String tipoUsuario = String.valueOf(combo_box_tipo_usuario.getSelectedItem());
        String usuario = input_usuario.getText();
        String senha = input_senha.getText();
        if(tipoUsuario.equals("Administrador")){
            Administrador adm = new Administrador(usuario, senha);
            if(adm.fazerLogin()) {
                new MenuAdministrador(adm, registros).setVisible(true);
            } else alertaLogin(usuario, senha);
        } else if(tipoUsuario.equals("Vendedor")){
            Vendedor vend = Models.Login.verificaLogin(registros.getVendedores(), usuario, senha);
                if(vend == null)
                    alertaLogin(usuario, senha);
                else new MenuVendedor(vend, registros).setVisible(true);
        } else if(tipoUsuario.equals("Veterinário")){
            //Veterinario vet = new Veterinario("nathann", 1232, usuario, senha, "1234");
            //if(usuario.equals("vet") && senha.equals("vet")) {
                //new MenuVeterinario(vet,registros).setVisible(true);
            //} else alertaLogin(usuario, senha);
                Veterinario vet = Models.Login.verificaLogin(registros.getVeterinario(), usuario, senha);
                if(vet == null)
                    alertaLogin(usuario, senha);
                else new MenuVeterinario(vet,registros).setVisible(true);
        }
        
    }//GEN-LAST:event_btn_entrarMouseClicked

    private void btn_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_sairMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JComboBox<String> combo_box_tipo_usuario;
    private javax.swing.JPasswordField input_senha;
    private javax.swing.JTextField input_usuario;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_tipo_usuario;
    private javax.swing.JLabel lbl_title_happetsy;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel lbl_version;
    private javax.swing.JLabel lvl_sistema_gerenciamento;
    // End of variables declaration//GEN-END:variables
}
