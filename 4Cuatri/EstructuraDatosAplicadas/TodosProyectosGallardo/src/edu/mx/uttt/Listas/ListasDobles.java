/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Listas;

import edu.mx.uttt.Listas.NodoDobles;

/**
 *
 * @author gabod
 */
public class ListasDobles {

    private String nombre;
    private NodoDobles primerNodo;
    private NodoDobles ultimoNodo;

    public ListasDobles() {
        this("lista");
    }

    public ListasDobles(String nombre) {
        this.nombre = nombre;
        primerNodo = ultimoNodo = null;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public NodoDobles getPrimerNodo() {
        return this.primerNodo;
    }

    public NodoDobles getUltimoNodo() {
        return this.ultimoNodo;
    }

    // obtiene tamaño
    public int obtenerTamanio() {
        int tamanio = 0;
        NodoDobles actual = primerNodo;

        while (actual != null) {
            tamanio++;
            actual = actual.getSigNodo();
        }

        return tamanio;
    }

    // obtiene posicion del nodo
    public NodoDobles obtenerNodoEnPosicion(int posicion) {
        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return null;
        }

        NodoDobles actual = primerNodo;
        for (int i = 0; i < posicion && actual != null; i++) {
            actual = actual.getSigNodo();
        }

        return actual;
    }

    //Metodo insertar en frente
    public void insertarEnfrente(Object elemento) {
        if (estaVacia()) {
            this.primerNodo = this.ultimoNodo = new NodoDobles(elemento);
        } else {
            NodoDobles nuevoNodo = new NodoDobles(elemento, primerNodo, null);
            primerNodo.setAntNodo(nuevoNodo);
            this.primerNodo = nuevoNodo;
        }
    }

