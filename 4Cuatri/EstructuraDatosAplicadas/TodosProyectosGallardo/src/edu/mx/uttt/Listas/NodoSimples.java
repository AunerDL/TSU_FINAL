/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Listas;

/**
 *
 * @author gabod
 */
public class NodoSimples {

    private Object dato;
    private NodoSimples SigNodo;
    private NodoSimples antNodo;

    //Constructor para crear el primer nodo de la lista
    public NodoSimples(Object dato) {
        this(dato, null, null);
    }

    public NodoSimples(Object dato, NodoSimples nodo, NodoSimples antNodo) {
        this.dato = dato;
        this.SigNodo = nodo;
        this.antNodo = antNodo;
    }

    public Object getDato() {
        return dato;
    }

    public NodoSimples getSigNodo() {
        return SigNodo;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setSigNodo(NodoSimples sigNodo) {
        this.SigNodo = sigNodo;
    }

    //nuevos metodos
    public NodoSimples getAntNodo() {
        return antNodo;
    }

    // Método para establecer el nodo anterior
    public void setAntNodo(NodoSimples antNodo) {
        this.antNodo = antNodo;
    }

}
