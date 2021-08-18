/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Vitoria
 */
public class Produto {
    public static int id = 0;
    
    private int quantidade;
    private float valor;
    private String nome;
    private String animal;
    private String descricao;
    
    public Produto(int quantidade, float valor, String nome, String animal, String descricao){
        setId(getId()+1);
        this.quantidade = quantidade;
        this.valor = valor;
        this.nome = nome;
        this.animal = animal;
    }
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Produto.id = id;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setAnimal(String animal){
        this.animal = animal;
    }
    
    public String getAnimal(){
        return animal;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public boolean atualizarQuantidade(int quantidade){
        if((getQuantidade() - quantidade ) >= 0){
            setQuantidade(getQuantidade() - quantidade);
            return true;
        }
        return false;
    }
}
