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
    private static int id = 0;
    private DataHorario dataVenc, dataPagto;
    private String descricao;
    private Float valor;
    private boolean estaPaga;
    
    public Conta(DataHorario dataVenc, String descricao, Float valor) {
        setDataVenc(dataVenc);
        setDescricao(descricao);
        setValor(valor);
        setEstaPaga(false);
        setId(getId() + 1);
    }
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Conta.id = id;
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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public boolean isEstaPaga() {
        return estaPaga;
    }

    public void setEstaPaga(boolean estaPaga) {
        this.estaPaga = estaPaga;
    }
}
