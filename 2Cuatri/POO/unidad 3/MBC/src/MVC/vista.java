package MVC;
import javax.swing.JOptionPane;

//solicuitarv o mostrar datos
public class vista {

    public int soliX(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa X"));
        return x;
    }

    public int soliY(){
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Y"));
        return y;
    }

    public void Result(double z){
        JOptionPane.showMessageDialog(null, "El resultado es " + z);
    }

    public void Error(){
        JOptionPane.showMessageDialog(null, "Datos no validos" );
    }
    
}
