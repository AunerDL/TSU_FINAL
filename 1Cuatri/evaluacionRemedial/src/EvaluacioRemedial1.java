import javax.swing.JOptionPane;

public class EvaluacioRemedial1 {
    public static void main(String[] args) {

        //Declaracio0n de variable
        double x, e;

        //Entradas
    
        x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor x"));

        //Proceso

        e = Math.exp(Math.sin(x)) + Math.cos(Math.exp(x)) + Math.exp(2);

        //Salida

        JOptionPane.showMessageDialog(null, "El resultado es: " + e);
 
    }
    
}
