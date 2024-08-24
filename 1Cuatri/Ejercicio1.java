/*Ejercicio 2.
La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual
se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del
producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un
productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo
A, se le cargan 20¢ al precio inicial cuando es de tamaño 1; y 30¢ si es de tamaño 2. Si es de
tipo B, se rebajan 30¢ cuando es de tamaño 1, y 50¢ cuando es de tamaño 2. Realice un
programa para determinar la ganancia obtenida. */

import javax.crypto.interfaces.DHPublicKey;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
    String tipo;
    double precio,Kilo;
    precio = Double.parseDouble(JOptionPane.showInputDialog("Cuanto es el precio inicial fijado? "));
    Kilo = Double.parseDouble(JOptionPane.showInputDialog("Cuantos kilos compro?  "));
     tipo = "Ingresa el tipo de uva por favor :";
     tipo =JOptionPane.showInputDialog(tipo);
     tipo = tipo.toUpperCase();
     if (tipo.equals("A")){
        A (Kilo, precio);
     }//if 
     else if (tipo.equals("B")){
        B (Kilo , precio);
     }//else if 
     else {
        JOptionPane.showMessageDialog(null,"Ingresa un valor correcto por favor");
     }

     JOptionPane.showMessageDialog(null,"Gracias por consultar :)");

    
    }//Main











public static double A(double x,double y) {
    int tamaño;
    String mensaje="";
    double r = 0.0,s;
    tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de la uva por favor : "));
        
    if (tamaño ==1){
        JOptionPane.showMessageDialog(null, "La uva tipo A de tamaño 1 tiene aumento de 20 centavos por kilo");
        s = x * .20;
        r = x * y;
        r = r + s;
        JOptionPane.showMessageDialog(null, "El precio final de la compra es: " + r );
    }//if 

    else if (tamaño == 2){
        JOptionPane.showMessageDialog(null, "La uva tipo A de tamaño 2 tiene aumento de 30 centavos por kilo");
        s = x * .30;
        r = x * y;
        r = r + s;
        JOptionPane.showMessageDialog(null, "El precio final de la compra es: " + r );

    }//if 2
    else {
        JOptionPane.showMessageDialog(null,"Ingresa un valor correcto por favor");
     }//else 

     return r;

}//A

public static double B(double x,double y) {
    int tamaño;
    String mensaje="";
    double r = 0.0,s;
    tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de la uva por favor : "));
        
    if (tamaño ==1){
    JOptionPane.showMessageDialog(null, "La uva tipo B de tamaño 1 tiene undescuento de 30 centavos por kilo");
    s = x * .30;
    r = x * y;
    r = r - s;
    JOptionPane.showMessageDialog(null, "El precio final de la compra es: " + r );
    
    }//if 

    else if (tamaño == 2){
    JOptionPane.showMessageDialog(null, "La uva tipo B de tamaño 2 tiene undescuento de 50 centavos por kilo");
    s = x * .50;
    r = x * y;
    r = r - s;
    JOptionPane.showMessageDialog(null, "El precio final de la compra es: " + r );
    }//if  2
    else {
        JOptionPane.showMessageDialog(null,"Ingresa un valor correcto por favor");
     }//else 

     return r;
}
   
}
