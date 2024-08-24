/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.javamysql.conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author gabod
 */
public class conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/bdejemplo?serverTimezone=UT";
    private static final String USER = "root";
    private static final String PASS = "121314";
    
    public static Connection obtenerConexion(){
        Connection con = null;
        
        
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Coneccion excitosa");
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        return con;
    }
    
}
