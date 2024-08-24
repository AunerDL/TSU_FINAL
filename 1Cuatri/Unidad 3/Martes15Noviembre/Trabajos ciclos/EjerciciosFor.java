import javax.swing.JOptionPane;
public class EjerciciosFor {
    public static void main(String[] args) {

        String opcion, menu;
        Boolean SENTINEL = true;

        do{

            menu = "\n1 o A) Promedio\n2 o B) Calificaciones de grupo\n3 o C) Tabla de multipicacion\n4 o D) Muestreos de personas\n5 o E) Naranjas\n6 o F) Automoviles\n7 o G) Suma de 10 cantidades\nintroduce 0 o S para finalizar";
            opcion = JOptionPane.showInputDialog("Introduce tu opcion: " + menu);
            opcion = opcion.toUpperCase();

            switch(opcion){

            case "1":
            case "A":

            /*Calcular el promedio de un alumno que tiene n calificaciones en la materia de
            Metodología de la programación.*/

                double Prom, calif, acum =0.0;
                int canti;

                canti = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de calificaciones a sumar"));

                if(canti>0.0){
                for(int y=0; y<canti; y++){

                    do{
                    calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + (y+1)));
                    }while(calif<=0);
                    acum += calif;
                    
                }
                JOptionPane.showMessageDialog(null, "El total es: " + acum);
                Prom = acum/canti;
                JOptionPane.showMessageDialog(null, "El promedio final es: " + Prom);
                
                }else{
                    JOptionPane.showMessageDialog(null, "Error, ingresas numero de calificaciones PAYASO"); 
                }
                JOptionPane.showMessageDialog(null, "Fin :3");

            break;
                         
            case "2":
            case "B":

            /*Suponga que se tiene un conjunto de calificaciones de un grupo de n alumnos. Realizar un
            programa para calcular la calificación media y la calificación más baja de todo el grupo.*/

                double Alumnos =0.0, promMedio=0, promBajo=0;
                int numAlum;

                numAlum = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumnos "));

                for(int i=1; i<=numAlum; i++){

                    Alumnos = Double.parseDouble(JOptionPane.showInputDialog("Introduce promedio de alumno " + i));
                    
                    if(Alumnos>=8){
                        
                        promMedio/=Alumnos;
                    }else{
                        
                        promBajo/=Alumnos;
                    }
                
                }
                JOptionPane.showMessageDialog(null, "\nTotal de promedio medio es: " + promMedio + "\nTotal de promedios bajos es: " + promBajo);
                JOptionPane.showMessageDialog(null, Alumnos);
                JOptionPane.showMessageDialog(null, "Fin :3");
   
            break;
            
            case "3":
            case "C":

            /*Calcular y multiplicar la tabla de multiplicar de un número cualquiera. Imprimir el
            multiplicando, el multiplicador y el producto.*/

            int multiando=0, pro =0; 
            String resul="El resultado es: \n";
            int opc ;

            for(int n=1; n<=1; n++){
                opc = Integer.parseInt(JOptionPane.showInputDialog("escoge\n1) para una tabla\n2) para todas las tablas de multiplicacion"));

                if(opc==1){

                    multiando = Integer.parseInt(JOptionPane.showInputDialog("Introduce el multiplicando"));

                    for(int c=1; c<=10; c++){

                    pro = c * multiando;
                    resul+= multiando + "x" + c + "=" + pro +"\n";
                    
                    }
                    JOptionPane.showMessageDialog(null, resul);

                }else if(opc==2){

                    for(int a=1; a<=10; a++){
                        for(int b=1; b<=10; b++){
                            pro = a * b;
                            resul+= a + "x" + b + "=" + pro + "\n";
                            
                        }
                    }
                    System.out.println(resul);

                }else{

                    JOptionPane.showMessageDialog(null,"introduce 1 o 2 >:(");
                }
     
            }
            JOptionPane.showMessageDialog(null, "Fin :3, pd: aprendete las tablas manco");

            break; 

            case "4":
            case "D":

            /*Una persona debe realizar un muestreo con n personas para determinar el promedio de
            peso de los niños, jóvenes, adultos y viejos que existen en su zona habitacional. Se
            determinan las categorías con base a la siguiente tabla: 
                    CATEGORIA                   EDAD
                    Niños                       0-12
                    Jovenes                     13-29
                    Adultos                     30-59
                    Viejos                      60 en adelante
            */

            int edad =0, numPersonas=0;
            double peso=0.0;
            String resultado ="";

            //contador
            int contNino =0, contJoven=0, contAdulto=0, contViejo=0;
            //Acumuladores
            double promNino=0.0, promJoven=0.0, promAdulto=0.0, promViejo=0.0;

            //Entrada
            numPersonas = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de personas a evaluar"));

            for(int y=1; y<=numPersonas; y++){
                peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso"));
                edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
                
                if(edad>=0){
                    if(edad>=0 && edad<=12){
                        contNino++;
                        promNino+=peso;
                    }else if(edad>=13 && edad<=29){
                        contJoven++;
                        promJoven+=peso;
                    }else if(edad>=30 && edad<=59){
                        contAdulto++;
                        promAdulto+=peso;
                    }else{
                        contViejo++;
                        promViejo+=peso;
                    }

                }

            }
            if(contNino != 0){
                promNino/=contNino;
            }
            if(contJoven != 0){
                promJoven/=contJoven;
            }
            if(contAdulto != 0){
                promAdulto/=contAdulto;
            }
            if(contViejo != 0){
                promViejo/=contViejo;
            }
           resultado = "Resumtados\nPromedio de niños " + promNino + "\nPromedio de jovenes " + promJoven + "\nPromedio de adultos " + promAdulto + "\nPromedio de viejos " + promViejo;
           JOptionPane.showMessageDialog(null, resultado);
            break; 

            case "5":
            case "E":

            /*Al cerrar un expendio de naranjas, 15 clientes que aún no han pagado recibirán un 15% de
            descuento si compran más de 10 kilos. Determinar cuánto pagará cada cliente y cuanto
            percibirá la tienda por esas compras.*/

            int kilo;
            double descu = 0.15;
            double cost = 0.0, total=0.0;
            double presutota =0.0;
            String cliente = "presupuesto general:\n\n"; 

            cost = Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo por kilo"));
            for(int d=1; d<=15; d++){
                
                kilo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de kilo del cliente " + d));

                if(kilo>=10){
                    total = ((cost*kilo))*descu;
                    
                }else{
                    total = (cost*kilo);
                }
                presutota += total;
                cliente += "total que debe pagar el cliente #" + d + " : $" + total + "\n";
            }
            JOptionPane.showMessageDialog(null, cliente + "\n\npedira la tienda: $" + presutota);
            /*"pedira la tienda: $" + presutota +*/

            break; 

            case "6":
            case "F":

            /*En un centro de verificación de automóviles se debe saber el promedio de puntos de
            contaminantes de los primeros 25 automóviles que lleguen. Asimismo, se desea saber los
            puntos contaminantes del carro que menos contamino y el que más contamino.*/

            int auto;
            int contamin, sumaSI=0, sumaNO=0;
            String conta = "";
            String autos="total de autos:\n\n", conta1 = "Totales de autos:\n\n";

            contamin = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango minimo de contaminante"));
            for(int f=1; f<=25; f++){
                
                auto = Integer.parseInt(JOptionPane.showInputDialog("Introduce los puntos contamiantes del carro " + f));

                if(auto<=contamin){
                    //mas contaminante
                    conta = "containa mas";
                    sumaSI++;

                }else{
                    //menos contaminante
                    conta = "contamina menos";
                    sumaNO++;

                }
                autos += "Auto #" + f + " " + conta + "\n";
               
            }
            conta1 += "Autos que contaminan mas: " + sumaSI + "\nAutos que contaminan menos: " + sumaNO;
            JOptionPane.showMessageDialog(null, autos + "\n\n" + conta1);

            break; 

            case "7":
            case "G":

            /*Realizar un programa que permita obtener la suma de diez cantidades.*/

            double numero=0.0, acumNum=0.0;

            for(int z=1; z<=10; z++){

                numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero " + z));
                acumNum += numero;

            }
        
            JOptionPane.showMessageDialog(null, "El total es: " + acumNum);
            
            break; 
            
            case "0":
            case "S":

            SENTINEL =false;

            }
           
        }while(SENTINEL);
        
    }
    
}
