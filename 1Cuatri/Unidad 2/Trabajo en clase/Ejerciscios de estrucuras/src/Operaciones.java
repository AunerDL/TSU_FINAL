import javax.swing.JOptionPane;;
public class Operaciones {
    public static void main(String[] args) {
        
        int n1=0, n2=0;
        String opc = "";
        String menu = "";
        

        menu = "menu\n1) Sumar\n2) Resta\n3) Multiplicacion\n4) Divicion○\n" + "Elegir opcion";
        opc = JOptionPane.showInputDialog(menu);

        switch(opc){
            case "1":
            //Suma

            n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2"));
            
            Sumar(n1,n2);
            break;
            case "2":
            //Resta

            n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2"));
            
            Restar(n1,n2);
            break;
            case "3":
            //Multiplicar

            n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2"));
            
            Multi(n1,n2);
            break;
            case "4":
            //Divicion

            n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2"));
            
            Div(n1,n2);
            break;
        }

    }

    public static void Sumar(int x, int y){
        int r = 0;
        r = x + y;
        JOptionPane.showMessageDialog(null, "La suma es: " + r);
    }
    
    public static int Restar(int x, int y){
        int r = 0;
        r = x - y;
        return r;
    }

    public static void Multi(int x, int y){
        int r = 0;
        r = x * y;
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + r);
    }

    public static int Div(int x, int y){
        int r = 0;
        r = x / y;
        return r;
    }
}
