import javax.swing.JOptionPane;

public class TestGreade {
    public static void main(String[] args) {
        
        //Declaracion de variables
        double calif;
        int extra;
        
        //Entrada
        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion"));
        extra = Integer.parseInt(JOptionPane.showInputDialog("Introduce puntos extra"));

        //Seleccion
        if(extra>0){
            calif+=extra;
            JOptionPane.showMessageDialog(null, "Tu calificacion final es: " + calif);
        }

        
    }
    
}
