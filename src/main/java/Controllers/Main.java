/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Registro;
import View.Login;

/**
 *
 * @author enya
 */
public class Main {
    public static void main(String[] args) {
        Registro registros = new Registro();
        new Login(registros).setVisible(true);
    }
}
