package resulFormu2;

public class formuResul {

    private int n;
    double x;
    double y;
    boolean bandera = true;

    public formuResul(int _n, double _x, double _y){
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
    public boolean isBandera(){
        return bandera;
    }
    public double serie(){
        double s = 0;
        int c1 = 0;
        double c2 = 0;
        double c3 = 0;

        for(int i = 0; i<n; i++){
            c1 = c1 + 2;
            c2 = c2 + 0.5;
            c3 = c3 + 0.3;

            s=s+ Math.pow(x, c2/c1) / Math.pow(y, c3);
        }
        return s;
    }
    
}
