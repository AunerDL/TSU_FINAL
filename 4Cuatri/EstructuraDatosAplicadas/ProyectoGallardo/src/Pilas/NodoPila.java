/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author gabod
 */
public class NodoPila {
    
    int dato;
    NodoPila siguiente;

    public NodoPila(int dato, NodoPila siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }
    
}
