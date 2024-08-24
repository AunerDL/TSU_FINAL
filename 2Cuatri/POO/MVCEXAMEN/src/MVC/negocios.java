package MVC;

public class negocios {

    public double Formula(double z, double v){

        double p1=0;
        double p2=0;
        double p3=0;
        double r=0;

        p1= Math.cbrt(Math.pow(z, v))/Math.pow(z, 2);
        p2= Math.pow(v, z)/Math.sqrt(v);
        p3= Math.exp(z*v)/Math.pow(v, 1/z);
        r= p1+p2+p3;
        
        return r;

    }


    
}
