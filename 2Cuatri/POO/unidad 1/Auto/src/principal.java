	import java.util.Random;

public class principal {
    public static void main(String[] args) {
        
        //Every code aplication logic here
        Auto ferrari = new Auto();

        //Acceder la clase
        ferrari.modelo="2022";
        ferrari.marca="296 GTS";
        ferrari.color="rojo";

        ferrari.meterlallave("Franchesco");
        ferrari.mandar("enciende\nla maquina mas velos de tuta italie");

        /*//Llamar clase
        ferrari.enciende();
        ferrari.acelerar();
        ferrari.frenar();

        //Acceder
        System.out.println("Marca: " + ferrari.marca);
        System.out.println("Color: " + ferrari.color);
        System.out.println("Modelo: " + ferrari.modelo);*/

    }
    
}
