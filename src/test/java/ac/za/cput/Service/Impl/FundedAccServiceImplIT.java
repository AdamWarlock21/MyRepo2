/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.FundedAcc;
import ac.za.cput.Service.FundedAccService;
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
public class FundedAccServiceImplIT {
    
    public FundedAccServiceImplIT() {
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
     * Test of getService method, of class FundedAccServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        FundedAccServiceImpl instance = null;
        FundedAccService expResult = null;
        FundedAccService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class FundedAccServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        FundedAcc fund = null;
        FundedAccServiceImpl instance = null;
        FundedAcc expResult = null;
        FundedAcc result = instance.create(fund);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class FundedAccServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        FundedAcc fund = null;
        FundedAccServiceImpl instance = null;
        FundedAcc expResult = null;
        FundedAcc result = instance.update(fund);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class FundedAccServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        FundedAccServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class FundedAccServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        FundedAccServiceImpl instance = null;
        FundedAcc expResult = null;
        FundedAcc result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllFundedAcc method, of class FundedAccServiceImpl.
     */
    @Test
    public void testGetAllFundedAcc() {
        System.out.println("getAllFundedAcc");
        FundedAccServiceImpl instance = null;
        Set<FundedAcc> expResult = null;
        Set<FundedAcc> result = instance.getAllFundedAcc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class FundedAccServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        FundedAccServiceImpl instance = null;
        Set<FundedAcc> expResult = null;
        Set<FundedAcc> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
