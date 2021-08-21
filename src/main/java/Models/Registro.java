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
    private ArrayList<Conta> contas = new ArrayList<>();
    private ArrayList<OrdemServico> ordemServicos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();
    private ArrayList<Veterinario> veterinarios = new ArrayList<>();
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    private final ArrayList<Produto> produtos = new ArrayList<>();

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

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

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void addVeterinario(Veterinario veterinario) {
        this.veterinarios.add(veterinario);
    }

    public void addVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

}
