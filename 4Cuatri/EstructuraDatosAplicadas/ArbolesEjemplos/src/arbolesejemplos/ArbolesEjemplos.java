/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesejemplos;

/**
 *
 * @author gabod
 */
public class ArbolesEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(15);
        arbol.insertar(54);
        
        /*/System.out.println("Recorrido Inorden antes de eliminar:");
        arbol.recorridoInorden();

        arbol.eliminar(3); // Eliminar el nodo con valor 3

        System.out.println("\nRecorrido Inorden después de eliminar:");
        arbol.recorridoInorden();*/
        
    }
    
}
