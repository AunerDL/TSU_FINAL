import javax.swing.JOptionPane;
public class factorial {
    public static void main(String[] args) {
        
        int N1=0;
        long factorial=1;
        boolean valor = false;

        N1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para el factorial"));

        valor = (N1==0 || N1==1)?false:true;

        if(valor){
            int a=N1;
            factorial =0;
            while(a>=N1){
                factorial*=a;
                a--;
            }
            int i=1;
            factorial = 1;
        while(i<=N1){
                factorial*=i;
                i++;
            }

            i = N1;
            factorial = 1;
            do{
                factorial*=i;
                i--;
            }while(i>=1);

            i=1;
            factorial = 1;
            do{
                factorial*=i;
                i++;
            }while(i<=N1);
            
            JOptionPane.showMessageDialog(null,"El factorial de f(" + N1 + ") es: " + factorial);
        }else{
            JOptionPane.showMessageDialog(null,"El factorial de f(" + N1 + ") es: " + factorial);
        }
    }
    
}
