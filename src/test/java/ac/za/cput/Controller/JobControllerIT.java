/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.Job;
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
public class JobControllerIT {
    
    public JobControllerIT() {
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
     * Test of create method, of class JobController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Job job = null;
        JobController instance = new JobController();
        Job expResult = null;
        Job result = instance.create(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class JobController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Job job = null;
        JobController instance = new JobController();
        Job expResult = null;
        Job result = instance.update(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class JobController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        JobController instance = new JobController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class JobController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        JobController instance = new JobController();
        Job expResult = null;
        Job result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class JobController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JobController instance = new JobController();
        Set<Job> expResult = null;
        Set<Job> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
