/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Vitoria
 */
public class Vendedor extends Usuario {

    public Vendedor(String nome, String usuario, String senha, float salario, String cpf) {
        super(nome, salario, usuario, senha, cpf);
    }

    public Cliente getClienteById(ArrayList<Cliente> clientes, int id, boolean flag) {
        if (super.getStatusLog()) {
            if (!clientes.isEmpty()) { // há clientes cadastrados
                for (Cliente cliente : clientes) {
                    if (cliente.getId() == id) {
                        flag = true;
                        return cliente;
                    }
                }
            }
        } else {
            System.out.println("faça oio login!!!!!!!!!!!!!!!!!!!!!");
        }
        flag = false;
        return null;
    }

    public void visualizarCliente(ArrayList<Cliente> clientes) {
        if (super.getStatusLog()) {
            if (!clientes.isEmpty()) {
                for (Cliente cliente : clientes)
                    System.out.println("cliente: " + cliente);
            } else
                System.out.println("não há clientes cadastrados");
        } else
            System.out.println("faça oio login!!!!!!!!!!!!!!!!!!!!!");
    }

    // public void visualizarProdutos(ArrayList<Produto> produtos) {
    // if (super.getStatusLog()) {
    // if (!produtos.isEmpty()) {

    // }
    // }
    // }

    public boolean cadastrarCliente():

    public boolean realizarVenda();

    public boolean realizarOrdemServico();

    // public Vendedor verificarLogin(ArrayList<Vendedor> vendedores, String
    // usuario, String senha){
    // ArrayList<Login> login;
    // return login.verificarLogin(vendedores, usuario, senha);
    // }

}
