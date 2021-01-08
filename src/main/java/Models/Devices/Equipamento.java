/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Devices;

import Models.Device;

/**
 *
 * @author jastrow
 */
public class Equipamento implements Device{
    
    protected static int id;
    protected int myId;
    protected int idPlace;
    protected String name;
    protected boolean state;

    
    public static Device newDevice(String name, int idPlace){
        
        Device novo;
        
        if(name.equalsIgnoreCase("arcondicionado") || name.equalsIgnoreCase("ar condicionado")){
            novo = new ArCondicionado(name, idPlace);
            return novo;
        }
        if(name.equalsIgnoreCase("lampada") || name.equalsIgnoreCase("lamp")){
            novo = new Lampada(name, idPlace);
            return novo;
        }
        
        return null;
    }
    
    @Override
    public boolean on() {
        this.state = true;
        return state;
    }

    @Override
    public boolean off() {
        this.state = false;
        return state;
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public String getName() {
        return name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
}
