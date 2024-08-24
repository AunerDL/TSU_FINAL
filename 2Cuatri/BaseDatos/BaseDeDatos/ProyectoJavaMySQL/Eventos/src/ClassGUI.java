/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabod
 */
import java.awt.GridLayout;
import javax.swing.*;

public class ClassGUI extends JFrame{
    
    private JFrame frame;
    private JPanel panel;
    private JButton btsuma;
    private JTextField txtDato1, txtDato2, txtResultado;
    
    ClassGUI(String titulo){
    
        this.frame = new JFrame(titulo);
        this.panel = new JPanel();
        this.btsuma = new JButton("+");
        this.txtDato1 = new JTextField(5);
        this.txtDato2 = new JTextField(5);
        this.txtResultado = new JTextField(5);
    
    }
    public void ejecutarGui(){
    
        frame.setSize(200, 300);
        panel.setLayout(new GridLayout(4, 1));
        panel.add(txtDato1);
        panel.add(txtDato2);
        panel.add(btsuma);
        panel.add(txtResultado);
        frame.add(panel);
        ClaseEventos objetos = new ClaseEventos();
        txtDato1.addKeyListener(objetos);
        btsuma.addActionListener(objetos);
        
        frame.setVisible(true);
    
    }
    
}
