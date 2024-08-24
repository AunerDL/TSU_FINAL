/*9) Problema 9
 * 
 * Que lea tres numeros diferentes y determine el numero medio del conjunto de los tres numeros
 * (el numero medio es aquel numero que no es mayor, ni menor),
 */

import javax.swing.JOptionPane;
public class TresNumeros {
    public static void main(String[] args) {

        //Declaracion
        double num1, num2, num3;
        double medio;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tercero numero"));

        if(num1<num3){

            medio = (num1 + num2 + num3)/3.0;
            JOptionPane.showMessageDialog(null, "el numero medio es: " + medio);

        }else
        if(num1==num3){

            JOptionPane.showMessageDialog(null, "los numeros se repiten");

        }

    }
    
} 
