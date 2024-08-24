/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uttt.htscft.apps.formula;



/**
 *
 * @author gabod
 */
public class Controladora {
    
    public void control () {
        Vista datos = new Vista();
        double a = datos.solicitarA();
        double b = datos.solicitarB();
        double n = datos.solicitarN();

        if ((a > 0 && a <= 1) && (b > 0 && b <= 1) && (n > 0)) {
        Modelo mod = new Modelo(a, b, n);
        Negocios neg = new Negocios();
        double r= neg.evaluarEcuacion (mod.getA(), mod.getB(), mod.getN());
        datos.resultado(r);
        } else {
        
        datos.Error();
        
        }
        
    }
    
}
