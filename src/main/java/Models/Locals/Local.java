/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Locals;

import Models.Place;

/**
 *
 * @author alexandre jastrow da cruz
 */
public class Local implements Place{
    
    private static int id;
    private int myId;
    private String categoria;
    private String nome;
    private int numero;
    
    public Local(String categoria, String nome, int numero) {
        this.nome = nome;
        this.categoria = categoria;
        this.numero = numero;
        Local.id++;
        this.myId = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
