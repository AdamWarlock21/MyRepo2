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
public class BookPlanIT {
    
    public BookPlanIT() {
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
     * Test of getBookId method, of class BookPlan.
     */
    @Test
    public void testGetBookId() {
        System.out.println("getBookId");
        BookPlan instance = null;
        String expResult = "";
        String result = instance.getBookId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookName method, of class BookPlan.
     */
    @Test
    public void testGetBookName() {
        System.out.println("getBookName");
        BookPlan instance = null;
        String expResult = "";
        String result = instance.getBookName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookGenre method, of class BookPlan.
     */
    @Test
    public void testGetBookGenre() {
        System.out.println("getBookGenre");
        BookPlan instance = null;
        String expResult = "";
        String result = instance.getBookGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class BookPlan.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        BookPlan instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BookPlan.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BookPlan instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
