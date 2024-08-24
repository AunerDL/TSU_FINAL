import javax.swing.JOptionPane;
public class EvaluacionFinal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    String menu, opcion;
    boolean sentinel = true;

        do{

        menu = "1 o A) Problema 1\n2 o B) Problema 2\n0 o S)Salir";  
        opcion = JOptionPane.showInputDialog("Elige una obcion: \n" + menu);

        opcion = opcion.toUpperCase();

            switch(opcion){
            case "1":
            case "A":

            double s=0.0,deno=10.0, vari=3.0;
            double n, x, expo=1.0, nencial=1.0;    
            
                n = Double.parseDouble(JOptionPane.showInputDialog("iNTRODUCE EL VALOR DE N"));
                x = Double.parseDouble(JOptionPane.showInputDialog("iNTRODUCE EL VALOR DE x"));

            int m=1;
            while(m<=n){
                
               s += (vari*Math.pow(x,expo))/Math.sqrt(deno); 
               vari+=3.0;
               deno+=10.0;
               
               for(int v=1; v<=1; v++){
                expo*=v;
               }
            
               m++;
            }
            s+=1;

            JOptionPane.showMessageDialog(null,s);
        

            break;

            case "2":
            case "B":

            /*una compania de seguros ha reunido datos concernientes a todos los accidentes de trancito ocurridos durante el año.
             * Los datos que se tienen de cada conductor comprendido en un accidente, son los siguientes :
             *      
             *      1.-Edad del conductor 
             *      2.-Sexo 
             *      3.-Codigo de ciudad (1.Capital, 2.Provincia)
             * 
             * Diseñar un programa en java.
             *  
             */

            double edad, edadH=0, edadG=0;
            int numConductores, Capital=0, Provincia=0, sexoH=0, sexoM=0;
            String sexo = "", CodiCiuedad, option, porcentaje = "los porcentajes son:\n", option1;
            double porcentEG=0.0, porcenM=0.0, porcenH=0.0, porcenCap=0.0;

            numConductores = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de conductores"));

            for(int i=1; i<=numConductores; i++){

                CodiCiuedad = "Capital\nProvincia\n";
                option = "Elige una opcion\n" + CodiCiuedad;

                sexo = JOptionPane.showInputDialog("Introduce el sexo:\nhombre\nmujer");
               
                edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del cunductor # " + i));

                
                if(sexo.equalsIgnoreCase("hombre")){
                    sexoH++;
                    if(edad>=18 && edad<=25){
                        edadH++;
                        porcenH = (edadH*100)/numConductores;
                    } 
                    
                }else if(sexo.equalsIgnoreCase("mujer")){
                    sexoM++;
                    porcenM = (sexoM*100)/numConductores; 

                }

                if(edad<25){
                    //Hombres

                    edadG++;
                    porcentEG = (edadG*100)/numConductores;
                } 

                option1 = JOptionPane.showInputDialog(option + "Del conductor # " + i);
                if(option1.equalsIgnoreCase("Capital")){
                    Capital++;
                    porcenCap = (Capital*100)/numConductores;
                }else if(option1.equalsIgnoreCase("Provincia")){
                    Provincia++;
                }
                
                porcentaje ="Menores de 25 años: " + porcentEG + "%\nProcentaje de conductores de sexo femenino: " + porcenM + "%\nPorcentaje de hombres entre 18 a 25 " + porcenH + "%\nPorcentaje de personas de capital " + porcenCap+"%";
            }
            JOptionPane.showMessageDialog(null, porcentaje);

            break;

            case "0":
            case "S":
            sentinel = false;
        
            break;

            default:
            System.out.println("Obcion no valida");
        
            }

        }while(sentinel);

    }
    
}
