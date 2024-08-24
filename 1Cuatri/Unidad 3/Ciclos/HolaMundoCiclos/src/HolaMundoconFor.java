import javax.swing.JOptionPane;
public class HolaMundoconFor {
public static void main(String[] args) {
    

    int numeroSaludos;

    numeroSaludos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de saludos"));



    for(int i=1; i<=numeroSaludos; i++){
    System.out.println("Hola mundo");

}

JOptionPane.showMessageDialog(null, "Gracias por participar");

}

    
}
