/*
 * El pago mensual de un empleado de una empresa se efectua de la siguiente manera: 
 * el sueldo basico se calcula en la base al numero total de horas trabajadas basado en una tarifa horaria;
 * al sueldo basico, se le aplica una bonificacion del 20% obteniendose el sueldo bruto; al sueldo bruto, se
 * le aplica un descuento del 10% obteniendose el sueldo neto.
 * 
 * Escriba un programa que calcule e imprima el sueldo basico,
 * el sueldo bruto y el sueldo neto de un trabajador
 */

import javax.swing.JOptionPane;

public class PagodeEmpleado {
    public static void main(String[] args) {

        //Declaraciones de variables
        double hrs_empleado, Tarifa_horaria, sueldo_basico, sueldo_bruto, sueldo_neto;
        String cadena;

        //Entradas
        hrs_empleado = Double.parseDouble(JOptionPane.showInputDialog("Introduce las horas"));
        Tarifa_horaria = Double.parseDouble(JOptionPane.showInputDialog("Introduce el pago por horas"));

        //Proceso
        sueldo_basico = hrs_empleado * Tarifa_horaria;
        sueldo_bruto = sueldo_basico * 0.20;
        sueldo_neto = sueldo_bruto * 0.10;
        cadena = sueldo_basico + "sueldo basico\n" + sueldo_bruto + "sueldo bruto\n" + sueldo_neto + "sueldo neto"; 

        //Salida
        JOptionPane.showMessageDialog(null, cadena);
    }
    
}
