 package principal;

public class calculos {

    public void datos(double _a, double _b, double _w){

        if(_a!=0 && _b!=0){

            double v1 = this.calcular_V1(_b);
            double v2 = this.calcular_V2(_a, _b);
            double v3 = this.calcular_V3(v2);
            double y = this.calcular_Y(v1, v3);
            System.out.println("El resultado de y es: " + y);

        }else{
            System.out.println("Datos no correctos");
        }

    }

    public double calcular_V1(double _w){

        return Math.pow(_w, 2);

    }

    public double calcular_V2(double _a, double _b){

        return Math.pow(_a, 2) + Math.pow(_b, 2);

    }

    public double calcular_V3(double _V2){

        return Math.sqrt(_V2);

    }

    public double calcular_Y(double _V1, double _V3){

        return _V1/_V3;

    }
    
}
