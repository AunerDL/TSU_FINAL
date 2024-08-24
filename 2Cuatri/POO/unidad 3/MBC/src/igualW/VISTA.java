package igualW;

import javax.swing.JOptionPane;
public class VISTA {

    public int soliciX(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce X"));
        return x;
    }
    public int soliciY(){
        int y = Integer.parseInt(JOptionPane.showInputDialog("Introduce Y"));
        return y;
    }
    public void Resultado(double w){
        JOptionPane.showMessageDialog(null,"El resultado es: " + w);
    }
    public void ERROR(){
        JOptionPane.showMessageDialog(null,"cyntax error");
    }

    
}
