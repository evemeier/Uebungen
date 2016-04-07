/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author eve
 */
public class MyFrame extends JFrame {
    
    public MyFrame(){
        super("Voll Geile Titel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        
        //Elemente Erstellen
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuHelp = new JMenu("Help");
        
        JMenuItem miFileNew  = new JMenuItem("New");
        JMenuItem miFileOpen  = new JMenuItem("Open");
        JMenuItem miFileExit  = new JMenuItem("Exit");
        JMenuItem miHelpAbout  = new JMenuItem("About");
        
        menuFile.add(miFileNew);
        menuFile.add(miFileOpen);
        menuFile.add(miFileExit);
        menuBar.add(menuFile);        
        menuHelp.add(miHelpAbout);
        menuBar.add(menuHelp);
        
        setJMenuBar(menuBar);
        
        setVisible(true);
        
        //ActionListeners
        miFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        miHelpAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Copyright", "Simple Menu Exaple", JOptionPane.ERROR_MESSAGE);
            }
        });
        
    }
    
    public static void main(String[] args){
        EventQueue.invokeLater(() -> new MyFrame());
    }
    
}
