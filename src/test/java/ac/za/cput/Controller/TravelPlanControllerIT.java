/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.TravelPlan;
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
public class TravelPlanControllerIT {
    
    public TravelPlanControllerIT() {
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
     * Test of create method, of class TravelPlanController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        TravelPlan travel = null;
        TravelPlanController instance = new TravelPlanController();
        TravelPlan expResult = null;
        TravelPlan result = instance.create(travel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TravelPlanController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        TravelPlan travel = null;
        TravelPlanController instance = new TravelPlanController();
        TravelPlan expResult = null;
        TravelPlan result = instance.update(travel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TravelPlanController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        TravelPlanController instance = new TravelPlanController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class TravelPlanController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        TravelPlanController instance = new TravelPlanController();
        TravelPlan expResult = null;
        TravelPlan result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class TravelPlanController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TravelPlanController instance = new TravelPlanController();
        Set<TravelPlan> expResult = null;
        Set<TravelPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
