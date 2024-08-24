import javax.swing.JOptionPane;

public class Converciones {
    public static void main(String[] args) {
       
        //Declaracion de variales y constantes

        final int FACTOR_YARDAS = 3;
        final double FACTOR_CM = 2.54;
        final double FACTOR_METROS = 100;
        final int FACTOR_PULGADAS = 12;
        double pies, yardas, metros, centimetros, pulgadas;
        String resultado;

        //Entradas
        pies = Double.parseDouble(JOptionPane.showInputDialog("INtroduce el valor de pies"));

        yardas = pies/FACTOR_YARDAS;
        pulgadas = pies * FACTOR_PULGADAS;
        centimetros = pulgadas * FACTOR_CM;
        metros = centimetros/FACTOR_METROS;
        
        //Salida 
        resultado = pies + "pies m: " + "\nyardas = " + yardas + 
        "\npulgadas = " + pulgadas + "\ncentimetros = " + centimetros + 
        "\nmetros = " + metros;
        JOptionPane.showMessageDialog(null, resultado);

    }
    
}
