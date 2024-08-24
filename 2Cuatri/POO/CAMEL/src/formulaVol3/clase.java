package formulaVol3;

import javax.swing.JOptionPane;
public class clase {

    public void date(double _b, double _a, double _c, double _x, double _y, double _z){

        if(_b!=0 && _a!=0 && _c!=0 && _x!=0 && _y!=0 && _z!=0){

            double p1 = this.respuP1(_b, _a);
            double p2 = this.respuP2(_x, _y);
            double p3 = this.respuP3(p1, p2);
            double p4 = this.respuP4(_y, _z);
            double p5 = this.respuP5(_c);
            double p6 = this.respuP6(p4, p5);
            double q =this.respuQ(p3, p6);

            JOptionPane.showMessageDialog(null, "La respuesta es: " + q);

        }else{

            JOptionPane.showMessageDialog(null, "Datos no validos");

        }

    } 
    public double respuP1(double _b, double _a){

        return _b + Math.pow(_a, 3);

    }
    public double respuP2(double _x, double _y){

        return Math.sqrt(Math.pow((_x * _y), 2));

    }
    public double respuP3(double _p1, double _p2){

        return _p1/_p2;

    }
    public double respuP4(double _y, double _z){
        
        return Math.pow((_y*_z), 2);

    }
    public double respuP5(double _c){

        return Math.sqrt(Math.pow(_c, 6));

    }
    public double respuP6(double _p4, double _p5){

        return _p4/_p5;

    }
    public double respuQ(double _p3, double _p6){

        return Math.pow((_p3+_p6), 3);

    }
    
}
