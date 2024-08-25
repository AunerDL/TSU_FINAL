/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolesBinarios;

/**
 *
 * @author gabod
 */
public class Nodo {

    int dato;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int dato) {
        // Crear nodo raiz
        this.dato = dato;
        this.izquierdo = this.derecho = null;

    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return this.dato;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void agregar(int dato) {
        if (dato < this.dato) {
            //Insertar el dato izquierdo
            if (this.izquierdo == null) {
                //caso base
                this.izquierdo = new Nodo(dato);
            } else {
                //caso general
                this.izquierdo.agregar(dato);
            }
        } else {
            //Insertar del lado derecho
            if (this.derecho == null) {
                //caso base
                this.derecho = new Nodo(dato);
            } else {
                //caso general
                this.derecho.agregar(dato);
            }
        }
    }
}
