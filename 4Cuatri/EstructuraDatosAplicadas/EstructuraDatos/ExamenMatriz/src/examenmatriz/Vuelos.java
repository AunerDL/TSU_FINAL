/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenmatriz;
import javax.swing.JOptionPane;

/**
 *
 * @author gabod
 */
public class Vuelos {
    
    private int filas;
    private int columnas;
    private int[][] vuelos;
    
    //arreglos
    private String[] Tiempos;
    private String[] Lugares;


    //matriz
    public Vuelos(int filas, int columnas, String[] Tiempos, String[] Lugares) {
        this.filas = filas;
        this.columnas = columnas;
        this.vuelos = new int[filas][columnas];
        
        //arreglos
        this.Tiempos = Tiempos;
        this.Lugares = Lugares;
    }

    Vuelos(String[] Tiempos, String[] Lugares) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Vuelos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setValor(int fila, int columna, int valor) {
        this.vuelos[fila][columna] = valor;
    }

    public int getValor(int fila, int columna) {
        return this.vuelos[fila][columna];
    }
    
}
