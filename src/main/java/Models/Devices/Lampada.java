/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Devices;


/**
 *
 * @author jastrow
 */
public class Lampada extends Equipamento{

    private int lumen;

    public Lampada(String nome, int place) {
        
        Equipamento.id++;
        super.myId = this.idPlace;
        super.idPlace = idPlace;
        super.name = "Lampada";
        super.state = false;
        
    }
    
    
    

    public int getLumen() {
        return lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
    }

}
