/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP4;
import java.awt.*; //für BorderLayout
import java.awt.event.*; //für ActionListener
import javax.swing.*; //für GUI Elemente

/**
 *
 * @author eve
 */
public class Calculator extends JFrame{
    
    private final JButton button0 = new JButton ("0");
    private final JButton button1 = new JButton ("1");
    private final JButton button2 = new JButton ("2");
    private final JButton button3 = new JButton ("3");
    private final JButton button4 = new JButton ("4");
    private final JButton button5 = new JButton ("5");
    private final JButton button6 = new JButton ("6");
    private final JButton button7 = new JButton ("7");
    private final JButton button8 = new JButton ("8");
    private final JButton button9 = new JButton ("9");
    private final JButton buttonC = new JButton ("C");
    private final JButton buttonS = new JButton ("S");
    private final JButton buttonGleich = new JButton ("=");
    private final JButton buttonDiv = new JButton ("/");
    private final JButton buttonMul = new JButton (("*"));
    private final JButton buttonSub = new JButton ("-");
    private final JButton buttonSum = new JButton ("+");
    private TextField text; 

    
    public Calculator(){
     super("Calculator"); //Set windows title
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     setSize(250, 210);
     setResizable(false);  //Fenstergrösse nicht Veränderbar
    
     Panel panel = new Panel(new GridLayout(5,4));
     panel.add(button7); 
     panel.add(button8); 
     panel.add(button9); 
     panel.add(buttonDiv); 
     panel.add(button4); 
     panel.add(button5); 
     panel.add(button6);
     panel.add(buttonMul);
     panel.add(button1);
     panel.add(button2);
     panel.add(button3);
     panel.add(buttonSub);
     panel.add(button0);
     panel.add(buttonS);
     panel.add(buttonGleich);
     panel.add(buttonSum);
     panel.add(buttonC); 
     
    text = new TextField(); 
    text.setEditable(false); 
    text.setBackground(Color.white); 
        
    add(text, BorderLayout.NORTH); 
    add(panel, BorderLayout.SOUTH); 
     
     setVisible(true);
    }
     public static void main(String[] args){
        EventQueue.invokeLater(() -> new Calculator());
    }
}
