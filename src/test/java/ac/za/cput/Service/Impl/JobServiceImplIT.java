/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.Job;
import ac.za.cput.Service.JobService;
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
public class JobServiceImplIT {
    
    public JobServiceImplIT() {
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
     * Test of getService method, of class JobServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        JobServiceImpl instance = null;
        JobService expResult = null;
        JobService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class JobServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Job job = null;
        JobServiceImpl instance = null;
        Job expResult = null;
        Job result = instance.create(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class JobServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Job job = null;
        JobServiceImpl instance = null;
        Job expResult = null;
        Job result = instance.update(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class JobServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        JobServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class JobServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        JobServiceImpl instance = null;
        Job expResult = null;
        Job result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllJob method, of class JobServiceImpl.
     */
    @Test
    public void testGetAllJob() {
        System.out.println("getAllJob");
        JobServiceImpl instance = null;
        Set<Job> expResult = null;
        Set<Job> result = instance.getAllJob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class JobServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JobServiceImpl instance = null;
        Set<Job> expResult = null;
        Set<Job> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
