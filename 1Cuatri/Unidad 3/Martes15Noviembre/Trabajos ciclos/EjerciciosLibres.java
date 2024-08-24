import javax.swing.JOptionPane;
public class EjerciciosLibres {
    public static void main(String[] args) {

        String menu, opcion;
        boolean sentinel = true;

        do{

        menu = "1) Calculo de masa\n2) Gallinas\n3) Suma de 100 + 98 + 96 +...\n4) Calificaciones de grupo\n5) Suma 20, 25, 30...N\n6) Suma 1, 2, 3, 16...\n7) Numero mayor y menor\n8) De 1 al 100\n9) Factorial\nA) Numeros impares\nB) Suma de antecesor\nC) Numero primo\nD) Numeros positivos y negativos\nE) Serie Vol.1\nF) Serie Vol.2\nG) De 100 a 0\n 0 o S)Salir";

        opcion = JOptionPane.showInputDialog("Elige una obcion: \n" + menu);

        opcion = opcion.toUpperCase();

        switch(opcion){
        case "1":
        /* La presión, volumen y temperatura de una masa de aire se relacionan por la fórmula:
         *                             presion * volumen
         *                  masa=______________________________
         *                         0.37 * (temperatura + 460)
        Calcular el promedio de masa de aire de los neumáticos de n vehículos que están en
        compostura en un servicio de alineación y balanceo. Los vehículos pueden ser motocicletas
        o automóviles.
        */

        double presion = 0.0, volumen = 0.0, temperatura = 0.0, masa = 0.0;
        int motosss = 0, automoviles = 0;
        final double valor1 = 0.37, valor2 = 460;
        String acumm1 = "", menu1 = "", option1 = "";
        boolean SENTINEL = true;

        int j = 1;
        do {
            menu1 = "Escribe el numero de preferencia:\n1) Motos\n2) Automoviles\no 0 para salir";
            option1 = (JOptionPane.showInputDialog(null, menu1));

            if (option1.equalsIgnoreCase("1")) {
                motosss = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de motos"));
                for (int i = 1; i <= motosss; i++) {
                    presion = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Ingresa la presion de la llanta: " + i));
                    volumen = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Ingresa el volumen de la llanta: " + i));
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Ingresa la temperatura de la llanta: " + i));
                    masa = (presion * volumen) / valor1 * (temperatura + valor2);
                    acumm1 += "\nEl valor de la llanta: " + i + "  es: " + masa;
                }
                JOptionPane.showMessageDialog(null, "\nPresion total es: " + acumm1);

            } else {
                if (option1.equalsIgnoreCase("2")) {
                    automoviles = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de motos"));
                    for (int i = 1; i <= automoviles; i++) {
                        presion = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingresa la presion de la llanta: " + i));
                        volumen = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingresa el volumen de la llanta: " + i));
                        temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingresa la temperatura de la llanta: " + i));
                        masa = (presion * volumen) / valor1 * (temperatura + valor2);
                        acumm1 += "\nEl valor de la llanta: " + i + "   es: " + masa;
                    }
                    JOptionPane.showMessageDialog(null, "\nPresion total es: " + acumm1);
                }
            }
            
        } while (SENTINEL);

        break;

        case "2":

        /* En una granja se requiere saber alguna información para determinar el precio de venta por
        cada kilo de huevo. Es importante determinar el promedio de calidad de las n gallinas que
        hay en la granja. La calidad de cada gallina se obtiene según la fórmula: 
         *
         *                         peso de la gallina * altura de la gallina
         *              calidad = ___________________________________________
         *                               numero de huevos que pone
         * 
        Finalmente, para fijar el precio de kilo de huevo, se toma como base la siguiente tabla:
          
                PRECIO TOTAL DE CALIDAD             PESO POR KILO DE HUEVO
                Mayor o igual a 15                  1.2 * promeio de calidad
                Mayor que 8 y menor que 15          1.00 * promedio de calidad
                Menor o igual que 8                 0.80 * promedio de calidad
        */

        double pesoG, alturaG, promCalidad;  
        double preciokil=0.0, preciokil2=0.0, preciokil3=0.0;
        int numGallina, numhuevos;
        int numG1=0, numG2=0, numG3=0; 
        String lista = "El costo por kilo en general es:\n\n";

        numGallina = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de gallinas"));

        for(int n=1; n<=numGallina; n++){

        numhuevos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de huevos de gallina # " + n));
        pesoG = Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso de la gallina # " + n));
        alturaG = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura de la gallina # " + n));

        promCalidad = (pesoG*alturaG)/numhuevos;

          if(promCalidad>=15){
            numG1++;
            preciokil +=  promCalidad*1.2; 

          }else if(promCalidad>8 && promCalidad<15){
            numG2++;
            preciokil2 +=  promCalidad*1.0; 

          }else if(promCalidad<=8){
            numG3++;
            preciokil3 +=  promCalidad*0.8; 

          }
           lista = "El costo mayor de 15 es: $" + preciokil + " De # "+ numG1 + " Gallinas" + "\nEl costo entre 8 a 15 es: $" + preciokil2 + " De # "+ numG2 + " Gallinas" + "\nEl costo menor de 8 es: $" + preciokil3 + " De # "+ numG3 + " Gallinas";  
        }
        JOptionPane.showMessageDialog(null, lista);
        
        break;

        case "3":

        /* Calcular la suma siguiente:
        100 + 98 + 96 + 94 + ... + 0 en este orden 
        */

        for (int i=0; i<=100; i+=2) {
            System.out.println(i);
        }

     
        break;

        case "4":

        /* Leer n calificaciones de un grupo de alumnos. Calcule y escriba el porcentaje de
        reprobados y de aprobados. Tomando en cuenta que la calificación mínima aprobatoria es
        de 70. 
        */

        int nalumnos = 0;
        double ncalif = 0.0, acummre = 0.0, acummap = 0.0;
        String cadena = "";

        nalumnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de alumnos: "));
        for (int i = 1; i <= nalumnos; i++) {
            ncalif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la calificación: " + i));
            if (ncalif < 70) {
                acummre += 1;
            } else {
                if (ncalif >= 70 && ncalif <= 100) {
                    acummap += 1;
                }
            }
        }
        cadena = "El porcentaje de reprobados es: " + Math.round((acummre / nalumnos) * 100) + "%" + "\nEl porcentaje de aprobados es: " + Math.round((acummap / nalumnos) * 100)+ "%";
        JOptionPane.showMessageDialog(null, cadena);
      
        break;

        case "5":

        /*Calcular la suma de la siguiente sucesión e imprimir la sucesión y la suma:
        20, 25, 30, 35, .... N 
        */
      
        String caden = "";
        int d=0;

        d = Integer.parseInt(JOptionPane.showInputDialog("Introduce el limite"));

        for(int i=20; i<d; i+=5){
            
            caden+= i + " , ";
        }
        JOptionPane.showMessageDialog(null, caden + d);
       
        break;

        case "6":
        /*Calcular la suma de la sucesión e imprimir la sucesión y la suma:
        *          1, 4, 9, 16, 25, 36, 49, 64, 81, ...n
        *El siguiente número se calcula elevando al cuadrado su posición.*/

        String caden1 = "";
        double suma = 0.0;
        int b=0;

        b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de n"));

        for(int i=1; i<=b; i++){
            suma+=Math.pow(i,2.0);
            caden1+= i + ",";
        }
        JOptionPane.showMessageDialog(null, caden1 + "=" + suma);
       
        break;

        case "7":

        /*Elabore un programa que lea n números y calcule e imprima el número mayor y el número
        menor, de todo el conjunto.
        */

        int numero =0;
        int nummayor =0;
        int nummenor =0;
        int total;

        total = Integer.parseInt(JOptionPane.showInputDialog("Introduce el total de numeros a calcular"));

        for(int i=1; i>total; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero " + i));
        
            if (i == 1) {
                nummayor = numero;
                nummenor = numero;
            } else {
                if (numero>nummayor) {
                    nummayor=numero;
                } else {
                    if (numero<nummenor) {
                        nummenor=numero;
                    }
                }
            }
    
        }
        JOptionPane.showMessageDialog(null, "Total de numeros mayores es: " + nummayor + "\nTotal de numeros menores es: " + nummenor);    

        break;

        case "8":

        /*Elaborar un programa que calcule e imprima la suma de los números del 1 hasta el 100
        */

        double sum=0.0;

        for (int i=1; i<=100; i++) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("La suma es: " + sum);
     
        break;

        case "9":

        /*Hacer un programa que lea un valor N, entero y positivo y que calcule e imprima su
        factorial. Por ejemplo, si lee el %, su factorial es el producto de 1*2*3*4*5. El factorial de
        0 es 1. */

        int N1=0;
        long factorial=1;
        boolean valor = false;

        N1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para el factorial"));

        valor = (N1==0 || N1==1)?false:true;

        if(valor){
            int a=N1;
            factorial =0;
            while(a>=N1){
                factorial*=a;
                a--;
            }
            j=1;
            factorial = 1;
        while(j<=N1){
                factorial*=j;
                j++;
            }

            j = N1;
            factorial = 1;
            do{
                factorial*=j;
                j--;
            }while(j>=1);

            j=1;
            factorial = 1;
            do{
                factorial*=j;
                j++;
            }while(j<=N1);
            
            JOptionPane.showMessageDialog(null,"El factorial de f(" + N1 + ") es: " + factorial);
        }else{
            JOptionPane.showMessageDialog(null,"El factorial de f(" + N1 + ") es: " + factorial);
        }
       
        break;

        case "A":

        /*Mostrar los números impares entre el 0 y el 100 
        */

        for (int i=1; i<=100; i+=2) {
            System.out.println(i);
        }
     
     
        break;

        case "B":

        /*Ingresar un número y mostrar la suma de los números que lo anteceden. 
        */

        double number = 0;
        String sumatoria = "";
        double sum1;
        int div = 2;
    
        number = Integer.parseInt(JOptionPane.showInputDialog("Introduce el resultado de un suma"));
        
        int L=0;
        do{

            sum1= number/div;
       
            sumatoria = "la suma de " + number + " es:\n" + sum1 + " + " + sum1;

            L++;
        }while(L<=number);

        JOptionPane.showMessageDialog(null, sumatoria);
        
        break;

        case "C":

        /*Ingresar un número y determinar si es número primo
        */

        int NUMERO = 0;
        int Sentinel = 0;
        int f=1;

        do{
            NUMERO = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero: " + f));
            if (NUMERO % 2 == 0) {
                System.out.println("El numero es: " + NUMERO + " es par");
            } else {
                if (NUMERO%2!= 0) {
                    System.out.println("El numero es: " + NUMERO + " es impar");
                }
            }
            f++;
        }while(f!=Sentinel);
        
        break;

        case "D":

        /*Ingresar n números sumar los + y multiplicar los –
        */

        int numberx=0;
        double vari;
        double sumatori=0.0;
        double multi=1;
        String CADENA="";

        numberx = Integer.parseInt(JOptionPane.showInputDialog("Introduce los numeros a contar"));

        for(int w=1; w<=numberx; w++){

            vari = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero # " + w));

            if(vari>=1){
                //numeros positivos

                sumatori+=vari;

            }else if(vari<=0){
                //numeros negativos

                multi*=vari;

            }
            CADENA = "El total es:\n" + "La suma tota es: " + sumatori + "\nLa multiplicacion total es: " + multi ;
        }

        JOptionPane.showMessageDialog(null, CADENA);
        
        break;

        case "E":
        /*Realizar un programa que resuelva la siguiente serie:
         *
         *               3/3     3/6      3/9      3/12
         *              x       x        x        x
         *        S = ______ + ______ + ______ + ______ ... n
         *              1        3        5        7
         */

        double s=0.0, denoSupe=3.0, denoInfe=1.0, x=0.0;
        int n=0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valorde x"));

        int i =1;
        while(i<=n){
            
            s+=Math.pow(x,3.0/denoSupe)/denoInfe;
            denoSupe+=3.0;
            denoInfe+=2.0;
            
            i++;
        }
        JOptionPane.showMessageDialog(null, "el valor de s es: " + s);
        
        break;

        case "F":

        /*Realizar un programa que resuelva la siguiente serie:
         * 
         *               3/3     3/6       3/9     3/12     3/15
         *              x       x        x        x        x
         *        S = ______ + ______ - ______ + ______ - ______ ... n
         *              1        3        5        7        9
         */

        double S=0.0, denoSupe1=3.0, denoInfe1=1.0, X=0.0;
        int N=0;
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
        X = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valorde x"));

        for(int z=1; z<=N; z++){
            
            if(z==1){
                S = Math.pow(X,3.0/denoSupe1)/denoInfe1;
            }else if(z%2==0){
                S+=Math.pow(X,3.0/denoSupe1)/denoInfe1;
            }else{
                S-=Math.pow(X,3.0/denoSupe1)/denoInfe1;
            }
            denoSupe1+=3.0;
            denoInfe1+=2.0;

        }//cierra el ciclo
        JOptionPane.showMessageDialog(null, "el valor de s es: " + S);
        
        break;

        case "G":

        /*Realizar un programa que imprima del 1000 al 0
        */

        for (int v=100; v>=0; v--) {
            System.out.println(v);
        }
        
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
