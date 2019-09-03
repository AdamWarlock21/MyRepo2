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
public class AccomodationIT {
    
    public AccomodationIT() {
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
     * Test of getAccId method, of class Accomodation.
     */
    @Test
    public void testGetAccId() {
        System.out.println("getAccId");
        Accomodation instance = null;
        String expResult = "";
        String result = instance.getAccId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccAmount method, of class Accomodation.
     */
    @Test
    public void testSetAccAmount() {
        System.out.println("setAccAmount");
        Accomodation instance = null;
        int expResult = 0;
        int result = instance.setAccAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccAmount method, of class Accomodation.
     */
    @Test
    public void testGetAccAmount() {
        System.out.println("getAccAmount");
        Accomodation instance = null;
        int expResult = 0;
        int result = instance.getAccAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Accomodation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Accomodation instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
