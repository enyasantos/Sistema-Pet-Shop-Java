/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Content.CadastrarFuncionarios;
import Content.Comprar;
import Content.ListarClientes;
import Content.ListarFuncionarios;
import Content.PagarConta;
import Content.Relatorio;
import Models.Administrador;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author enya
 */
public class MenuAdministrador extends javax.swing.JFrame {
    
    private Administrador adm;
    
    public MenuAdministrador() {
        initComponents();
    }
    /**
     * Creates new form MenuAdministrados
     * @param adm
     */
    public MenuAdministrador(Administrador adm) {
        initComponents();
        setAdm(adm);
    }

    public Administrador getAdm() {
        return adm;
    }

    private void setAdm(Administrador adm) {
        this.adm = adm;
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
        lbl_cadastrar_vendedor = new javax.swing.JLabel();
        lbl_cadastrar_veterinario = new javax.swing.JLabel();
        lbl_v_vededores = new javax.swing.JLabel();
        lbl_v_veterinarios = new javax.swing.JLabel();
        lbl_sair = new javax.swing.JLabel();
        lbl_title_happetsy = new javax.swing.JLabel();
        lbl_version = new javax.swing.JLabel();
        lvl_sistema_gerenciamento = new javax.swing.JLabel();
        btn_gerenciar_fun = new javax.swing.JPanel();
        lbl_gerenciar_fun = new javax.swing.JLabel();
        btn_gerenciar_fun_aux = new javax.swing.JPanel();
        btn_pagar_conta = new javax.swing.JPanel();
        lbl_pagar_conta = new javax.swing.JLabel();
        btn_pagar_conta_aux = new javax.swing.JPanel();
        btn_comprar = new javax.swing.JPanel();
        lbl_comprar = new javax.swing.JLabel();
        btn_comprar_aux = new javax.swing.JPanel();
        btn_relatorio = new javax.swing.JPanel();
        lbl_relatorio = new javax.swing.JLabel();
        btn_relatorio_aux = new javax.swing.JPanel();
        btn_v_cliente = new javax.swing.JPanel();
        lbl_v_cliente = new javax.swing.JLabel();
        btn_v_cliente_aux = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        j_content.setBackground(new java.awt.Color(244, 244, 244));
        j_content.setBorder(null);
        j_content.setPreferredSize(new java.awt.Dimension(678, 536));

        panel_menu.setBackground(new java.awt.Color(13, 36, 51));

        lbl_cadastrar_vendedor.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_cadastrar_vendedor.setForeground(new java.awt.Color(254, 254, 254));
        lbl_cadastrar_vendedor.setText("Cadastrar vendedor");
        lbl_cadastrar_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cadastrar_vendedorMouseClicked(evt);
            }
        });

        lbl_cadastrar_veterinario.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_cadastrar_veterinario.setForeground(new java.awt.Color(254, 254, 254));
        lbl_cadastrar_veterinario.setText("Cadastrar veterinário");
        lbl_cadastrar_veterinario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cadastrar_veterinarioMouseClicked(evt);
            }
        });

        lbl_v_vededores.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_v_vededores.setForeground(new java.awt.Color(254, 254, 254));
        lbl_v_vededores.setText("Visualizar vendedores");
        lbl_v_vededores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_v_vededoresMouseClicked(evt);
            }
        });

        lbl_v_veterinarios.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lbl_v_veterinarios.setForeground(new java.awt.Color(254, 254, 254));
        lbl_v_veterinarios.setText("Visualizar veterinários");
        lbl_v_veterinarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_v_veterinariosMouseClicked(evt);
            }
        });

        lbl_sair.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_sair.setForeground(new java.awt.Color(254, 254, 254));
        lbl_sair.setText("Sair");

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

        btn_gerenciar_fun.setBackground(new java.awt.Color(13, 36, 51));
        btn_gerenciar_fun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_gerenciar_funMousePressed(evt);
            }
        });

        lbl_gerenciar_fun.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_gerenciar_fun.setForeground(new java.awt.Color(254, 254, 254));
        lbl_gerenciar_fun.setText("Gerenciar funcionarios");
        lbl_gerenciar_fun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_gerenciar_funMouseClicked(evt);
            }
        });

        btn_gerenciar_fun_aux.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_gerenciar_fun_auxLayout = new javax.swing.GroupLayout(btn_gerenciar_fun_aux);
        btn_gerenciar_fun_aux.setLayout(btn_gerenciar_fun_auxLayout);
        btn_gerenciar_fun_auxLayout.setHorizontalGroup(
            btn_gerenciar_fun_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        btn_gerenciar_fun_auxLayout.setVerticalGroup(
            btn_gerenciar_fun_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_gerenciar_funLayout = new javax.swing.GroupLayout(btn_gerenciar_fun);
        btn_gerenciar_fun.setLayout(btn_gerenciar_funLayout);
        btn_gerenciar_funLayout.setHorizontalGroup(
            btn_gerenciar_funLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_gerenciar_funLayout.createSequentialGroup()
                .addComponent(btn_gerenciar_fun_aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_gerenciar_fun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_gerenciar_funLayout.setVerticalGroup(
            btn_gerenciar_funLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_gerenciar_fun_aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_gerenciar_funLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_gerenciar_fun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_pagar_conta.setBackground(new java.awt.Color(13, 36, 51));
        btn_pagar_conta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_pagar_contaMousePressed(evt);
            }
        });

        lbl_pagar_conta.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_pagar_conta.setForeground(new java.awt.Color(254, 254, 254));
        lbl_pagar_conta.setText("Pagar conta");
        lbl_pagar_conta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_pagar_contaMouseClicked(evt);
            }
        });

        btn_pagar_conta_aux.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_pagar_conta_auxLayout = new javax.swing.GroupLayout(btn_pagar_conta_aux);
        btn_pagar_conta_aux.setLayout(btn_pagar_conta_auxLayout);
        btn_pagar_conta_auxLayout.setHorizontalGroup(
            btn_pagar_conta_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        btn_pagar_conta_auxLayout.setVerticalGroup(
            btn_pagar_conta_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_pagar_contaLayout = new javax.swing.GroupLayout(btn_pagar_conta);
        btn_pagar_conta.setLayout(btn_pagar_contaLayout);
        btn_pagar_contaLayout.setHorizontalGroup(
            btn_pagar_contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pagar_contaLayout.createSequentialGroup()
                .addComponent(btn_pagar_conta_aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_pagar_conta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_pagar_contaLayout.setVerticalGroup(
            btn_pagar_contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_pagar_conta_aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_pagar_contaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_pagar_conta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_comprar.setBackground(new java.awt.Color(13, 36, 51));
        btn_comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_comprarMousePressed(evt);
            }
        });

        lbl_comprar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_comprar.setForeground(new java.awt.Color(254, 254, 254));
        lbl_comprar.setText("Comprar");
        lbl_comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_comprarMouseClicked(evt);
            }
        });

        btn_comprar_aux.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_comprar_auxLayout = new javax.swing.GroupLayout(btn_comprar_aux);
        btn_comprar_aux.setLayout(btn_comprar_auxLayout);
        btn_comprar_auxLayout.setHorizontalGroup(
            btn_comprar_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        btn_comprar_auxLayout.setVerticalGroup(
            btn_comprar_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_comprarLayout = new javax.swing.GroupLayout(btn_comprar);
        btn_comprar.setLayout(btn_comprarLayout);
        btn_comprarLayout.setHorizontalGroup(
            btn_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_comprarLayout.createSequentialGroup()
                .addComponent(btn_comprar_aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_comprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_comprarLayout.setVerticalGroup(
            btn_comprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_comprar_aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_comprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_comprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_relatorio.setBackground(new java.awt.Color(13, 36, 51));
        btn_relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_relatorioMousePressed(evt);
            }
        });

        lbl_relatorio.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_relatorio.setForeground(new java.awt.Color(254, 254, 254));
        lbl_relatorio.setText("Relatório");
        lbl_relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_relatorioMouseClicked(evt);
            }
        });

        btn_relatorio_aux.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_relatorio_auxLayout = new javax.swing.GroupLayout(btn_relatorio_aux);
        btn_relatorio_aux.setLayout(btn_relatorio_auxLayout);
        btn_relatorio_auxLayout.setHorizontalGroup(
            btn_relatorio_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        btn_relatorio_auxLayout.setVerticalGroup(
            btn_relatorio_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_relatorioLayout = new javax.swing.GroupLayout(btn_relatorio);
        btn_relatorio.setLayout(btn_relatorioLayout);
        btn_relatorioLayout.setHorizontalGroup(
            btn_relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_relatorioLayout.createSequentialGroup()
                .addComponent(btn_relatorio_aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_relatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_relatorioLayout.setVerticalGroup(
            btn_relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_relatorio_aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_relatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_relatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_v_cliente.setBackground(new java.awt.Color(13, 36, 51));
        btn_v_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_v_clienteMousePressed(evt);
            }
        });

        lbl_v_cliente.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lbl_v_cliente.setForeground(new java.awt.Color(254, 254, 254));
        lbl_v_cliente.setText("Visualizar clientes");
        lbl_v_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_v_clienteMouseClicked(evt);
            }
        });

        btn_v_cliente_aux.setBackground(new java.awt.Color(13, 36, 51));

        javax.swing.GroupLayout btn_v_cliente_auxLayout = new javax.swing.GroupLayout(btn_v_cliente_aux);
        btn_v_cliente_aux.setLayout(btn_v_cliente_auxLayout);
        btn_v_cliente_auxLayout.setHorizontalGroup(
            btn_v_cliente_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        btn_v_cliente_auxLayout.setVerticalGroup(
            btn_v_cliente_auxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_v_clienteLayout = new javax.swing.GroupLayout(btn_v_cliente);
        btn_v_cliente.setLayout(btn_v_clienteLayout);
        btn_v_clienteLayout.setHorizontalGroup(
            btn_v_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_v_clienteLayout.createSequentialGroup()
                .addComponent(btn_v_cliente_aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_v_cliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_v_clienteLayout.setVerticalGroup(
            btn_v_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_v_cliente_aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_v_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_v_cliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_gerenciar_fun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_pagar_conta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_v_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_sair)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cadastrar_veterinario)
                    .addComponent(lbl_cadastrar_vendedor)
                    .addComponent(lbl_v_vededores)
                    .addComponent(lbl_v_veterinarios))
                .addGap(50, 50, 50))
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvl_sistema_gerenciamento)
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addComponent(lbl_title_happetsy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_version)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title_happetsy)
                    .addComponent(lbl_version))
                .addGap(2, 2, 2)
                .addComponent(lvl_sistema_gerenciamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_gerenciar_fun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cadastrar_vendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_cadastrar_veterinario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_v_vededores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_v_veterinarios)
                .addGap(18, 18, 18)
                .addComponent(btn_v_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pagar_conta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_sair)
                .addGap(222, 222, 222))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(j_content, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j_content, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(13, 36, 51));
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(254, 254, 254));
    }

    private void lbl_cadastrar_vendedorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_cadastrar_vendedorMouseClicked
        // TODO add your handling code here:
        CadastrarFuncionarios cadastro = new CadastrarFuncionarios("vendedor");
        j_content.removeAll();
        j_content.add(cadastro).setVisible(true);

        setColor(btn_gerenciar_fun_aux);
        resetColor(btn_v_cliente_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
    }// GEN-LAST:event_lbl_cadastrar_vendedorMouseClicked

    private void lbl_gerenciar_funMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_gerenciar_funMouseClicked
        // TODO add your handling code here
        setColor(btn_v_cliente_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
        resetColor(btn_gerenciar_fun_aux);
    }// GEN-LAST:event_lbl_gerenciar_funMouseClicked

    private void btn_gerenciar_funMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_gerenciar_funMousePressed
        // TODO add your handling code here:
        setColor(btn_gerenciar_fun_aux);
        resetColor(btn_v_cliente_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
    }// GEN-LAST:event_btn_gerenciar_funMousePressed

    private void lbl_pagar_contaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_pagar_contaMouseClicked
        // TODO add your handling code here:Lista lista = new Lista();
        PagarConta lista = new PagarConta();
        j_content.removeAll();
        j_content.add(lista).setVisible(true);

        setColor(btn_pagar_conta_aux);
        resetColor(btn_gerenciar_fun_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_v_cliente_aux);
    }// GEN-LAST:event_lbl_pagar_contaMouseClicked

    private void btn_pagar_contaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_pagar_contaMousePressed
        // TODO add your handling code here:
        setColor(btn_pagar_conta_aux);
        resetColor(btn_gerenciar_fun_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_v_cliente_aux);
    }// GEN-LAST:event_btn_pagar_contaMousePressed

    private void lbl_comprarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_comprarMouseClicked
        // TODO add your handling code here:
        Comprar comprar = new Comprar();
        j_content.removeAll();
        j_content.add(comprar).setVisible(true);

        setColor(btn_comprar_aux);
        resetColor(btn_gerenciar_fun_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_pagar_conta_aux);
        resetColor(btn_v_cliente_aux);
    }// GEN-LAST:event_lbl_comprarMouseClicked

    private void btn_comprarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_comprarMousePressed
        // TODO add your handling code here:
        Comprar comprar = new Comprar();
        j_content.removeAll();
        j_content.add(comprar).setVisible(true);
        
        setColor(btn_comprar_aux);
        resetColor(btn_gerenciar_fun_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_pagar_conta_aux);
        resetColor(btn_v_cliente_aux);
    }// GEN-LAST:event_btn_comprarMousePressed

    private void lbl_relatorioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_relatorioMouseClicked
        // TODO add your handling code here:
        Relatorio relatorio = new Relatorio();
        j_content.removeAll();
        j_content.add(relatorio).setVisible(true);

        setColor(btn_relatorio_aux);
        resetColor(btn_gerenciar_fun_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
        resetColor(btn_v_cliente_aux);
    }// GEN-LAST:event_lbl_relatorioMouseClicked

    private void btn_relatorioMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_relatorioMousePressed
        // TODO add your handling code here:
        Relatorio relatorio = new Relatorio();
        j_content.removeAll();
        j_content.add(relatorio).setVisible(true);
        
        setColor(btn_relatorio_aux);
        resetColor(btn_gerenciar_fun_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
        resetColor(btn_v_cliente_aux);
    }// GEN-LAST:event_btn_relatorioMousePressed

    private void lbl_v_clienteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_v_clienteMouseClicked
        // TODO add your handling code here:
        ListarClientes lista = new ListarClientes();
        j_content.removeAll();
        j_content.add(lista).setVisible(true);

        setColor(btn_v_cliente_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
        resetColor(btn_gerenciar_fun_aux);
    }// GEN-LAST:event_lbl_v_clienteMouseClicked

    private void btn_v_clienteMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_v_clienteMousePressed
        // TODO add your handling code here:
        ListarClientes lista = new ListarClientes();
        j_content.removeAll();
        j_content.add(lista).setVisible(true);
        
        setColor(btn_v_cliente_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
        resetColor(btn_gerenciar_fun_aux);
    }// GEN-LAST:event_btn_v_clienteMousePressed

    private void lbl_cadastrar_veterinarioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_cadastrar_veterinarioMouseClicked
        // TODO add your handling code here:
        CadastrarFuncionarios lista = new CadastrarFuncionarios("veterinário");
        j_content.removeAll();
        j_content.add(lista).setVisible(true);

        setColor(btn_gerenciar_fun_aux);
        resetColor(btn_v_cliente_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
    }// GEN-LAST:event_lbl_cadastrar_veterinarioMouseClicked

    private void lbl_v_vededoresMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_v_vededoresMouseClicked
        // TODO add your handling code here:
        ListarFuncionarios lista = new ListarFuncionarios("vendedor");
        j_content.removeAll();
        j_content.add(lista).setVisible(true);

        setColor(btn_gerenciar_fun_aux);
        resetColor(btn_v_cliente_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
    }// GEN-LAST:event_lbl_v_vededoresMouseClicked

    private void lbl_v_veterinariosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_v_veterinariosMouseClicked
        // TODO add your handling code here:
        ListarFuncionarios lista = new ListarFuncionarios("veterinário");
        j_content.removeAll();
        j_content.add(lista).setVisible(true);

        setColor(btn_gerenciar_fun_aux);
        resetColor(btn_v_cliente_aux);
        resetColor(btn_relatorio_aux);
        resetColor(btn_comprar_aux);
        resetColor(btn_pagar_conta_aux);
    }// GEN-LAST:event_lbl_v_veterinariosMouseClicked

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_comprar;
    private javax.swing.JPanel btn_comprar_aux;
    private javax.swing.JPanel btn_gerenciar_fun;
    private javax.swing.JPanel btn_gerenciar_fun_aux;
    private javax.swing.JPanel btn_pagar_conta;
    private javax.swing.JPanel btn_pagar_conta_aux;
    private javax.swing.JPanel btn_relatorio;
    private javax.swing.JPanel btn_relatorio_aux;
    private javax.swing.JPanel btn_v_cliente;
    private javax.swing.JPanel btn_v_cliente_aux;
    private javax.swing.JDesktopPane j_content;
    private javax.swing.JLabel lbl_cadastrar_vendedor;
    private javax.swing.JLabel lbl_cadastrar_veterinario;
    private javax.swing.JLabel lbl_comprar;
    private javax.swing.JLabel lbl_gerenciar_fun;
    private javax.swing.JLabel lbl_pagar_conta;
    private javax.swing.JLabel lbl_relatorio;
    private javax.swing.JLabel lbl_sair;
    private javax.swing.JLabel lbl_title_happetsy;
    private javax.swing.JLabel lbl_v_cliente;
    private javax.swing.JLabel lbl_v_vededores;
    private javax.swing.JLabel lbl_v_veterinarios;
    private javax.swing.JLabel lbl_version;
    private javax.swing.JLabel lvl_sistema_gerenciamento;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}
