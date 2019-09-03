/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.FundedAcc;
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
public class FundedAccControllerIT {
    
    public FundedAccControllerIT() {
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
     * Test of create method, of class FundedAccController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        FundedAcc fundA = null;
        FundedAccController instance = new FundedAccController();
        FundedAcc expResult = null;
        FundedAcc result = instance.create(fundA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class FundedAccController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        FundedAcc fundA = null;
        FundedAccController instance = new FundedAccController();
        FundedAcc expResult = null;
        FundedAcc result = instance.update(fundA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class FundedAccController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        FundedAccController instance = new FundedAccController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class FundedAccController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        FundedAccController instance = new FundedAccController();
        FundedAcc expResult = null;
        FundedAcc result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class FundedAccController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        FundedAccController instance = new FundedAccController();
        Set<FundedAcc> expResult = null;
        Set<FundedAcc> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
