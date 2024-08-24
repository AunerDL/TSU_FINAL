/*
 * 6) Problema 6
 * 
 * El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente año.
 * La manera de planificarlas depende de lo siguiente:
 * 
 * Si actualmente su capital se encuentra con saldo negativo, pedira un prestamo bancario para que su 
 * nuevo saldo sea de $10000. Si su captal tiene actualmente un saldo positivo pedira un prestamo 
 * bancario para tener un nuevo saldo de $20000, pero si su capital tiene actualmente un saldo superior
 * a los $20000 no pedira ningun prestamo. Posteriormente repartira su presupuesto de la siguiente manera.
 *      $5000 para equipo de computo.
 *      $2000 para mobiliario.
 * Y el resto a la mitad sera para la comprade insumos y la otra para otrogar incentivos al personal.
 * Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y, en caso
 * de que fuera necesario, a cuanto ascenderia la cantidad que se pediria al banco.
 */

import javax.swing.JOptionPane;
public class DuenoDeEmpresa {
    public static void main(String[] args) {

        //Declaracion 
        double capital, prestamo, distri, distri2;
        String cadena;

        //Entradas
        capital = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu saldo"));

        //Proceso
        if(capital<=0){
            JOptionPane.showMessageDialog(null, "JA, pobre :p");
            
        }else if(capital<10000){
            JOptionPane.showMessageDialog(null, "Tu saldo es negartivo");
            JOptionPane.showMessageDialog(null, "Tu prestamo es de $20,000");
                prestamo = capital + 20000;
            JOptionPane.showMessageDialog(null, "Tu saldo es " + prestamo);
                distri = (prestamo - 5000) - 2000;
                distri2 = distri/2;
            cadena = 5000 + " para equpo de computo\n" + 2000 + " para mobiliario\n" + distri2 + " parainsumos\n" + distri2 + " para incentivos";
            JOptionPane.showMessageDialog(null, "Tu distribucion sera:\n" + cadena);

        }else if(capital>10000 && capital<20000){
            JOptionPane.showMessageDialog(null, "Tu saldo es positivo");
            JOptionPane.showMessageDialog(null, "Tu prestamo es de $10,000");
                prestamo = capital + 10000;
            JOptionPane.showMessageDialog(null, "Tu saldo es " + prestamo);
                distri = (prestamo - 5000) - 2000;
                distri2 = distri/2;
            cadena = 5000 + " para equpo de computo\n" + 2000 + " para mobiliario\n" + distri2 + " parainsumos\n" + distri2 + " para incentivos";
            JOptionPane.showMessageDialog(null, "Tu distribucion sera:\n" + cadena);

        }else if(capital>20000){
            JOptionPane.showMessageDialog(null, "Tu saldo es superior");
                distri = (capital - 5000) - 2000;
                distri2 = distri/2;
            cadena = 5000 + "para equpo de computo\n" + 2000 + "para mobiliario\n" + distri2 + "parainsumos\n" + distri2 + "para incentivos";
            JOptionPane.showMessageDialog(null, "Tu distribucion sera:\n " + cadena);

        }

        JOptionPane.showMessageDialog(null, "Hasta la proxima...");
        
    }
    
}
