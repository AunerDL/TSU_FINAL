/*
 * 8) Problema 8
 * 
 * Una Institucion educativa establecio un programa para estimular a los alumnos con buenrendimiento academico
 * y que consiste en lo siguiente:
 * 
 * . Si el promedio es de 9.5 o mas y el alumno es de preparatoria, entonces este podra cursar 55 unidades y se
 * le hara un 25% de decuento.
 * . Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de preparatoria, entonces este podra
 * cursar 50 unidades y se hara un 10% de descuento.
 * . Si Si el promedio es mayor que 7 y menor que 9 y el alumnoes de preparatoria, este podra cursar 50 unidades
 * y no tendra ningun descuento.
 * . Si el promedio es de 7 o menor, el numero de materias reprobadas es de 0 a 3 y el alumno es depreparatoria, 
 * entonces podra cursar 45 unidades y no tendra descuento.
 * . Si el promedio es de 6 o menor, el numero de materias reprobadas es de 4 o mas y el alumno es de preparatoria,
 * entonces podra cursar 40 unidades y no tendra ningun descuento.
 * 
 * . Si el promedio es mayor o igual a 9.5 y el alumno es de profecional, entonces podra cursar 55 unidades y se 
 * le dara un 20% de descuento.
 * . Si el promedio es menor de 9.5 y el alumnoes de profecional, entonces podra cursar 55 unidades y no tendra 
 * descuento.
 * 
 * Obten el total que tendra que pagar un alumno si la colegiatura para alumnos de profecional es de $300 por cada
 * cinco unidades y para alumnos de preparatoria es de $180 por cada cionco unidades. 
 */

import javax.swing.JOptionPane;
public class InstitucionEducativa {
    public static void main(String[] args) {

        //Declaracion
        String nivelEdu = "";
        double promP, promU, costo;
        double repro;
        int costU = 300;
        int costP = 180;

        //Entradas
        nivelEdu = JOptionPane.showInputDialog("Introduce tu nivel educativo\nmedia superior o superior");

        //Proceso
        if(nivelEdu.equalsIgnoreCase("media superior")){

            //Preparatoria

            promP = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu promedio"));
            if(promP>=9.5 && promP<=10){
            JOptionPane.showMessageDialog(null, "Puedes cursar 55 unidades");
            JOptionPane.showMessageDialog(null, "Costo por cada 5 unidades $180\ny descuento de 25%");
               costo = (costP * 11)-((costP * 11)*0.25);
            JOptionPane.showMessageDialog(null, "costo por 55 unidades es: " + costo);

            }else  if(promP>=9 && promP<9.5){
            JOptionPane.showMessageDialog(null, "Puedes cursar 50 unidades");
            JOptionPane.showMessageDialog(null, "Costo por cada 5 unidades $180\ny descuento de 10%");
                costo = (costP * 10)-((costP * 10)*0.10);
            JOptionPane.showMessageDialog(null, "costo por 50 unidades es: " + costo);
    
            }else  if(promP>7 && promP<9){
            JOptionPane.showMessageDialog(null, "Puedes cursar 50 unidades");
            JOptionPane.showMessageDialog(null, "Costo por cada 5 unidades $180\nno tienes descuento");
                costo = (costP * 10);
            JOptionPane.showMessageDialog(null, "costo por 50 unidades es: " + costo);
        
            }else  if(promP>=5 && promP<=7){

            repro = Double.parseDouble(JOptionPane.showInputDialog("Introduce cuantas materias reprobaste"));

                if(repro>=0 && repro<=3){
                    JOptionPane.showMessageDialog(null, "Puedes cursar 45 unidades");
                    JOptionPane.showMessageDialog(null, "Costo por cada 5 unidades $180\nno tienes descuento");
                        costo = (costP * 9);
                    JOptionPane.showMessageDialog(null, "costo por 45 unidades es: " + costo);    

                }else if(repro>=4){
                    JOptionPane.showMessageDialog(null, "Puedes cursar 40 unidades");
                    JOptionPane.showMessageDialog(null, "Costo por cada 5 unidades $180\nno tienes descuento");
                        costo = (costP * 8);
                    JOptionPane.showMessageDialog(null, "costo por 40 unidades es: " + costo);

                }

            }             
            
        }else if(nivelEdu.equalsIgnoreCase("superior")){

            //Universidad

            promU = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu promedio"));
            if(promU>=9.5 && promU<=10){
            JOptionPane.showMessageDialog(null, "Puedes cursar 55 unidades");
            JOptionPane.showMessageDialog(null, "Costo por cada 5 unidades $300\ny descuento de 20%");
               costo = (costU * 11)-((costU * 11)*0.20);
            JOptionPane.showMessageDialog(null, "costo por 55 unidades es: " + costo);

            }else  if(promU>=9 && promU<9.5){
            JOptionPane.showMessageDialog(null, "Puedes cursar 55 unidades");
            JOptionPane.showMessageDialog(null, "Costo por cada 5 unidades $300\nno tienes descuento");
                costo = (costU * 11);
            JOptionPane.showMessageDialog(null, "costo por 55 unidades es: " + costo);
    
            }

        }
        JOptionPane.showMessageDialog(null, "hasta la proxima...B)");   
    }
    
}
