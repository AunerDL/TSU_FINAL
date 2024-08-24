public class calculodeVaso {
    public static void main(String[] args) {
       
        float diametro = 6;
        float altura = 10;
        float pi = 3.1416f;
        float radio = diametro/2;
        double volumen;

        volumen = pi*Math.pow(radio, 2)*altura;

        System.out.println("El volummen del vaso es de: " + volumen);

        float litros = 2;
        float mililitros = litros*1000;
        double limite = mililitros/volumen;

        System.out.println("Puedo tomar: " + limite + "vasos de cerveza");

    }
    
}
