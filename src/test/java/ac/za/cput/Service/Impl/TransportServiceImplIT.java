/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.Transport;
import ac.za.cput.Service.TransportService;
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
public class TransportServiceImplIT {
    
    public TransportServiceImplIT() {
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
     * Test of getService method, of class TransportServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        TransportServiceImpl instance = null;
        TransportService expResult = null;
        TransportService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class TransportServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Transport trans = null;
        TransportServiceImpl instance = null;
        Transport expResult = null;
        Transport result = instance.create(trans);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TransportServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Transport trans = null;
        TransportServiceImpl instance = null;
        Transport expResult = null;
        Transport result = instance.update(trans);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TransportServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        TransportServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class TransportServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        TransportServiceImpl instance = null;
        Transport expResult = null;
        Transport result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTransport method, of class TransportServiceImpl.
     */
    @Test
    public void testGetAllTransport() {
        System.out.println("getAllTransport");
        TransportServiceImpl instance = null;
        Set<Transport> expResult = null;
        Set<Transport> result = instance.getAllTransport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class TransportServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TransportServiceImpl instance = null;
        Set<Transport> expResult = null;
        Set<Transport> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
