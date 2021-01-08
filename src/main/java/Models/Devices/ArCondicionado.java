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
public class ArCondicionado extends Equipamento{
    
    
    private int minValueOff;
    private int maxValueOff;
    private int minValueOn;
    private int maxValueOn;


    public ArCondicionado(String name, int idPlace) {
        
        Equipamento.id++;
        super.myId = this.idPlace;
        super.idPlace = idPlace;
        super.name = "Ar Condicionado";
        super.state = false;
    }

    
    public int getMinValueOff() {
        return minValueOff;
    }

    public void setMinValueOff(int minValueOff) {
        this.minValueOff = minValueOff;
    }

    public int getMaxValueOff() {
        return maxValueOff;
    }

    public void setMaxValueOff(int maxValueOff) {
        this.maxValueOff = maxValueOff;
    }

    public int getMinValueOn() {
        return minValueOn;
    }

    public void setMinValueOn(int minValueOn) {
        this.minValueOn = minValueOn;
    }

    public int getMaxValueOn() {
        return maxValueOn;
    }

    public void setMaxValueOn(int maxValueOn) {
        this.maxValueOn = maxValueOn;
    }

}
