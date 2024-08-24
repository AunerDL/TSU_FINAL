package tronco;

public class negocios {

    public double FormulaA(double P, double P2, double a, double Ab, double Ab2){

        return (((P+P2)/2)*a+Ab+Ab2);

    }
    public double FormulaV(double Ab, double Ab2, double h){

        return ((Ab+Ab2+Math.sqrt(Ab*Ab2))*h)/3;

    }
    
}
