import javax.swing.JOptionPane;
public class constanteE {
    public static void main(String[] args) {

        int e=0;
        int resulto;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del denominador"));

       if(n>0){

        for(int i=1; i<=n; i++){
            e=+1/n;
            n++;
        }
        resulto=1+e;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resulto);

       }else{
            JOptionPane.showMessageDialog(null, "El valor n debe ser mayor a 0");
       }

    }

}
