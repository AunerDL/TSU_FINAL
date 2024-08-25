/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenmatriz;
import javax.swing.JOptionPane;

/**
 *
 * @author gabod
 */
public class ExamenMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String opcion = "Elige una opcion:\n";
        
        String[] Tiempos = {"Mañana", "Medio dia", "Noche"};
        String[] Lugares = {"Cancun", "CDMX", "Los Cabos","Mazatlan","Puerto Vallarta"};

        Vuelos arreglos = new Vuelos(Tiempos, Lugares);
        
        opcion +=""
        JOptionPane.showInputDialog(opcion)
            
        switch (opcion) {
            case 1:
                
                break;
            case 2:
                
                break;
            default:
                System.out.println("Opción no válida.");
            
    }
        
    }
        // TODO code application logic here
}
