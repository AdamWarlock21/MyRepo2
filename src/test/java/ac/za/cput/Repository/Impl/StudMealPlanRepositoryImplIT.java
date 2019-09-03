/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudMealPlan;
import ac.za.cput.Repository.StudMealPlanRepository;
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
public class StudMealPlanRepositoryImplIT {
    
    public StudMealPlanRepositoryImplIT() {
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
     * Test of getRepository method, of class StudMealPlanRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        StudMealPlanRepository expResult = null;
        StudMealPlanRepository result = StudMealPlanRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudMealPlanRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudMealPlan Mplan = null;
        StudMealPlanRepositoryImpl instance = null;
        StudMealPlan expResult = null;
        StudMealPlan result = instance.create(Mplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudMealPlanRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String MealPlanId = "";
        StudMealPlanRepositoryImpl instance = null;
        StudMealPlan expResult = null;
        StudMealPlan result = instance.read(MealPlanId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudMealPlanRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudMealPlan Mplan = null;
        StudMealPlanRepositoryImpl instance = null;
        StudMealPlan expResult = null;
        StudMealPlan result = instance.update(Mplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudMealPlanRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MealPlanId = "";
        StudMealPlanRepositoryImpl instance = null;
        instance.delete(MealPlanId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudMealPlanRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudMealPlanRepositoryImpl instance = null;
        Set<StudMealPlan> expResult = null;
        Set<StudMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
