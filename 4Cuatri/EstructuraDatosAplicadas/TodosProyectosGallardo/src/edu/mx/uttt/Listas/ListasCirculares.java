/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Listas;

/**
 *
 * @author gabod
 */
public class ListasCirculares {

    private String nombre;
    private NodoCirculares primerNodo;

    public ListasCirculares() {
        this("lista");
    }

    public ListasCirculares(String nombre) {
        this.nombre = nombre;
        primerNodo = null;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public NodoCirculares getPrimerNodo() {
        return this.primerNodo;
    }

    public int obtenerTamanio() {
        int tamanio = 0;
        NodoCirculares actual = primerNodo;

        if (actual != null) {
            do {
                tamanio++;
                actual = actual.getSigNodo();
            } while (actual != primerNodo);
        }

        return tamanio;
    }

    public NodoCirculares obtenerNodoEnPosicion(int posicion) {
        if (posicion < 0 || estaVacia()) {
            System.out.println("La posición no puede ser negativa o la lista está vacía.");
            return null;
        }

        NodoCirculares actual = primerNodo;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSigNodo();
        }

        return actual;
    }

    public NodoCirculares obtenerUltimoNodo() {
        if (estaVacia()) {
            return null;
        }

        NodoCirculares actual = primerNodo;
        while (actual.getSigNodo() != primerNodo) {
            actual = actual.getSigNodo();
        }

        return actual;
    }

    public void insertarEnfrente(int elemento) {
        if (estaVacia()) {
            primerNodo = new NodoCirculares(elemento);
            primerNodo.setSigNodo(primerNodo); // Hacer que el último nodo apunte al primero
        } else {
            NodoCirculares nuevoNodo = new NodoCirculares(elemento, primerNodo);
            NodoCirculares ultimo = obtenerUltimoNodo();
            primerNodo = nuevoNodo;
            ultimo.setSigNodo(primerNodo); // Actualizar el apuntador del último nodo al nuevo primero
        }
    }

    public void insertarAlFinal(int elemento) {
        if (estaVacia()) {
            insertarEnfrente(elemento);
        } else {
            NodoCirculares nuevoNodo = new NodoCirculares(elemento, primerNodo);
            obtenerUltimoNodo().setSigNodo(nuevoNodo);
        }
    }

    public void eliminarAlFrente() {
        if (!estaVacia()) {
            NodoCirculares ultimo = obtenerUltimoNodo();
            if (ultimo == primerNodo) {
                primerNodo = null;
            } else {
                primerNodo = primerNodo.getSigNodo();
                ultimo.setSigNodo(primerNodo); // Actualizar el apuntador del último nodo al nuevo primero
            }
        } else {
            System.out.println("La lista está vacía. No se puede eliminar al frente.");
        }
    }

    public void eliminarAlFinal() {
        if (!estaVacia()) {
            NodoCirculares actual = primerNodo;
            while (actual.getSigNodo() != obtenerUltimoNodo()) {
                actual = actual.getSigNodo();
            }
            actual.setSigNodo(primerNodo);
        } else {
            System.out.println("La lista está vacía. No se puede eliminar al final.");
        }
    }

    public NodoCirculares busquedaSecuencial(int elemento) {
        NodoCirculares actual = primerNodo;
        do {
            if (actual.getDato() == elemento) {
                return actual;
            }
            actual = actual.getSigNodo();
        } while (actual != primerNodo);
        return null;
    }

    public String busquedaBinaria(int elemento) {
        ordenamientoBurbuja(); // Asegurarse de que la lista esté ordenada para la búsqueda binaria

        NodoCirculares inicio = primerNodo;
        NodoCirculares fin = obtenerUltimoNodo();
        int tamaño = obtenerTamanio();

        while (inicio != fin.getSigNodo()) {
            int medio = tamaño / 2;
            NodoCirculares nodoMedio = obtenerNodoEnPosicion(medio);

            if (nodoMedio.getDato() == elemento) {
                return "Elemento encontrado en el nodo: " + nodoMedio.getDato();
            } else if (elemento < nodoMedio.getDato()) {
                fin = nodoMedio.getSigNodo();
                tamaño = medio; // Ajustar el tamaño para la siguiente iteración
            } else {
                inicio = nodoMedio.getSigNodo();
                tamaño = tamaño - medio; // Ajustar el tamaño para la siguiente iteración
            }
        }

        return "Elemento no encontrado";
    }

    public void ordenamientoBurbuja() {
        if (estaVacia() || primerNodo == obtenerUltimoNodo()) {
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            NodoCirculares actual = primerNodo;
            NodoCirculares siguiente = primerNodo.getSigNodo();

            while (siguiente != primerNodo) {
                int valorActual = actual.getDato();
                int valorSiguiente = siguiente.getDato();

                if (valorActual > valorSiguiente) {
                    int temp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(temp);
                    intercambio = true;
                }
                actual = siguiente;
                siguiente = siguiente.getSigNodo();
            }
        } while (intercambio);
    }

    public void ordenamientoMerge() {
        if (estaVacia() || primerNodo == obtenerUltimoNodo()) {
            return;
        }
        int tamaño = obtenerTamanio();
        primerNodo = mergeSortRecursivo(primerNodo, tamaño);
    }

