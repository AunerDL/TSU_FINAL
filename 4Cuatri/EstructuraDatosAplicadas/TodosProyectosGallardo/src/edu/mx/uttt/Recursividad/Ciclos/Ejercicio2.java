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
public class Ejercicio2 {

    public static double factorialFor(double n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double serieFactorial(double n) {
        int deno = 2;
        double r = 0.0;
        for (int i = 1; i <= n; i++) {
            r += (i / factorialFor(deno));
            deno += 2;
        }
        return r;
    }

    public static String serieFactorialAsString(double n) {
        StringBuilder stringBuilder = new StringBuilder();
        int deno = 2;
        double r = 0.0;
        for (int i = 1; i <= n; i++) {
            r += (i / factorialFor(deno));
            stringBuilder.append("(").append(i).append("/").append(factorialFor(deno)).append(") + ");
            deno += 2;
        }
        stringBuilder.setLength(stringBuilder.length() - 3); // Elimina el último "+ "
        stringBuilder.append(" = ").append(r);
        return stringBuilder.toString();
    }

}
