import java.util.Scanner;
import libreria.funciones.*;   
public class Programadores_Samsumg {
    public static void main(String[] args) {
        
        Scanner entra = new Scanner(System.in);

        int kilos=entra.nextInt();
        System.out.println("Elige el tipo de ropa\n1: ropa blanca\n2: ropa de color");
        int tipoRopa=entra.nextInt();

        funciones val=new funciones(tipoRopa, kilos);
        val.cicloFinalizar();

    }
    
}
