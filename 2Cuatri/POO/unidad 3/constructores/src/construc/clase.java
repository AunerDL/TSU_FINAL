package construc;

public class clase {

    private double radio, h;

    public clase(double _radio, double _h){
        this.radio=_radio;
        this.h=_h;
    }

    private double calcularArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularVolumen(){
        return this.calcularArea(radio)*h;
    }
    
}
