/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.ExamPlanner;
import ac.za.cput.Repository.ExamPlanRepository;
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
public class ExamPlannerRepositoryImplIT {
    
    public ExamPlannerRepositoryImplIT() {
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
     * Test of getRepository method, of class ExamPlannerRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        ExamPlanRepository expResult = null;
        ExamPlanRepository result = ExamPlannerRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ExamPlannerRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ExamPlanner Eplan = null;
        ExamPlannerRepositoryImpl instance = null;
        ExamPlanner expResult = null;
        ExamPlanner result = instance.create(Eplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class ExamPlannerRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String ExamId = "";
        ExamPlannerRepositoryImpl instance = null;
        ExamPlanner expResult = null;
        ExamPlanner result = instance.read(ExamId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ExamPlannerRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ExamPlanner Eplan = null;
        ExamPlannerRepositoryImpl instance = null;
        ExamPlanner expResult = null;
        ExamPlanner result = instance.update(Eplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ExamPlannerRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String ExamId = "";
        ExamPlannerRepositoryImpl instance = null;
        instance.delete(ExamId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class ExamPlannerRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ExamPlannerRepositoryImpl instance = null;
        Set<ExamPlanner> expResult = null;
        Set<ExamPlanner> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
