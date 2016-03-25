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
public final class SwitchGUI extends JFrame implements ActionListener{
    private final JLabel label = new JLabel ("The switch is OFF");
    private final JButton buttonOn = new JButton ("ON");
    private final JButton buttonOff = new JButton ("OFF");
    private final JButton buttonClose = new JButton("Close");
    
    public SwitchGUI(){
        super("Switch"); //Set windows title
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(100, 150);
        
        //ActionListener für buttonClose
        buttonClose.addActionListener(this);
        buttonOff.addActionListener(this);
        buttonOn.addActionListener(this);
        
        //BoarderLayout is the default layout
        add(buttonOn, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
        add(buttonOff , BorderLayout.SOUTH);
        add(buttonClose, BorderLayout.EAST);
        
        setVisible(true);
    }
    
    //Funktionen
    @Override
    public void actionPerformed(final ActionEvent event){ 
        if (event.getSource() == this.buttonClose){
            System.exit(0); 
        }
        if (event.getSource() == this.buttonOn){
            this.label.setText("The Switch is ON");
        }
        if (event.getSource() == this.buttonOff){
            this.label.setText("The Switch is OFF");
        }
    } 
        
    public static void main(String[] args){
        EventQueue.invokeLater(() -> new SwitchGUI());
    }
}
