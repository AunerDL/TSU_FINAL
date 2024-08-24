import java.util.Scanner;

import javax.swing.JOptionPane;

public class empleado {
    public static void main(String[] args) {
        
        empleado e = new empleado();
        Scanner entra = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre= entra.nextLine();
        e.setNombre(nombre);

        System.out.println("Ingresa tu edad");
        int edad= entra.nextInt();
        e.setEdad(edad);

        JOptionPane.showMessageDialog(null, "Nombre" + e.getNombre() + "Edad" + e.getEdad());;

    }
    
}
