import javax.swing.JOptionPane;
public class SentinelaAcumulador {
    public static void main(String[] args) {
        
        final int SENTINEL=0;
        double numero=0.0, total=0.0;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero o 0 para terminar"));

        while(numero!=SENTINEL){
            total += numero;
            numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el siguiente numero o 0 para terminar"));

        }
        JOptionPane.showMessageDialog(null, "El total es: " + total);
        
    }
    
}