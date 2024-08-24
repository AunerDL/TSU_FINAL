
public class empleado {

    String nombre;
    int edad;

    public void setEdad(int edad){
        
        if(edad>=18 && edad<=25){

            this.edad = edad;
            System.out.println("Estas contratado");

        }else{

            System.out.println("Nosotros te contactamos");

        }

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public String getNombre(){

        return nombre;

    }

    public int getEdad(){

        return edad;

    }
    
}
