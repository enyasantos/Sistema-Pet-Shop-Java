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
    
    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    
    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
}
