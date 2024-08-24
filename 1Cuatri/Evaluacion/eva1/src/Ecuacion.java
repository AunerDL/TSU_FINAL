import javax.swing.JOptionPane;
public class Ecuacion {
    public static void main(String[] args) {

        String obcion = "";

        obcion = JOptionPane.showInputDialog("¿Que tipo de problema quieres?\n1) Ecuacion\n2) Pato");

        if(obcion.equalsIgnoreCase("Ecuacion")){
            
            double a, b, x;
            double res1, res2, res3, y;
            
            a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor a")); 
            b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor b")); 
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor x")); 

                if((x>0) && (a>=0.5 && a<=2.8) && (b>=-0.5 && b<=2.5)){

                    res1 = (Math.pow(a,2) + Math.pow(b,3));
                    res2 = res1 / (Math.sqrt(x));
                    res3 = Math.pow(((2*x)+(3*a*b)),3);
                    y = res2 + res3;

                    JOptionPane.showMessageDialog(null, "La respuesta es: " + y );

                }else{

                    JOptionPane.showMessageDialog(null, "Errror");

                }  

        }else if(obcion.equalsIgnoreCase("Pato")){

            double numeroPer;
            double presu;

            numeroPer = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de presonas"));

            if(numeroPer<=0){
                JOptionPane.showMessageDialog(null, "Error");
            }else

            if(numeroPer>0 && numeroPer<=200){
                JOptionPane.showMessageDialog(null,"el costo por platillo por persona es de $95 de banquete");
                presu= numeroPer * 95;
                JOptionPane.showMessageDialog(null, "El presupuesto total es: " + presu);

            }else if(numeroPer>200 && numeroPer<300){
                JOptionPane.showMessageDialog(null,"el costo por platillo por persona es de $85 de banquete");
                presu= numeroPer * 85;
                JOptionPane.showMessageDialog(null, "El presupuesto total es: " + presu);
            
            }else if(numeroPer>=300){
                JOptionPane.showMessageDialog(null,"el costo por platillo por persona es de $85 de banquete");
                presu= numeroPer * 75;
                JOptionPane.showMessageDialog(null, "El presupuesto total es: " + presu);
            
            }
            JOptionPane.showMessageDialog(null, "Gracias por su preferencia");
            JOptionPane.showMessageDialog(null, "Hasta la proxima");
        }

        
        
    }
    
}
