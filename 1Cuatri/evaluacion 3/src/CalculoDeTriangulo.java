import javax.swing.JOptionPane;

public class CalculoDeTriangulo {
    public static void main(String[] args) {
        
        //Declaracion de variables
        double valor1, valor2, hip1, hipoten;
        
        //Entradas
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la variable area"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la variable base"));

        //Proceso

        hip1 = Math.pow(valor1, 2) + Math.pow(valor2, 2);
        hipoten = Math.sqrt(hip1);
        

        //Salida
        JOptionPane.showMessageDialog(null, "La hipotenusa es:" + hipoten);
    }
    
}
