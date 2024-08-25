/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas;

/**
 *
 * @author gabod
 */
public class colasListas {
    
    String nombre;
    NodoCola frente;
    NodoCola fin;

    public colasListas() {
        this("cola");
    }

    public colasListas(String nombre) {
        this.nombre = nombre;
        frente = fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public NodoCola getFrente() {
        return this.frente;
    }

    public NodoCola getFin() {
        return this.fin;
    }

    public void encolar(int elemento) {
        if (estaVacia()) {
            frente = fin = new NodoCola(elemento);
        } else {
            fin.setSigNodo(new NodoCola(elemento));
            fin = fin.getSigNodo();
        }
    }

    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía. No se puede desencolar.");
        }

        int dato = frente.getDato();
        if (frente == fin) {
            frente = fin = null;
        } else {
            frente = frente.getSigNodo();
        }
        return dato;
    }

    public int frenteCola() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía. No hay frente.");
        }
        return frente.getDato();
    }

    public String imprimirCola() {
        if (estaVacia()) {
            return "La cola está vacía.";
        }

        StringBuilder resultado = new StringBuilder();
        NodoCola actual = frente;
        while (actual != null) {
            resultado.append(actual.getDato()).append(" -> ");
            actual = actual.getSigNodo();
        }
        resultado.append("null");
        return resultado.toString();
    }
    
}
