import javax.swing.JOptionPane;
/*
 * Determinar si un alumno aprueva o reprueva un curso, sabiendo que aprobara si su promedio de tres 
 * calificaciones es mayor o igual a 70, reprueba en caso contrario.
 */
public class PromedioCalificaciones {
    public static void main(String[] args) {

        double califi = 0.0, califi2 = 0.0, califi3 = 0.0;
        String respuesta;

        califi = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu primera calificacion"));
        califi2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu segunda calificacion"));
        califi3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu tercera calificacion"));

        respuesta = "El promedio es: " + promediar(califi, califi2, califi3) + "\nu resultado es: " 
        + promediar(califi, califi2, califi3);

        //respuesta = promediar(califi,califi2,califi3);

        JOptionPane.showMessageDialog(null, respuesta);

    }

    public static String promediar(double c1, double c2, double c3){
        String respuesta = "";
        double prom = 0.0;

        prom = (c1+c2+c3)/3.0;

        if(prom>=8.0){
            respuesta = "Aprobado";
        }else{
            respuesta = "Reprobado";
        }

        return respuesta;
    }

    public static double solicitarCalificacion(){

        double calfi = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion"));
        return calfi;
    }

    public static double promedio(){
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 1"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 2"));
        double c3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 3"));

        return (c1+c2+c3)/3.0;
    
    }
    
}
