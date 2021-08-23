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
public class OrdemServico {
    static int _id = 0;
    
    private int id;
    private Servico servico;
    private DataHorario datatime;
    private Cliente cliente;
    private String nomeCliente;
    private String animal;
    private String relatorio;

    public OrdemServico(Servico servico, DataHorario datatime, Cliente cliente, String animal) {
        setId();
        setServico(servico);
        setDatatime(datatime);
        setCliente(cliente);
        setAnimal(animal);
    }

    public OrdemServico(Servico servico, DataHorario datatime, String nomeCliente, String animal) {
        setId();
        setServico(servico);
        setDatatime(datatime);
        setNomeCliente(nomeCliente);
        setAnimal(animal);
    }
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = _id++;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public DataHorario getDatatime() {
        return datatime;
    }

    public void setDatatime(DataHorario datatime) {
        this.datatime = datatime;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
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

    
    
}
