/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulacion.name;
import javax.swing.JOptionPane;
/**
 *
 * @author gabod
 */
public class vista {
    
    //solicitar datos
    //obtener x
    public int solicitarx(){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa x"));
        return x;
    }
    public int solicitary(){
        int y=Integer.parseInt(JOptionPane.showInputDialog("Ingresa y"));
        return y;
    }
    
    //Mostrar resultados
    public void mostrarResultado(double z){
        System.out.println("El resultado es " + z);
    }
    public void mostrarError(){
        System.out.println("Datos incorrectos");
    }
    
}
