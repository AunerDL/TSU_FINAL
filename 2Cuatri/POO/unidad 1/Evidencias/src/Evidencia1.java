/*
 * Dado un número entero A, haga un programa para determinar si el mismo es par, impar o nulo
 */
import javax.swing.JOptionPane;
public class Evidencia1 {
    public static void main(String[] args) {

        int A;

        A = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero en asignar"));

        if(A==0){
            JOptionPane.showMessageDialog(null, "El numero es nulo");

        }else if(A%2==0){
            JOptionPane.showMessageDialog(null, "El numero es par");

        }else{
            JOptionPane.showMessageDialog(null, "El numero es impar");

        }
        JOptionPane.showMessageDialog(null, "fin :p");
    }
    
}
