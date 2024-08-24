package segundoFor;

import javax.swing.JOptionPane;
public class clase {

    public void dato(double _x, double _a, double _z){

        if(_x!=0 && _a!=0 && _z!=0){

            double V1 = this.resul_V1(_x);
            double V2 = this.resul_V2(_a, _z);
            double q = this.resul_q(V1, V2);
            JOptionPane.showMessageDialog(null, "El resultado es: " + q);

        }else{
            System.out.println("valores no validos");
        }

    }
    public double resul_V1(double _x){

        return Math.sqrt(Math.pow(_x, 2));

    }
    public double resul_V2(double _a, double _z){

        return Math.pow(_a, 3) + Math.pow(_z, 5);

    }
    public double resul_q(double _V1, double _V2){

        return _V1/_V2;

    }
    
}
