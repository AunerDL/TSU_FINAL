import javax.swing.JOptionPane;

public class CalculoDeMasa {
    public static void main(String[] args) {

    //Declaracionde variables y constantes
    final double C1 = 0.37;
    final double C2 = 460;

    double temp, volumen, presion, masa;

    //Entradas
    temp = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura"));
    volumen = Double.parseDouble(JOptionPane.showInputDialog("Introduce la volumen"));
    presion = Double.parseDouble(JOptionPane.showInputDialog("Introduce la presion"));

    //Proceso
    masa = presion * volumen / (C1 * (temp + C2));

    //Salida
    JOptionPane.showMessageDialog(null, "la masa es: " + masa);

    }
}
