import javax.swing.JOptionPane;
public class formuVol2 {
    public static void main(String[] args) {

        int e=0;
        int resultado;
        int x;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de x"));

        Math.pow(x, 2);

       if(n>0){

        for(int i=1; i<=n; i++){
            e=+1+x/n;
            n++;
        }
        resultado=1+e;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

       }else{
            JOptionPane.showMessageDialog(null, "El valor n debe ser mayor a 0");
       }
       
    }
    
}
