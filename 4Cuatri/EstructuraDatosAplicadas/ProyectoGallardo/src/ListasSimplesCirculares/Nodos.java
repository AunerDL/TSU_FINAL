/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimplesCirculares;

/**
 *
 * @author gabod
 */
public class Nodos {
    
    int dato;
    Nodos sigNodo;

    public Nodos(int dato) {
        this.dato = dato;
        this.sigNodo = null;
    }

    public Nodos(int dato, Nodos sigNodo) {
        this.dato = dato;
        this.sigNodo = sigNodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodos getSigNodo() {
        return sigNodo;
    }

    public void setSigNodo(Nodos sigNodo) {
        this.sigNodo = sigNodo;
    }
}
