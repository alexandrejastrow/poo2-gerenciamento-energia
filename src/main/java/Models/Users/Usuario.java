/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Users;

import Controllers.HashPassWd;
import Models.User;

/**
 *
 * @author alexandre jastrow da cruz
 */

public class Usuario implements User{
    
    protected static int id;
    protected int userID;
    protected String TipoUsuario;
    protected String login;
    protected String senha;

    protected void setUserID() {
        this.userID = Usuario.id;
      
    }

    @Override
    public int getForcaDePermissao() {
        return 0;
    }

    @Override
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public static User newUser(String tpUser, String login, String senha, int permissao) throws Exception {
        
        User u;

        if(tpUser.equalsIgnoreCase("admin") || tpUser.equalsIgnoreCase("administrador")){
            u = new Administrador(login, senha, permissao);
        }else{
            u = new Cliente(login, senha);
        }

        return u;
    }

    @Override
    public int getId() {
        return this.userID;
    }

    @Override
    public String getTipoUsuario() {
        return TipoUsuario;
    }
    
}
