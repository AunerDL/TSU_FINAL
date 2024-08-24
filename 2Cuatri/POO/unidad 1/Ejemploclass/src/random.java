import java.util.Random;

import javax.swing.JOptionPane;

public class random {

    public static void main(String[] args) {

        //Random
    Random rand = new Random();

    //Declaracion de variables
    int da1 = rand.nextInt(6)+1;
    int da2 = rand.nextInt(6)+1;
    int da3 = rand.nextInt(6)+1;
    String cadena = "Tiros totales:\n\n";
    String mensage = "";
    int tiradas;

    System.out.println(da1);
    System.out.println(da2);
    System.out.println(da3);

    tiradas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas tiradas vas hacer?"));

        for(int i=1; i<=tiradas; i++){

            if(da1==6){
                if(da2==6){
                    if(da3==6){
                        mensage = "tiro Excelente";
                    }else{
                        mensage = "tiro Bueno";
                    }
                }else{
                    if(da3==6){
                        mensage = "tiro Bueno";
                    }else{
                        mensage = "tiro Regular";
                    }
                }
            }else{
                if(da2==6){
                    if(da3==6){
                        mensage = "tiro Bueno";
                    }else{
                        mensage = "tiro Regular";
                    }
                }else{
                    if(da3==6){
                        mensage = "tiro Regular";
                    }else{
                        mensage = "tiro Fatal";
                    }
                }
            }
            cadena += "Tiro " + i + ":\n" + da1 + ", " + da2 + ", " + da3 + ", " + mensage + "\n";
            JOptionPane.showMessageDialog(null, cadena);
        }
        
    }

}
