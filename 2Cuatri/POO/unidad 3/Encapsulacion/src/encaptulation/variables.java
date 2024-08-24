package encaptulation;

import javax.swing.JOptionPane;
public class variables {
    
    public int soliX(){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa x"));
        return x;
    }
    public int soliY(){
        int y=Integer.parseInt(JOptionPane.showInputDialog("Ingresa y"));
        return y;
    }
    public int soliA(){
        int a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa a"));
        return a;
    }
    
    //Mostrar resultados
    public void Resultado(double EKIS){
        System.out.println("El resultado es " + EKIS);
    }
    public void Error(){
        System.out.println("Datos incorrectos");
    }
}
