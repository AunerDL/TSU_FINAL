/*
 * Un alumno desea saber cual sera su calificacion final de la materia de metodologia. 
 * Dicha calificacion se compone de los siguientes porcentajes
 * a)55 % de promedio de sus tres calificaciones parciales
 * b)30 % de la calificacion del examen final
 * c)15 % de la calificacion de un trabajo final
 */

import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
       
        //Declaracion de variables
        final double Califi_1 = 0.0;
        final double Califi_2 = 0.0;
        final double Califi_3 = 0.0;
        final double EXAMEN;
        final double TRABAJO_FIN;
        double calificacion_parcial, calificacion_1, calificacion_2, calificacion_3, examen, trabajo_final; 
        String promedio_final;

        //Entradas
        calificacion_1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 1"));
        calificacion_2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 2"));
        calificacion_3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 3"));
        examen = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del examen"));
        trabajo_final = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion del trabajo"));
        
        //Proceso
        calificacion_parcial = (calificacion_1 + calificacion_2 + calificacion_3) * (0.3);
        EXAMEN = (examen * 0.3);
        TRABAJO_FIN = (trabajo_final * 0.3);

        
        promedio_final = calificacion_parcial + "\ncalificacion del parcial = " + EXAMEN + "\nexamen = " + TRABAJO_FIN + "\ntrabajo final = " ;

        //Salida
        JOptionPane.showMessageDialog(null, promedio_final);

    }
    
}
