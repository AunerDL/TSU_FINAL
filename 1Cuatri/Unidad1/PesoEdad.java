/*
 * Escribir un software donde mencione la edad y peso de la persona.
 */

import javax.swing.JOptionPane;

public class PesoEdad {    
    public static void main(String[] args) {
        
    //Declaracion de entradas
    double peso, edad;
    String datos;

    //Entradas
    peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso"));
    edad = Double.parseDouble(JOptionPane.showInputDialog("Introduce la edad"));

    //Proceso
    datos = peso + "peso\n" + edad + "pedad";

    //Salida
    JOptionPane.showMessageDialog(null, "los datos de la persona son: " + datos);

    }

}
