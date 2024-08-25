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
public class Ejercicio3 {

    public static int multiplicacion(int m1, int m2) {

        if (m2 == 0) {

            return 0;

        } else if (m2 % 2 == 1) {

            return m1 + multiplicacion(m1 * 2, m2 / 2);

        } else {

            return multiplicacion(m1 * 2, m2 / 2);

        }

    }

    public static String multiplicacionString(int m1, int m2) {
        int result = multiplicacion(m1, m2);
        return String.valueOf(result);
    }

}
