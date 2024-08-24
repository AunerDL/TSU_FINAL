import javax.swing.JOptionPane;
public class Serie {
    public static void main(String[] args) {

        int n, expo =3;
        double s =0;
        long factorial = 1;

        do{
            n = Integer.parseInt(JOptionPane.showInputDialog( "Introduce el numero"));
        }while(!(n>=1 && n<=20));
     
        if(n>1){
            int i=1;
            do{
                int j=1;
                while(j<=i){
                    factorial*=j;
                    j++;
                }
                s+=Math.exp(expo)/factorial;
                expo+=3;
                factorial = 1;
                i++;
            }while(i<n);
        }
        JOptionPane.showMessageDialog(null, "la solucion es: " + s);
        System.out.println(Math.exp(3));
    }
    
}
