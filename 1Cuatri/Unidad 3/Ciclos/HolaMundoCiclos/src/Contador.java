import javax.swing.JOptionPane;
public class Contador {
    public static void main(String[] args) {

      int numero =0;
      int numpos =0;
      int numnega =0;

    for(int i=1; i<=32; i++){
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero " + i));
        
        if(numero>=8){
            numpos++;
        }else{
            numnega++;
        }
    
    }
    System.out.println("Total de numeros positivos es: " + numpos + "\nTotal de numeros negativos es: " + numnega);    

    }
    
}
