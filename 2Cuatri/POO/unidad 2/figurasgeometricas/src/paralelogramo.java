public class paralelogramo {

    private double perimetro, altura2, area2;

    //Crear construccion
    public paralelogramo(double _perimetro, double _altura2){

        this.perimetro = _perimetro;
        this.altura2 = _altura2;

    }
    
    public void opera(){

        area2 = (perimetro * altura2)/2;

    }

    public void resulpara(){ 

        opera();
        System.out.println("El area es " + area2);

    }
    
}
