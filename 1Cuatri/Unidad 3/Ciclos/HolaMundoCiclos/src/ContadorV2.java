import javax.swing.JOptionPane;
public class ContadorV2 {
    public static void main(String[] args) {
        final int SENTINEL =0;
        int numero =0;
        int numpos =0;
        int numnega =0;
        int i =0;
  
        do{

          numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero " + i + " o 0 para cancelar"));
          i++;
          
          if(numero>=0){
            numpos++;
        }else{
            numnega++;
        }

        }while(numero!=SENTINEL);

      System.out.println("Total de numeros positivos es: " + numpos + "\nTotal de numeros negativos es: " + numnega);    
  
    }

    
}
