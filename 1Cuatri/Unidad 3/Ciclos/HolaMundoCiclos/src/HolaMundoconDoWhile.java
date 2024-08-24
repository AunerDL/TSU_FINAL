import javax.swing.JOptionPane;
public class HolaMundoconDoWhile {
public static void main(String[] args) {

    int numeroSaludos;

    numeroSaludos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de saludos"));

    int j = 1;
    do{
        System.out.println("hola mundo");
        j++;
    }while(j<=numeroSaludos);

    JOptionPane.showMessageDialog(null, "Gracias por participar");

}
    
    
}
