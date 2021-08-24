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
public class Administrador extends Usuario {

    private static final String USUARIO = "admin";
    private static final String SENHA = "admin";

    public Administrador(String usuario, String senha) {
        super("Administrador", (float) 0.0, usuario, senha, "");
    }

    public boolean cadastrarVendedor(Registro registros, Vendedor vendedor) {
        if (super.getStatusLog()) {
            registros.addVendedor(vendedor);
            return true;
        } else {
            return false;
        }
    }

    public boolean cadastrarVeterinario(Registro registros, Veterinario veterinario) {
        if (super.getStatusLog()) {
            registros.addVeterinario(veterinario);
            return true;
        } else {
            return false;
        }
    }

    public boolean pagarConta(Registro registros, Conta conta, DataHorario dataPagamento) {
        if (super.getStatusLog()) {
            if (conta.isPaga()) {
                return false; // conta já está paga
            } else { // atualiza valores para pago
                conta.setPaga(true);
                conta.setDataPagto(dataPagamento);
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean comprar(Registro registros, Conta conta, Produto produto) {
        if (super.getStatusLog()) {
            registros.addConta(conta);
            registros.addProduto(produto);
            return true;
        } else {
            return false;
        }
    }

    public boolean fazerLogin() {
        if (super.getUsuario().equals(USUARIO) && super.getSenha().equals(SENHA)) {
            super.setStatusLog(true);
            return true;
        } else {
            super.setStatusLog(false);
            return false;
        }
    }
}
