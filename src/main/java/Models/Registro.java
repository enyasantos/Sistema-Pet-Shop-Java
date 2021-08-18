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
public class Registro {
    private ArrayList<Conta> contas;
    private ArrayList<OrdemServico> ordemServicos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Servico> servicos;
    private ArrayList<Veterinario> veterinarios;

    public ArrayList<Veterinario> getVeterinario() {
        return veterinarios;
    }

    public void setVeterinario(ArrayList<Veterinario> veterinario) {
        this.veterinarios = veterinario;
    }

    public ArrayList<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void setOrdemServicos(ArrayList<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }
    
    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    
    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
    
    public void addVeterinario(Veterinario veterinario) {
        this.veterinarios.add(veterinario);
    }
    
}
