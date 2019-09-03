/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BooBoo
 */
public class TransportIT {
    
    public TransportIT() {
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
     * Test of getTransId method, of class Transport.
     */
    @Test
    public void testGetTransId() {
        System.out.println("getTransId");
        Transport instance = null;
        String expResult = "";
        String result = instance.getTransId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransDestination method, of class Transport.
     */
    @Test
    public void testGetTransDestination() {
        System.out.println("getTransDestination");
        Transport instance = null;
        String expResult = "";
        String result = instance.getTransDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransPickUp method, of class Transport.
     */
    @Test
    public void testGetTransPickUp() {
        System.out.println("getTransPickUp");
        Transport instance = null;
        String expResult = "";
        String result = instance.getTransPickUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransTime method, of class Transport.
     */
    @Test
    public void testGetTransTime() {
        System.out.println("getTransTime");
        Transport instance = null;
        String expResult = "";
        String result = instance.getTransTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Transport.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Transport instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
