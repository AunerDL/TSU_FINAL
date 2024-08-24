package MVCvol2;

import javax.swing.JOptionPane;
public class vista {

    public int soliN(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de bueltas"));
        return n;
    }

    public void finalReul(double S){
        JOptionPane.showMessageDialog(null, "El resultado es " + S);
    }

    public void Falla(){
        JOptionPane.showMessageDialog(null, "Datos no validos" );
    }
    
}
