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
        super.senha = senha;
        super.login = login;
        super.setUserID();
        this.permissao = permissao;
        super.TipoUsuario = "Administrador";
    }
    
    @Override
    public int getForcaDePermissao() {
        return this.permissao;
    }
    
}
