/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP4;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author eve
 */
public class BalloonTest {
    
    public BalloonTest() {
    }
    /**
     * Test of equals method, of class Balloon.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
       
        
        final Balloon balloon1 = new Balloon("1", Color.GREEN);
        final Balloon balloon2 = new Balloon("1", Color.GREEN);
        final Balloon balloon3 = new Balloon ("3", Color.GREEN);
        final Balloon balloon4 = new Balloon ("1", Color.BLUE);
        final Balloon balloon5 = new Balloon ("5", Color.RED);
           
        boolean result = balloon1.equals(balloon2);
        System.out.println(result);
        assertEquals(true, result);
       
        boolean result2 = balloon1.equals(balloon3);
        System.out.println(result2);
        assertEquals(false, result2);
        
        boolean result3 = balloon1.equals(balloon4);
        System.out.println(result3);
        assertEquals(false, result3);
        
        boolean result4 = balloon1.equals(balloon5);
        System.out.println(result4);
        assertEquals(false, result4);
       
    }
    
     @Test
    public void testHashCode() {
        System.out.println("hashCode");
       
        final Balloon balloon1 = new Balloon("1", Color.GREEN);
        final Balloon balloon2 = new Balloon("1", Color.GREEN);
        final Balloon balloon3 = new Balloon ("3", Color.GREEN);
        final Balloon balloon4 = new Balloon ("1", Color.BLUE);
        final Balloon balloon5 = new Balloon ("5", Color.RED);
        
              
        assertEquals(true, balloon1.hashCode() == balloon2.hashCode());
        assertEquals(false, balloon1.hashCode() == balloon3.hashCode());
        assertEquals(false, balloon1.hashCode() == balloon4.hashCode());
        assertEquals(false, balloon1.hashCode() == balloon5.hashCode());
       
    }
}
