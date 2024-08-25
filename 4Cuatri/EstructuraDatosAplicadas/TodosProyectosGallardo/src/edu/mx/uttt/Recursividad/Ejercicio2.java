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
public class Ejercicio2 {

    //Hace factorial
    public static double Factorial(double r2) {

        //Sacar factorial
        if (r2 == 1) {

            return 1;

        } else {

            return r2 * Factorial(r2 - 1);

        }

    }

    //Hace divicion
    public static double serie(double n) {

        double r2 = 2.0;

        if (n == 1) {

            return 1.0 / 2.0;

        } else {

            return (n / Factorial(n + r2)) + serie(n - 1);

        }

    }

    public static String serieString(double n) {
        StringBuilder serieStr = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            serieStr.append(serie(i));
            if (i != n) {
                serieStr.append(", ");
            }
        }
        return serieStr.toString();
    }

}
