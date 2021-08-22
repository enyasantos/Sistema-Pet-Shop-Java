/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author thayn
 */
public class Veterinario extends Usuario {

    public Veterinario(String nome, float salario, String usuario, String senha, String cpf) {
        super(nome, salario, usuario, senha, cpf);
    }

    public void cadastrarRelatorioOrdem(Registro registro, String relatorio, int index){
        registro.addRelatorioOrdem(relatorio, index);
    }
    
    public Veterinario verificarLogin(ArrayList<Veterinario> veterinarios, String usuario, String senha) {
        return Login.verificaLogin(veterinarios, usuario, senha);
    }
}
