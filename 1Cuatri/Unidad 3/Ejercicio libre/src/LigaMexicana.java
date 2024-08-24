/* Cada equipo de beisbol de la linea Mexicana del pasifico tienen 30 jugadores. Supongase que cada equipo de la
 * liga prepara un lisado donde por cada jugador aparecen los datos siguientes: 1 Nombre del jugador, peso y edad.
 * 
 * Los datos correspondientes a los 10 equipos de la liga se recopilan y se envian a la sede sentral 
 * para su analisis.
 * 
 * Se tiene un paquete, que contiene los datos, de los 30 jugadores del equipo 1, del equipo 2 y asi 
 * sucesivamente.
 * 
 * Elavorar un programa para leer estos datos y que sirva para proporcionar:
 * a) pesos y edades promedio de los jugadores de cada uno de los 10 equipos
 * b) pesos y edades promedio de todos los jugadores  
 */

import javax.swing.JOptionPane;
 public class LigaMexicana {
    public static void main(String[] args){

        //Declaracion de variables
        int numeroEquipos = 0, numeroJugadores = 0;
        double pesoPromEquipo = 0.0, pesoPromGeneal = 0.0;
        int edadPromEquipo = 0, edadPromGeneral = 0;
        String salida = "Estadistica de jugadores:\nEquipo\t\t"+"Peso promedio\t\tEdad Promedio\n";
        int j;

        numeroEquipos = Integer.parseInt(JOptionPane.showInputDialog("Introdce el numero de Equipos"));
        numeroJugadores = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de jugadores"));

        for(int i=1; i<=numeroEquipos; i++){
            //Controla siclo que controla los jugadores
            j = 1;
            while(j<=numeroJugadores){
                pesoPromEquipo+=Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso del jugador " + j + " del Equipo " + i));
                edadPromEquipo+= Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del jugador " + j + " del Eqipo " + i));

                j++;
            }
            //Calcula los promedios de jugadores por equipo
            pesoPromEquipo/=numeroJugadores;
            edadPromEquipo/=numeroJugadores;
            //Acumula los promedios generales por equipo
            pesoPromGeneal+=pesoPromEquipo;
            edadPromGeneral+=edadPromEquipo;

            salida+= i + "\t\t" + pesoPromEquipo + "\t\t" + edadPromEquipo + "\n";

            pesoPromEquipo = 0.0;
            edadPromEquipo = 0;
        }

        pesoPromGeneal/=numeroEquipos;
        edadPromGeneral/=numeroEquipos;

        salida+="\t\tPeso: Promedio General " + pesoPromGeneal + "\t\tEdad: Promedio General " + edadPromGeneral;

        System.out.println(salida);
        
    }
    
}
