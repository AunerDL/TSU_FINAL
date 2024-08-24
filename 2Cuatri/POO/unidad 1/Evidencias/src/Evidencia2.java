/*
En una tienda efectúan un descuento a los clientes dependiendo del monto de la
compra. El descuento se efectúa con base en el siguiente criterio: 
Si el monto es menor que $500 — - no hay descuento. 
Si el monto está comprendido entre $500 y $1 000
inclusive —- 5% de descuento. 
Si el monto está comprendido entre $1 000 y $7 000
inclusive —* 11% de descuento. 
Si el monto está comprendido entre $7 000 y $15 000
inclusive —* 18% de descuento.
Si el monto es mayor a $15 000 —* 25% de descuento. 
Construya un programa tal que dado el monto de la compra de un
cliente, determine lo que el mismo debe pagar.
 */
import javax.swing.JOptionPane;
public class Evidencia2 {
    public static void main(String[] args) {

        double descu1 = 0.5, descu2 = 0.11, descu3 = 0.18, descu4 = 0.25;
        double pago;
        double descu;
        double monto;
        
        pago = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu monto de compra"));

        if(pago<500){
            JOptionPane.showMessageDialog(null, "Tu monto es de: $" + pago + "\nNo tienes descuento");

        }else if(pago>=500 && pago<1000){
            descu = descu1*pago;
            monto = pago - descu;
            JOptionPane.showMessageDialog(null, "Tu monto es de: $" + monto + "\nTu descuento es del 5%");
            
        }else if(pago>=1000 && pago<7000){
            descu = descu2*pago;
            monto = pago - descu;
            JOptionPane.showMessageDialog(null, "Tu monto es de: $" + monto + "\nTu descuento es del 11%");
            
        }else if(pago>=7000 && pago<15000){
            descu = descu3*pago;
            monto = pago - descu;
            JOptionPane.showMessageDialog(null, "Tu monto es de: $" + monto + "\nTu descuento es del 18%");
            
        }else if(pago>=15000){
            descu = descu4*pago;
            monto = pago - descu;
            JOptionPane.showMessageDialog(null, "Tu monto es de: $" + monto + "\nTu descuento es del 25%");
            
        }
        JOptionPane.showMessageDialog(null, "fin :p");
    }
    
}
