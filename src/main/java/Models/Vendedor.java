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
        if (super.getStatusLog()) { // verifica se o vendendor está logado no sistema       
            if(clientes.get(index) != null){ // verifica se o vetor de clientes está vazio
                return clientes.get(index); // retorna o cliente buscado
            }
        } else {
            //mensagem de erro exibida na tela
            JOptionPane.showMessageDialog(null, "Operação não permitida, faça o login para continuar", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
        
    public Produto getProdutoByID(ArrayList<Produto> produtos, int index) {
        if (super.getStatusLog()) { // verifica se o vendedor está logado no sistema
           return produtos.get(index); // retorna o produto buscado
        } else {
            // mensagem de erro exibida na tela
            JOptionPane.showMessageDialog(null, "Operação não permitida, faça o login para continuar", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    public boolean cadastrarCliente(Registro registros, Cliente cliente){
        if(super.getStatusLog()){ // verifica se o vendedor está logado no sistema
            registros.addCliente(cliente); // adciona o cliente no array de clientes 
            return true; 
        }
        else 
            return false;
    }
      
    public boolean realizarVenda(Registro registros, Venda venda, ArrayList<Produto> produtos, int quantidade, int id){
        if(super.getStatusLog()){ // verifica se o vendedor está logado
            if(!produtos.isEmpty() && quantidade > 0){ //se há produtos e a quantidade desejada pelo cliente for maior que 0
                for(Produto produto : produtos){ //percorro o vetor de produtos
                    if(produto.getId() == id){ // busco o produto de id desejado
                        if(produto.getQuantidade() >= quantidade){ 
                            produto.atualizarQuantidade(quantidade); //chama função que atualiza a quantidade de prdutos no estoque
                            Venda nVenda = new Venda(produto, (produto.getValor() * quantidade), this.getId()); // cria uma nova venda
                            registros.addVenda(nVenda); // adiciona a venda nos registros de vendas
                            return true;
                        }
                            
                    }
                }
            }
        }
        return false;
    }
    
    public boolean realizarOrdemServico(Registro registros, OrdemServico ordem, Venda venda, Servico servico){
        if(super.getStatusLog()){ // verifica se o vendedor está logado
            registros.addOrdemServico(ordem); // adiciona nova ordem de serviço nos registros de ordem de serviço
            Venda nVenda = new Venda(servico, servico.getValor(), this.getId()); // nova venda do serviço
            registros.addVenda(nVenda); // adiciona a venda nos registros de venda
            return true;
        }
        return false;
    }

    public Vendedor verificarLogin(ArrayList<Vendedor> vendedores, String usuario, String senha) {
        return Login.verificaLogin(vendedores, usuario, senha); // função que verifica o login do vendedor
    }

}
