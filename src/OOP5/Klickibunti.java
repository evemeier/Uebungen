/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP5;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author eve
 */
public class Klickibunti extends JFrame {
    
    private int clicks = 0;
    
    public Klickibunti(){
        super("Klickibunti Fenster");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        
        JButton button = new JButton("Count button clicks");
        JLabel label = new JLabel("Number clicks: " + clicks);
        
        setLayout(new GridLayout(0, 1));
        add(button);
        add(label);
        
        setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks ++;
                label.setText("Number clicks: " + clicks);
            }
        });
    }
    
    public static void main(String[] args){
        EventQueue.invokeLater(() -> new Klickibunti());
    }
    
    
}
