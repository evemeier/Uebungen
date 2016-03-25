/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP4;
import java.awt.*; //für BorderLayout
import java.awt.event.*; //für ActionListener
import javafx.scene.layout.Border;
import javax.swing.*; //für GUI Elemente
/**
 *
 * @author eve
 */
public final class CircleGUI extends JFrame implements ActionListener, AdjustmentListener {
    //GUI Elemente
    private int radius;
    private Scrollbar slider;
    
    public CircleGUI(){
        super("Circle GUI");
        setSize(200,200);
       
        //Scrollbar
        slider = new Scrollbar(Scrollbar.HORIZONTAL);
        slider.addAdjustmentListener(this);
       
        add(slider, BorderLayout.NORTH);
        
        setVisible(true);
    }
    
    public CircleGUI(int radius){
        this(); 
        setRadius(radius); 
    } 
    
    // AdjustmentListener 
    public void adjustmentValueChanged(AdjustmentEvent e) 
    { 
        setRadius(e.getValue()); 
    }
    
    public void setRadius(int radius) { 
        this.radius = radius; 
        repaint(); 
    }
    
    public void paint(Graphics g){ 
        super.paint(g); // paint() der Oberklasse aufrufen 
        this.radius = slider.getValue(); 
        //getWidth und getHight um Kreis zu zentrieren
        g.fillOval(((getWidth()/2)-radius), ((getHeight()/2)-radius), radius*2, radius*2);
    }

     public static void main(String[] args){
        EventQueue.invokeLater(() -> new CircleGUI());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0); 
    }
}
