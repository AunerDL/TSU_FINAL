/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje1;
import javax.swing.JOptionPane;

/**
 *
 * @author gabod
 */
public class Alumnos {
    
    public double calificaciones [][];
    
    public int [] cantidadAlumnos(int canlificaciones) {
        JOptionPane.showMessageDialog(null, "Ingresa el numero de alumnos");
    }
    
    public String Imprimir() {
        String salida ;
        for (int i = 0; i < calificaciones.length; i++) {
            salida += destinos[i] + "                 ";
            for (int j = 0; j < calificaciones[0].length; j++) {
                salida += calificaciones[i][j] + "               ";
            }

            salida += "\n";
        }
        return salida;
    }
    public void llenarTablero() {
        boolean sentinel = false;
        for(int i=0; i<this.calificaciones.length; i++){
            for(int j=0; j<this.calificaciones[0].length; j++){
                
                do{
                    try{
                       this.calificaciones[i][j] = Integer.parseInt(
                       JOptionPane.showInputDialog("Introduce un valor"));
                       sentinel = false;
                    }catch(NumberFormatException e){
                        sentinel = true;
                        JOptionPane.showMessageDialog(null, "El valor debe ser entero");
                    }
                }while(sentinel);
            }
        }
    }
 
}
