/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.javamysql.controlador;
import edu.mx.uttt.javamysql.negocio.NegocioProdcuto;
import edu.mx.uttt.javamysql.modelo.ModeloProducto;

/**
 *
 * @author gabod
 */
public class controlProducto {
    
    public static boolean agregar(ModeloProducto prod){
        return NegocioProdcuto.agregar(prod);
    }
    
}
