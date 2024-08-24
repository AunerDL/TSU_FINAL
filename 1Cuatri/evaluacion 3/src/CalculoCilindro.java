import javax.swing.JOptionPane;

public class CalculoCilindro {
    public static void main(String[] args) {

        //Declaracion de variables
        double A, V, R, h;
        String cadena;

        //Entradas       
        R = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de radio"));
        h = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de altura"));

        //Procedimiento
        A = Math.PI*2 * R * (h*R);
        V = Math.PI * Math.pow(R, 2) * h;

        //Salida
        cadena = "\narea" + A + "\nvolumen" + V;
        JOptionPane.showMessageDialog(null, "El valor de area y volumen es: " + cadena);
        
    }
}

