import java.util.Calendar;
import java.util.GregorianCalendar;

public class Edad {
    public static void main(String[] args) {

        //Extraer los años
        Calendar fechaNac = new GregorianCalendar(2004, 05, 11);
        Calendar fechaAtc = Calendar.getInstance();

        //Declaracion de variables
        int anoNaci = fechaNac.get(Calendar.YEAR);
        int anoAct = fechaAtc.get(Calendar.YEAR);
        
        //Proceso
        int edad = anoAct - anoNaci;

        //Salida
        System.out.println("Tu edad es: " + edad);
    }
    
}
