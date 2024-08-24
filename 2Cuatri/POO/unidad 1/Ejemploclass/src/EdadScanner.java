import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EdadScanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu año de nacimiento");
        int a = entrada.nextInt();
        System.out.println("Ingresa tu mes de nacimiento");
        int m = entrada.nextInt();
        System.out.println("Ingresa tu dia de nacimiento");
        int d = entrada.nextInt();

        //Extraer los años
        Calendar fechaNac = new GregorianCalendar(a, m, d);
        Calendar fechaAtc = Calendar.getInstance();

        //Declaracion de variables
        int anoNaci = fechaNac.get(Calendar.YEAR);
        int anoAtc = fechaAtc.get(Calendar.YEAR);

        //Proceso
        int edad = anoAtc-anoNaci;

        //Salida
        System.out.println("tu edad es: " + edad);

    }
    
}
