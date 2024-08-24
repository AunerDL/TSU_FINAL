import javax.swing.JOptionPane;
public class Patito {
    public static void main(String[] args) {

        //Declaracion
        double numeroPer;
        double presu;

        numeroPer = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de presonas"));

        if(numeroPer<=0){
            JOptionPane.showMessageDialog(null, "Error");
        }else

        if(numeroPer>0 && numeroPer<=200){
            JOptionPane.showMessageDialog(null,"el costo por platillo por persona es de $95 de banquete");
            presu= numeroPer * 95;
            JOptionPane.showMessageDialog(null, "El presupuesto total es: " + presu);
        }else if(numeroPer>200 && numeroPer<=300){
            JOptionPane.showMessageDialog(null,"el costo por platillo por persona es de $85 de banquete");
            presu= numeroPer * 85;
            JOptionPane.showMessageDialog(null, "El presupuesto total es: " + presu);
            
        }else if(numeroPer>300){
            JOptionPane.showMessageDialog(null,"el costo por platillo por persona es de $85 de banquete");
            presu= numeroPer * 75;
            JOptionPane.showMessageDialog(null, "El presupuesto total es: " + presu);
            
        }
        JOptionPane.showMessageDialog(null, "Gracias por su preferencia");
        JOptionPane.showMessageDialog(null, "Hasta la proxima");
    }
    
}
