package formu;

import javax.swing.JOptionPane;
public class formu {
    private int n;
    boolean bandera = true;
    
    public formu(int _n){

        _n =Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de"));
        if(n>0){
            this.n=_n;
        }else{
            System.out.println("datos no validos");
            bandera = false;
        }
    }

    public boolean bandera(){
        return bandera;
    }
    
    public double suma(){
    double s=0;
    int c2=0;
    int c3=0;
    
        for (int c1 = 0; c1 < n; c1++) {
      
            c3+=5;
            c2+=2;
            s+= Math.exp(c2)/Math.sqrt(c3);
            
        }
        return s;
    }
    
    
}
