package tronco;

public class modelo {

    private double P, P2, a, Ab, Ab2, h;

    public modelo(double P, double P2, double a, double Ab, double Ab2, double h){
        this.P=P;
        this.P2=P2;
        this.a=a;
        this.Ab=Ab;
        this.Ab2=Ab2;
        this.h=h;
    }
    public double getP(){
        return P;
    }
    public double getP2(){
        return P2;
    }
    public double geta(){
        return a;
    }
    public double getAb(){
        return Ab;
    }
    public double getAb2(){
        return Ab2;
    }
    public double geth(){
        return h;
    }
    
}
