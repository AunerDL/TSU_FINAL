import javax.swing.JOptionPane;

public class Sexo2 {
    public static void main(String[] args) {
        String sexo;
        sexo = JOptionPane.showInputDialog(null, "Introduce sexo");

        if(sexo.equalsIgnoreCase( "Femenino")){
            System.out.println("Eres mujer");
        }else{
            System.out.println("No eres mujer");
        }
        System.out.println("Gracias...");

    }
    
}
