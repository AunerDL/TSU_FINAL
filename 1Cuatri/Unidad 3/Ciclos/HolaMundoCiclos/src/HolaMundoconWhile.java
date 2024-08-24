import javax.swing.JOptionPane;

public class HolaMundoconWhile {
    public static void main(String[] args) {
        
        int numeroSaludos;

        numeroSaludos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de saludos"));

        int j = 1;
        while(j<=numeroSaludos){
            System.out.println("hola mundo");
            j++;
        }
        JOptionPane.showMessageDialog(null, "Gracias por participar");
    }
    
}
