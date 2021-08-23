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
public class Conta {
    private static int INIT_ID = 0;
    private int id;
    private DataHorario dataVenc, dataPagto;
    private String descricao;
    private float valor;
    private boolean paga;
    
    public Conta(DataHorario dataVenc, String descricao, float valor) {
        setDataVenc(dataVenc);
        setDescricao(descricao);
        setValor(valor);
        setPaga(false);
        setId();
    }
    
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = ++INIT_ID;
    }

    public DataHorario getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(DataHorario dataVenc) {
        this.dataVenc = dataVenc;
    }

    public DataHorario getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(DataHorario dataPagto) {
        this.dataPagto = dataPagto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean estaPaga) {
        this.paga = estaPaga;
    }
}
