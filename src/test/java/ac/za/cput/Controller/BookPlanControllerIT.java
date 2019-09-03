/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.BookPlan;
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
public class BookPlanControllerIT {
    
    public BookPlanControllerIT() {
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
     * Test of create method, of class BookPlanController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        BookPlan book = null;
        BookPlanController instance = new BookPlanController();
        BookPlan expResult = null;
        BookPlan result = instance.create(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class BookPlanController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        BookPlan book = null;
        BookPlanController instance = new BookPlanController();
        BookPlan expResult = null;
        BookPlan result = instance.update(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BookPlanController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        BookPlanController instance = new BookPlanController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class BookPlanController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        BookPlanController instance = new BookPlanController();
        BookPlan expResult = null;
        BookPlan result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class BookPlanController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        BookPlanController instance = new BookPlanController();
        Set<BookPlan> expResult = null;
        Set<BookPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
