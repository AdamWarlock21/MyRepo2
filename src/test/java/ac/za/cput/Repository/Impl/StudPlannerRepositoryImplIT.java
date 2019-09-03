/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudPlanner;
import ac.za.cput.Repository.StudPlannerRepository;
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
public class StudPlannerRepositoryImplIT {
    
    public StudPlannerRepositoryImplIT() {
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
     * Test of getRepository method, of class StudPlannerRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        StudPlannerRepository expResult = null;
        StudPlannerRepository result = StudPlannerRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudPlannerRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudPlanner Mplan = null;
        StudPlannerRepositoryImpl instance = null;
        StudPlanner expResult = null;
        StudPlanner result = instance.create(Mplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudPlannerRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String StudCourseId = "";
        StudPlannerRepositoryImpl instance = null;
        StudPlanner expResult = null;
        StudPlanner result = instance.read(StudCourseId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudPlannerRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudPlanner Mplan = null;
        StudPlannerRepositoryImpl instance = null;
        StudPlanner expResult = null;
        StudPlanner result = instance.update(Mplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudPlannerRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String StudCourseId = "";
        StudPlannerRepositoryImpl instance = null;
        instance.delete(StudCourseId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudPlannerRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudPlannerRepositoryImpl instance = null;
        Set<StudPlanner> expResult = null;
        Set<StudPlanner> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
