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
    private static int id = 0;
    private String nome;
    private Float salario;
    private String usuario;
    private String senha;
    private boolean statusLog;
    
    public Usuario(String nome, Float salario, String usuario, String senha) {
        setId(getId() + 1);
        setNome(nome);
        setUsuario(usuario);
        setSalario(salario);
        setSenha(senha);
        setStatusLog(false);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Usuario.id = id;
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

    public boolean getStatusLog() {
        return statusLog;
    }

    public void setStatusLog(boolean statusLog) {
        this.statusLog = statusLog;
    }
}
