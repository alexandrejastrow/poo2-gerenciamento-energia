/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import Models.Local;
import Models.User;
import java.util.LinkedList;

/**
 *
 * @author alexandre jastrow da cruz
 */
public class Db {
    
    private final ReadWriteCSV file;
    private LinkedList<User> users;
    private LinkedList<Local> locals;
    //private LinkedList<Equipament> equipaments;
    //private LinkedList<Sensor> sensors;
    
    public Db(){
        file = new ReadWriteCSV();
    }
    
    public void loadUsers(){
    
        this.users = file.getUsers();

    }
    public boolean saveUsers(){
        
        return file.saveUsers(users);
    }
    
    public boolean insert(User user){
        
        if(users.add(user)){
            saveUsers();
            return true;
        }else{
            return false;
        } 
    }
    public User selectUser(String login){
        
        for(int i =0; i< users.size(); i++){
            
            if(users.get(i).getLogin().equals(login)){
                return users.get(i);
            }
        }
        
        return null;
    }

        public void loadLocals(){
    
            this.locals = file.getLocals();

        }
}
