/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.StudBudget;
import ac.za.cput.Service.StudBudgetService;
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
public class StudBudgetServiceImplIT {
    
    public StudBudgetServiceImplIT() {
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
     * Test of getService method, of class StudBudgetServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        StudBudgetServiceImpl instance = null;
        StudBudgetService expResult = null;
        StudBudgetService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudBudgetServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudBudget budg = null;
        StudBudgetServiceImpl instance = null;
        StudBudget expResult = null;
        StudBudget result = instance.create(budg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudBudgetServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudBudget budg = null;
        StudBudgetServiceImpl instance = null;
        StudBudget expResult = null;
        StudBudget result = instance.update(budg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudBudgetServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        StudBudgetServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudBudgetServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        StudBudgetServiceImpl instance = null;
        StudBudget expResult = null;
        StudBudget result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllStudBudget method, of class StudBudgetServiceImpl.
     */
    @Test
    public void testGetAllStudBudget() {
        System.out.println("getAllStudBudget");
        StudBudgetServiceImpl instance = null;
        Set<StudBudget> expResult = null;
        Set<StudBudget> result = instance.getAllStudBudget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudBudgetServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudBudgetServiceImpl instance = null;
        Set<StudBudget> expResult = null;
        Set<StudBudget> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
