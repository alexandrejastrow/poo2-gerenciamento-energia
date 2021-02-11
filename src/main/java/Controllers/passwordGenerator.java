/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.Random;

/**
 *
 * @author jastrow
 */
public class passwordGenerator {
    
    
    public static String generate(){
        
        String alfabetLower = "qwertyuiopasdfghjklzxcvbnm";
        String alfabetUpper = "ZXCVBNMASDFGHJKLQWERTYUIOP";
        String alfabetnumber= "1234567890";
        String alfabetSymbols = "!@#$%&*+=-*?";
        
        int minSize = 10;
        
        Random gerador = new Random();
        
        String passwd = "";
        int pos;
        for(int i =0; i< 16; i++){
            
            int type = gerador.nextInt(4);
            
            
            switch (type){
                case 0:
                    pos = gerador.nextInt(26);
                    passwd += alfabetLower.charAt(pos);
                    break;
                case 1:
                    pos = gerador.nextInt(26);
                    passwd += alfabetUpper.charAt(pos);
                    break;
                case 2:
                    pos = gerador.nextInt(10);
                    passwd += alfabetnumber.charAt(pos);
                    break;
                case 3:
                    pos = gerador.nextInt(12);
                    passwd += alfabetSymbols.charAt(pos);
                    break;
            }
        }
       
        return passwd;
    }
}
