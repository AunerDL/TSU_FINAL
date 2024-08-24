import javax.swing.JOptionPane;
public class operacionesAritmeticas {
    public static void main(String[] args) {
        //Decolaracion de variables
        double n1,n2,suma,resta,div,multi,modulo;
        String cadena;

        //Entradas
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2: "));

        //Operaciones 
        suma = n1 + n2;
        resta = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        modulo = n1 % n2;

        cadena = "La Suma es: " + suma + "\nLa Resta es: " + resta + 
        "\nLa Multiplicacion es: " + multi + "\nLa Division es: " + div + "\nEl Modulo es: " + modulo;

        JOptionPane.showMessageDialog(null, cadena);


    }
    }
