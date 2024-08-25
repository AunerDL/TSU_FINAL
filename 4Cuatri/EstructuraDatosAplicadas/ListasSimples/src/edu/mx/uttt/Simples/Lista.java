package edu.mx.uttt.Simples;

import edu.mx.uttt.Simples.NodoLista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabod
 */
public class Lista {

    private String nombre;
    private NodoLista PrimerNodo;
    private NodoLista UltimoNodo;

    //Constructores sobre cargados
    public Lista() {
        this("lista");
    }

    public Lista(String nombre) {
        this.nombre = nombre;
        PrimerNodo = UltimoNodo = null;
    }

    public boolean estaVacia() {
        return PrimerNodo == null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public NodoLista getPrimerNodo() {
        return this.PrimerNodo;
    }

    public NodoLista getUltimoNodo() {
        return this.UltimoNodo;
    }

    // Método para obtener el tamaño de la lista
    public int obtenerTamanio() {
        int tamanio = 0;
        NodoLista actual = PrimerNodo;

        while (actual != null) {
            tamanio++;
            actual = actual.getSigNodo();
        }

        return tamanio;
    }

    // Método para obtener posicion
    public NodoLista obtenerNodoEnPosicion(int posicion) {
        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return null;
        }

        NodoLista actual = PrimerNodo;
        for (int i = 0; i < posicion && actual != null; i++) {
            actual = actual.getSigNodo();
        }

        return actual;
    }

    //pimer metodo
    public void insertarEnfrente(Object elemento) {
        if (estaVacia()) {
            this.PrimerNodo = this.UltimoNodo = new NodoLista(elemento, null, null);
        } else {
            this.PrimerNodo = new NodoLista(elemento, PrimerNodo, null);
            this.PrimerNodo.getSigNodo().setAntNodo(PrimerNodo); // Establecer el nodo anterior del siguiente nodo
        }
    }

    //metodo imprimir 
    public String Imprimir() {
        if (estaVacia()) {
            return "La lista está vacía";
        }

        NodoLista aux = PrimerNodo;
        StringBuilder finalizar = new StringBuilder();
        while (aux != null) {
            finalizar.append(aux.getDato()).append(" --> ");
            aux = aux.getSigNodo();
        }
        return finalizar.toString();

    }

    // Método para insertar al final
    public void insertarAlFinal(Object elemento) {
        if (estaVacia()) {
            PrimerNodo = UltimoNodo = new NodoLista(elemento, null, null);
        } else {
            UltimoNodo.setSigNodo(new NodoLista(elemento, null, null));
            UltimoNodo = UltimoNodo.getSigNodo();
        }
    }

