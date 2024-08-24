package Herencia3;

public abstract class ClaseA {

    public ClaseA(){
        System.out.println("Dentro del constructor A");
    }

    public abstract void metodo1();

    public int metodo2(){
        return 3;
    }

    public void metodo3(){
        System.out.println("dentro de metodo 3 de A");
    }

    public abstract void metodo4();
    
}
