
public class Sexo3 {
    public static void main(String[] args) {
        //Declaracion de variable
        char sexo = 'm';
        int edad = 10;

        if(sexo == 'm'){
        if(sexo >= 18){
                System.out.println("Eres mujer mayor de edad");
            }else{
                System.out.println("Eres mujer menor de edad");
            }else{
            if(edad >= 18){
                System.out.println("Eres hombre mayor de edad");
            }else{
                System.out.println("Eres hombre menor de edad");
            }  
        }   
        System.out.println("Gracias...");
    }
    
}
