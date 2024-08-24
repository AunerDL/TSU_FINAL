package tronco;

import javax.swing.JOptionPane;
public class vista {

    public double soliP(){
        double P = Double.parseDouble(JOptionPane.showInputDialog("introduce P"));
        return P;
    }
    public double soliP2(){
        double P2 = Double.parseDouble(JOptionPane.showInputDialog("introduce P'"));
        return P2;
    }
    public double solia(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("introduce a"));
        return a;
    }
    public double soliAb(){
        double Ab = Double.parseDouble(JOptionPane.showInputDialog("introduce Ab"));
        return Ab;
    }
    public double soliAb2(){
        double Ab2 = Double.parseDouble(JOptionPane.showInputDialog("introduce Ab2"));
        return Ab2;
    }
    public double solih(){
        double h = Double.parseDouble(JOptionPane.showInputDialog("introduce h"));
        return h;
    }
    public void ResultAdo1(double A){
        JOptionPane.showMessageDialog(null,"El resultado es: " + A);
    }
    public void ResultAdo2(double V){
        JOptionPane.showMessageDialog(null,"El resultado es: " + V);
    }
    public void ErroR(){
        JOptionPane.showMessageDialog(null,"cyntax error");
    }
    
}
