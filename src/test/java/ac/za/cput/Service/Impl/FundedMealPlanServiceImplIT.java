/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.FundedMealPlan;
import ac.za.cput.Service.FundedMealPlanService;
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
public class FundedMealPlanServiceImplIT {
    
    public FundedMealPlanServiceImplIT() {
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
     * Test of getService method, of class FundedMealPlanServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        FundedMealPlanServiceImpl instance = null;
        FundedMealPlanService expResult = null;
        FundedMealPlanService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class FundedMealPlanServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        FundedMealPlan fund = null;
        FundedMealPlanServiceImpl instance = null;
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.create(fund);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class FundedMealPlanServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        FundedMealPlan fund = null;
        FundedMealPlanServiceImpl instance = null;
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.update(fund);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class FundedMealPlanServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        FundedMealPlanServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class FundedMealPlanServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        FundedMealPlanServiceImpl instance = null;
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllFundedMealPlan method, of class FundedMealPlanServiceImpl.
     */
    @Test
    public void testGetAllFundedMealPlan() {
        System.out.println("getAllFundedMealPlan");
        FundedMealPlanServiceImpl instance = null;
        Set<FundedMealPlan> expResult = null;
        Set<FundedMealPlan> result = instance.getAllFundedMealPlan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class FundedMealPlanServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        FundedMealPlanServiceImpl instance = null;
        Set<FundedMealPlan> expResult = null;
        Set<FundedMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
