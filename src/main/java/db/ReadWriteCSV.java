/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import Models.Local;
import Models.User;
import Models.Users.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre jastrow da cruz
 */
public class ReadWriteCSV {
    
    private String headerUser;
    private String headerLocal;
    ReadWriteCSV() {
        
    }
    
    LinkedList<User> getUsers(){
        
        try {
            User us;
            
            LinkedList<User> clientes = new  LinkedList<>();
            
            String current = new java.io.File( "." ).getCanonicalPath();
            File inputFile = new File(current + "\\src\\main\\java\\db\\Files\\users.csv");
            
            try (FileReader in = new FileReader(inputFile); BufferedReader arq = new BufferedReader(in)) {
                
                String line = arq.readLine();
                this.headerUser = line;
                
                while ((line = arq.readLine()) != null) {
                    
                    String[] vars = line.split(";");
                    
                    us = Usuario.newUser(vars[1], vars[2], vars[3], Integer.valueOf(vars[4]));
                    
                    clientes.add(us);                  
                    
                }
                
            } catch (Exception ex) {
                Logger.getLogger(ReadWriteCSV.class.getName()).log(Level.SEVERE, null, ex);
            }
            return clientes;
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ReadWriteCSV.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    LinkedList<Local> getLocals(){
        
        try {
            Local loc;
            
            LinkedList<Local> locals = new  LinkedList<>();
            
            String current = new java.io.File( "." ).getCanonicalPath();
            File inputFile = new File(current + "\\src\\main\\java\\db\\Files\\locals.csv");
            
            try (FileReader in = new FileReader(inputFile); BufferedReader arq = new BufferedReader(in)) {
                
                String line = arq.readLine();
                this.headerLocal = line;
                
                while ((line = arq.readLine()) != null) {
                    
                    String[] vars = line.split(";");
                    
                    loc = new Local(vars[1]);
                    
                    locals.add(loc);                  
                    
                }
                
            } catch (Exception ex) {
                Logger.getLogger(ReadWriteCSV.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(!locals.isEmpty()){
                return null;
            }else{
                return locals;
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ReadWriteCSV.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public boolean saveUsers(LinkedList<User> users){
        
        try {
            String current = new java.io.File( "." ).getCanonicalPath();
            File outputFile = new File(current + "\\src\\main\\java\\db\\Files\\users.csv");
            
            try (FileWriter arq = new FileWriter(outputFile)) {
                PrintWriter gravaArq = new PrintWriter(arq);
                
                gravaArq.println(this.headerUser);
                
                int id;
                String tpUser;
                String login;
                String senha;
                int permissao;
                
                for(int i = 0; i< users.size(); i++){
                    
                    id = users.get(i).getId();
                    tpUser = users.get(i).getTipoUsuario();
                    login = users.get(i).getLogin();
                    senha = users.get(i).getPassword();
                    permissao = users.get(i).getForcaDePermissao();
                    
                    String aux = id + ";" + tpUser + ";" + login + ";" + senha + ";" + permissao;
                    gravaArq.println(aux);
                }
            }
            
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ReadWriteCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
