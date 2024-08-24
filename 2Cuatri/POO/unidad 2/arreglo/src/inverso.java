import java.util.Scanner;

public class inverso {
    public static void main(String[] args) {
        
        String palabra = "";
        int longitud = 0;
        String palaInve = "";

        Scanner entra = new Scanner(System.in);

        System.out.println("Ingresa la palabra");

        palabra = entra.nextLine();
        longitud = palabra.length();

        while(longitud != 0){
            //substring divide la palabra en caracteres
            palaInve+=palabra.substring(longitud-1, longitud);
            longitud--;

        }

        System.out.println(palaInve);

    }
    
}
