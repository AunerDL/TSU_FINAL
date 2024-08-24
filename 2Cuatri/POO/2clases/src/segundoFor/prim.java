package segundoFor;

import  javax.swing.JOptionPane;
public class prim {
    public static void main(String[] args) {
        
        double x;
        double a;
        double z;

        x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor x"));
        a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor a"));
        z = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor z"));

        clase qu = new clase();
        qu.dato(x, a, z);

    }
    
}
