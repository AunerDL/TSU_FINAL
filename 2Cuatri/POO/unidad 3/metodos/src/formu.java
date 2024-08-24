public class formu {

    private double x, y, z;

    public void opera(){

        z = Math.sqrt(x)/y;

    }

    public void result(){
        opera();
        System.out.println("El resultado de z es: " + z);
    }
    
}
