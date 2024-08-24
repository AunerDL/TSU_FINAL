import javax.swing.JOptionPane;
public class EjerciciosDoWhile {
    public static void main(String[] args) {

        String menu, opcion;
        boolean sentinel = true;

        do{

        menu = "1 o A) Bolitas de colores\n 2 o B) Super mercado\n 3 o C) Teatro\n 0 o S) Salir";

        opcion = JOptionPane.showInputDialog("Elige una obcion: \n" + menu);

        opcion = opcion.toUpperCase();

        switch(opcion){

        case "1":
        case "A":

        /*En una tienda de descuento las personas que van a pagar el importe de su compra llegan a
        la caja y sacan una bolita de color, que les dirá que descuento tendrán sobre el total de su
        compra. Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que
        cierra. Se sabe que si el color de la bolita es roja el cliente obtendrá un 40% de descuento;
        si es amarilla un 25% y si es blanca no obtendrá descuento.*/

        //Declaracion de variables
        double importe=0.0, totaldia=0.0;
        final double descu1=0.40, descu2=0.25, SENTINEL =0.0;
        String option = "", menu1 = "", resultado = "resultados semanales:\n";
        int aux = 1;
        boolean sentinelMenu = true;

        //Crear menu
        menu1 = "Tombola\n1) Bolita roja\n2) Bolita amarila\n3) Bolita blanca\nElejir opcion:";

        do{

        do{

        importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce el importe o 0 para terminar"));
        if(importe<0.0){
            JOptionPane.showMessageDialog(null, "Debes introducir un importe mayor a 0");
        }

        }while(importe<0.0);

            if(importe!=0.0){

        do{

        option = JOptionPane.showInputDialog(menu1);

            switch(option){

                case "1": //bolita roja
            importe = importe - (importe * descu1);
            resultado+="Cliente" + aux + ":\nImporte a pagar: $" + importe + "\n\n"; 
            aux++;
            totaldia+=importe;
            sentinelMenu = false;
                break;

                case "2": //Bolita amarrilla
            importe = importe - (importe * descu2);
            resultado+="Cliente" + aux + ":\nImporte a pagar: $" + importe + "\n\n"; 
            aux++;
            totaldia+=importe;
            sentinelMenu = false;
                break;

                case "3": //Bolita blanca
            resultado+="Cliente" + aux + ":\nImporte a pagar: $" + importe + "\n\n"; 
            aux++;
            totaldia+=importe;
            sentinelMenu = false;
                break;

                default:
            JOptionPane.showMessageDialog(null, "Obcion no valida");

            }
    
        }while(sentinelMenu);

    }

}while(importe!=SENTINEL);

JOptionPane.showMessageDialog(null, resultado + "\nTotal del dia $" + totaldia);

        break;

        case "2":
        case "B":

        /*En un supermercado una ama de casa pone en su carrito los artículos que va tomando de
        los estantes. La señora quiere asegurarse de que el cajero le cobre bien lo que ella ha
        comprado, por lo que cada vez que toma un artículo anota su precio junto con la cantidad
        de artículos iguales que ha tomado y determina cuánto dinero gastara en ese artículo; a
        esto le suma lo que ira gastando en los demás artículos, hasta que decide que ya tomo todo
        lo que necesitaba. Ayúdale a la señora a obtener el total de sus compras.*/


        int cantiCosas;
        double Total = 0.0, articulos;
        String listadoArti = "Los articulos son:\n\n";
        
        cantiCosas = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de articulos a comprar"));

        int i = 1;

        do{

        articulos = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del articulo " + i));

            Total += articulos;

        i++;
            listadoArti += "Articulo #" + i + " costo $" + articulos + "\n";

        }while(i<=cantiCosas);
        JOptionPane.showMessageDialog(null, listadoArti + "\n\nEl total de toda la copra es:\n" + "$" + Total);

        break;

        case "3":
        case "C":

        /*Un teatro otorga descuentos según la edad del cliente. Determinar la cantidad de dinero
        que el teatro deja de percibir por cada una de las categorías. Tomar en cuenta que los niños
        menores de 5 años no pueden entrar al teatro y que existe un precio único en los asientos.
        Los descuentos se hacen tomando en cuenta el siguiente cuadro:

                CATEGORIA       EDAD                DESCUENTO
                categoria 1     5 - 14              35%
                categoria 2     15 - 19             25%
                categoria 3     20 - 45             10%
                categoria 4     46 - 65             25%
                categoria 5     66 en adelante      35%
        */

        double edad, dineroTeatro=0.0, precio, TotalTeTro=0.0;
        double cate1=0.35, cate2=0.25, cate3=0.10, cate4=0.25, cate5=0.35;
        int cantiPerso=0;
        String caden="En total por cada persona es:\n\n";

        cantiPerso = Integer.parseInt(JOptionPane.showInputDialog("Introdcela cantidad de personas"));
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de hacientos"));

        int c=1;
        do{

            edad= Double.parseDouble(JOptionPane.showInputDialog("Introduce la edad de la persona " + c));

            if(edad>=5 && edad<=14){
                //Categoria 1
                dineroTeatro = precio*cate1;

            }else if(edad>=15 && edad<=19){
                //Categoria 2
                dineroTeatro = precio*cate2;

            }else if(edad>=20 && edad<=45){
                //Categoria 3
                dineroTeatro = precio*cate3;

            }else if(edad>=46 && edad<=65){
                //Categoria 4
                dineroTeatro = precio*cate4;

            }else if(edad>=66){
                //Categoria 5
                dineroTeatro = precio*cate5;

            }else if(edad>=0 && edad<5){
                JOptionPane.showMessageDialog(null,"No pueden entrar menores de 5 años");

            }
            TotalTeTro+=dineroTeatro;
            caden+="persona #" + c + " edad " + edad + " total $" + dineroTeatro + "\n";

            c++;
        }while(c<=cantiPerso);
        JOptionPane.showMessageDialog(null, caden + "\n\n Total para el teatro:\n" + "$" + TotalTeTro);

        break;

        case "0":
        case "S":
        sentinel = false;
        
        break;

        default:
        JOptionPane.showMessageDialog(null, "Obcion no valida");

        }

        }while(sentinel);
        
    }
    
}
