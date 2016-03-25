/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP4;
import java.awt.Color;
import java.util.Objects;

/**
 *
 * @author eve
 */
public final class Balloon {
    private final String text;
    private int size;
    private Color color; //from Java.awt.color   


    public Balloon(final String text, final Color color){
        this.text = text;
        this.size = 0;
        this.color = color;
    }
    
    public void blowUp(){
        size = size+5;
    }
    
    public void deflate(){
        size = 0;
    }
    
    @Override
    public String toString(){
        return ("Balloon[text='" + this.text + "', size=" + this.size + ", Color=" + this.color + "]");
    }
    
    @Override
    public boolean equals(final Object other){
        //1. Test auf identität
        if (this == other){
            return true;
        }
        
        //2. Test auf null
        if (other == null){
            return false;
        }
        
        //3. Test auf Vergleichbarkeit
        if (other.getClass() != this.getClass()){
            return false;
        }
        
        //4.Effektiver Vergleich Attribute 
        return (Objects.equals(this.text, (((Balloon)other).text))) && (Objects.equals(this.color, (((Balloon)other).color)));
    }
    
    @Override
    public int hashCode(){
        return((text != null ? text.hashCode() : 7) + (color != null ? color.hashCode() : 7));
    }
}