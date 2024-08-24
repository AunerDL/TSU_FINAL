 import javax.swing.JOptionPane;

public class AreaCirculoV3 {
    public static void main(String[] args) {

        //Declaracion de las variables
        double radio, area;

        //Entrada
        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio "));

        //Proceso
        area = Math.PI * Math.pow(radio, 2);

        //Salida
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);


    }
}
