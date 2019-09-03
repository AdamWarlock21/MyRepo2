/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.PrivateAcc;
import ac.za.cput.Service.PrivateAccService;
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
public class PrivateAccServiceImplIT {
    
    public PrivateAccServiceImplIT() {
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
     * Test of getService method, of class PrivateAccServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        PrivateAccServiceImpl instance = null;
        PrivateAccService expResult = null;
        PrivateAccService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PrivateAccServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PrivateAcc privacc = null;
        PrivateAccServiceImpl instance = null;
        PrivateAcc expResult = null;
        PrivateAcc result = instance.create(privacc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PrivateAccServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        PrivateAcc privacc = null;
        PrivateAccServiceImpl instance = null;
        PrivateAcc expResult = null;
        PrivateAcc result = instance.update(privacc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PrivateAccServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        PrivateAccServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PrivateAccServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        PrivateAccServiceImpl instance = null;
        PrivateAcc expResult = null;
        PrivateAcc result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPrivateAcc method, of class PrivateAccServiceImpl.
     */
    @Test
    public void testGetAllPrivateAcc() {
        System.out.println("getAllPrivateAcc");
        PrivateAccServiceImpl instance = null;
        Set<PrivateAcc> expResult = null;
        Set<PrivateAcc> result = instance.getAllPrivateAcc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PrivateAccServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PrivateAccServiceImpl instance = null;
        Set<PrivateAcc> expResult = null;
        Set<PrivateAcc> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
