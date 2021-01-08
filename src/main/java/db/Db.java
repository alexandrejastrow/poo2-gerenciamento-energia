/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import Models.Locals.Local;
import Models.User;
import java.util.LinkedList;

/**
 *
 * @author alexandre jastrow da cruz
 */
public class Db implements DbUser, DbLocal{
    
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
    
    public boolean saveLocals(){
        
        return file.saveLocals(locals);
    }
    
    @Override
    public boolean insertUser(User user){
        
        if(users.add(user)){
            saveUsers();
            return true;
        }else{
            return false;
        } 
    }
    @Override
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

    @Override
    public boolean deleteUser(String nome) {
        
        for(int i = 0; i< users.size(); i++){
            if(users.get(i).getLogin().equals(nome)){
                users.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Local selectLocal(int id) {
        
        for(int i =0; i< locals.size(); i++){
            
            if(locals.get(i).getMyId() == id){
                return locals.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean insertLocal(Local local) {
        
        if(locals.add(local)){
            saveLocals();
            return true;
        }else{
            return false;
        } 
    }

    @Override
    public boolean deleteLocal(int id) {
        
        for(int i = 0; i< locals.size(); i++){
            if(locals.get(i).getMyId() == id){
                locals.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public String[] getLocals(){
        
        int qtd = locals.size();

        String names[] = new String[qtd];
        System.out.println(names);
        for(int i = 0; i< qtd; i++){
            names[i] = Integer.toString(locals.get(i).getNumero()) + " " + 
                                        locals.get(i).getNome();
        }
                System.out.println(names);
        return names;
    }
}
