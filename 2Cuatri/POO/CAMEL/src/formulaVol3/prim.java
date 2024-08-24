package formulaVol3;

import javax.swing.JOptionPane;
public class prim {
    public static void main(String[] args) {
        
        double b;
        double a;
        double c;
        double x;
        double y;
        double z;
    
        a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de c"));
        x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y"));
        z = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de z"));

        clase form  = new clase();
        form.date(b, a, c, x, y, z);

    }
    
}
