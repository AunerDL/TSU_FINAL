package edu.mx.uttt.listasimples;

public class pruebaLista {
    public static void main(String[] args) {
        Lista list= new Lista("miLista :p");
        list.insertarAlFrente(-1);
        list.imprimir();
        list.insertarAlFrente(0);
        list.imprimir();
        list.insertarAlFinal(1);
        list.imprimir();
        list.insertarAlFinal(5);
        list.imprimir();
        //Eliminar objetos de la lista
        try{
            Object objetoEliminado=list.eliminarDelFinal();
            System.out.println("[Eliminado] "+objetoEliminado);
            list.imprimir();
        }catch(ExcepcionListaVacia ex){
            System.out.println(ex.getMessage());
        }
        //System.out.println("El elemento eliminado es: "+list.eliminarDelFrente());
        //list.imprimir();
    }
}
