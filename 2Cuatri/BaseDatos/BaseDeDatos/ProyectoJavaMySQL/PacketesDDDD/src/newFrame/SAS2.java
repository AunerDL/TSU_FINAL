/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newFrame;
import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gabod
 */
public class SAS2 extends JFrame{
    
    private JFrame frame1;
    private Container color;
    private JButton bt1,bt2;
    
    public SAS2(String titulo){
    
        frame1 = new JFrame(titulo);
        bt1 = new JButton("NORTE");
        bt2 = new JButton("SUR");
        
    }
     public void ejecuta(){
    
        frame1.setVisible(true);
        frame1.setSize(500, 200);
        frame1.setLocation(500, 300);
        color=frame1.getContentPane();
        color.setBackground(Color.green);
        BorderLayout obj = new BorderLayout();
        frame1.setLayout(obj);
        frame1.add(bt1, BorderLayout.NORTH);
        frame1.add(bt2, BorderLayout.SOUTH);
        
    }    
}
