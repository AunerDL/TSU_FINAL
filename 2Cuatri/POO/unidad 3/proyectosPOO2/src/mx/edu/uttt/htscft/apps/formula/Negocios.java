/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uttt.htscft.apps.formula;

import mx.edu.uttt.htscft.apps.soporte.mat;

/**
 *
 * @author gabod
 */
public class Negocios {
    
    public double evaluarEcuacion (double a, double b, double n) {

        double z,v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11;
        v1= mat.potencia (a,0.5); 
        v2=mat.raizcuadrada (b);
        v3=v1+v2;
        v4= mat.raizCubica (a*b);
        v5= mat.logaritmoNatural (a/b);
        v6= v4+v5;
        v7= v3/v6;
        v8= mat.logaritmoNeper (a*b);
        v9= mat.seno (a) *mat.coseno (b);
        v10=v8/v9;
        v11=v7*v10; 
        System.out.println(mat. factorial (n));
        z=v11+mat.factorial (n);
        
        return z;
    }
    
}
