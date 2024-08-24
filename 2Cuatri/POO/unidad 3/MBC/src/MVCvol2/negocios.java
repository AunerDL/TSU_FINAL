package MVCvol2;

public class negocios {

        double s = 0;
        double c1 = 0.5;
        double c2 = 3;
        double c3 = 2;

    public double cicloFormula(int n){

        vista num = new vista();

        for(int i=0; i<num.soliN(); i++){
            
            c1 = c1 + 0.5;
            c2 = c2 + 3;
            c3 = c3 + 2;

            s=s+ Math.pow(c2, c1) / Math.sqrt(c3);
        }
        return s;

    }
    
}
