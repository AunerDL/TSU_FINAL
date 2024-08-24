/*
 * 4)Problema 4
 * 
 * Un proveedor de estereos ofrece un descuento del 10% sobre el precio sin IVA, de algun aparato
 * si este cuesta $2000 o mas. Ademas, independientemente de esto, ofrece un 5% de descuento si 
 * la marca es "SONY". Detereminarcuanto pagara, con IVA incluido, un cliente cualquiera por la 
 * compra de su aparato.
 */

import javax.swing.JOptionPane;
public class Estereos {
    public static void main(String[] args) {

        //Declaracion de variables
        int SONY = 2499;
        int pioneer = 1849;
        int steelpro = 669;
        int kenwood = 8900;
        double IVA = 116;
        double costo, conIVA, producto, S, K;

        //Entrada
        producto = Double.parseDouble(JOptionPane.showInputDialog("¡Que estereo gusta? \n1) sony \n2) pioneer \n3) steelpro \n4) kenwood"));
        
        //Proceso
        if(producto<=0){
            JOptionPane.showMessageDialog(null, "No me hagas perder el tiempo");
        
        }else if(producto>0 && producto==1){
            S = SONY * 0.15;
                JOptionPane.showMessageDialog(null, "Su costo es: " + S);
            costo = (S * 100)/IVA;
            conIVA = costo + S;
                JOptionPane.showMessageDialog(null, "Costo con IVA es: " + conIVA);

        }else if(producto==2){
                JOptionPane.showMessageDialog(null, "Su costo es: " + pioneer);
            costo = (pioneer * 100)/IVA;
            conIVA = costo + pioneer;
                JOptionPane.showMessageDialog(null, "Costo con IVA es: " + conIVA);

        }else if(producto==3){
                JOptionPane.showMessageDialog(null, "Su costo es: " + steelpro);
            costo = (steelpro *100)/IVA;
            conIVA = costo + steelpro;
                JOptionPane.showMessageDialog(null, "Costo con IVA es: " + conIVA);

        }else if(producto==4){
            K = kenwood * 0.10;
                JOptionPane.showMessageDialog(null, "Su costo es: " + K);
            costo = (K * 100)/IVA;
            conIVA = costo + K;
                JOptionPane.showMessageDialog(null, "Costo con IVA es: " + conIVA);
            
        }
        if(producto>=1 && producto<5){
        JOptionPane.showMessageDialog(null, "Gracias por su compra");

        }else if(producto<=0){
            JOptionPane.showMessageDialog(null, "No regreses, payaso ( ˘︹˘ )");
        }

    }
    
}
