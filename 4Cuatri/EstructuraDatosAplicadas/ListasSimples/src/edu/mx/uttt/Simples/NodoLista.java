package edu.mx.uttt.Simples;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabod
 */
public class NodoLista {
    
    private Object dato;
    private NodoLista SigNodo;
    private NodoLista antNodo;
    
    //Constructor para crear el primer nodo de la lista
    public NodoLista(Object dato){
        this(dato, null, null);
    }
    
    public NodoLista(Object dato, NodoLista nodo, NodoLista antNodo){
        this.dato = dato;
        this.SigNodo = nodo;
        this.antNodo = antNodo;
    }
    
    public Object getDato(){
        return dato;
    }
    
    public NodoLista getSigNodo(){
        return SigNodo;
    }
    
    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    public void setSigNodo(NodoLista sigNodo) {
        this.SigNodo = sigNodo;
    }
    
    //nuevos metodos
    public NodoLista getAntNodo() {
        return antNodo;
    }

    // Método para establecer el nodo anterior
    public void setAntNodo(NodoLista antNodo) {
        this.antNodo = antNodo;
    }
}