    private NodoCirculares mergeSortRecursivo(NodoCirculares inicio, int tamaño) {
        if (tamaño <= 1) {
            return inicio;
        }

        int mitad = tamaño / 2;
        NodoCirculares mitadNodo = inicio;
        for (int i = 0; i < mitad - 1; i++) {
            mitadNodo = mitadNodo.getSigNodo();
        }

        NodoCirculares inicioSegundaMitad = mitadNodo.getSigNodo();
        mitadNodo.setSigNodo(null);

        NodoCirculares primerMitad = mergeSortRecursivo(inicio, mitad);
        NodoCirculares segundaMitad = mergeSortRecursivo(inicioSegundaMitad, tamaño - mitad);

        return merge(primerMitad, segundaMitad);
    }

    private NodoCirculares merge(NodoCirculares primerMitad, NodoCirculares segundaMitad) {
        NodoCirculares resultado = null;

        if (primerMitad == null) {
            return segundaMitad;
        }
        if (segundaMitad == null) {
            return primerMitad;
        }

        if (primerMitad.getDato() <= segundaMitad.getDato()) {
            resultado = primerMitad;
            resultado.setSigNodo(merge(primerMitad.getSigNodo(), segundaMitad));
        } else {
            resultado = segundaMitad;
            resultado.setSigNodo(merge(primerMitad, segundaMitad.getSigNodo()));
        }

        return resultado;
    }

    public String ordenamientoQuicksort() {
        if (estaVacia() || primerNodo == obtenerUltimoNodo()) {
            return "La lista está vacía o tiene un solo elemento";
        }
        quicksortRecursivo(primerNodo, null, obtenerUltimoNodo());
        return "La lista ha sido ordenada mediante QuickSort";
    }

    private void quicksortRecursivo(NodoCirculares izquierda, NodoCirculares izqAnt, NodoCirculares derecha) {
        if (izquierda != derecha && izquierda != null && derecha != null) {
            NodoCirculares[] indicesParticion = particion(izquierda, derecha);
            quicksortRecursivo(izquierda, indicesParticion[0], indicesParticion[1]);
            quicksortRecursivo(indicesParticion[1].getSigNodo(), indicesParticion[1], derecha);
        }
    }

    private NodoCirculares[] particion(NodoCirculares izquierda, NodoCirculares derecha) {
        int pivote = derecha.getDato();
        NodoCirculares i = izquierda;

        for (NodoCirculares j = izquierda; j != derecha; j = j.getSigNodo()) {
            if (j.getDato() <= pivote) {
                int temp = i.getDato();
                i.setDato(j.getDato());
                j.setDato(temp);
                i = i.getSigNodo();
            }
        }

        int temp = i.getDato();
        i.setDato(derecha.getDato());
        derecha.setDato(temp);

        return new NodoCirculares[]{i, derecha};
    }

    public void ordenamientoShell() {
        if (estaVacia() || primerNodo == obtenerUltimoNodo()) {
            return;
        }

        int brecha = 1;
        int tamaño = obtenerTamanio();

        while (brecha < tamaño / 3) {
            brecha = 3 * brecha + 1;
        }

        while (brecha > 0) {
            for (int i = brecha; i < tamaño; i++) {
                int elementoAInsertar = obtenerNodoEnPosicion(i).getDato();
                int j = i;

                while (j >= brecha && obtenerNodoEnPosicion(j - brecha).getDato() > elementoAInsertar) {
                    obtenerNodoEnPosicion(j).setDato(obtenerNodoEnPosicion(j - brecha).getDato());
                    j -= brecha;
                }

                obtenerNodoEnPosicion(j).setDato(elementoAInsertar);
            }
            brecha = brecha / 3;
        }
    }

    public String imprimir() {
        if (estaVacia()) {
            return "La lista está vacía";
        }

        StringBuilder resultado = new StringBuilder();
        NodoCirculares actual = primerNodo;
        do {
            resultado.append(actual.getDato()).append(" -> ");
            actual = actual.getSigNodo();
        } while (actual != primerNodo);

        return resultado.toString();
    }

    public void insertarEnPosicion(int elemento, int posicion) {
        if (posicion < 0) {
            System.out.println("La posición no puede ser negativa.");
            return;
        }

        if (posicion == 0) {
            insertarEnfrente(elemento);
        } else {
            NodoCirculares nuevoNodo = new NodoCirculares(elemento);
            NodoCirculares anterior = obtenerNodoEnPosicion(posicion - 1);

            if (anterior == null) {
                System.out.println("La posición excede el tamaño de la lista.");
                return;
            }

            nuevoNodo.setSigNodo(anterior.getSigNodo());
            anterior.setSigNodo(nuevoNodo);
        }
    }

    public void eliminarEnPosicion(int posicion) {
        if (posicion < 0 || estaVacia()) {
            System.out.println("La posición no puede ser negativa o la lista está vacía.");
            return;
        }

        if (posicion == 0) {
            eliminarAlFrente();
        } else {
            NodoCirculares anterior = obtenerNodoEnPosicion(posicion - 1);

            if (anterior == null || anterior.getSigNodo() == primerNodo) {
                System.out.println("La posición excede el tamaño de la lista.");
                return;
            }

            NodoCirculares nodoAEliminar = anterior.getSigNodo();
            anterior.setSigNodo(nodoAEliminar.getSigNodo());

            // Si el nodo a eliminar es el último, se actualiza el primer nodo
            if (nodoAEliminar == obtenerUltimoNodo()) {
                primerNodo = anterior.getSigNodo();
            }
        }
    }

}
