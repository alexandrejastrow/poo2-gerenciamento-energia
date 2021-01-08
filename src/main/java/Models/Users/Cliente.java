/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Users;

/**
 *
 * @author alexandre jastrow da cruz
 */
public class Cliente extends Usuario{

    public Cliente(String login, String senha) {
        Usuario.id++;
        super.senha = senha;
        super.login = login;
        super.setUserID();
        super.TipoUsuario = "Cliente";
    }

}
