/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import Models.Login;

/**
 *
 * @author thayn
 */
public class Veterinario extends Usuario{
   

    public Veterinario(String nome, float salario, String usuario, String senha) {
        super(nome, salario, usuario, senha);
    }

    public Veterinario verificarLogin(ArrayList<Veterinario> veterinarios, String usuario, String senha){
        Login<Veterinario> login;
        return login.verificaLogin(veterinarios,usuario,senha);
    }
}



