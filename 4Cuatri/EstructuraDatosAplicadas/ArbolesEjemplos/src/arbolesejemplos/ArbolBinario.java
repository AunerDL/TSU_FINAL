/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesejemplos;

/**
 *
 * @author gabod
 */
public class ArbolBinario {
    
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int dato){
        if(esVacio()){
            this.raiz = new Nodo(dato);
        }else{
            raiz.agregar(dato);
        }
    }
    
    public boolean esVacio(){
        return raiz==null;
    }
    
    /*
    // Método para insertar un nodo en el árbol
    private Nodo insertarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.valor)
            nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = insertarNodo(nodo.derecho, valor);

        return nodo;
    }

    // Método para eliminar un nodo del árbol
    public void eliminar(int valor) {
        raiz = eliminarNodo(raiz, valor);
    }

    private Nodo eliminarNodo(Nodo nodo, int valor) {
        if (nodo == null)
            return nodo;

        if (valor < nodo.valor)
            nodo.izquierdo = eliminarNodo(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = eliminarNodo(nodo.derecho, valor);
        else {
            // Nodo con solo un hijo o sin hijos
            if (nodo.izquierdo == null)
                return nodo.derecho;
            else if (nodo.derecho == null)
                return nodo.izquierdo;

            // Nodo con dos hijos: obtener el sucesor inorden (el menor valor en el subárbol derecho)
            nodo.valor = encontrarMenorValor(nodo.derecho);

            // Eliminar el sucesor inorden
            nodo.derecho = eliminarNodo(nodo.derecho, nodo.valor);
        }
        return nodo;
    }

    private int encontrarMenorValor(Nodo nodo) {
        int min = nodo.valor;
        while (nodo.izquierdo != null) {
            min = nodo.izquierdo.valor;
            nodo = nodo.izquierdo;
        }
        return min;
    }*/

    // Método para realizar el recorrido Inorden
    public void recorridoInorden() {
        recorridoInorden(raiz);
    }

    private void recorridoInorden(Nodo nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.izquierdo);
            System.out.print(nodo + " ");
            recorridoInorden(nodo.derecho);
        }
    }
    
}
