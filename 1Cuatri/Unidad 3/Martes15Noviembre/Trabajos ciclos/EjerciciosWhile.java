import javax.swing.JOptionPane;
public class EjerciciosWhile {
    public static void main(String[] args) {
        
        String menu, opcion;
        boolean sentinel = true;

        do{

        menu = "1 o A) Compania de seguros\n 2 o B) Salario empresa\n3 o C) Hombres y Mujeres\n4 o D) Seguridad publica\n5 o E) Promedio de calificaciones\n6 o F) Edades\n7 o G) Menor valor de n\n8 o H) Mayor valor de n\n0 o S)Salir";

        opcion = JOptionPane.showInputDialog("Elige una obcion: \n" + menu);

        opcion = opcion.toUpperCase();

        switch(opcion){

        case "1":
        case "A":

        /*Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la
        semana. Su política de pagos es que un vendedor recibe un sueldo base y un 10% extra por
        comisiones de sus ventas. El gerente de su compañía desea saber cuánto dinero obtendrá
        en la semana cada vendedor por concepto de comisiones por las tres ventas realizadas, y
        cuanto tomando en cuenta su sueldo base y sus comisiones.*/

        double ven1=0.0, ven2=0.0, ven3=0.0, sB=0.0, comision=0.0, total=.0;
        int numEmple=0;
        final double PORCENTAJE =0.10;
        String result="Resultados semanales:\n";
        String Datos ="Los datos son:\n";

        //Entradas secuenciales

        numEmple = Integer.parseInt(JOptionPane.showInputDialog("Numero de empleados"));
        sB = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo base"));

        //Inicializacion del siclo
        int i=1;

        while(i<=numEmple){//Paro
            //Entradas ciclicas
            ven1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 1 del empleado " + i));
            ven2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 2 del empleado " + i));
            ven3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 3 del empleado " + i));

            comision = (ven1+ven2+ven3)*PORCENTAJE;

            total = sB + comision;
            result+="Empleado #" + i + "\nComision de sus ventas $" + comision + "\nTotal de su pago $" + total + "\n\n";
            Datos+="Numero de empleados "+"\tSueldo base "+"\tVenta 1 "+"\tVenta 2 "+"\tVenta 3 "+"\tComision "+"\ttotal\n"+i+"\t\t "+sB+"\t\t "+ven1+"\t\t "+ven2+"\t\t "+ven3+"\t\t "+comision+"\t\t "+total+"\t\t "+"\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, Datos);
        JOptionPane.showMessageDialog(null, result);
       
        break;

        case "2":
        case "B":

        /*En una empresa se requiere calcular el salario semanal de cada uno de los n obreros que
        laboran en ella. El salario de la siguiente manera:
            a. Si el obrero trabaja 40 horas o menos se le paga $20 por hora
            b. Si trabaja más de 40 horas se le paga $20 por cada una de las primeras 40 horas y
            $25 por cada hora extra.*/

            int obreros = 0;
            double horas = 0.0;
            double sFinal = 0.0;
            String salida = "Nomina del trabajador:\n", preguntas = "";
    
            obreros = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de obreros a pagar"));
    
            int f=1;
    
            while(f<=obreros){
    
                preguntas = JOptionPane.showInputDialog("¿El trabajador " + f +  " trabajo mas de 40 horas?");
                preguntas.toLowerCase();
    
                if(preguntas.equals("no")){
    
                    horas = Double.parseDouble(JOptionPane.showInputDialog("Ingresa las horas trabajadas del trabajor " + f));
                    JOptionPane.showMessageDialog(null, " Si El numero de horas es menor o igual a 40, se paga a $20 cada hora");
                    
                            horas*=20;
                            salida += "Pago de horas extra del trabajador " + f + " $0 " + " Sueldo final de trabajador " + f + " $" + sFinal + "\n";
                            horas = 0.0;
    
                }else if(preguntas.equals("si")){
    
                    JOptionPane.showMessageDialog(null, "Si el trabajor trabajo mas de 40 horas, las primeras 40 horas se pagan a $20 \n" + "y cada hora extra se paga a $25");
    
                    horas = Double.parseDouble(JOptionPane.showInputDialog("Solo ingresa cuantas horas extras trabajo el trabajador #" + f + "\n" + " despues de llegar a las 40 Horas "));
    
                            sFinal = 40.0 * 20.0;
                            horas*=25;
                            sFinal+=horas;
                            salida+="Pago de horas extra del trabajador " + f + " $" + horas + " Sueldo final de trabajador " + f + " $" + sFinal + "\n";
                            horas = 0.0;
                            sFinal+=0.0;
    
                }
    
                f++;
    
            }
            JOptionPane.showMessageDialog(null, salida);    

        break;

        case "3":
        case "C":

        /*Determinar cuántos hombres y cuantas mujeres se encuentran en un grupo de n personas,
        suponiendo que los datos son extraídos alumno por alumno.*/

        int perso = 0;
        int hom = 0;
        int feme = 0;
        char sexo;

        perso = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas participan en el censo?"));
        int c = 1;

        while (c<=perso) {
            do {
                sexo = JOptionPane.showInputDialog(
                        "Bienvenido, Ingresa tu sexo \n (Para masculino ingresa *m*, de lo contrario *f*)").charAt(0);
            } while (!(sexo == 'm' || sexo == 'f'));
            if (sexo == 'm') {
                JOptionPane.showMessageDialog(null, "Persona #" + c + " Hombre");
                hom++;

            } else if (sexo == 'f') {
                JOptionPane.showMessageDialog(null, "Persona #" + c + " Mujer");
                feme++;

            } else {

            }
            c++;
        }
        JOptionPane.showMessageDialog(null, "Censo \n El numero de hombres es " + hom + "\n El  numero de mujeres es " + feme);
       
        break;

        case "4":
        case "D":

        /*El departamento de seguridad pública y tránsito del DF, desea saber, de los n autos que
        entran a la ciudad de México, cuántos entran con calcomanía de cada color. Conociendo el
        ultimo digito de la placa de cada automóvil se puede determinar el color de la calcomanía
        utilizando la siguiente relación:
        
                DIGITO              COLOR
                1 o 2               Amarrilla
                3 o 4               Rosa
                5 o 6               Roja
                7 o 8               Verde
                9 o 0               Azul 
        */

        int carros = 0, ultimoDigito = 0; 
        int ama = 0; 
        int azul = 0; 
        int roja = 0; 
        int rosa = 0; 
        int verde = 0;
        String sali = "Autos Entrantes \n";

        do {

            carros = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de autos "));

        } while (carros<1);

        int a = 1;
        
        while (a<= carros) {
            
            do {
                ultimoDigito = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ultimo digito"));
            } while (ultimoDigito < 0 || ultimoDigito > 9);
            if (ultimoDigito == 1 || ultimoDigito == 2) {
            JOptionPane.showMessageDialog(null, "Carro " + a +  " Etiqueta Amarilla");
             ama +=1;
            } else if (ultimoDigito == 3 || ultimoDigito == 4) {
            JOptionPane.showMessageDialog(null, "Carro " + a +  " Etiqueta Rosa");
            rosa +=1;
            } else if (ultimoDigito == 5 || ultimoDigito == 6) {
                JOptionPane.showMessageDialog(null, "Carro " + a +  " Etiqueta Roja");
                roja +=1;
            } else if (ultimoDigito == 7 || ultimoDigito == 8) {
                JOptionPane.showMessageDialog(null, "Carro " + a +  " Etiqueta Verde");
            verde +=1;
            } else {
                JOptionPane.showMessageDialog(null, "Carro " + a +  " Etiqueta azul");
                azul +=1;
            }
           
            a++;
        }
        sali += "\n Etiqueta Amarilla " + ama + "\n Etiqueta Rosa " + rosa + "\n Etiqueta Roja " + roja + "\n Etiqueta Verde " + verde + "\n Etiqueta Azul " + azul;
        JOptionPane.showMessageDialog(null, sali);
       
        break;

        case "5":
        case "E":

        /*Obtener el promedio de calificaciones de un grupo de n alumnos*/

        int alumnos = 0, calificaciones = 0;
        double calificacion = 0.0;
        String exit = "Calificaciones \n";

        do {
            alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de alumnos a evaluar"));
        } while (alumnos < 1);

        do {
            calificaciones = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingresa el numero de calificaciones que se evaluan"));
        } while (calificaciones < 1);

        int b = 1;
        while (b<= alumnos) {

            int j = 1;
            while (j <= calificaciones) {
                calificacion += Double
                        .parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion #" + j + " del alumno " + b));
                j++;
            }

            calificacion /= calificaciones;
            exit += "Calificacion del Alumno #" + b + " es de: " + calificacion + "\n";
            calificacion = 0.0;
            b++;
        }
        JOptionPane.showMessageDialog(null, exit);
       
        break;

        case "6":
        case "F":

        /*Calcular el promedio de edades de hombres, mujeres y de todo un grupo de n alumnos */

        int alum = 0, edadHomb=0, edadMuje =0; 
        int H=0,M=0, Final;
        char sex;
        String Salida = "";
        
        do {
            alum = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de alumnos "));
        } while (alum< 1);
        
        int v = 1;
        while (v <= alum) {
            do {
                sex = JOptionPane.showInputDialog(
                        "Bienvenido, Ingresa el sexo de la persona " + v + "\n (Para masculino ingresa *m*, de lo contrario *f*)").charAt(0);
            } while (!(sex == 'm' || sex == 'f'));
            if (sex == 'm'){
                H += 1;
              edadHomb += Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Edad del Alumno " + H));
            }else if (sex == 'f'){
                M += 1;
                edadMuje+= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Edad de la Alumna " + M));          
            }
        v++;
        }
        Final = (edadHomb + edadMuje) / alum;
        edadHomb = edadHomb / H;
        edadMuje = edadMuje / M;

        Salida += "\n Hombres en clase: " + H + " Promedio de edad entre hombres: " + edadHomb + "\n Mujeres en clase: " + M + " Promedio de edad entre Mujeres: " + edadMuje + "\n Alumnos y Alumnas totales en clase: " + (H + M) + " Promedio de edades: " + Final;
                 
        JOptionPane.showMessageDialog(null, Salida);
       
        break;

        case "7":
        case "G":

        /*Encontrar el menor valor de un conjunto de n números dados*/

        double numero=0.0;
        double numMax =0.0;
        int k=1;
        int conti =0;
        String salid ="Numeros \n";

        conti = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los numeros a comparar"));

        while (k <= conti) {

            numero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero " + k));
            salid += "El numero " + k + " es " + numero + "\n";

            if (k == 1){
                numMax = numero;
            }else if (numero > numMax) {
            numMax = numero;
            }

            k++;
        }
        salid += "El numero mayor es " + numMax;
        JOptionPane.showMessageDialog(null, salid);
       
        break;

        case "8":
        case "H":

        /*Encontrar el mayor valor de un conjunto de n números dados*/

        double number=0.0;
        double numMini =0.0;
        int p=1;
        int Serie =0;
        String SALIDA ="Numeros \n";

        Serie = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los numeros a comparar"));

        while (p<=Serie) {

            number = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero " + p));
            SALIDA += "El numero " + p + " es " + number + "\n";

            if (p == 1){
                numMini = number;
            }else if (number < numMini) {
            numMini = number;
            }

            p++;
        }
        SALIDA += "El numero menor es " + numMini;
        JOptionPane.showMessageDialog(null, SALIDA);
       
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
