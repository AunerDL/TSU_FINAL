package static4;

import javax.swing.JOptionPane;

public class vista {
    public double solicitarA(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el vañlor de a"));
        return a;
    }
    public double solicitarB(){
        double b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el vañlor de B"));
        return b;
    }
    public double solicitarN(){
        double n = Double.parseDouble(JOptionPane.showInputDialog("Introduce el vañlor de N"));
        return n;
    }
    public void resultado(double z){
        JOptionPane.showInputDialog(null, "Z = " + z);
    }
    public void Error(){
        JOptionPane.showInputDialog(null, "ERROR");
    }
    
}
