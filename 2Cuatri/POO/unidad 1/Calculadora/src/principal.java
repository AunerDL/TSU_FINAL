import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        
        calculadora calcu = new calculadora();
        Scanner entra = new Scanner(System.in);

        //Solicita datos
        System.out.println("Ingresa 2 numeros");

        //Almacenar
        int resul1 = calcu.operacion(entra.nextInt(), entra.nextInt());
        int resul2 = calcu.operacion(entra.nextInt(), entra.nextInt());
        int resul3 = calcu.operacion(entra.nextInt(), entra.nextInt());
        int resul4 = calcu.operacion(entra.nextInt(), entra.nextInt());
       
        System.out.println("Tu resultado es:\n" + resul1 + "\n" + resul2 + "\n" + resul3 + "\n" + resul4 + "\n");
        

    }
    
}