    // Método para eliminar al frente
    public void eliminarAlFrente() {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar al frente.");
        } else {
            PrimerNodo = PrimerNodo.getSigNodo();
            if (PrimerNodo == null) {
                UltimoNodo = null;
            }
        }
    }

    // Método para eliminar al final
    public void eliminarAlFinal() {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar al final.");
        } else {
            if (PrimerNodo == UltimoNodo) {
                PrimerNodo = UltimoNodo = null;
            } else {
                NodoLista actual = PrimerNodo;
                while (actual.getSigNodo() != UltimoNodo) {
                    actual = actual.getSigNodo();
                }
                actual.setSigNodo(null);
                UltimoNodo = actual;
            }
        }
    }

    // Método para insertar en cualquier posición
    public void insertarEnPosicion(Object elemento, int posicion) {
        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return;
        }

        if (posicion == 0 || estaVacia()) {
            insertarEnfrente(elemento);
            return;
        }

        NodoLista nuevoNodo = new NodoLista(elemento, null, null);
        NodoLista actual = PrimerNodo;

        for (int i = 1; i < posicion; i++) {
            if (actual.getSigNodo() == null) {
                System.out.println("La posición excede el tamaño de la lista. Se insertará al final.");
                UltimoNodo.setSigNodo(nuevoNodo);
                UltimoNodo = nuevoNodo;
                return;
            }
            actual = actual.getSigNodo();
        }

        nuevoNodo.setSigNodo(actual.getSigNodo());
        actual.setSigNodo(nuevoNodo);
    }

    // Método para eliminar en cualquier posición
    public void eliminarEnPosicion(int posicion) {
        if (posicion < 0 || estaVacia()) {
            System.out.println("La lista está vacía o la posición no es válida.");
            return;
        }

        if (posicion == 0) {
            eliminarAlFrente();
            return;
        }

        NodoLista actual = PrimerNodo;
        for (int i = 1; i < posicion; i++) {
            if (actual.getSigNodo() == null) {
                System.out.println("La posición excede el tamaño de la lista. No se puede eliminar.");
                return;
            }
            actual = actual.getSigNodo();
        }

        if (actual.getSigNodo() == UltimoNodo) {
            UltimoNodo = actual;
        }

        actual.setSigNodo(actual.getSigNodo().getSigNodo());
    }

    // Método para realizar una búsqueda secuencial
    public NodoLista busquedaSecuencial(Object elemento) {
        NodoLista actual = PrimerNodo;
        while (actual != null) {
            if (actual.getDato().equals(elemento)) {
                return actual;
            }
            actual = actual.getSigNodo();
        }
        return null;
    }

    // Método para realizar una búsqueda binaria
    public NodoLista busquedaBinaria(Object elemento) {
        ordenamientoMerge();

        int inicio = 0;
        int fin = obtenerTamanio() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            NodoLista nodoMedio = obtenerNodoEnPosicion(medio);

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
        if (estaVacia() || PrimerNodo == UltimoNodo) {
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            NodoLista actual = PrimerNodo;
            NodoLista siguiente = PrimerNodo.getSigNodo();

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

    // Método para realizar el ordenamiento shell
    public void ordenamientoShell() {
        if (estaVacia() || PrimerNodo == UltimoNodo) {
            return;
        }

        int brecha = 1;
        int tamaño = obtenerTamaño();

        while (brecha < tamaño / 3) {
            brecha = 3 * brecha + 1;
        }

        while (brecha > 0) {
            for (int i = brecha; i < tamaño; i++) {
                Object elementoAInsertar = obtenerElementoEnPosicion(i);
                int j = i;

                while (j >= brecha && compararElementos(obtenerElementoEnPosicion(j - brecha), elementoAInsertar) > 0) {
                    establecerElementoEnPosicion(j, obtenerElementoEnPosicion(j - brecha));
                    j -= brecha;
                }

                establecerElementoEnPosicion(j, elementoAInsertar);
            }

            brecha = (brecha - 1) / 3;
        }
    }

    private int compararElementos(Object a, Object b) {
        int valorA = Integer.parseInt((String) a);
        int valorB = Integer.parseInt((String) b);
        return Integer.compare(valorA, valorB);
    }

    // Métodos auxiliares para obtener y establecer elementos en la lista
    private Object obtenerElementoEnPosicion(int posicion) {
        NodoLista actual = PrimerNodo;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSigNodo();
        }
        return actual.getDato();
    }

    private void establecerElementoEnPosicion(int posicion, Object dato) {
        NodoLista actual = PrimerNodo;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSigNodo();
        }
        actual.setDato(dato);
    }

    private int obtenerTamaño() {
        int tamaño = 0;
        NodoLista actual = PrimerNodo;
        while (actual != null) {
            tamaño++;
            actual = actual.getSigNodo();
        }
        return tamaño;
    }

    // Método para realizar el ordenamiento merge
    public void ordenamientoMerge() {
        if (estaVacia() || PrimerNodo == UltimoNodo) {
            return;
        }
        int tamaño = obtenerTamaño2();
        NodoLista nodoOrdenado = mergeSortRecursivo(PrimerNodo, tamaño);
        PrimerNodo = nodoOrdenado;
    }

    private NodoLista mergeSortRecursivo(NodoLista inicio, int tamaño) {
        if (tamaño <= 1) {
            return inicio;
        }

        int mitad = tamaño / 2;
        NodoLista mitadNodo = inicio;
        for (int i = 0; i < mitad - 1; i++) {
            mitadNodo = mitadNodo.getSigNodo();
        }

        NodoLista inicioSegundaMitad = mitadNodo.getSigNodo();
        mitadNodo.setSigNodo(null);

        NodoLista primerMitad = mergeSortRecursivo(inicio, mitad);
        NodoLista segundaMitad = mergeSortRecursivo(inicioSegundaMitad, tamaño - mitad);

        return merge(primerMitad, segundaMitad);
    }

    private NodoLista merge(NodoLista primerMitad, NodoLista segundaMitad) {
        NodoLista resultado = null;

        if (primerMitad == null) {
            return segundaMitad;
        }
        if (segundaMitad == null) {
            return primerMitad;
        }

        if (compararElementos(primerMitad.getDato(), segundaMitad.getDato()) <= 0) {
            resultado = primerMitad;
            resultado.setSigNodo(merge(primerMitad.getSigNodo(), segundaMitad));
        } else {
            resultado = segundaMitad;
            resultado.setSigNodo(merge(primerMitad, segundaMitad.getSigNodo()));
        }

        return resultado;
    }

    private int compararElementos2(Object a, Object b) {
        int valorA = Integer.parseInt((String) a);
        int valorB = Integer.parseInt((String) b);
        return Integer.compare(valorA, valorB);
    }

    private int obtenerTamaño2() {
        int tamanio2 = 0;
        NodoLista actual = PrimerNodo;
        while (actual != null) {
            tamanio2++;
            actual = actual.getSigNodo();
        }
        return tamanio2;
    }

    //Metodo de ordenamiento Quicksort
    public void ordenamientoQuicksort() {
        if (estaVacia() || PrimerNodo == UltimoNodo) {
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

    // Métodos auxiliares (iguales a los utilizados en el algoritmo Shell)
    private Object obtenerElementoEnPosicion1(int posicion) {
        NodoLista actual = PrimerNodo;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSigNodo();
        }
        return actual.getDato();
    }

    private void establecerElementoEnPosicion1(int posicion, Object dato) {
        NodoLista actual = PrimerNodo;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSigNodo();
        }
        actual.setDato(dato);
    }

    //Tamaños
    private int obtenerTamaño1() {
        int tamaño = 0;
        NodoLista actual = PrimerNodo;
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

    // Método auxiliar para obtener el último nodo de la lista
    private NodoLista obtenerUltimoNodo() {
        NodoLista actual = PrimerNodo;
        while (actual != null && actual.getSigNodo() != null) {
            actual = actual.getSigNodo();
        }
        return actual;
    }
}
