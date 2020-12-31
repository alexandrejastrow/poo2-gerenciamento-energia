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
public class Administrador extends Usuario{
    
    private final int permissao;
    
    public Administrador(String login, String senha, int permissao) {
        Usuario.id++;
        this.senha = senha;
        this.login = login;
        this.setUserID();
        this.permissao = permissao;
        this.TipoUsuario = "Administrador";
    }
    
    @Override
    public int getForcaDePermissao() {
        return this.permissao;
    }
    
}
