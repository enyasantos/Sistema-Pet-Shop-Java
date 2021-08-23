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
public class Usuario {
    private static int INIT_ID = 0;
    private int id;
    private String nome;
    private float salario;
    private String usuario;
    private String senha;
    private boolean statusLog;
    private String cpf;

    public Usuario(String nome, Float salario, String usuario, String senha, String cpf) {
        setId();
        setNome(nome);
        setUsuario(usuario);
        setSalario(salario);
        setSenha(senha);
        setStatusLog(false);
        setCpf(cpf);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = ++INIT_ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean getStatusLog() {
        return statusLog;
    }

    public void setStatusLog(boolean statusLog) {
        this.statusLog = statusLog;
    }
}
