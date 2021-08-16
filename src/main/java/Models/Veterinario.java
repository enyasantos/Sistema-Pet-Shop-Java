/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;


/**
 *
 * @author thayn
 */
public class Veterinario{
    String nome;
    String usuario;
    String senha;
    float salario;

    public Veterinario(String nome, String usuario, String senha, float salario) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.salario = salario;
    }

    void visualizarOrdem(ArrayList<OrdemServico> ordens){
        if(this->getStatusLog()){
            if(ordens.isEmpty()){
                System.out.println("Não há ordens cadastradas.");
            }
            else{
                for(OrdemServico ordem : ordens){
                    if(ordem.getServico().getNome().equals("Consulta"))
                        //imprimir ordem
                }
            }
        }
        else{
                System.out.println("Erro: Ação não permitida, faça o login.");
                
            }
    }
    
    bool registraRelatorio(ArrayList<OrdemServico> ordens, String relatorio, int id){
        if(this.getStatusLog()){
            if(ordens.isEmpty()){
                System.out.println("Não há ordens cadastradas.");
            }
            else{
                for(OrdemServico ordem : ordens){
                    if(ordem.getId() == id)
                        ordem.setRelatorio(relatorio);
                    return true;
                }
            }
            return false;
        }
        else{
            System.err.println("Erro: Ação não permitida, faça o login.");
        }
        return false;
    }
}



