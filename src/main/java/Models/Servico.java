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
    String animal;
    String relatorio;
    DataHorario dataHorario;
    Float valor;

    public Servico(String nome, Float valor) {
        setNome(nome);
        setValor(valor);
        setId(getId() + 1);
    }

    public int getId() {
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

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    public DataHorario getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(DataHorario dataHorario) {
        this.dataHorario = dataHorario;
    }

}
