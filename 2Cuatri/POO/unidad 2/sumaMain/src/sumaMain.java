import java.util.Scanner;
public class sumaMain {
    public static void main(String[] args) {
        
        Scanner entra = new Scanner(System.in);
        //Solicitar datos de entrada
        System.out.println("Ingresa el primer valor");
        //Guardar dato
        double  valor1 = entra.nextDouble();

        System.out.println("Ingresa el segundo valor");
        double valor2 = entra.nextDouble();

        //Instancia
        suma valores = new suma(valor1, valor2);

        valores.mostrar();

    }
    
}
