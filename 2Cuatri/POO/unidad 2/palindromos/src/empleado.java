import javax.swing.JOptionPane;
public class empleado {

    String nombre;
    int edad;

    public void setEdad(int Edad){
        
        if(edad>=18 && edad<=25){

            this.edad = edad;
            JOptionPane.showMessageDialog(null, "Estars contratado");

        }else{

            JOptionPane.showMessageDialog(null, "Nosotros te contactamos");

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
