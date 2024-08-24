/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

/**
 *
 * @author gabod
 */
public class ClaseB extends ClaseA{
    
    public ClaseB(){
        super();
        System.out.println("Estoy  en B");
    }
    public void metodo1(){
        super.metodo1();
        System.out.println("Sobre escriturra del metodo 2 de B");
    }
    public String metodo2(){
        super.metodo2();
        System.out.println("Segunda llamada del metodo 1 de clase A " + super.metodo2());
        return "Sobre escritura de metodos";
    }
    
}
