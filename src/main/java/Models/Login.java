/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author enya
 */
public class Login<T> {
    public Login() {
    }

    public static <T extends Usuario> T verificaLogin(ArrayList<T> usuarios, String usuario, String senha) {
        for (T item : usuarios) {
            if (item.getUsuario().equals(usuario) && item.getSenha().equals(senha)) {
                item.setStatusLog(true);
                return item;
            }
        }

        return null;
    }
}
