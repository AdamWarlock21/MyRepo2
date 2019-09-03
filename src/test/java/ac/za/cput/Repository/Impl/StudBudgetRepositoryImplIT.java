/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudBudget;
import ac.za.cput.Repository.StudBudgetRepository;
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
public class StudBudgetRepositoryImplIT {
    
    public StudBudgetRepositoryImplIT() {
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
     * Test of getRepository method, of class StudBudgetRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        StudBudgetRepository expResult = null;
        StudBudgetRepository result = StudBudgetRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudBudgetRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StudBudget StudB = null;
        StudBudgetRepositoryImpl instance = null;
        StudBudget expResult = null;
        StudBudget result = instance.create(StudB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudBudgetRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String BudgetId = "";
        StudBudgetRepositoryImpl instance = null;
        StudBudget expResult = null;
        StudBudget result = instance.read(BudgetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudBudgetRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        StudBudget StudB = null;
        StudBudgetRepositoryImpl instance = null;
        StudBudget expResult = null;
        StudBudget result = instance.update(StudB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudBudgetRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String BudgetId = "";
        StudBudgetRepositoryImpl instance = null;
        instance.delete(BudgetId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudBudgetRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudBudgetRepositoryImpl instance = null;
        Set<StudBudget> expResult = null;
        Set<StudBudget> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
