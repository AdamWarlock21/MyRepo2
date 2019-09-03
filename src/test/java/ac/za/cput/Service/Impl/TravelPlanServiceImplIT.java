/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.TravelPlan;
import ac.za.cput.Service.TravelPlanService;
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
public class TravelPlanServiceImplIT {
    
    public TravelPlanServiceImplIT() {
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
     * Test of getService method, of class TravelPlanServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        TravelPlanServiceImpl instance = null;
        TravelPlanService expResult = null;
        TravelPlanService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class TravelPlanServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        TravelPlan travel = null;
        TravelPlanServiceImpl instance = null;
        TravelPlan expResult = null;
        TravelPlan result = instance.create(travel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TravelPlanServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        TravelPlan travel = null;
        TravelPlanServiceImpl instance = null;
        TravelPlan expResult = null;
        TravelPlan result = instance.update(travel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TravelPlanServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        TravelPlanServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class TravelPlanServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        TravelPlanServiceImpl instance = null;
        TravelPlan expResult = null;
        TravelPlan result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTravelPlan method, of class TravelPlanServiceImpl.
     */
    @Test
    public void testGetAllTravelPlan() {
        System.out.println("getAllTravelPlan");
        TravelPlanServiceImpl instance = null;
        Set<TravelPlan> expResult = null;
        Set<TravelPlan> result = instance.getAllTravelPlan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class TravelPlanServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TravelPlanServiceImpl instance = null;
        Set<TravelPlan> expResult = null;
        Set<TravelPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
