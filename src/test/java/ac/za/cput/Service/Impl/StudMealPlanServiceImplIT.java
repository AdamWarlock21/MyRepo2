/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.StudMealPlan;
import ac.za.cput.Service.StudMealPlanService;
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
public class StudMealPlanServiceImplIT {
    
    public StudMealPlanServiceImplIT() {
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
     * Test of getService method, of class StudMealPlanServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        StudMealPlanServiceImpl instance = null;
        StudMealPlanService expResult = null;
        StudMealPlanService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudMealPlanServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudMealPlan sMeal = null;
        StudMealPlanServiceImpl instance = null;
        StudMealPlan expResult = null;
        StudMealPlan result = instance.create(sMeal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudMealPlanServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudMealPlan sMeal = null;
        StudMealPlanServiceImpl instance = null;
        StudMealPlan expResult = null;
        StudMealPlan result = instance.update(sMeal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudMealPlanServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        StudMealPlanServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudMealPlanServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        StudMealPlanServiceImpl instance = null;
        StudMealPlan expResult = null;
        StudMealPlan result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllStudMealPlan method, of class StudMealPlanServiceImpl.
     */
    @Test
    public void testGetAllStudMealPlan() {
        System.out.println("getAllStudMealPlan");
        StudMealPlanServiceImpl instance = null;
        Set<StudMealPlan> expResult = null;
        Set<StudMealPlan> result = instance.getAllStudMealPlan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudMealPlanServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudMealPlanServiceImpl instance = null;
        Set<StudMealPlan> expResult = null;
        Set<StudMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
