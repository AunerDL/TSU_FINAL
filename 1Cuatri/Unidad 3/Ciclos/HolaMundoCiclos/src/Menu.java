import javax.swing.JOptionPane;
public class Menu {
    public static void main(String[] args) {
        String menu, opcion;
        boolean sentinel = true;

        do{

        menu = "1 o A) Suma\n 2 o B) Resta\n 3 o S)Salir";

        opcion = JOptionPane.showInputDialog("Elige una obcion: \n" + menu);

        opcion = opcion.toUpperCase();

        switch(opcion){
        case "1":
        case "A":
        System.out.println("Opcion de suma");

        break;

        case "2":
        case "B":
        System.out.println("Obcion de resta");

        break;

        case "3":
        case "S":
        sentinel = false;
        
        break;

        default:
        System.out.println("Obcion no valida");
        }

        }while(sentinel);
        
    }
    
}
