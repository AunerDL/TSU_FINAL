import javax.swing.JOptionPane;
public class AculumacionV1 {
    public static void main(String[] args) {

        int tamanio;
        double numero=0.0, acum=0.0;

        tamanio = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numero es a sumar"));

        int i=0;
        while(i<tamanio){
            numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero" + (i+1)));
            acum += numero;
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "El total es: " + acum);
    }
    
}
