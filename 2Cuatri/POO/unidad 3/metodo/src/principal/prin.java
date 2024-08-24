package principal;

import javax.swing.JOptionPane;
public class prin {

    public static void main(String[] args) {

    double a = 0;
    double b = 0;
    double w = 0;

    a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de a"));
    b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de b"));
    w = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de w"));

    //instanciar
    calculos ba = new calculos();
    ba.datos(a, b, w);

    }
    
}
