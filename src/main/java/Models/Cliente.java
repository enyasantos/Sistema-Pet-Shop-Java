/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author thayn
 */


public class Cliente {
    static int _id = 0;
    
    private int id;
    private String nome;
    private String endereco;
    
    public Cliente(String nome, String endereco){
        setId();
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return _id;
    }

    public void setId() {
        this.id = _id++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
