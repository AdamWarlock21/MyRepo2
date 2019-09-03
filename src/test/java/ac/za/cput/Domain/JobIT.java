/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;

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
public class JobIT {
    
    public JobIT() {
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
     * Test of getEmpStat method, of class Job.
     */
    @Test
    public void testGetEmpStat() {
        System.out.println("getEmpStat");
        Job instance = null;
        String expResult = "";
        String result = instance.getEmpStat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpId method, of class Job.
     */
    @Test
    public void testGetEmpId() {
        System.out.println("getEmpId");
        Job instance = null;
        String expResult = "";
        String result = instance.getEmpId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobRole method, of class Job.
     */
    @Test
    public void testGetJobRole() {
        System.out.println("getJobRole");
        Job instance = null;
        String expResult = "";
        String result = instance.getJobRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHours method, of class Job.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Job instance = null;
        int expResult = 0;
        int result = instance.getHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStipend method, of class Job.
     */
    @Test
    public void testSetStipend() {
        System.out.println("setStipend");
        Job instance = null;
        int expResult = 0;
        int result = instance.setStipend();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStipend method, of class Job.
     */
    @Test
    public void testGetStipend() {
        System.out.println("getStipend");
        Job instance = null;
        int expResult = 0;
        int result = instance.getStipend();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Job.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Job instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
