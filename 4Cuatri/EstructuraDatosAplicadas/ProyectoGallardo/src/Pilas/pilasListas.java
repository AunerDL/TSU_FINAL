/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author gabod
 */
public class pilasListas {

    String nombre;
    NodoPila tope;

    // Constructores sobrecargados
    public pilasListas() {
        this("pila");
    }

    public pilasListas(String nombre) {
        this.nombre = nombre;
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public NodoPila getTope() {
        return this.tope;
    }

    public void push(int dato) {
        if (estaVacia()) {
            tope = new NodoPila(dato, null);
        } else {
            NodoPila nuevoNodo = new NodoPila(dato, tope);
            tope = nuevoNodo;
        }
    }

    public int pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. No se puede sacar ningún elemento.");
            return -1; // Se podría lanzar una excepción en lugar de retornar -1
        } else {
            int dato = tope.getDato();
            tope = tope.getSiguiente();
            return dato;
        }
    }

    public int peek() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. No hay elementos para ver en el tope.");
            return -1; // Se podría lanzar una excepción en lugar de retornar -1
        } else {
            return tope.getDato();
        }
    }

    public String imprimirPila() {
        if (estaVacia()) {
            return "La pila está vacía";
        }

        StringBuilder resultado = new StringBuilder();
        NodoPila actual = tope;
        while (actual != null) {
            resultado.append(actual.getDato()).append(" --> ");
            actual = actual.getSiguiente();
        }
        return resultado.toString();
    }

    public String eliminarDesdePosicion(int posicion) {
        if (posicion < 0 || estaVacia()) {
            return "Posición inválida o pila vacía";
        } else {
            StringBuilder elementosEliminados = new StringBuilder();
            NodoPila actual = tope;
            NodoPila anterior = null;

            int contador = 0;
            while (actual != null && contador < posicion) {
                elementosEliminados.insert(0, actual.getDato() + " ");
                anterior = actual;
                actual = actual.getSiguiente();
                contador++;
            }

            if (actual != null) {
                if (anterior != null) {
                    anterior.siguiente = null;
                } else {
                    tope = null;
                }
            } else {
                return "Posición fuera de rango";
            }
            return "Elementos eliminados: " + elementosEliminados.toString();
        }
    }
}
