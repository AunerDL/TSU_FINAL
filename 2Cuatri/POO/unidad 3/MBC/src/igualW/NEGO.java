package igualW;

public class NEGO {

    public double Formu(double x, double y){
        double R1;
        double R2;
        double R3;

        R1 = Math.cbrt(x*y)/Math.pow(x, 2);
        R2 = Math.pow(y, x)/Math.sqrt(y);
        R3 = Math.exp(x*y)/Math.pow(y,1/x);

        return R1+R2+R3;
    }
    
}

