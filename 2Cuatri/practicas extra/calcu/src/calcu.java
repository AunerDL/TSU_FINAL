import javax.swing.JOptionPane;

public class calcu {
    public static void main(String[] args){

		double a=3, b=7, suma, resta, multi, div, expo;
		String mensaje = "Los resultados son:\n\n";

		suma = a+b;
		resta = a-b;
		multi = a+b;
		div = a+b;
		expo = a+b;

		mensaje = "La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicacion es: " + multi + "La divicion es: " + div + "el exponente es: " + expo;

		JOptionPane.showMessageDialog(null, mensaje);	

	}

}
    

