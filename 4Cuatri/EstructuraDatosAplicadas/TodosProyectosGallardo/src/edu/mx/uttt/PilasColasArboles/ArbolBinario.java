/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.PilasColasArboles;

/**
 *
 * @author gabod
 */
public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Metodos de insercion
    public void insertar(int dato) {
        if (esVacio()) {
            this.raiz = new NodoArbol(dato);
        } else {
            raiz.agregar(dato);
        }
    }

    public boolean esVacio() {
        return raiz == null;
    }

    // Metodos Inorden
    public String recorridoInorden() {
        StringBuilder resultado = new StringBuilder();
        recorridoInorden(raiz, resultado);
        return resultado.toString();
    }

    private void recorridoInorden(NodoArbol nodo, StringBuilder resultado) {
        if (nodo != null) {
            recorridoInorden(nodo.getIzquierdo(), resultado);
            resultado.append(nodo.getDato()).append(" ");
            recorridoInorden(nodo.getDerecho(), resultado);
        }
    }

    //Preorden
    public String recorridoPreorden() {
        StringBuilder resultado = new StringBuilder();
        recorridoPreorden(raiz, resultado);
        return resultado.toString();
    }

    private void recorridoPreorden(NodoArbol nodo, StringBuilder resultado) {
        if (nodo != null) {
            resultado.append(nodo.getDato()).append(" ");
            recorridoPreorden(nodo.getIzquierdo(), resultado);
            recorridoPreorden(nodo.getDerecho(), resultado);
        }
    }

    //Postorden
    public String recorridoPostorden() {
        StringBuilder resultado = new StringBuilder();
        recorridoPostorden(raiz, resultado);
        return resultado.toString();
    }

    private void recorridoPostorden(NodoArbol nodo, StringBuilder resultado) {
        if (nodo != null) {
            recorridoPostorden(nodo.getIzquierdo(), resultado);
            recorridoPostorden(nodo.getDerecho(), resultado);
            resultado.append(nodo.getDato()).append(" ");
        }
    }

}
