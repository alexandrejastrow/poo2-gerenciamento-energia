/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author alexandre jastrow da cruz
 */
public class Local {
    
    private static int id;
    private int myId;
    private String nome;

    public Local(String nome) {
        this.nome = nome;
        Local.id++;
        this.myId = id;
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
