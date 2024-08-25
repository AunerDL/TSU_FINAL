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
public class Ejercicio3 {

    public static int operaciones(int m1, int m2) {

        int r1 = 0;
        int r2 = 0;

        for (int i = 1; i <= m1; i++) {

            if (m2 % 2 == 1) {

                r1 = m1 * 2;
                r2 = m2 / 2;

            }

        }
        return m1;

    }

    public static String obtenerOperacionesString(int m1, int m2) {
        int r1 = 0;
        int r2 = 0;

        for (int i = 1; i <= m1; i++) {
            if (m2 % 2 == 1) {
                r1 = m1 * 2;
                r2 = m2 / 2;
            }
        }

        return "Operación realizada: m1 * 2 = " + r1 + ", m2 / 2 = " + r2;
    }

}
