import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        
        //Declaracion de variable
        double n1, n2, result;
        String opcion, menu;
        boolean sentinel = false;


        //Entrada
        menu = "MENU\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Divicion○\n5)Modulo\nElegir una obcion";


        if(menu.equals("1") || menu.equals("2") || menu.equals("3") || menu.equals("4") || menu.equals("5")){
                
        JOptionPane.showInputDialog(menu);
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Intrduce el valor 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Intrduce el valor 2"));

        //Seleccion
        switch (menu){
        case "1":
                //Suma
                result = n1 + n2;
            break;
        case "2":
                //Resta
                result = n1 - n2;
            break;
        case "3":
                //Multiplicacion
                result = n1 * n2;
            break;
        case "4":
                //Divicion
                result = n1 / n2;
            break;
        case "5":
                //Modulo
                result = n1 % n2;
            break;
        
            default:
                sentinel =false;
                JOptionPane.showMessageDialog(null,"Obcion no valida");

        }//Cierra switch
    
        if(sentinel){
        JOptionPane.showMessageDialog(null,"El resultado es: " + result);
    }
}
    }//Cierra el main

}//Cierra la clase
