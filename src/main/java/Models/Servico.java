/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author enya
 */
public class Servico {
    private static int id = 0;
    String nome;
    Float valor;

    public Servico(String nome, Float valor){
        setNome(nome);
        setValor(valor);
        setId(getId() + 1);
    }
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Servico.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
