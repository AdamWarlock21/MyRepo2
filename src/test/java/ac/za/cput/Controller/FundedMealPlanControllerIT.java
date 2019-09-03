/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.FundedMealPlan;
import java.util.Set;
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
public class FundedMealPlanControllerIT {
    
    public FundedMealPlanControllerIT() {
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
     * Test of create method, of class FundedMealPlanController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        FundedMealPlan fundM = null;
        FundedMealPlanController instance = new FundedMealPlanController();
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.create(fundM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class FundedMealPlanController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        FundedMealPlan fundM = null;
        FundedMealPlanController instance = new FundedMealPlanController();
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.update(fundM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class FundedMealPlanController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        FundedMealPlanController instance = new FundedMealPlanController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class FundedMealPlanController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        FundedMealPlanController instance = new FundedMealPlanController();
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class FundedMealPlanController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        FundedMealPlanController instance = new FundedMealPlanController();
        Set<FundedMealPlan> expResult = null;
        Set<FundedMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
