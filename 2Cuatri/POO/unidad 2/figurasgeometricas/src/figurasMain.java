import java.util.Scanner;

import javax.swing.JOptionPane;
public class figurasMain {
    public static void main(String[] args) {
        
        Scanner entra = new Scanner(System.in);
        String menu = "Elije una opcion:\n\n";
        Boolean SENTINEL = true;

        do{

            menu+="A) Rectangulo\nB) Triangulo\nC) Paralelogramo\nD) Circulo\nS) Salir";

            menu = JOptionPane.showInputDialog(menu);

            switch(menu){
                
                case "A":
    
                //Solicitar datos
                System.out.println("Ingresa el valor de la base del rectangulo");
                //Guardar datos
                double base = entra.nextDouble();
                System.out.println("Ingresa el valor de la altura del rectangulo");
                double altura = entra.nextDouble();
    
                //Instancia
                rectangulo rec = new rectangulo(base, altura);
                rec.result();
    
                break;
    
                case "B":
    
                //Solicitar datos
                System.out.println("Ingresa el valor de la base del triangulo");
                //Guardar datos
                double base1 = entra.nextDouble();
                System.out.println("Ingresa el valor de la altura del triangulo");
                double altura1 = entra.nextDouble();
    
                //Instancia
                triangulo tri = new triangulo(base1, altura1);
                tri.resultri();
    
                break;
    
                case "C":
    
                //Solicitar datos
                System.out.println("Ingresa el valor del perimetro del paralelogramo");
                //Guardar datos
                double perimetro = entra.nextDouble();
                System.out.println("Ingresa el valor de la altura del paralelogramo");
                double altura2 = entra.nextDouble();
    
                //Instancia
                paralelogramo para = new paralelogramo(perimetro, altura2);
                para.resulpara();
    
                break;
    
                case "D":
    
                //Solicitar datos
                System.out.println("Ingresa el valor del radio del circulo");
                //Guardar datos
                double radio = entra.nextDouble();
    
                //Instancia
                circulo circu = new circulo(radio);
                circu.resulcircu();
    
                break;

                case "S":

                SENTINEL = false;

                break;
    
            }

        }while(SENTINEL);

    }
    
}
