package formulaVol2;

import javax.swing.JOptionPane;
public class prim {
    public static void main(String[] args) {

        int n = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("introduce el valor de N"));

        //instancia
        serie fus = new serie();
        fus.seri(n);

    }
    
}
