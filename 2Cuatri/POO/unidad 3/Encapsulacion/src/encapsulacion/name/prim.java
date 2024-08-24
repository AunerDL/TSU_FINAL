/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulacion.name;

/**
 *
 * @author gabod
 */
public class prim {
    public static void main(String[] args) {
        //instanciar vistqa
        vista datos = new vista();
        //instanciar encapsulacion
        encapsulacion bla = new encapsulacion(datos.solicitarx(), datos.solicitary());
        if(bla.isBandera()){
            //instancia para formula
            formula calcu = new formula();
            double z = calcu.evaluFormu(bla.getx(), bla.gety());
            datos.mostrarResultado(z);
        }else{
            datos.mostrarError();
        }
    }
    
}
