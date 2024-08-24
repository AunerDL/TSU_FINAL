package static3;

public class prueba {
    public static void main(String[] args) {
        double x = 0.5;
        double base = 2;
        int exponente = 3;
        int n = 2;
        System.out.println(Mat.potencia(base, exponente));
        System.out.println(Mat.raizcuadrada(x));
        System.out.println(Mat.raizCubica(x));
        System.out.println(Mat.logaritmoNatural(x));
        System.out.println(Mat.logaritmoNeper(x));
        System.out.println(Mat.seno(x));
        System.out.println(Mat.coseno(x));
        System.out.println(Mat.factorial(n));
    }
    
}
