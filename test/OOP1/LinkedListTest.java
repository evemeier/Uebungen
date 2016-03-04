/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

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
public class LinkedListTest {
    
    public LinkedListTest() {
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
     * Test of isFound method, of class LinkedList.
     */
    @Test
    public void testIsFound() {
        System.out.println("isFound");
        Konto konto = null;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isFound(konto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }

    /**
     * Test of insert method, of class LinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Konto konto = null;
        LinkedList instance = new LinkedList();
        instance.insert(konto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class LinkedList.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        LinkedList instance = new LinkedList();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of length method, of class LinkedList.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        LinkedList instance = new LinkedList();
        instance.length();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
