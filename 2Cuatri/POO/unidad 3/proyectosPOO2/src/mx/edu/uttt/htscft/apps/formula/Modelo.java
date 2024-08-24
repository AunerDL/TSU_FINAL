/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uttt.htscft.apps.formula;

/**
 *
 * @author gabod
 */
public class Modelo {
    
    private double a, b;
    private double n;

    public Modelo(double a, double b, double n){
        this.a=a;
        this.b=b;
        this.n=n;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getN(){
        return n;
    }
    
}
