/*
 * 3)Problema 3
 * 
 * En un juego de preguntas a las que se responde "Si" o "No" gana quien responda correctamente las tres preguntas. 
 * Si se responde mal a cualquiera de ellas ya no se pregunta la siguiente y termina el juego. Las preguntas son: 
 * 1. Colon descubrió América? 
 * 2. La independencia de México fue en el año 1810? 
 * 3. The Doors fue un grupo de rock Americano?
 */

import javax.swing.JOptionPane;
public class Juego {
    public static void main(String[] args) {

        //Declaracion de variables
        String pregu1 = "si", pregu2 = "no";
       
        //Proceso
        pregu1 = JOptionPane.showInputDialog("¿Colon descubrio America? \nintroduce la respuesta si o no");
        if(pregu1.equalsIgnoreCase("si")&&pregu2.equalsIgnoreCase("no")){

            pregu1 = JOptionPane.showInputDialog("¿La independencia de Mexico fue en el año 1810? \nintroduce la respuesta si o no");
            if(pregu1.equalsIgnoreCase("si")&&pregu2.equalsIgnoreCase("no")){
                
                pregu1 = JOptionPane.showInputDialog("¿The Doors fue un grupo de rock Americano? \nintroduce la respuesta si o no");
                if(pregu1.equalsIgnoreCase("si")&&pregu2.equalsIgnoreCase("no")){
                    
                }else{
                    JOptionPane.showMessageDialog(null, "menudo sin cultura");
                }

            }else{
                JOptionPane.showMessageDialog(null, "bobo o k");
            }

        }else{
            JOptionPane.showMessageDialog(null, "chilla por tonto");
        }
        JOptionPane.showMessageDialog(null, "fin :3");

    }
    
}
