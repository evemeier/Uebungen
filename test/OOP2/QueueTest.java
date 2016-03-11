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
public class QueueTest {
    
    public QueueTest() {
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
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        String x = "Erster Eintrag";
        Queue<String> instance = new Queue();
        System.out.println(instance.isEmpty());
        instance.enqueue(x);
        System.out.println(instance.isEmpty());
    }

    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
       
        String x = "Erster Eintrag";
        Queue<String> instance = new Queue();
        System.out.println(instance.isEmpty());
        System.out.println(instance.dequeue());
        System.out.println(instance.isEmpty());
        instance.enqueue(x);
        System.out.println(instance.dequeue());
        System.out.println(instance.isEmpty());
        
    }

    /**
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Queue<String> instance = new Queue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
        String x = "Erster Eintrag";
        instance.enqueue(x);
        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);    
       
    }

    /**
     * Test of isFull method, of class Queue.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Queue<String> instance = new Queue();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
    }
    
}
