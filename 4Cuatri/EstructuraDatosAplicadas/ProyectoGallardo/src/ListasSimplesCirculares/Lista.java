/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimplesCirculares;

/**
 *
 * @author gabod
 */
public class Lista {

    private String nombre;
    private Nodos primerNodo;

    public Lista() {
        this("lista");
    }

    public Lista(String nombre) {
        this.nombre = nombre;
        primerNodo = null;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Nodos getPrimerNodo() {
        return this.primerNodo;
    }

    public int obtenerTamanio() {
        int tamanio = 0;
        Nodos actual = primerNodo;

        if (actual != null) {
            do {
                tamanio++;
                actual = actual.getSigNodo();
            } while (actual != primerNodo);
        }

        return tamanio;
    }

    public Nodos obtenerNodoEnPosicion(int posicion) {
        if (posicion < 0 || estaVacia()) {
            System.out.println("La posición no puede ser negativa o la lista está vacía.");
            return null;
        }

        Nodos actual = primerNodo;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSigNodo();
        }

        return actual;
    }

    public Nodos obtenerUltimoNodo() {
        if (estaVacia()) {
            return null;
        }

        Nodos actual = primerNodo;
        while (actual.getSigNodo() != primerNodo) {
            actual = actual.getSigNodo();
        }

        return actual;
    }

    public void insertarEnfrente(int elemento) {
        if (estaVacia()) {
            primerNodo = new Nodos(elemento);
            primerNodo.setSigNodo(primerNodo); // Hacer que el último nodo apunte al primero
        } else {
            Nodos nuevoNodo = new Nodos(elemento, primerNodo);
            Nodos ultimo = obtenerUltimoNodo();
            primerNodo = nuevoNodo;
            ultimo.setSigNodo(primerNodo); // Actualizar el apuntador del último nodo al nuevo primero
        }
    }

    public void insertarAlFinal(int elemento) {
        if (estaVacia()) {
            insertarEnfrente(elemento);
        } else {
            Nodos nuevoNodo = new Nodos(elemento, primerNodo);
            obtenerUltimoNodo().setSigNodo(nuevoNodo);
        }
    }

    public void eliminarAlFrente() {
        if (!estaVacia()) {
            Nodos ultimo = obtenerUltimoNodo();
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
            Nodos actual = primerNodo;
            while (actual.getSigNodo() != obtenerUltimoNodo()) {
                actual = actual.getSigNodo();
            }
            actual.setSigNodo(primerNodo);
        } else {
            System.out.println("La lista está vacía. No se puede eliminar al final.");
        }
    }

    public Nodos busquedaSecuencial(int elemento) {
        Nodos actual = primerNodo;
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

        Nodos inicio = primerNodo;
        Nodos fin = obtenerUltimoNodo();
        int tamaño = obtenerTamanio();

        while (inicio != fin.getSigNodo()) {
            int medio = tamaño / 2;
            Nodos nodoMedio = obtenerNodoEnPosicion(medio);

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
            Nodos actual = primerNodo;
            Nodos siguiente = primerNodo.getSigNodo();

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

    private Nodos mergeSortRecursivo(Nodos inicio, int tamaño) {
        if (tamaño <= 1) {
            return inicio;
        }

        int mitad = tamaño / 2;
        Nodos mitadNodo = inicio;
        for (int i = 0; i < mitad - 1; i++) {
            mitadNodo = mitadNodo.getSigNodo();
        }

        Nodos inicioSegundaMitad = mitadNodo.getSigNodo();
        mitadNodo.setSigNodo(null);

        Nodos primerMitad = mergeSortRecursivo(inicio, mitad);
        Nodos segundaMitad = mergeSortRecursivo(inicioSegundaMitad, tamaño - mitad);

        return merge(primerMitad, segundaMitad);
    }

    private Nodos merge(Nodos primerMitad, Nodos segundaMitad) {
        Nodos resultado = null;

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

    private void quicksortRecursivo(Nodos izquierda, Nodos izqAnt, Nodos derecha) {
        if (izquierda != derecha && izquierda != null && derecha != null) {
            Nodos[] indicesParticion = particion(izquierda, derecha);
            quicksortRecursivo(izquierda, indicesParticion[0], indicesParticion[1]);
            quicksortRecursivo(indicesParticion[1].getSigNodo(), indicesParticion[1], derecha);
        }
    }

    private Nodos[] particion(Nodos izquierda, Nodos derecha) {
        int pivote = derecha.getDato();
        Nodos i = izquierda;

        for (Nodos j = izquierda; j != derecha; j = j.getSigNodo()) {
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

        return new Nodos[]{i, derecha};
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
        Nodos actual = primerNodo;
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
            Nodos nuevoNodo = new Nodos(elemento);
            Nodos anterior = obtenerNodoEnPosicion(posicion - 1);

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
            Nodos anterior = obtenerNodoEnPosicion(posicion - 1);

            if (anterior == null || anterior.getSigNodo() == primerNodo) {
                System.out.println("La posición excede el tamaño de la lista.");
                return;
            }

            Nodos nodoAEliminar = anterior.getSigNodo();
            anterior.setSigNodo(nodoAEliminar.getSigNodo());

            // Si el nodo a eliminar es el último, se actualiza el primer nodo
            if (nodoAEliminar == obtenerUltimoNodo()) {
                primerNodo = anterior.getSigNodo();
            }
        }
    }

}
