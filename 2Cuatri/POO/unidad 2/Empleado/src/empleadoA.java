import java.util.Scanner;

public class empleadoA {

    public static void main(String[] args) {
        
        empleado e = new empleado();
        Scanner entra = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = entra.nextLine();
        e.setNombre(nombre);

        System.out.println("Ingresa tu edad");
        int edad = entra.nextInt();
        e.setEdad(edad);



    }
    
}
