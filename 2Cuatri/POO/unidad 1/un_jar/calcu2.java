import javax.swing.JOptionPane;

public class calcu2{

	public static void main(String[] args){

		double a, b, suma, resta, multi, div, expo;
		String mensaje = "Los resultados son:\n\n";

		a= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a"));
		b= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de b"));

		suma = a+b;
		resta = a-b;
		multi = a*b;
		div = a/b;
		expo = Math.pow(a, b);

		mensaje = "La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicacion es: " + multi + "\na divicion es: " + div + "\nl exponente es: " + expo;

		JOptionPane.showMessageDialog(null, mensaje);

	}

}
