public class triangulo {

    private double base1, altura1, area1;

    //Crear construccion
    public triangulo(double _base1, double _altura1){

        this.base1 = _base1;
        this.altura1 = _altura1;

    }
    
    public void opera(){

        area1 = (base1 * altura1)/2;

    }

    public void resultri(){

        opera();
        System.out.println("El area es " + area1);

    }
    
}
