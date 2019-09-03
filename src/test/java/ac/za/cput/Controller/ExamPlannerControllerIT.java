/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.ExamPlanner;
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
public class ExamPlannerControllerIT {
    
    public ExamPlannerControllerIT() {
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
     * Test of create method, of class ExamPlannerController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ExamPlanner exam = null;
        ExamPlannerController instance = new ExamPlannerController();
        ExamPlanner expResult = null;
        ExamPlanner result = instance.create(exam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ExamPlannerController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ExamPlanner exam = null;
        ExamPlannerController instance = new ExamPlannerController();
        ExamPlanner expResult = null;
        ExamPlanner result = instance.update(exam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ExamPlannerController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        ExamPlannerController instance = new ExamPlannerController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class ExamPlannerController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        ExamPlannerController instance = new ExamPlannerController();
        ExamPlanner expResult = null;
        ExamPlanner result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class ExamPlannerController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ExamPlannerController instance = new ExamPlannerController();
        Set<ExamPlanner> expResult = null;
        Set<ExamPlanner> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
