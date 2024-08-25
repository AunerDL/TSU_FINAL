/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas;

/**
 *
 * @author gabod
 */
public class NodoCola {
    
    private int dato;
    NodoCola sigNodo;

    public NodoCola(int dato) {
        this(dato, null);
    }

    public NodoCola(int dato, NodoCola sigNodo) {
        this.dato = dato;
        this.sigNodo = sigNodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoCola getSigNodo() {
        return sigNodo;
    }

    public void setSigNodo(NodoCola sigNodo) {
        this.sigNodo = sigNodo;
    }
    
}
