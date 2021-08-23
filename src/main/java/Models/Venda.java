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
    
    private static int INIT_ID = 0;
    private int id;
    private Produto produto;
    private Servico servico;
    private boolean isProduto;
    private float valor;
    private int idVendedor;
    
    public Venda(Produto produto, float valor, int idVendedor){
        setId();
        setProduto(produto);
        setValor(valor);
        setIdVendedor(idVendedor);
        setIsProduto(true);
    }
    
    public Venda(Servico servico, float valor, int idVendedor){
        setId();
        setServico(servico);
        setValor(valor);
        setIdVendedor(idVendedor);
        setIsProduto(false);
    }
    
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = ++INIT_ID;
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
