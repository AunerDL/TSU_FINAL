package Examen;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author perez
 */
public class Transportes {
    
    
    private String[] nombres;
    private int[][] kmPorSemana;

    public Transportes() {
    }

    public Transportes(int numConductores, int Sem) {
        nombres = new String[numConductores];
        kmPorSemana = new int[numConductores][Sem];
    }

    public String[] getNombres() {
        return nombres;
    }

    public int[][] getKmPorSemana() {
        return kmPorSemana;
    }

    public void llenarNombres() {

        for (int i = 0; i < this.nombres.length; i++) {
            this.nombres[i] = JOptionPane.showInputDialog("Nombre del empleado: " + (i+1));
        }
    }

    public void llenarKmPorSemana() {
        
        String[] DiasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        boolean sentinel = false;
        
        for (int i = 0; i < this.kmPorSemana.length; i++) {
            for (int j = 0; j < this.kmPorSemana[0].length; j++) {
                do {
                    try {
                        this.kmPorSemana[i][j] = Integer.parseInt(JOptionPane.showInputDialog(DiasSemana[j] + "Empleado: " + (i+1)));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "los datos deben ser enteros");
                    }
                } while (sentinel);
            }
            
        }
    }
    
    public String sumarEmpleados(){
        
        String[] Nom = getNombres();
        
        String cadena="";
        int suma;

        for (int i = 0; i < kmPorSemana.length ; i++) {
            suma = 0;
            for (int j = 0; j < kmPorSemana[0].length ; j++) {
                suma += kmPorSemana[i][j];
            }
            
            cadena+= Nom[i] + ": " + suma + " km";
            cadena+="\n";
    }
        cadena+="\n";
        return cadena;
    }
   
}


   
   

   

