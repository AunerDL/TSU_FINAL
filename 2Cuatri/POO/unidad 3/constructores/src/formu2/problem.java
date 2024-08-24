package formu2;

import javax.swing.JOptionPane;
public class problem {

    private double n;
    double x;
    double y;
    boolean bandera = true;

    public problem(double _n, double _x, double _y){

        _n = Double.parseDouble(JOptionPane.showInputDialog("INtroduce el valor de n"));
        _x = Double.parseDouble(JOptionPane.showInputDialog("INtroduce el valor de x"));
        _y = Double.parseDouble(JOptionPane.showInputDialog("INtroduce el valor de y"));
        if(_n>0){
            if(_x>=1 && _x<=5){
                if(_y>=1 && _y<=2){
                    this.n=_n;
                    this.x=_x;
                    this.y=_y;
                }else{
                    System.out.println("y es de 1 a 2");
                }
            }else{
                System.out.println("x es de 1 a 5");
            }
        }else{
            System.out.println("n debe ser mayor a 0");
        }

    }

    public boolean bandera(){
        return bandera;
    }

    public double ope(){
        double s=0;
        double c1=0;
        double c2=0;
        double c3=0;
        double r1=0;
        double r2=0;
        for(int i=1; i<=n; i++){
            
            r1 += Math.pow(x, c1/c3);
            r2 += Math.pow(y, c2);
            s+=r1/r2;
            c1+=0.5;
            c2+=0.3;
            c3+=2;
            
        }
        return s;
    }
    
}
