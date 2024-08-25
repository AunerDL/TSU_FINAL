/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.PilasColasArboles;

/**
 *
 * @author gabod
 */
public class pilaArreglos {

    private int[] arreglo;
    private int tope;
    private int capacidad;

    public pilaArreglos(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.tope = -1;
    }

    public int getTope() {
        return this.tope;
    }

    public int[] getArreglo() {
        return this.arreglo;
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public boolean estaLlena() {
        return tope == capacidad - 1;
    }

    public void push(int dato) {
        if (estaLlena()) {
            System.out.println("La pila está llena. No se puede agregar más elementos.");
        } else {
            tope++;
            arreglo[tope] = dato;
        }
    }

    public int pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. No se puede sacar ningún elemento.");
            return -1; // Podrías lanzar una excepción en lugar de retornar -1
        } else {
            int dato = arreglo[tope];
            tope--;
            return dato;
        }
    }

    public int peek() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. No hay elementos para ver en el tope.");
            return -1; // Podrías lanzar una excepción en lugar de retornar -1
        } else {
            return arreglo[tope];
        }
    }

    public String imprimirPila() {
        if (estaVacia()) {
            return "La pila está vacía";
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = tope; i >= 0; i--) {
            resultado.append(arreglo[i]).append(" --> ");
        }
        return resultado.toString();
    }

    public String eliminarDesdePosicion(int posicion) {
        if (posicion < 0 || posicion > tope) {
            return "Posición inválida";
        } else {
            StringBuilder elementosEliminados = new StringBuilder();
            for (int i = tope; i >= posicion; i--) {
                elementosEliminados.append(arreglo[i]).append(" ");
            }
            tope = posicion - 1;
            return "Elementos eliminados: " + elementosEliminados.toString();
        }
    }

}
