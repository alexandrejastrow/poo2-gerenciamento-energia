/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author alexandre jastrow da cruz
 */
public interface User {
    
    public int getForcaDePermissao();    
    
    public String getLogin();
    public String getPassword();
    public int getId();
    public String getTipoUsuario();
}
