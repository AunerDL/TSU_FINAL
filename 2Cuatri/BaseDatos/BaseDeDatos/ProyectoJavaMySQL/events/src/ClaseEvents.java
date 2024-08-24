/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabod
 */
import java.awt.event.*;
import javax.swing.*;
import java.util.EventListener;
public class ClaseEvents implements ActionListener, KeyListener{
    
    private JTextField txtDato1, txtDato2, txtResultado;
    private JButton btsuma;
    
    public ClaseEvents(JTextField txtDato1, JTextField txtDato2, JButton btsuma, JTextField txtResultado){
    
        this.txtDato1 = txtDato1;
        this.txtDato2 = txtDato2;
        this.btsuma = btsuma;
        this.txtResultado = txtResultado;
        
    }
    public void actionPerformed(ActionEvent e){
    
        double v1 = Double.parseDouble(txtDato1.getText());
        double v2 = Double.parseDouble(txtDato2.getText());
        double r= v1 + v2;
        txtResultado.setText(Double.toString(r));
    
    }
    public void KeyTyped(KeyEvent e){
    }
    public void  KeyPressed(KeyEvent e){
    
        int enter = e.getKeyCode();
        if(enter==10){
            txtDato2.requestFocus();
        }
    
    }
    public void KeyReleased(KeyEvent e){
    
    }
    
}
