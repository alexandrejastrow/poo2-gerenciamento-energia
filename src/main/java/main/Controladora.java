package main;

import Controllers.HashPassWd;
import Models.Local;
import Models.User;
import db.Db;
import db.DbLocal;
import db.DbUser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre jastrow da cruz
 */
public class Controladora implements DbUser, DbLocal{
    
    private Db database;
    private User user;
    
    public Controladora() {
        initDb();
        initConfig();
    }
    
    private void initDb(){
        this.database = new Db();
        database.loadUsers();
        database.loadLocals();
        initConfig();
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
    
    public boolean userPrivileges(){
        
        return user.getForcaDePermissao() == 1;
    }
    
    @Override
    public User selectUser(String login){
        return this.database.selectUser(login);
    }

    @Override
    public boolean insertUser(User user) {
        return this.database.insertUser(user);
    }

    @Override
    public boolean deleteUser(String nome) {
        return this.database.deleteUser(nome);
    }

    @Override
    public Local selectLocal(int id) {
        return this.database.selectLocal(id);
    }

    @Override
    public boolean insertLocal(Local local) {
        return this.database.insertLocal(local);
    }

    @Override
    public boolean deleteLocal(int id) {
        return this.database.deleteLocal(id);
    }
    
    
    
}
