import javax.swing.JOptionPane;

public class palindromos {
    public static void main(String[] args) {

        String oracion = "";
        StringBuilder reversa = new StringBuilder(oracion);
        StringBuilder revStr = reversa.reverse();

        oracion = JOptionPane.showInputDialog("Introduce una oracion o palabra");

        if(){
            JOptionPane.showMessageDialog(null, "Es palindromo: " + oracion);
        }  

    }
    
}
