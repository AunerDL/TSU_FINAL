import javax.swing.JOptionPane;

public class ConversionKGLibras {
    public static void main(String[] args) {
        //Declaracion de Constantes y variables
        final double FACTOR_CONVERSION =0.454;
        double valorKg1 = 10, valorKg2 = 50, valorKg3 = 100;
        double valorLibras1, valorLibras2, valorLibras3;
        String cadena;


        //Entradas

        //Proceso

        valorLibras1= valorKg1/FACTOR_CONVERSION;
        valorLibras2= valorKg2/FACTOR_CONVERSION;
        valorLibras3= valorKg3/FACTOR_CONVERSION;

        cadena = valorKg1 + "kg son" + valorLibras1 + "Libras.\n" + 
        valorKg2 + "kg son" + valorLibras2 + "Libras.\n" +
        valorKg3 + "kg son" + valorLibras3 + "Libras";

        JOptionPane.showConfirmDialog(null, cadena);
        

    }
    
}
