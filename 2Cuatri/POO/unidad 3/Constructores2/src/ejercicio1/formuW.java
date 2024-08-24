package ejercicio1;

import javax.swing.JOptionPane;
public class formuW {

    double a=1.3;
    double b=0.10;
    double PI=3.1416;

    public formuW(double _a, double _b, double _e, double _PI){

        _a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de a"));
        _b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de b"));
        
        if(_a>=0.5 && _a<=1 &&
            _b>=1 && _b<=1.5){

            this.a=_a;
            this.b=_b;
            this.PI=_PI;
        
        }else{
            System.out.println("Datos no validos");
        }
                                                                                                                                                                           
    }

    public double resul1(double _R1){
        double t1 = Math.sin((this.a*this.b));
        double t2 = Math.cos(Math.pow(this.a, 0.5)/(this.b*Math.sqrt(2)));
        return _R1 = t1/t2;
    }

    public double resul2(double _R2){
        return _R2 = this.PI/2;
    }

    public double resul3(double _R3){
        double v1 = Math.sqrt((Math.pow(this.a, 2)+Math.pow(this.b, 2)));
        double v2 = Math.exp(0.5);
        return _R3 = v1/v2;
    }

    private double resul4(double _R4){
        double r1 = Math.pow(Math.sqrt(2*this.PI), 5);
        double r2 = (this.a*this.b)*Math.cbrt(this.a) ;
        return _R4 = r1/r2;
    }

    public double w(){
        double _w = this.resul1(PI)+ this.resul2(PI)+ this.resul3(PI)+ this.resul4(PI);
        return _w;
    }
    
}
