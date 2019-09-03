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
public class StudBudgetIT {
    
    public StudBudgetIT() {
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
     * Test of SetBalance method, of class StudBudget.
     */
    @Test
    public void testSetBalance() {
        System.out.println("SetBalance");
        StudBudget instance = null;
        int expResult = 0;
        int result = instance.SetBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBudgetId method, of class StudBudget.
     */
    @Test
    public void testGetBudgetId() {
        System.out.println("getBudgetId");
        StudBudget instance = null;
        String expResult = "";
        String result = instance.getBudgetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBudgetAmount method, of class StudBudget.
     */
    @Test
    public void testGetBudgetAmount() {
        System.out.println("getBudgetAmount");
        StudBudget instance = null;
        int expResult = 0;
        int result = instance.getBudgetAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpenses method, of class StudBudget.
     */
    @Test
    public void testGetExpenses() {
        System.out.println("getExpenses");
        StudBudget instance = null;
        int expResult = 0;
        int result = instance.getExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class StudBudget.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        StudBudget instance = null;
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StudBudget.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StudBudget instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
