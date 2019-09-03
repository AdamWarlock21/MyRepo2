/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.BookPlan;
import ac.za.cput.Service.BookPlanService;
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
public class BookPlanServiceImplIT {
    
    public BookPlanServiceImplIT() {
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
     * Test of getService method, of class BookPlanServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        BookPlanServiceImpl instance = null;
        BookPlanService expResult = null;
        BookPlanService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class BookPlanServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        BookPlan book = null;
        BookPlanServiceImpl instance = null;
        BookPlan expResult = null;
        BookPlan result = instance.create(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class BookPlanServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        BookPlan book = null;
        BookPlanServiceImpl instance = null;
        BookPlan expResult = null;
        BookPlan result = instance.update(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BookPlanServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        BookPlanServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class BookPlanServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        BookPlanServiceImpl instance = null;
        BookPlan expResult = null;
        BookPlan result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllBookPlan method, of class BookPlanServiceImpl.
     */
    @Test
    public void testGetAllBookPlan() {
        System.out.println("getAllBookPlan");
        BookPlanServiceImpl instance = null;
        Set<BookPlan> expResult = null;
        Set<BookPlan> result = instance.getAllBookPlan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class BookPlanServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        BookPlanServiceImpl instance = null;
        Set<BookPlan> expResult = null;
        Set<BookPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
