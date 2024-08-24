import javax.swing.JOptionPane;
public class AcumuladorV2 {
    public static void main(String[] args) {

        int tamanio;
        double numero=0.0, acum=0.0;

        tamanio = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numero es a sumar"));

        int i=0;

        do{
            numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero " + (i+1)));
            acum += numero;
            i++;  
        }while(i<tamanio);
        JOptionPane.showMessageDialog(null, "El total es: " + acum);
        
    }
    
}
