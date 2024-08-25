/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;
import Ejercicio.Transportes;
import java.util.Random;


/**
 *
 * @author gabod
 */
public class Vista {
    
    public static void main(String[] args) {
        
        Transportes miMatriz = new Transportes(3,5);
        
        miMatriz.llenarEmpleados();
        miMatriz.llenarDias();
        miMatriz.llenarTablero();
        miMatriz.mostrarMenuEmpleados();
        
        System.out.println(miMatriz.Imprimir());
                
    }
    
}


