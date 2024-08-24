import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
    //Variables
    Double UL,U,x,R0,RL;

    //PROCESO 
    U = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de U "));
    x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de x (Intervalo cerrado de 0.5,1) "));
    if (x >= 0.5 && x <= 1) {
    R0 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de R0 (Intervalo cerrado de [10,12]) "));
    if (R0 >= 10 && x <= 12){
    RL = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de RL (Intervalo cerrado de [10,12]) "));
    if (RL >= 10 && x <= 12){

        UL = x - Math.pow(x, 2);
        UL = (R0 / RL ) * (UL);
        UL = UL + 1;
        UL = x / UL;
        UL = U * UL;

        JOptionPane.showMessageDialog(null,"La tencion de carga es:  " + UL );


      }//if rl
      else {
        JOptionPane.showMessageDialog(null, "Ingresa un valor establecido por favor");
    }//else rl
    

    }//if r0
    else {
        JOptionPane.showMessageDialog(null, "Ingresa un valor establecido por favor");
    }//else r0
    
    }// if x
    else {
        JOptionPane.showMessageDialog(null, "Ingresa un valor establecido por favor");
    }// else x
  
    JOptionPane.showMessageDialog(null,"Gracias por Utilizar el programa :)");
}
    
}
