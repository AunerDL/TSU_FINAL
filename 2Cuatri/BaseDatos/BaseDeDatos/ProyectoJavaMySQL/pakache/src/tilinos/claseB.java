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
public class claseB extends JFrame{
    
    private JFrame frame;
    private Container color;
    private JLabel lbEti1, lbEti2;
    private JButton bt1, bt2, bt3, bt4, bt5;
    private JPanel panel1, panel2;
    private JTextField txtT1, txtT2;
    
    public claseB(String titulo){
    
        frame = new JFrame(titulo);
        bt1 = new JButton("BOTON 1");
        bt2 = new JButton("BOTON 2");
        bt3 = new JButton("BOTON 3");
        bt4 = new JButton("BOTON 4");
        bt5 = new JButton("BOTON 5");
        lbEti1 = new JLabel("Dato 1");
        lbEti2 = new JLabel("Dato 2");
        txtT1 = new JTextField();
        txtT2 = new JTextField();
        panel1 = new JPanel();
        panel2 = new JPanel();
        
    }
    public void ejecuta(){
    
        frame.setVisible(true);
        frame.setSize(400, 200);
        frame.setLocation(WIDTH, WIDTH);
        color=frame.getContentPane();
        color.setBackground(Color.red);
        frame.setLayout(new BorderLayout());
        
        panel1.add(lbEti1);
        panel1.add(txtT1);
        panel1.add(lbEti2);
        panel1.add(txtT2);
        panel1.setLayout(new GridLayout(1,4));
        
        panel2.add(bt1);
        panel2.add(bt2);
        panel2.add(bt3);
        panel2.add(bt4);
        panel2.add(bt5);
        panel2.setLayout(new GridLayout(1,4));
        
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.pack();
        
    }
    
}
