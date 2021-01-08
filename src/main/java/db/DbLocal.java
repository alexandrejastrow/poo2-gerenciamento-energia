/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import Models.Locals.Local;

/**
 *
 * @author alexandre jastrow da cruz
 */
public interface DbLocal {
    
    
    public Local selectLocal(int id);
    
    public boolean insertLocal(Local local);
    
    public boolean deleteLocal(int id);
}
