/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.StudPlanner;
import ac.za.cput.Service.StudPlannerService;
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
public class StudPlannerServiceImplIT {
    
    public StudPlannerServiceImplIT() {
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
     * Test of getService method, of class StudPlannerServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        StudPlannerServiceImpl instance = null;
        StudPlannerService expResult = null;
        StudPlannerService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudPlannerServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudPlanner stud = null;
        StudPlannerServiceImpl instance = null;
        StudPlanner expResult = null;
        StudPlanner result = instance.create(stud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudPlannerServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudPlanner stud = null;
        StudPlannerServiceImpl instance = null;
        StudPlanner expResult = null;
        StudPlanner result = instance.update(stud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudPlannerServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        StudPlannerServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudPlannerServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        StudPlannerServiceImpl instance = null;
        StudPlanner expResult = null;
        StudPlanner result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAppDevCourses method, of class StudPlannerServiceImpl.
     */
    @Test
    public void testGetAllAppDevCourses() {
        System.out.println("getAllAppDevCourses");
        StudPlannerServiceImpl instance = null;
        Set<StudPlanner> expResult = null;
        Set<StudPlanner> result = instance.getAllAppDevCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudPlannerServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudPlannerServiceImpl instance = null;
        Set<StudPlanner> expResult = null;
        Set<StudPlanner> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
