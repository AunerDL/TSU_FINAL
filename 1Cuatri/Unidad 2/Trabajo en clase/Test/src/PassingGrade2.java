import javax.swing.JOptionPane;
public class PassingGrade2 {
    public static void main(String[] args) {
        double calif;
        String mensaje;

        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion"));

        if(calif<8){
            mensaje = "No estas aprovado";
        }else{
            mensaje = "Estas aprovado";
        }
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
    
}
