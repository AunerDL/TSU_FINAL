/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tilinos;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author gabod
 */
public class CLAsep extends JFrame{
    
    private JFrame frame;
    //private Container color;
    private JLabel lblTitulo, lblNomina, lblRFC, lblNombre, lblApellidoP, lblApellidoM, lblDireccion;
    private JTextField txtnomina, txtRFC, txtNombre, txtApellidoP, txtApellidoM, txtDireccion;
    private JButton btnEnviar, btnImprimir, btnSalir; 
    private JPanel panel1, panel2, panel3;
    
    public CLAsep(String titulo){

        frame = new JFrame(titulo);
        btnEnviar = new JButton("ENVIAR");
        btnImprimir = new JButton("IMPRIMIR");
        btnSalir = new JButton("SALIR");
        
        //campos txt
        
        
        txtnomina = new JTextField(10);
        txtRFC = new JTextField(10);
        txtNombre = new JTextField(10);
        txtApellidoP = new JTextField(10);
        txtApellidoM = new JTextField(10);
        txtDireccion = new JTextField(10);
        
        lblTitulo = new JLabel("Registro personal");
        lblNomina = new JLabel("No de Nomina");
        lblRFC = new JLabel("RFC");
        lblNombre = new JLabel("Nombre");
        lblApellidoP = new JLabel("Apellido Paterno");
        lblApellidoM = new JLabel("Apellido Materno");
        lblDireccion = new JLabel("Direccion");
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
}
    
    public void ejecutar(){
    
        frame.setVisible(true);
        frame.setSize(700, 200);
        frame.setLocation(100, 200);
        //frame.setLayout(new BorderLayout());
        //agregar campos al panel 1
        
        panel1.add(lblTitulo);
        
        panel2.add(lblNomina);
        panel2.add(lblRFC);
        panel2.add(lblNombre);
        panel2.add(lblApellidoP);
        panel2.add(lblApellidoM);
        panel2.add(lblDireccion);
        panel2.setLayout(new GridLayout(1, 4));
        
        panel3.add(btnEnviar);
        panel3.add(btnImprimir);
        panel3.add(btnSalir);
        
        panel1.setLayout(new GridLayout(1, 1));
        panel2.setLayout(new GridLayout(6, 2));
        panel3.setLayout(new GridLayout(1, 3));
        /*panel2.add(btnButton1);
        panel2.add(btnButton2);
        panel2.add(btnButton3);
        panel2.add(btnButton4);
        panel2.setLayout(new GridLayout(1, 4));*/
        
        //areas
        
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);
        //frame.pack();
        
        
    }
    
}
