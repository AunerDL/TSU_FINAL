/*
 * 7) Problema 7
 * 
 * Tomando como base los resultados en un laboratorio de analisis clinicos, un medico determina si una persona
 * tiene anemia o no, lo cual depende de su nivel de hemoglobina en la sangre, de su edad y de su sexo. Si el
 * nivel de hemoglobina que tiene una es menor que el rango que le coresponde, se determina el resultado como 
 * positivo y en caso contrario como negativo. La tabla en la que el medico se basa para obtener el resultado 
 * es la siguiente:
 *          EDAD                            NIVEL HEMOGLOBINA
 *          0 - 1 mes                       13 - 26 g%
 *          >1 y <=6 meses                  10 - 18 g%
 *          >6 y <=12 meses                 11 - 15 g%
 *          >1 y <=5 años                   11.5 - 15 g%
 *          >5 y <=15 años                  12.6 - 15.5 g%
 *          >10 y =15 años                  13 - 15.5 g%
 *          mujeres >15 años                12 - 16 g%
 *          hombres >15 años                14 - 18 g%
 */

import javax.swing.JOptionPane;
public class AnalisisClinicos {
    public static void main(String[] args) {

        //Declaracion
        double años, meses, Nhemoglo;
        String sexo = "";
        String edad = "";

        //Entradas
        edad =JOptionPane.showInputDialog("Introduce tu edad\nmeses o años");
        
        //Proceso
        if(edad.equalsIgnoreCase("meses")){

            meses = Double.parseDouble(JOptionPane.showInputDialog("introduce tus meses"));

            if(meses==0 && meses==1){
            Nhemoglo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu hemoglobina"));
            if(Nhemoglo>=13 && Nhemoglo<=26){
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es normal");
                JOptionPane.showMessageDialog(null, "Negativo");
            }else{
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es baja");
                JOptionPane.showMessageDialog(null, "Positivo");
            }
            
            }else if(meses>1 && meses<=6){
            Nhemoglo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu hemoglobina"));
            if(Nhemoglo>=10 && Nhemoglo<=18){
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es normal");
                JOptionPane.showMessageDialog(null, "Negativo");
            }else{
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es baja");
                JOptionPane.showMessageDialog(null, "Positivo");
            }
        
            }else if(meses>6 && meses<=12){
            Nhemoglo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu hemoglobina"));
            if(Nhemoglo>=11 && Nhemoglo<=15){
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es normal");
                JOptionPane.showMessageDialog(null, "Negativo");
            }else{
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es baja");
                JOptionPane.showMessageDialog(null, "Positivo");
            }    
            }

        }else if(edad.equalsIgnoreCase("años")){

            años = Double.parseDouble(JOptionPane.showInputDialog("introduce tus años"));

            if(años>=1 && años<=5){
            Nhemoglo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu hemoglobina"));
            if(Nhemoglo>=11.5 && Nhemoglo<=15){
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es normal");
                JOptionPane.showMessageDialog(null, "Negativo");
            }else{
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es baja");
                JOptionPane.showMessageDialog(null, "Positivo");
            }    
        
            }else if(años>5 && años<=15){
            Nhemoglo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu hemoglobina"));
            if(Nhemoglo>=12.6 && Nhemoglo<=15.5){
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es normal");
                JOptionPane.showMessageDialog(null, "Negativo");
            }else{
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es baja");
                JOptionPane.showMessageDialog(null, "Positivo");
            }    
        
            }else if(años>10 && años==15){
            Nhemoglo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu hemoglobina"));
            if(Nhemoglo>=13 && Nhemoglo<=15.5){
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es normal");
                JOptionPane.showMessageDialog(null, "Negativo");
            }else{
                JOptionPane.showMessageDialog(null, "Tu hemoglobina es baja");
                JOptionPane.showMessageDialog(null, "Positivo");
            }    
        
            }else if(años>15){
            sexo = JOptionPane.showInputDialog("Introduce tu sexo\nmujer u hombre");
            if(sexo.equalsIgnoreCase("mujer")){
                Nhemoglo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu Hemoglobina"));
                if(Nhemoglo>=12 && Nhemoglo<=16){
                    JOptionPane.showMessageDialog(null, "Tu hemoglobina es normal");
                    JOptionPane.showMessageDialog(null, "Negativo");
                }else{
                    JOptionPane.showMessageDialog(null, "Tu hemoglobina es baja");
                    JOptionPane.showMessageDialog(null, "Positivo");
                }    
            }else if(sexo.equalsIgnoreCase("hombre")){
                Nhemoglo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu hemoglobina"));
                if(Nhemoglo>=14 && Nhemoglo<=18){
                    JOptionPane.showMessageDialog(null, "Tu hemoglobina es normal");
                    JOptionPane.showMessageDialog(null, "Negativo");
                }else{
                    JOptionPane.showMessageDialog(null, "Tu hemoglobina es baja");
                    JOptionPane.showMessageDialog(null, "Positivo");
            
                } 
                
            }
        } 
        
        }
        JOptionPane.showMessageDialog(null, "Recuperese pronto, hasta luego");
    }
    
}
