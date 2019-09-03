/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.Transport;
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
public class TransportControllerIT {
    
    public TransportControllerIT() {
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
     * Test of create method, of class TransportController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Transport trans = null;
        TransportController instance = new TransportController();
        Transport expResult = null;
        Transport result = instance.create(trans);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TransportController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Transport trans = null;
        TransportController instance = new TransportController();
        Transport expResult = null;
        Transport result = instance.update(trans);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TransportController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        TransportController instance = new TransportController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class TransportController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        TransportController instance = new TransportController();
        Transport expResult = null;
        Transport result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class TransportController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TransportController instance = new TransportController();
        Set<Transport> expResult = null;
        Set<Transport> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
