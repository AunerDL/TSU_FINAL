import javax.swing.JOptionPane;

public class CalculoCono {
    public static void main(String[] args) {
        
        //Declaracon de variables
            double A, V, R, g, h;
            String cadena;

        //Entradas
            R = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de radio"));
            g = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la geratriz"));
            h = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de altura "));

        //Procedimiento
            A = Math.PI * R * (R+g);
            V = Math.PI * Math.pow(R,2) * h /3;

        //Salida
            cadena = "\narea" + A + "\nvolumen" + V + "\ngeneratriz" + g;
            JOptionPane.showMessageDialog(null, " El area, el volumen y la generatriz son: " + cadena);

    }
    
}
