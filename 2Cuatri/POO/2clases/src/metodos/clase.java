package metodos;

import javax.swing.JOptionPane;
public class clase {

    public void date(double _a, double _b){

        double v1 = this.respu_v1(_b);
        double v2 = this.respu_v2(_a);
        double y = this.respu_y(v1, v2);
        JOptionPane.showMessageDialog(null, "El resultado es: " + y);
        
    }

    public double respu_v1(double _b){

        return Math.pow(_b, 5);

    }
    public double respu_v2(double _a){

        return Math.sqrt(Math.pow(_a, 3));

    }
    public double respu_y(double _v1, double _v2){

        return _v1/_v2;

    }
    
}
