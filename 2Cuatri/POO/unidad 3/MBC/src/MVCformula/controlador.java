package MVCformula;

public class controlador {

    public void valida(){

        vista contex = new vista();
        int a = contex.soliA();
        int b = contex.soliB();

        if(a>=0.5 && a<=1 &&
        b>=1 && b<=1.5){
            modelo cosa = new modelo(a, b);
            negocio opera = new negocio();
            double w = opera.formula(cosa.getA(), cosa.getB());
            contex.Result(w);
        }else{
            contex.Error();
        }

    }
    
}
