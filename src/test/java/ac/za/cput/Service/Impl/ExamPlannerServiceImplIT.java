/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.ExamPlanner;
import ac.za.cput.Service.ExamPlannerService;
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
public class ExamPlannerServiceImplIT {
    
    public ExamPlannerServiceImplIT() {
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
     * Test of getService method, of class ExamPlannerServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        ExamPlannerServiceImpl instance = null;
        ExamPlannerService expResult = null;
        ExamPlannerService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ExamPlannerServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ExamPlanner exmplner = null;
        ExamPlannerServiceImpl instance = null;
        ExamPlanner expResult = null;
        ExamPlanner result = instance.create(exmplner);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ExamPlannerServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ExamPlanner exmplner = null;
        ExamPlannerServiceImpl instance = null;
        ExamPlanner expResult = null;
        ExamPlanner result = instance.update(exmplner);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ExamPlannerServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        ExamPlannerServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class ExamPlannerServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        ExamPlannerServiceImpl instance = null;
        ExamPlanner expResult = null;
        ExamPlanner result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllExamPlanner method, of class ExamPlannerServiceImpl.
     */
    @Test
    public void testGetAllExamPlanner() {
        System.out.println("getAllExamPlanner");
        ExamPlannerServiceImpl instance = null;
        Set<ExamPlanner> expResult = null;
        Set<ExamPlanner> result = instance.getAllExamPlanner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class ExamPlannerServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ExamPlannerServiceImpl instance = null;
        Set<ExamPlanner> expResult = null;
        Set<ExamPlanner> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
