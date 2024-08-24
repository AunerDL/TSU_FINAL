/*
 * 5) Problrema 5
 * 
 *  Una fruteria otrece las manzanas con descuento segun la siguiente tabla:
 * NUM. DE KILOS COMPRADOS          % DESCUENTO
 *      0   -   2                        0%
 *      2.01 -  5                       10%
 *      5.01 - 10                       15%
 *    10.01 en adelante                 20%
 * Determinar cuanto pagara unqa persona que compre manzanas en esa fruteria. 
 */

import javax.swing.JOptionPane;
public class Fruteria {
    public static void main(String[] args) {
        
        //Declaracion 
        double Nomkilos;
        double costokilo;
        double costo;

        //Entradas
        Nomkilos = Double.parseDouble(JOptionPane.showInputDialog("INtroduce la cantidad de kilos"));
        
        //Proceso
        if(Nomkilos>0 && Nomkilos<=2){
            costokilo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo por kilo"));
            costo = Nomkilos * costokilo;
            JOptionPane.showMessageDialog(null, "El costo es: " + costo);

        }else if(Nomkilos>2 && Nomkilos<=5){
            costokilo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo por kilo"));
            costo = (Nomkilos * costokilo)*0.10;
            JOptionPane.showMessageDialog(null, "El costo es: " + costo);

        }else if(Nomkilos>5 && Nomkilos<=10){
            costokilo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo por kilo"));
            costo = (Nomkilos * costokilo)*0.15;
            JOptionPane.showMessageDialog(null, "El costo es: " + costo);

        }else if(Nomkilos>10){
            costokilo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo por kilo"));
            costo = (Nomkilos * costokilo)*0.20;
            JOptionPane.showMessageDialog(null, "El costo es: " + costo);

        }
        JOptionPane.showMessageDialog(null, "Gracias por comprar");
    }
    
}
