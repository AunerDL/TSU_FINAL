/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.Recursividad.Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author gabod
 */
public class Ejercicio4 {

    public static double MaxComunDivi(double num1, double num2) {

        while (num2 != 0) {

            double max = num2;

            num2 = num1 % num2;

            num1 = max;

        }
        return num1;

    }

    public static String obtenerRepresentacionCadena(double num1, double num2) {
        double mcd = MaxComunDivi(num1, num2);
        return "El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd;
    }

}
