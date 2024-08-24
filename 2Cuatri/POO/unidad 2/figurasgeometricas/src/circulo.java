public class circulo {

    private double pi, radio, area3;

    //Crear construccion
    public circulo(double _radio){

        this.pi = 3.1416;
        this.radio = _radio;

    }
    
    public void opera(){

        area3 = pi * Math.pow(radio, 2);

    }

    public void resulcircu(){

        opera();
        System.out.println("El area es " + area3);

    }
    
}
