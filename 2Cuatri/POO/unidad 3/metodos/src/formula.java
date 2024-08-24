import java.util.Scanner;
public class formula {
    public static void main(String[] args) {

        Scanner entra = new Scanner(System.in);

        System.out.println("Ingresa el valor de y");
        double y = entra.nextDouble();
        System.out.println("Ingresa el valor de x");
        double x = entra.nextDouble();

        if(x>0){
            if(y!=0){

               formu resu = new formu();
               resu.result();

            }else{
                System.out.println("Valores no saceptables de la variable y");
            }
        }else{
            System.out.println("Valores no saceptables de la variable y");
        }

    }
    
}
