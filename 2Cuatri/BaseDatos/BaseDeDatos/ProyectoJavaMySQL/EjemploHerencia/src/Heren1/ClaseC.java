/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heren1;

/**
 *
 * @author gabod
 */
public class ClaseC extends ClaseD implements IClaseA, IClaseB{
    
    
    public void metodo1(){
        System.out.println("Dentro del metodo 1 de clase C");
    }
    
    
    public int metodo2(){
        return 100;
    }
    
    
    public void metodo3(int a, double b){
        System.out.println("Dentro del metodo 3 de clase C");
        System.out.println("a="+a+" b="+b);
    }
    
    public void metodo4(){
        super.metodo4();
        System.out.println("Dentro del metodo 4 de ClaseC, sobre escritura metodo");
    }
    
}
