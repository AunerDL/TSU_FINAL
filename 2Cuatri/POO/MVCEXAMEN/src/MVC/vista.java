package MVC;

import javax.swing.JOptionPane;
public class vista {

    public double Pedirz(){
        double z= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor de z"));
        return z;
    }

    public double Pediv(){
        double v= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor de z"));
        return v;
    }

    public void Resultado(double r){
        JOptionPane.showInputDialog(null, "El resultado es: "+r);
    }

    public void Error(){
        JOptionPane.showInputDialog(null, "Datos no validos");
    }


}