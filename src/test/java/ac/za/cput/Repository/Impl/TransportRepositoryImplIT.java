/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Transport;
import ac.za.cput.Repository.TransportRepository;
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
public class TransportRepositoryImplIT {
    
    public TransportRepositoryImplIT() {
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
     * Test of getRepository method, of class TransportRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        TransportRepository expResult = null;
        TransportRepository result = TransportRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class TransportRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Transport Bplan = null;
        TransportRepositoryImpl instance = null;
        Transport expResult = null;
        Transport result = instance.create(Bplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class TransportRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String transId = "";
        TransportRepositoryImpl instance = null;
        Transport expResult = null;
        Transport result = instance.read(transId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TransportRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Transport Bplan = null;
        TransportRepositoryImpl instance = null;
        Transport expResult = null;
        Transport result = instance.update(Bplan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TransportRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String transId = "";
        TransportRepositoryImpl instance = null;
        instance.delete(transId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class TransportRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TransportRepositoryImpl instance = null;
        Set<Transport> expResult = null;
        Set<Transport> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
