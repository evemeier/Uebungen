/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP8;

import java.awt.Graphics;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author eve
 */
public class BallPanel extends JFrame implements Runnable {
        
    private final JPanel panel = new JPanel();
    private ArrayList<Ball> list = new ArrayList<Ball>();

    public BallPanel(){
        super("Bälle voll cool");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                printBall(e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        add(panel);
        setVisible(true);
        
        Thread tBall = new Thread(this);
        tBall.start();
       
    }
    
    private void printBall(int x, int y) {
        Ball ball = new Ball(x, y);
        Thread tBall = new Thread(ball);
        tBall.start();
        list.add(ball);
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Iterator<Ball> itr = list.iterator();
        while (itr.hasNext()) {
            Ball ball = (Ball) itr.next();
            if (!ball.isIsAlive()) {
                itr.remove();
            }
            g.setColor(ball.getColor());
            g.fillArc(ball.getX(), ball.getY(), ball.getRadius(), ball.getRadius(), 0, 360);  //von Grad 0 bis 360
        }
    }
    
}
