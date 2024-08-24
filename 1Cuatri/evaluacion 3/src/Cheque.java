/*
 * Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de sus empleados que tendra que ir
 * por equis numero de dias a la ciudad de Monterrey; los gastos que cubre la empresa son: Hotel, comida y 100.00 pesos
 * diarios para otros gastos. El monto debe estar desglosado para cada concepto. Realice el programa que representen
 * el algoritmo que determine el monto del cheque.
 */

import javax.swing.JOptionPane;

public class Cheque {
    public static void main(String[] args) {

        //Declaracion de variables
            final double Pesos = 100.00;
            double Nodias, Hotel, comida, cheque;
        
        //Entradas
            Nodias = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Numero de dias"));
            Hotel = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad del hotel"));
            comida = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad para comida"));
        
        //Procedimiento
            cheque = Nodias * (Hotel + comida + Pesos);

        //Salida
            JOptionPane.showMessageDialog(null, "El cheque es: " + cheque);

    }
}
