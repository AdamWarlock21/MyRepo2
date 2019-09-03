/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.BookPlan;
import ac.za.cput.Repository.BookPlanRepository;
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
public class BookPlanRepositoryImplIT {
    
    public BookPlanRepositoryImplIT() {
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
     * Test of getRepository method, of class BookPlanRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        BookPlanRepository expResult = null;
        BookPlanRepository result = BookPlanRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class BookPlanRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        BookPlan Bplan = null;
        BookPlanRepositoryImpl instance = null;
        BookPlan expResult = null;
        BookPlan result = instance.create(Bplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class BookPlanRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String bId = "";
        BookPlanRepositoryImpl instance = null;
        BookPlan expResult = null;
        BookPlan result = instance.read(bId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class BookPlanRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        BookPlan Bplan = null;
        BookPlanRepositoryImpl instance = null;
        BookPlan expResult = null;
        BookPlan result = instance.update(Bplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BookPlanRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String BookId = "";
        BookPlanRepositoryImpl instance = null;
        instance.delete(BookId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class BookPlanRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        BookPlanRepositoryImpl instance = null;
        Set<BookPlan> expResult = null;
        Set<BookPlan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
