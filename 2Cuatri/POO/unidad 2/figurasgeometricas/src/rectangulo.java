public class rectangulo {

    private double base, altura, area;

    //Crear construccion
    public rectangulo(double _base, double _altura){

        this.base = _base;
        this.altura = _altura;

    }
    
    public void opera(){

        area = base * altura;

    }

    public void result(){

        opera();
        System.out.println("El area es " + area);

    }

}
