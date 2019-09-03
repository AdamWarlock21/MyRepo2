/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.PrivateMealPlan;
import ac.za.cput.Service.PrivateMealPlanService;
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
public class PrivateMealPlanServiceImplIT {
    
    public PrivateMealPlanServiceImplIT() {
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
     * Test of getService method, of class PrivateMealPlanServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        PrivateMealPlanServiceImpl instance = null;
        PrivateMealPlanService expResult = null;
        PrivateMealPlanService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PrivateMealPlanServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PrivateMealPlan meal = null;
        PrivateMealPlanServiceImpl instance = null;
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.create(meal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PrivateMealPlanServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        PrivateMealPlan meal = null;
        PrivateMealPlanServiceImpl instance = null;
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.update(meal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PrivateMealPlanServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        PrivateMealPlanServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PrivateMealPlanServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        PrivateMealPlanServiceImpl instance = null;
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPrivateMealPlan method, of class PrivateMealPlanServiceImpl.
     */
    @Test
    public void testGetAllPrivateMealPlan() {
        System.out.println("getAllPrivateMealPlan");
        PrivateMealPlanServiceImpl instance = null;
        Set<PrivateMealPlan> expResult = null;
        Set<PrivateMealPlan> result = instance.getAllPrivateMealPlan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PrivateMealPlanServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PrivateMealPlanServiceImpl instance = null;
        Set<PrivateMealPlan> expResult = null;
        Set<PrivateMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
