/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulacion.name;

/**
 *
 * @author gabod
 */
public class encapsulacion {
    //declarar
    private int x, y;
    private boolean bandera = true;
    
    //constructor
    public encapsulacion(int x, int y){
        if(x>0 && y!=0){
            this.x=x;
            this.y=y;           
        }else{
            System.out.println("Datos incorrectos");
            bandera = false;
        }
    }
    
    public int getx(){
        return x;
    }
    
    public int gety(){
        return y;
    }
    
    public boolean isBandera(){
        return bandera;
    }
    
}
