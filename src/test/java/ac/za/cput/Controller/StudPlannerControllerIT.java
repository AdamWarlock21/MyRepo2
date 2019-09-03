/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.StudPlanner;
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
public class StudPlannerControllerIT {
    
    public StudPlannerControllerIT() {
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
     * Test of create method, of class StudPlannerController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudPlanner studP = null;
        StudPlannerController instance = new StudPlannerController();
        StudPlanner expResult = null;
        StudPlanner result = instance.create(studP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudPlannerController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudPlanner studP = null;
        StudPlannerController instance = new StudPlannerController();
        StudPlanner expResult = null;
        StudPlanner result = instance.update(studP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudPlannerController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        StudPlannerController instance = new StudPlannerController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudPlannerController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        StudPlannerController instance = new StudPlannerController();
        StudPlanner expResult = null;
        StudPlanner result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudPlannerController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudPlannerController instance = new StudPlannerController();
        Set<StudPlanner> expResult = null;
        Set<StudPlanner> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
