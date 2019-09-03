/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.StudBudget;
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
public class StudBudgetControllerIT {
    
    public StudBudgetControllerIT() {
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
     * Test of create method, of class StudBudgetController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudBudget studB = null;
        StudBudgetController instance = new StudBudgetController();
        StudBudget expResult = null;
        StudBudget result = instance.create(studB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudBudgetController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudBudget studB = null;
        StudBudgetController instance = new StudBudgetController();
        StudBudget expResult = null;
        StudBudget result = instance.update(studB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudBudgetController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        StudBudgetController instance = new StudBudgetController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudBudgetController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        StudBudgetController instance = new StudBudgetController();
        StudBudget expResult = null;
        StudBudget result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudBudgetController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudBudgetController instance = new StudBudgetController();
        Set<StudBudget> expResult = null;
        Set<StudBudget> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
