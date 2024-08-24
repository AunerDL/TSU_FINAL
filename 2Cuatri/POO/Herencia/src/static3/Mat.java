package static3;

public class Mat {
    public static double potencia(double base, int exponente){
        return Math.pow(base, exponente);
    }
    public static double raizcuadrada(double x){
        return Math.sqrt(x);
    }
    public static double raizCubica(double base){
        return Math.pow(base, 1.0/3.0);
    }
    public static double logaritmoNatural(double x){
        return Math.log(x);
    }
    public static double logaritmoNeper(double x){
        return Math.exp(x);
    }
    public static double seno(double x){
        return Math.sin(x);
    }
    public static double coseno(double x){
        return Math.cos(x);
    }
    public static double factorial(double n){
        int f = 1;
        for(int i=1; i<n; i++){
            f=f*i;
        }
        return f;
    }
}
