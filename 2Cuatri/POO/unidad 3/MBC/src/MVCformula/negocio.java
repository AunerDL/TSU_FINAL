package MVCformula;

public class negocio {

    public double formula(int a, int b){
        
        double t1 = Math.sin((a * b));
        double t2 = Math.cos(Math.pow(a, 0.5)/(b*Math.sqrt(2)));
        double R1 = t1/t2;

        double R2 = Math.PI/2;

        double v1 = Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)));
        double v2 = Math.exp(0.5);
        double R3 = v1/v2;

        double r1 = Math.sqrt(2 * Math.PI)*5;
        double r2 = (a * b)*Math.cbrt(a) ;
        double R4 = r1/r2;

        return R1 + R2 + R3 - R4;

    }
    
}
