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
public class StudMealPlanIT {
    
    public StudMealPlanIT() {
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
     * Test of getMealPlanId method, of class StudMealPlan.
     */
    @Test
    public void testGetMealPlanId() {
        System.out.println("getMealPlanId");
        StudMealPlan instance = null;
        String expResult = "";
        String result = instance.getMealPlanId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealName method, of class StudMealPlan.
     */
    @Test
    public void testGetMealName() {
        System.out.println("getMealName");
        StudMealPlan instance = null;
        String expResult = "";
        String result = instance.getMealName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealPrice method, of class StudMealPlan.
     */
    @Test
    public void testGetMealPrice() {
        System.out.println("getMealPrice");
        StudMealPlan instance = null;
        int expResult = 0;
        int result = instance.getMealPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StudMealPlan.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StudMealPlan instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
