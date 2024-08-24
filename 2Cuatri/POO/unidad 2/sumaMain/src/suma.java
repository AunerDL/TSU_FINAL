public class suma {
    private double valor1, valor2, res1;

    
    public suma(double _valor1,double _valor2){

        this.valor1 = _valor1;
        this.valor2 = _valor2;

    }

    public void operacion(){

        res1 = valor1 + valor2;

    }

    public void mostrar(){

        operacion();
        System.out.println("El resultado " + res1);

    }
    
}
