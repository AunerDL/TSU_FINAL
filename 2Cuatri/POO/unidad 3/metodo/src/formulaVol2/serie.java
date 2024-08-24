package formulaVol2;

public class serie {

    public void seri(int _n){

        if(_n>0){

        }else{
            System.out.println("Datos incorrectos");
        }
        
    }

    public double serie(int n){

        int c1 = 0;
        int c2 = 0;
        double s = 0;

        do{
            c1 = c1+1;
            c2 = c2+5;
            s = s + Math.pow(2, c1)/c2;
        }while(c1<n);

        return s;
    }
    
}
