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
public class Ejercicio1 {

    public static double suma(double n) {

        double resul = 0.0;
        double i = 1.0;

        // realiza procedimiento
        while (i <= n) {
            resul += 1.0 / i;
            i++;
        }

        // retorna valor
        return resul;

    }

    public static String sumaString(double n) {
        double resultado = suma(n);
        return "La suma es: " + resultado;
    }

}
