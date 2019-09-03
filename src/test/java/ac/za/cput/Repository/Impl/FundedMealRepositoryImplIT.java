/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

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
public class FundedMealRepositoryImplIT {
    
    public FundedMealRepositoryImplIT() {
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
     * Test of getRepository method, of class FundedMealRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        FundedMealRepositoryImpl expResult = null;
        FundedMealRepositoryImpl result = FundedMealRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class FundedMealRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        FundedMealPlan FMealPlan = null;
        FundedMealRepositoryImpl instance = null;
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.create(FMealPlan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class FundedMealRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String LocationId = "";
        FundedMealRepositoryImpl instance = null;
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.read(LocationId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class FundedMealRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        FundedMealPlan FMealPlan = null;
        FundedMealRepositoryImpl instance = null;
        FundedMealPlan expResult = null;
        FundedMealPlan result = instance.update(FMealPlan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class FundedMealRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String LocationId = "";
        FundedMealRepositoryImpl instance = null;
        instance.delete(LocationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class FundedMealRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        FundedMealRepositoryImpl instance = null;
        Set<FundedMealPlan> expResult = null;
        Set<FundedMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
