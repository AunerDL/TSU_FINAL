import javax.swing.JOptionPane;
public class arregloVol22 {
    public static void main(String[] args) {
        
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];

        for(int i=0; i<5; i++){

            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor " + (i+1) + " para arreglo a"));

        }
        for(int i=0; i<5; i++){

            b[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor " + (i+1) + " para arreglo b"));

        }

        int j=0;
        for(int i=0; i<5; i++){

            c[j] = a[i];
            j++; 
            c[j] = b[i];
            j++;

        }
        for(int mostrar:c){
            System.out.println(mostrar);
        }


    }
    
}
