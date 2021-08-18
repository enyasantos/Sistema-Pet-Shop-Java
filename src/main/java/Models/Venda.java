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
public class Venda {
    public static int id = 0;
    private Produto produto;
    private Servico servico;
    private boolean isProduto;
    private float valor;
    private int idVendedor;
    
    public Venda(Produto produto, boolean isProduto, float valor, int idVendedor){
        setId(getId()+1);
        this.produto = produto;
        this.isProduto = isProduto;
        this.valor = valor;
        this.idVendedor = idVendedor;
    }
    
    public Venda(Servico servico, boolean isProduto, float valor, int idVendedor){
        setId(getId()+1);
        this.servico = servico;
        this.isProduto = isProduto;
        this.valor = valor;
        this.idVendedor = idVendedor;
    }
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Venda.id = id;
    }
    
    public void setIsProduto(boolean isProduto){
        this.isProduto = isProduto;
    }
    
    public boolean getIsProduto(){
        return isProduto;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public Produto getProduto(){
        return produto;
    }
    
    public void setServico(Servico servico){
        this.servico = servico;
    }
    
    public Servico getServico(){
        return servico;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setIdVendedor(int idVendedor){
        this.idVendedor = idVendedor;
    }
    
    public int getIdVendedor(){
        return idVendedor;
    }
}
