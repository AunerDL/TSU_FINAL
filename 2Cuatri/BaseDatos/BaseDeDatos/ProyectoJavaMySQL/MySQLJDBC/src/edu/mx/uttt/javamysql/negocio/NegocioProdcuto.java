/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.javamysql.negocio;
import edu.mx.uttt.javamysql.conexion.conexion;
import edu.mx.uttt.javamysql.modelo.ModeloProducto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author gabod
 */
public class NegocioProdcuto {
    
    public static boolean agregar(ModeloProducto prod){
        
        Connection con = conexion.obtenerConexion();
        String sql = "insert into productos(id_fab,id_producto,descripcion,precio,stock) values(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, prod.getIdFab());
            ps.setString(2, prod.getIdProducto());
            ps.setString(3, prod.getDescripcion());
            ps.setDouble(4, prod.getPrecio());
            ps.setInt(5, prod.getStock());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROS: " + e.getMessage());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("ERROS: " + e.getMessage());
            }
            
        }
        
    }
    
}
