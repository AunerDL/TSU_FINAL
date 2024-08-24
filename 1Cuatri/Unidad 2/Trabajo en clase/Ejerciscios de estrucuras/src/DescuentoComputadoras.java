/*
 * 1) Problema 1
 * 
 * En una fabrica de computadoras se planea ofrecer a los clientes un descuento que dependera
 * del nuero de computadoras que compre. Si las computadoras son menos que de cinco se les dara
 * un 10% de descuento sobre el total de compra; si el numero de comptadoras es mayor o igual 
 * a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o mas se les da un
 * 40% de descuento. En precio de cada computadora es de $11,000.
 */

import javax.swing.JOptionPane;
public class DescuentoComputadoras {
    public static void main(String[] args) {

        //Declaracion de entradas
        double PC, costo;
        double importe1, importe2, importe3, menos10, menos20, menos40;

        //Entrada
        PC = Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas computadoras compras?:"));

        //Proceso
        if(PC<=0){
            JOptionPane.showMessageDialog(null, "Compra una pc CERDO");

        }else if(PC>0 && PC<5){
            costo = Double.parseDouble(JOptionPane.showInputDialog("costo por cada computadora"));
                importe1 = PC*costo;
            JOptionPane.showMessageDialog(null, "tu costo es: " + importe1);
                menos10 = importe1*0.10;
            JOptionPane.showMessageDialog(null, "tu costo total es: " + menos10);

        }else if(PC>=5){
            costo = Double.parseDouble(JOptionPane.showInputDialog("costo por cada computadora"));
                importe2 = PC*costo;
            JOptionPane.showMessageDialog(null, "Tu costo es: " + importe2);
                menos20 = importe2*0.20;
            JOptionPane.showMessageDialog(null, "tu costo total es: " + menos20);

        }else if(PC>=10){
            costo = Double.parseDouble(JOptionPane.showInputDialog("costo por cada computadora"));
                importe3 = PC*costo;
            JOptionPane.showMessageDialog(null, "tu costo es: " + importe3);
                menos40 = importe3*0.40;
            JOptionPane.showMessageDialog(null, "tu costo total es: " + menos40);
        }

        JOptionPane.showMessageDialog(null, "Gracias por vicitarnos pobreton");
    }
    
}
