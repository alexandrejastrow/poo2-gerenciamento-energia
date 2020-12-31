/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre jastrow da cruz
 */
public class HashPassWd {
    
    public static String gerarHash(String senha){
        
        try {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte hash[] = algorithm.digest(senha.getBytes("UTF-8"));
            
            StringBuilder texto = new StringBuilder();
            for (byte b : hash) {
                texto.append(String.format("%02X", 0xFF & b));
            }
            return texto.toString();
            
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(HashPassWd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
}
