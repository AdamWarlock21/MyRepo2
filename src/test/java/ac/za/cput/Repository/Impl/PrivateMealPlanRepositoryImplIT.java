/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.PrivateMealPlan;
import ac.za.cput.Repository.PrivateMealPlanRepository;
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
public class PrivateMealPlanRepositoryImplIT {
    
    public PrivateMealPlanRepositoryImplIT() {
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
     * Test of getRepository method, of class PrivateMealPlanRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        PrivateMealPlanRepository expResult = null;
        PrivateMealPlanRepository result = PrivateMealPlanRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PrivateMealPlanRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PrivateMealPlan PrivMeal = null;
        PrivateMealPlanRepositoryImpl instance = null;
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.create(PrivMeal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PrivateMealPlanRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String LocationId = "";
        PrivateMealPlanRepositoryImpl instance = null;
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.read(LocationId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PrivateMealPlanRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        PrivateMealPlan PrivMeal = null;
        PrivateMealPlanRepositoryImpl instance = null;
        PrivateMealPlan expResult = null;
        PrivateMealPlan result = instance.update(PrivMeal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PrivateMealPlanRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String LocationId = "";
        PrivateMealPlanRepositoryImpl instance = null;
        instance.delete(LocationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PrivateMealPlanRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PrivateMealPlanRepositoryImpl instance = null;
        Set<PrivateMealPlan> expResult = null;
        Set<PrivateMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
