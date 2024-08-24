import javax.swing.JOptionPane;

public class arregloVol3 {
    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog("Ingresa numeros divididos con una coma");

        //Comas
        String numerosText[] = texto.split(",");
        //Espacios
        int cantidad = numerosText.length;
        //Arreglo
        int numeros[] = new int [cantidad];

        for(int i=0; i<cantidad; i++){

            numeros[i] = Integer.parseInt(numerosText[i]);

        }

        int mayor = 0;
        //bucle para el mayor
        for(int mostrar:numeros){

            if(mostrar>mayor){

                mayor= mostrar;

            }

        }

        JOptionPane.showMessageDialog(null, mayor);

    }
    
}
