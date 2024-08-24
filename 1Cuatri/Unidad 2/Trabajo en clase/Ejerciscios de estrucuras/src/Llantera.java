/*
 * 2)Problema 2
 * 
 * En una llantera se ha establecido una promocion de las lantas marca "Ponchadas", dicha
 * promocion consiste en lo siguiente:
 * 1) Si se compran menos de cinco llantas el precio es de $300 cada una, de %250 si se compran
 * de 5 a 10 y de $200 si se compran mas de 10.
 * 2) Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas 
 * que compra y la que tiene que pagar por el total de la compra. 
 */

import javax.swing.JOptionPane;
public class Llantera {
    public static void main(String[] args) {

    //Declaracion de variables
    double Llantas, costo;
    int precio1 = 300;
    int precio2 = 250;
    int precio3 = 200;

    //Declaracion de variable
    Llantas = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de llantas"));


    //Proceso
    if(Llantas<0){
        JOptionPane.showMessageDialog(null, "eres bobo o ke");
    }else if(Llantas>0 && Llantas<5){
        JOptionPane.showMessageDialog(null, "presio por llanta es: " + precio1);
            costo = Llantas * precio1;
        JOptionPane.showMessageDialog(null, "el costo total es: " + costo);
    }else if(Llantas>=5 && Llantas<=10){
        JOptionPane.showMessageDialog(null, "Precio de llantas es. " + precio2);
            costo = Llantas * precio2;
        JOptionPane.showMessageDialog(null, "El costo total es: " + costo);
    }else if(Llantas>10){
        JOptionPane.showMessageDialog(null, "Precio de llantas es: " + precio3);
            costo = Llantas * precio3;
        JOptionPane.showMessageDialog(null, "El costo total es: " + costo);
    }
    
    if(Llantas<0){
        JOptionPane.showMessageDialog(null, "Comprate un auto probreton");
    }

    if(Llantas>1){
        JOptionPane.showMessageDialog(null, "Gracias por su compra no regrese");
    }
    }
    
}
