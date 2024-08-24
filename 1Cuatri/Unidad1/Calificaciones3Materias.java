/*
 * Un alumno desea saber ccual sera su promedio general en las 3 materias mas dificiles en general y 
 * en cada una de ellas. Estas materias se evaluan como se muestra:
 * 
 * Matematicas:
 * a)Examen 90%
 * b)Tareas 10%
 * En esta materia se pidio un total de 3 tareas
 * 
 * Fisica: 
 * a)Examen 80%
 * b)Tareas 20%
 * En esta materia se pide un total de 2 tareas
 * 
 * Qimica:
 * a)Examen 85%
 * b)Tareas 15%
 * En esta materia se pidio un total de 3 tareas
 */

import javax.swing.JOptionPane;

public class Calificaciones3Materias {
    public static void main(String[] args) {

        //Declaracion de variables
        double MCT1, MCT2, MCT3, MCT, MCE, FC1, FC2, FCT, FCE, QCT1, QCT2, QCT3, QCT, QCE, MCF, FCF, QCF, califi_general;
        String calificacion_general;

        //Entradas
        MCT1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de tarea matematicas 1"));
        MCT2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de tarea matematicas 2"));
        MCT3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de tarea matematicas 3"));
        MCE = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de examen matematicas"));
        MCT = (MCT1 + MCT2 + MCT3)/ 3;
        MCF = MCT + MCE;

        FC1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de tarea fisica 1"));
        FC2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de tarea fisica 2"));
        FCE = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de examen fisica"));
        FCT = (FC1 + FC2)/ 2;
        FCF = FCT + FCE;

        QCT1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de tarea quimica 1"));
        QCT2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de tarea quimica 2"));
        QCT3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de tarea quimica 3"));
        QCE = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calficacion de examen quimica"));
        QCT = (QCT1 + QCT2 + QCT3)/ 3;
        QCF = QCT + QCE; 
       
        //Proceso
       califi_general = (MCF + FCF + QCF)/ 3;


        //Salida
        calificacion_general = MCF + "calificacion final mate\n" + FCF + "calificacion final fisica\n" + QCF + "calificacion final quimica\n" + 
        califi_general + "promedio general";

        JOptionPane.showMessageDialog(null, calificacion_general);



    



        
    

    }
    
}
