package problema1;

import javax.swing.JOptionPane;
public class cass {

    private double a, b, c, l;
    
    public cass(double _a, double _b, double _c, double _l){ 

    _a = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de a")); 
    _b = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de b"));
    _c = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de c"));

        if(_a>=1 && _a<=2){
            if(_b>=0.5 && _b<=1){
                if(_c>=5 && _c<=6){
            this.a = _a;
            this.b = _b;
            this.c = _c;
            this.l = _l;
                }else{
                    System.out.println("el valor de c es incorrecto");
                }
            }else{
                System.out.println("el valor de b es incorrecto");
            }
        }else{
            System.out.println("el valor de a es incorrecto");
        }
        
    }
    private double R1(double a, double b, double c, double l){
        double resu = Math.pow(a, 2) + Math.pow(b, 2) + (l/c);
        return Math.sqrt(resu);
    }
    private double R2(){
        return this.R1(a, b, c, l)/Math.pow(this.a, this.b);
    }
    private double R3(){
        double rel = (this.a * this.b)/this.c;
        return Math.cbrt(rel);
    }
    public double t(){
        return this.R2()+this.R3();
    }
    
}
