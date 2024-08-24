/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pat;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author gabod
 */
public class SAS  extends JFrame{
    private JFrame F1, F2, F3, F4;
    private Container color;
    
    public SAS(String titulo){
         F1 = new JFrame(titulo+"verde");
         F2 = new JFrame(titulo+"rojo");
         F3 = new JFrame(titulo+"cyan");
         F4 = new JFrame(titulo+"negro");
    }
    public void ejecuta(){
    
        F1.setVisible(true);
        F1.setSize(500, 200);
        F1.setLocation(500, 200);
        color=F1.getContentPane();
        color.setBackground(Color.green);
        
    }
    public void ejecuta2(){
    
        F2.setVisible(true);
        F2.setSize(500, 200);
        F2.setLocation(500, 200);
        color=F2.getContentPane();
        color.setBackground(Color.red);
        
    }
    public void ejecuta3(){
    
        F3.setVisible(true);
        F3.setSize(500, 200);
        F3.setLocation(500, 200);
        color=F3.getContentPane();
        color.setBackground(Color.CYAN);
        
    }
    public void ejecuta4(){
    
        F4.setVisible(true);
        F4.setSize(500, 200);
        F4.setLocation(500, 200);
        color=F4.getContentPane();
        color.setBackground(Color.black);
        
    }
    
}
