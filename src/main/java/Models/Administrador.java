/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author enya
 */
public class Administrador extends Usuario {
    
    private static final String USUARIO = "admin";
    private static final String SENHA = "admin";
    
    public Administrador(String usuario, String senha) {
        super("Administrador", (float)0.0, usuario, senha);    
    }
    
    /*
    void visualizarClientes(vector<Cliente> &);
    void visualizarVendedores(vector<Vendedor> &);
    void visualizarVeterinarios(vector<Veterinario> &);
    bool visualizarContas(vector<Conta> &);

    bool cadastrarVendedor(vector<Vendedor> &, Vendedor &);
    bool cadastrarVeterinario(vector<Veterinario> &, Veterinario &);
    bool pagarConta(vector<Conta> &, int);
    bool comprar(vector<Produto> &, vector<Conta> &, Produto &, Conta &);
    void registraConta(Conta &);
    void gerarRelatorio(vector<Conta> &, vector<Venda> &);
    bool verificarLogin(string, string);
    */
    
    public void visualizarClientes(ArrayList<String> clientes){
        
    }
    
    public void visualizarVendedores(ArrayList<String> vendedores){
        
    }
    
    public void visualizarVeterinarios(ArrayList<String> veterinarios){
        
    }
    
    public void visualizarContas(ArrayList<String> vontas){
        
    }
    
    public boolean cadastrarVendedor(ArrayList<String> vendedores, String vendedor){
        return true;
    }
    
    public boolean cadastrarVeterinario(ArrayList<String> veterinarios, String veterinario){
        return true;
    }
    
    public boolean pagarConta(ArrayList<String> contas, String conta){
        return true;
    }
        
    public boolean comprar(Registro registros, Conta conta, String produto){
        if(super.getStatusLog()){
            registros.addConta(conta);
            return true;
        }
        else return false;
    }
    
    public void registraConta(ArrayList<String> contas) {}
    
    public ArrayList<Conta> gerarRelatorioConta(Registro registros){
        return registros.getContas();
    }
    
    public void gerarRelatorioVendas(Registro registros){
        
    }
    
    public boolean fazerLogin() {
        if(super.getUsuario().equals(USUARIO) && super.getSenha().equals(SENHA)){
            super.setStatusLog(true);
            return true;
        } else {
            super.setStatusLog(false);
            return false;
        }
    }
}