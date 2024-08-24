import javax.swing.JOptionPane;
public class PassingGrade {
    public static void main(String[] args) {
        //Declaracion de variables
        double calif;

        //Entradas
        calif= Double.parseDouble(JOptionPane.showInputDialog("Introduce tu calificacion"));
        //Selecion
        if (calif>=8){
            JOptionPane.showMessageDialog(null,"Estas aprovado");
        }else{
            JOptionPane.showMessageDialog(null,"Estas reprovado");
        }
        JOptionPane.showMessageDialog(null, "Gracias");
    }
    
}
