package MVCformula;

import javax.swing.JOptionPane;
public class vista {

    public int soliA(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa A"));
        return a;
    }

    public int soliB(){
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa B"));
        return b;
    }

    public void Result(double w){
        JOptionPane.showMessageDialog(null, "El resultado es " + w);
    }

    public void Error(){
        JOptionPane.showMessageDialog(null, "Datos no validos" );
    }
    
}
