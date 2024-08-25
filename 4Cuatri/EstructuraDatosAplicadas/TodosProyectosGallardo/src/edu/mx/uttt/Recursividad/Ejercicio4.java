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
public class Ejercicio4 {

    // recursiva de MCD de dos numeros (Recursivo)
    public static double MaxComunDivi(double num1, double num2) {

        double r = 0.0;

        if (num2 == 0) {

            return num1;

        } else if (num1 == 0) {

            return num2;

        } else {

            r = num1 % num2;
            return MaxComunDivi(num2, r);

        }

    }

    public static String MaxComunDiviString(double num1, double num2) {
        double mcd = MaxComunDivi(num1, num2);
        return "El MCD de " + num1 + " y " + num2 + " es: " + mcd;

    }
    
}
