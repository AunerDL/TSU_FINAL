/*
 *  Escribir un Pseudocódigo que calcule el área de un triángulo recibiendo como entrada el valor de base y altura.
 */

import javax.swing.JOptionPane;

public class AreaTriangulo {
    public static void main(String[] args) {
        //Declaracion de variables
        double base, altura, area;

        //Entradas
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de altura"));

        //Proceso
        area = (base*altura)/2;

        //Salida
        JOptionPane.showMessageDialog(null, "El area es: " + area);

    }
    
}
