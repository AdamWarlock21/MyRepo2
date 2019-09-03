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
public class TravelPlanIT {
    
    public TravelPlanIT() {
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
     * Test of getPlanId method, of class TravelPlan.
     */
    @Test
    public void testGetPlanId() {
        System.out.println("getPlanId");
        TravelPlan instance = null;
        String expResult = "";
        String result = instance.getPlanId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class TravelPlan.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        TravelPlan instance = null;
        int expResult = 0;
        int result = instance.setBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTravelAmount method, of class TravelPlan.
     */
    @Test
    public void testGetTravelAmount() {
        System.out.println("getTravelAmount");
        TravelPlan instance = null;
        int expResult = 0;
        int result = instance.getTravelAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTravelExp method, of class TravelPlan.
     */
    @Test
    public void testGetTravelExp() {
        System.out.println("getTravelExp");
        TravelPlan instance = null;
        int expResult = 0;
        int result = instance.getTravelExp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TravelBal method, of class TravelPlan.
     */
    @Test
    public void testTravelBal() {
        System.out.println("TravelBal");
        TravelPlan instance = null;
        int expResult = 0;
        int result = instance.TravelBal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TravelPlan.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TravelPlan instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