    //Metodo insertar al final
    public void insertarAlFinal(Object elemento) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new NodoDobles(elemento);
        } else {
            NodoDobles nuevoNodo = new NodoDobles(elemento, null, ultimoNodo);
            ultimoNodo.setSigNodo(nuevoNodo);
            ultimoNodo = nuevoNodo;
        }
    }

    //Metodo Eliminar al frente
    public void eliminarAlFrente() {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar al frente.");
        } else {
            primerNodo = primerNodo.getSigNodo();
            if (primerNodo == null) {
                ultimoNodo = null;
            } else {
                primerNodo.setAntNodo(null);
            }
        }
    }

    //Metodo eliminar al final
    public void eliminarAlFinal() {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar al final.");
        } else {
            ultimoNodo = ultimoNodo.getAntNodo();
            if (ultimoNodo == null) {
                primerNodo = null;
            } else {
                ultimoNodo.setSigNodo(null);
            }
        }
    }

    //Metodo imprimir
    public String Imprimir() {
        if (estaVacia()) {
            return "La lista está vacía";
        }

        NodoDobles aux = primerNodo;
        StringBuilder finalizar = new StringBuilder();
        while (aux != null) {
            finalizar.append(aux.getDato()).append(" <--> ");
            aux = aux.getSigNodo();
        }
        return finalizar.toString();
    }

    //Imprimir de Izquierda a derecha
    public String obtenerListaDeIzquierdaADerecha() {
        if (estaVacia()) {
            return "La lista está vacía.";
        }

        NodoDobles actual = primerNodo;
        StringBuilder resultado = new StringBuilder("Lista de izquierda a derecha: ");

        while (actual != null) {
            resultado.append(actual.getDato()).append(" <--> ");
            actual = actual.getSigNodo();
        }

        resultado.append("null");
        return resultado.toString();
    }

    //Imrpimir de Derecha a izquierda
    public String obtenerListaDeDerechaAIzquierda() {
        if (estaVacia()) {
            return "La lista está vacía.";
        }

        NodoDobles actual = ultimoNodo;
        StringBuilder resultado = new StringBuilder("Lista de derecha a izquierda: null");

        while (actual != null) {
            resultado.insert(0, " <--> " + actual.getDato());
            actual = actual.getAntNodo();
        }

        return resultado.toString();
    }

    //Insertar en cualquier posicion
    public void insertarEnPosicion(Object elemento, int posicion) {
        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return;
        }

        if (posicion == 0 || estaVacia()) {
            insertarEnfrente(elemento);
            return;
        }

        NodoDobles nuevoNodo = new NodoDobles(elemento, null, null);
        NodoDobles actual = primerNodo;

        for (int i = 1; i < posicion; i++) {
            if (actual.getSigNodo() == null) {
                System.out.println("La posición excede el tamaño de la lista. Se insertará al final.");
                ultimoNodo.setSigNodo(nuevoNodo);
                nuevoNodo.setAntNodo(ultimoNodo);
                ultimoNodo = nuevoNodo;
                return;
            }
            actual = actual.getSigNodo();
        }

        nuevoNodo.setSigNodo(actual.getSigNodo());
        nuevoNodo.setAntNodo(actual);
        actual.getSigNodo().setAntNodo(nuevoNodo);
        actual.setSigNodo(nuevoNodo);
    }

    //eliminar en cualquier posicion
    public void eliminarEnPosicion(int posicion) {
        if (posicion < 0 || estaVacia()) {
            System.out.println("La lista está vacía o la posición no es válida.");
            return;
        }

        if (posicion == 0) {
            eliminarAlFrente();
            return;
        }

        NodoDobles actual = primerNodo;
        for (int i = 0; i < posicion; i++) {
            if (actual.getSigNodo() == null) {
                System.out.println("La posición excede el tamaño de la lista. No se puede eliminar.");
                return;
            }
            actual = actual.getSigNodo();
        }

        if (actual == ultimoNodo) {
            ultimoNodo = actual.getAntNodo();
            ultimoNodo.setSigNodo(null);
        } else {
            actual.getAntNodo().setSigNodo(actual.getSigNodo());
            actual.getSigNodo().setAntNodo(actual.getAntNodo());
        }
    }

    // Método para realizar una búsqueda secuencial
    public NodoDobles busquedaSecuencial(Object elemento) {
        NodoDobles actual = primerNodo;
        while (actual != null) {
            if (actual.getDato().equals(elemento)) {
                return actual;
            }
            actual = actual.getSigNodo();
        }
        return null;
    }

    // Método para realizar una búsqueda binaria
    public NodoDobles busquedaBinaria(Object elemento) {
        ordenamientoBurbuja();

        int inicio = 0;
        int fin = obtenerTamanio() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            NodoDobles nodoMedio = obtenerNodoEnPosicion(medio);

            if (nodoMedio.getDato().equals(elemento)) {
                return nodoMedio;
            } else if (elemento.hashCode() < nodoMedio.getDato().hashCode()) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        return null;
    }

    // Método para realizar el ordenamiento burbuja
    public void ordenamientoBurbuja() {
        if (estaVacia() || primerNodo == ultimoNodo) {
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            NodoDobles actual = primerNodo;
            NodoDobles siguiente = primerNodo.getSigNodo();

            while (siguiente != null) {
                int valorActual = Integer.parseInt((String) actual.getDato());
                int valorSiguiente = Integer.parseInt((String) siguiente.getDato());

                if (valorActual > valorSiguiente) {

                    Object temp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(temp);
                    intercambio = true;
                }
                actual = siguiente;
                siguiente = siguiente.getSigNodo();
            }
        } while (intercambio);
    }

    // Método para realizar el ordenamiento quicksort
    public void ordenamientoQuicksort() {
        if (estaVacia() || primerNodo == ultimoNodo) {
            return;
        }
        int tamaño = obtenerTamaño1();
        quicksortRecursivo(0, tamaño - 1);
    }

    private void quicksortRecursivo(int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(izquierda, derecha);
            quicksortRecursivo(izquierda, indiceParticion - 1);
            quicksortRecursivo(indiceParticion + 1, derecha);
        }
    }

    private int particion(int izquierda, int derecha) {
        Object pivote = obtenerElementoEnPosicion1(derecha);
        int i = (izquierda - 1);

        for (int j = izquierda; j < derecha; j++) {
            if (compararElementos1(obtenerElementoEnPosicion1(j), pivote) <= 0) {
                i++;
                intercambiarElementos(i, j);
            }
        }

        intercambiarElementos(i + 1, derecha);
        return i + 1;
    }

    private void intercambiarElementos(int i, int j) {
        Object temp = obtenerElementoEnPosicion1(i);
        establecerElementoEnPosicion1(i, obtenerElementoEnPosicion1(j));
        establecerElementoEnPosicion1(j, temp);
    }

    //Tamaños
    private int obtenerTamaño1() {
        int tamaño = 0;
        NodoDobles actual = primerNodo;
        while (actual != null) {
            tamaño++;
            actual = actual.getSigNodo();
        }
        return tamaño;
    }

    private int compararElementos1(Object a, Object b) {
        int valorA = Integer.parseInt((String) a);
        int valorB = Integer.parseInt((String) b);
        return Integer.compare(valorA, valorB);
    }

    private void establecerElementoEnPosicion1(int posicion, Object dato) {
        NodoDobles actual = primerNodo;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSigNodo();
        }
        actual.setDato(dato);
    }

    private Object obtenerElementoEnPosicion1(int posicion) {
        NodoDobles actual = primerNodo;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSigNodo();
        }
        return actual.getDato();
    }

    // Método auxiliar para obtener el último nodo de la lista
    private NodoDobles obtenerUltimoNodo() {
        NodoDobles actual = primerNodo;
        while (actual != null && actual.getSigNodo() != null) {
            actual = actual.getSigNodo();
        }
        return actual;
    }

}
