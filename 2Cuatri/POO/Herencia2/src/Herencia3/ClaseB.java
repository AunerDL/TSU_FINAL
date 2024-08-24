package Herencia3;

public class ClaseB extends ClaseA{

    public ClaseB(){
        super();
        System.out.println("Estoy en constructor de B");
    }

    @Override
    public void metodo1(){
        System.out.println(super.metodo2());
        super.metodo3();
    }

    @Override
    public void metodo4(){
        System.out.println("Dentro del metoddo 4 de B");
    }
    
}
