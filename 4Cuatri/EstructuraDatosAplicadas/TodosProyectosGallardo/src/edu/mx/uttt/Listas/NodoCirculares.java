/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Listas;

/**
 *
 * @author gabod
 */
public class NodoCirculares {

    int dato;
    NodoCirculares sigNodo;

    public NodoCirculares(int dato) {
        this.dato = dato;
        this.sigNodo = null;
    }

    public NodoCirculares(int dato, NodoCirculares sigNodo) {
        this.dato = dato;
        this.sigNodo = sigNodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoCirculares getSigNodo() {
        return sigNodo;
    }

    public void setSigNodo(NodoCirculares sigNodo) {
        this.sigNodo = sigNodo;
    }

}
