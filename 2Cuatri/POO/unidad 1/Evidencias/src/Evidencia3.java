/*
En un cierto país el impuesto que se debe pagar por los artículos se calcula mediante la siguiente regla:
los primeros $20 no causan impuesto, los siguientes $20
tienen el 30% de impuesto y el resto el 40% de impuesto, pero si el costo del producto es mayor a $500, entonces en lugar del 40% se cobra el 50%.
Diseñe un programa que lea el costo básico de un artículo y calcule su
precio total (precio total = precio básico + impuesto)
 */
import javax.swing.JOptionPane;
public class Evidencia3 {
    public static void main(String[] args) {
        
        double impuest1 = 0.3, impuest2 = 0.4, impuest3 = 0.5;
        double impuestoT = 0;
        double precioT = 0, precioB = 0;
        int arti;
        String cadena = "El total es:\n\n";

        arti = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de articulos"));
        
        for(int i=1; i<=arti; i++){

            precioB =  Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del articulo " + i));
            
            if(precioB>0 && precioB<=20){
                precioT=precioB;
                
            }else if(precioB>20 && precioB<=40){
                impuestoT = (precioB-20)*impuest1;
                precioT = precioB + impuestoT;
                
                
            }else if(precioB>40 && precioB<500){
                impuestoT = 20*impuest1+(precioB-40)*impuest2;
                precioT = precioB + impuestoT;

            }else if(precioB>=500){
                impuestoT = 20*impuest1+(precioB-40)*impuest3;
                precioT = precioB + impuestoT;
                
            }

            cadena+= "El impuesto del articulo " + i + " es $" + impuestoT + "\nEl precio total del del articulo " + i + " es: $" + precioT + "\n\n";

        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
}
