package main;

import Controllers.HashPassWd;
import Models.User;
import db.Db;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre jastrow da cruz
 */
public class Controladora {
    
    private Db database;
    private User user;
    
    public Controladora() {
        initDb();
        initConfig();
    }
    
    private void initDb(){
        this.database = new Db();
        database.loadUsers();
    }
    
    private void initConfig(){
    }
    
    public boolean confirmUser(String name, String senha){
        
        if(name == null || senha == null){
            
            return false;
        }
        String passwd = HashPassWd.gerarHash(senha);
        User n = database.selectUser(name);
        
        if(n != null){
            
            if(n.getPassword().equals(passwd)){
                this.user = n;
                return true;
            }
        }
        return false;
    }
}
