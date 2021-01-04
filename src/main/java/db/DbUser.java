/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import Models.User;

/**
 *
 * @author alexandre jastrow da cruz
 */
public interface DbUser {
    
    
    public User selectUser(String login);
    
    public boolean insertUser(User user);
    
    public boolean deleteUser(String nome);
}
