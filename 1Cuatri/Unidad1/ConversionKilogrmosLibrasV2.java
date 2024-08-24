import javax.swing.JOptionPane;

public class ConversionKilogrmosLibrasV2 {
    public static void main(String[] args) {
        //Declarar Variables y Constantes
        final double FACTOR_CONVERSION = 0.454;
        double Kilogramos = 0.0;
        double valorlibras = 0.0;

        //PRoceso
        Kilogramos = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Valor de kilogramos"));
        valorlibras = Kilogramos/FACTOR_CONVERSION;
        JOptionPane.showMessageDialog(null, "El valor de libras es: "+ valorlibras);



    }
}
