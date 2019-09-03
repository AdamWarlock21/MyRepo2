/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.PrivateMealPlan;
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
public class PrivateMealPlanControllerIT {
    
    public PrivateMealPlanControllerIT() {
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
     * Test of create method, of class PrivateMealPlanController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PrivateMealPlan privA = null;
        PrivateMealPlanController instance = new PrivateMealPlanController();
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.create(privA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PrivateMealPlanController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        PrivateMealPlan privA = null;
        PrivateMealPlanController instance = new PrivateMealPlanController();
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.update(privA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PrivateMealPlanController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        PrivateMealPlanController instance = new PrivateMealPlanController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PrivateMealPlanController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        PrivateMealPlanController instance = new PrivateMealPlanController();
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PrivateMealPlanController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PrivateMealPlanController instance = new PrivateMealPlanController();
        Set<PrivateMealPlan> expResult = null;
        Set<PrivateMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
