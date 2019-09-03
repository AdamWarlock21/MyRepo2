/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.StudMealPlan;
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
public class StudMealPlanControllerIT {
    
    public StudMealPlanControllerIT() {
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
     * Test of create method, of class StudMealPlanController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudMealPlan studM = null;
        StudMealPlanController instance = new StudMealPlanController();
        StudMealPlan expResult = null;
        StudMealPlan result = instance.create(studM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudMealPlanController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudMealPlan studM = null;
        StudMealPlanController instance = new StudMealPlanController();
        StudMealPlan expResult = null;
        StudMealPlan result = instance.update(studM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudMealPlanController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        StudMealPlanController instance = new StudMealPlanController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudMealPlanController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        StudMealPlanController instance = new StudMealPlanController();
        StudMealPlan expResult = null;
        StudMealPlan result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudMealPlanController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudMealPlanController instance = new StudMealPlanController();
        Set<StudMealPlan> expResult = null;
        Set<StudMealPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
