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
public class Calculator extends JFrame implements ActionListener{
    
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
    
    private int operand1;
    private int operand2;
    private int resultat;
    private int operator;
    
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
     
    button0.addActionListener(this);
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    buttonC.addActionListener(this);
    buttonS.addActionListener(this);
    buttonGleich.addActionListener(this);
    buttonDiv.addActionListener(this);
    buttonMul.addActionListener(this);
    buttonSub.addActionListener(this);
    buttonSum.addActionListener(this);
    
    setVisible(true);
    }
     public static void main(String[] args){
        EventQueue.invokeLater(() -> new Calculator());
    }
    public void actionPerformed(ActionEvent event){
        //Rechenlogik
        
        //Erster Buchstabe der Buttonbeschriftung holen
        char ch = (event.getActionCommand()).charAt(0);
        
        //Durch ersten Buchstaben des Buttons - Operand setzen
        switch(ch){
            case '+':
                operator = 1;
                break;
            case '-':
                operator = 2;
                break;
            case '*':
                operator = 3;
                break;
            case '/':
                operator = 4;
                break;
                
           //Wenn Gleich gedrückt Resulat berechnen und ausgeben
            case '=':
                switch(operator){
                    case 0:
                        resultat= operand1;
                        break;
                    case 1:
                        resultat = operand1 + operand2;
                        operator = 0;
                        break;
                    case 2:
                        resultat = operand1 - operand2;
                        operator = 0;
                        break;
                    case 3:
                        resultat = operand1 * operand2;
                        operator = 0;
                        break;
                    case 4:
                        resultat = operand1 / operand2;
                        operator = 0;
                        break;
                }
                text.setText("" + resultat);
                break;
                
            //Wenn Clear gedrückt alles löschen und 0 anzeigen    
            case 'C':
                operator = 0;
                operand1 = 0;
                operand2 = 0;
                resultat = 0;
                text.setText("" + resultat);
                break;
            
            //Wenn S gedrückt falls kein Operand operator 1 zeichen kehren und anzeigen, sonst operator2
            case 'S':
                if(operator == 0){
                    operand1 *= -1;
                    text.setText(""+operand1);
                }
                else{
                    operand2 *= -1;
                    text.setText(""+operand2);
                }
                break;
            //Wenn nichts oben zutrifft, dann wird es wohl eine Zahl sein
            default:
                int digit = ch - '0'; // int Wert bestimmen von Char
                if (operator == 0){
                    operand1 = (operand1 * 10) + digit;
                    text.setText(""+operand1);
                }
                else{
                    operand2 = (operand2 * 10) + digit;
                    text.setText(""+operand2);
                }
                break;
                           
        } //Klammer zu Switch
              
    } //Klammer zu Funktion
}
