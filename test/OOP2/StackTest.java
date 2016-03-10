/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eve
 */
public class StackTest {
    
    Stack<String> stack = new Stack<>();
   
    public StackTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String str1 = "Capday";
        stack.push(str1);
        assertEquals(1, stack.getTopIndex());
        String str2 = "Capday Yeah";
        stack.push(str2);
        assertEquals(2, stack.getTopIndex());
        
        
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        String result =  stack.pop();
        assertEquals("Capday Yeah", result);
       
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult = false;
        boolean result = stack.isEmpty();
        assertEquals(expResult, result);
    }
    
}
