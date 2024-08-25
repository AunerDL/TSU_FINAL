/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.control;

import javax.swing.JOptionPane;

/**
 *
 * @author gabod
 */
public class ControlVuelos {
    
    private int[][] tablero; // = {{12, 56, 11}, {4, 5, 8}, {6, 7, 12}, {7, 8, 9}, {11, 23, 12}};
    //private String [] destinos;
    String destinos[] = {"Cancun", "CDMX", "Los Cabos", "Mazatlan", "Puerto Vallarta","Guanchumpein", "Contra el Dragon"};
    private String[] horarios = {"Mañana", "Medio Dia", "Noche"};
 

    public ControlVuelos() {

    }

    public ControlVuelos(int filas, int columnas) {
        tablero = new int[filas][columnas];

    }
    
    public int [][] getTablero(){
        return tablero;
    }

    public String [] getDestinos(){
        return destinos;
    }
    
    public String [] getHorarios(){
        return horarios;
    }
    
    public String Imprimir() {
        String salida = "                        Mañana    Medio Dia    Noche\n";
        for (int i = 0; i < tablero.length; i++) {
            salida += destinos[i] + "                 ";
            for (int j = 0; j < tablero[0].length; j++) {
                salida += tablero[i][j] + "               ";
            }

            salida += "\n";
        }
        return salida;
    }

    public String mostrarMenuDestino() {
        String salida = "   Destinos      \n";

        for (int i = 0; i < destinos.length; i++) {
            salida += (i + 1) + ")" + destinos[i] + "\n";
        }

        salida += "Elegir Opción: \n";
        return salida;
    }

    public String mostrarMenuHorario() {
        String salida = "   Horarios      \n";

        for (int i = 0; i < horarios.length; i++) {
            salida += (i + 1) + ")" + horarios[i] + "\n";
        }

        salida += "Elegir Opción: \n";
        return salida;
    }

    public boolean verificarDisponibilidad(int destino, int horario, int numeroBoletos) {
        boolean res = false;
        if (numeroBoletos > 0) {
            if (tablero[destino - 1][horario - 1] >= numeroBoletos) {
                tablero[destino - 1][horario - 1] = tablero[destino - 1][horario - 1] - numeroBoletos;
                res = true;
            }

           
        }
   
        return res;
       
    }

    public String mensaje(boolean opcion) {
        return opcion ? "La venta fue exitosa " : "La venta de boletos no fue exitosa por falta de disponibilidad";
    }

    public void llenarTablero() {
        boolean sentinel = false;
        for(int i=0; i<this.tablero.length; i++){
            for(int j=0; j<this.tablero[0].length; j++){
                
                do{
                    try{
                       this.tablero[i][j] = Integer.parseInt(
                       JOptionPane.showInputDialog("Introduce un valor"));
                       sentinel = false;
                    }catch(NumberFormatException e){
                        sentinel = true;
                        JOptionPane.showMessageDialog(null, "El valor debe ser entero");
                    }
                }while(sentinel);
            }
        }
    }
    
}
