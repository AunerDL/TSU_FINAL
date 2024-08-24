/*
 * Calcular el salario de un onbrero que obtuvo el 25% sobre su salario anterior
 */


import javax.swing.JOptionPane;

public class SalarioObrero {
    public static void main(String[] args) {
        
        //Entradas
        double salario_anterior, sal25;

        //Proceso
        salario_anterior = Double.parseDouble(JOptionPane.showInputDialog("Introduce el salario anterior"));
        sal25 = salario_anterior * 0.25;
        
        //Salida
        JOptionPane.showMessageDialog(null, "el salario es: " + sal25);

    }
    
}
