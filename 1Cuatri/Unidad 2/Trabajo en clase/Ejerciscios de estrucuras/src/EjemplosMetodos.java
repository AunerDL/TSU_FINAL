import javax.swing.JOptionPane;

public class EjemplosMetodos {
    public static void main(String[] args) {
        int resta = 0;
        sumar(5, 10);
        
        resta = r (20,15);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
    }
    
    public static void sumar (int n1, int n2){
        int suma;
        suma = n1 + n2;
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        
    }

    public static int r (int n1, int n2){
        int resta;
        resta = n1 - n2;
        return resta;
    }
}
