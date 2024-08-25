/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author gabod
 */
public class Transportes {

    private int[][] tablero;
    private String empleados[];
    private String[] dias;

    public Transportes() {

    }

    public Transportes(int filas, int columnas) {
        tablero = new int[filas][columnas];
        empleados = new String[filas];
        dias = new String[columnas];
    }

    public int[][] getTablero() {
        return tablero;
    }

    public String[] getEmpleados() {
        return empleados;
    }

    public String[] getDias() {
        return dias;
    }

    // TABLERO
    public String Imprimir() {
        String salida = "                        Lunes     Martes     Miercoles    Jueves    Viernes\n";
        for (int i = 0; i < tablero.length; i++) {
            salida += String.format("%-20s", empleados[i]);
            for (int j = 0; j < tablero[0].length; j++) {
                salida += String.format("%-12d", tablero[i][j]);
            }
            salida += "\n";
        }
        return salida;
    }

    public void llenarTablero() {
        boolean sentinel = false;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {
                do {
                    try {
                        this.tablero[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de boletos: "));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor Debe De Ser Entero");
                    }
                } while (sentinel);

            }
        }

    }

    // EMPLEADOS
    public String mostrarMenuEmpleados() {
        String salida = "   Empleados      \n";
        for (int i = 0; i < empleados.length; i++) {
            salida += (i + 1) + ")" + empleados[i] + "\n";
        }
        salida += "Elegir Opción: \n";
        return salida;
    }

    public void llenarEmpleados() {
        for (int i = 0; i < this.empleados.length; i++) {
            this.empleados[i] = JOptionPane.showInputDialog("Introduce El Empleado " + (i + 1));
        }
    }

    // DIAS
    public void llenarDias() {
        for (int i = 0; i < this.dias.length; i++) {
            this.dias[i] = JOptionPane.showInputDialog("Introduce El Dias " + (i + 1));
        }
    }

    // OPERACIONES
}
