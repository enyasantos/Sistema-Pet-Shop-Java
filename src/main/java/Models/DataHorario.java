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
public class DataHorario {
    private int dia, mes, ano, hora, minuto;

    public DataHorario(int dia, int mes, int ano, int hora, int minuto) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
        setHora(hora);
        setMinuto(minuto);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    
    public String toDateAmericanFormat() {     
        String mes = getMes() > 9 ? String.valueOf(getMes()) : "0"+getMes();
        return (getAno() + "-" + mes + "-" +  getDia());
    }
    
    public String toStringData() {
        return String.format("%d-%d-%d", getDia(), getMes(), getAno());
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%d-%d-%d %d:%d", getDia(), getMes(), getAno(), getHora(), getMinuto());
    }
}
