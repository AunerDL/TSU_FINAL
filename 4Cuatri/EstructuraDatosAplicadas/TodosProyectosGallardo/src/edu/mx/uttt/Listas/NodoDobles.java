/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Listas;

/**
 *
 * @author gabod
 */
public class NodoDobles {

    private Object dato;
    private NodoDobles sigNodo;
    private NodoDobles antNodo;

    public NodoDobles(Object dato) {
        this(dato, null, null);
    }

    public NodoDobles(Object dato, NodoDobles sigNodo, NodoDobles antNodo) {
        this.dato = dato;
        this.sigNodo = sigNodo;
        this.antNodo = antNodo;
    }

    public Object getDato() {
        return dato;
    }

    public NodoDobles getSigNodo() {
        return sigNodo;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setSigNodo(NodoDobles sigNodo) {
        this.sigNodo = sigNodo;
    }

    public NodoDobles getAntNodo() {
        return antNodo;
    }

    public void setAntNodo(NodoDobles antNodo) {
        this.antNodo = antNodo;
    }

}
