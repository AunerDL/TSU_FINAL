/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.PilasColasArboles;

/**
 *
 * @author gabod
 */
public class colasArreglos {

    String nombre;
    int[] cola;
    int tamañoMaximo;
    int frente;
    int fin;
    int elementos;

    public colasArreglos() {
        this("cola");
    }

    public colasArreglos(String nombre) {
        this.nombre = nombre;
        this.tamañoMaximo = 10; // Tamaño predeterminado
        cola = new int[tamañoMaximo];
        frente = 0;
        fin = -1;
        elementos = 0;
    }

    // Nuevo método para cambiar el tamaño del arreglo
    public void cambiarTamanio(int nuevoTamanio) {
        if (nuevoTamanio <= 0) {
            throw new IllegalArgumentException("El tamaño debe ser mayor que cero.");
        }
        if (nuevoTamanio < elementos) {
            throw new IllegalArgumentException("El nuevo tamaño es menor que la cantidad actual de elementos en la cola.");
        }

        int[] nuevoArreglo = new int[nuevoTamanio];
        int contador = 0;
        int indice = frente;
        while (contador < elementos) {
            nuevoArreglo[contador] = cola[indice];
            indice = (indice + 1) % tamañoMaximo;
            contador++;
        }

        cola = nuevoArreglo;
        frente = 0;
        fin = elementos - 1;
        tamañoMaximo = nuevoTamanio;
    }

    public boolean estaVacia() {
        return elementos == 0;
    }

    public boolean estaLlena() {
        return elementos == tamañoMaximo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void encolar(int elemento) {
        if (estaLlena()) {
            throw new IllegalStateException("La cola está llena. No se puede encolar más elementos.");
        }
        fin = (fin + 1) % tamañoMaximo;
        cola[fin] = elemento;
        elementos++;
    }

    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía. No se puede desencolar.");
        }
        int dato = cola[frente];
        frente = (frente + 1) % tamañoMaximo;
        elementos--;
        return dato;
    }

    public int frenteCola() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía. No hay frente.");
        }
        return cola[frente];
    }

    public String imprimirCola() {
        if (estaVacia()) {
            return "La cola está vacía.";
        }

        StringBuilder resultado = new StringBuilder();
        int contador = 0;
        int indice = frente;
        while (contador < elementos) {
            resultado.append(cola[indice]).append(" | ");
            indice = (indice + 1) % tamañoMaximo;
            contador++;
        }
        resultado.append("null");
        return resultado.toString();
    }

}
