package metodos;

import javax.swing.JOptionPane;
public class principal {
    public static void main(String[] args) {
        
        double a;
        double b;

        a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor b"));

        //instancia
        clase ye = new clase();
        ye.date(a, b);

    }
    
}
