/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author gabod
 */
public class Ejercicio1 {

    public static double dividir(double n) {

        if (n == 1) {

            return 1;

        } else {
            double suma = dividir(n - 1);
            return (1 / n) + suma;

        }

    }

    public static String imprimirString(double n) {
        StringBuilder sb = new StringBuilder();
        sb.append("Resultado de la división recursiva hasta ").append(n).append(": ");
        sb.append(dividir(n));
        return sb.toString();
    }

}
