/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitoria
 */
public class Vendedor extends Usuario {

    public Vendedor(String nome, String usuario, String senha, float salario, String cpf) {
        super(nome, salario, usuario, senha, cpf);
    }

    public Cliente getClienteById(ArrayList<Cliente> clientes, int index) {
        if (super.getStatusLog()) {            
            if(clientes.get(index) != null){
                return clientes.get(index);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação não permitida, faça o login para continuar", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
        
    public Produto getProdutoByID(ArrayList<Produto> produtos, int index) {
        if (super.getStatusLog()) {
           return produtos.get(index);
        } else {
            JOptionPane.showMessageDialog(null, "Operação não permitida, faça o login para continuar", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    public boolean cadastrarCliente(Registro registros, Cliente cliente){
        if(super.getStatusLog()){
            registros.addCliente(cliente);
            return true;
        }
        else 
            return false;
    }
      
    public boolean realizarVenda(Registro registros, Venda venda, ArrayList<Produto> produtos, int quantidade, int id){
        if(super.getStatusLog()){
            if(!produtos.isEmpty() && quantidade > 0){
                for(Produto produto : produtos){
                    if(produto.getId() == id){
                        if(produto.getQuantidade() >= quantidade){
                            produto.atualizarQuantidade(quantidade);
                            Venda nVenda = new Venda(produto, (produto.getValor() * quantidade), this.getId()); 
                            registros.addVenda(nVenda);
                            return true;
                        }
                            
                    }
                }
            }
        }
        return false;
    }
    
    public boolean realizarOrdemServico(Registro registros, OrdemServico ordem, Venda venda, Servico servico){
        if(super.getStatusLog()){
            registros.addOrdemServico(ordem);
            Venda nVenda = new Venda(servico, servico.getValor(), this.getId());
            registros.addVenda(nVenda);
            return true;
        }
        return false;
    }

    public Vendedor verificarLogin(ArrayList<Vendedor> vendedores, String usuario, String senha) {
        return Login.verificaLogin(vendedores, usuario, senha);
    }

}
