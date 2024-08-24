import javax.swing.JOptionPane;
public class LetterGrade {
    public static void main(String[] args) {

        //Declaracion de variables
        double calif;
        char letra;

        //Entradas
        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion"));

        //Seleccion
        if(calif>90){
            letra = 'A';
        }else 
        if(calif>=80){
            letra = 'B';
        }else
        if(calif>=70){
            letra = 'C';
        }else
        if(calif>=60){
            letra = 'D';
        }else{ 
            letra = 'F';
        }
        JOptionPane.showMessageDialog(null, "Tu calificacion es: " + letra);        
    }

}
