import javax.swing.JOptionPane;

public class Variables {
  public static void main(String[] args) {

    //Declaracion de varables
    double n1 = 0.0;
    double n2 = 0.0;
    double div;

    //Entradas
    n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 1"));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2"));

    //Proceso
    div = n1/n2;

    //Salida
    JOptionPane.showMessageDialog(null,"La divicion es: " + div); 
  }
}
