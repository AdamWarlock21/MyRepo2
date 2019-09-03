/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.FundedAcc;
import ac.za.cput.Repository.FundedAccRepository;
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
public class FundedAccRepositoryImplIT {
    
    public FundedAccRepositoryImplIT() {
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
     * Test of getRepository method, of class FundedAccRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        FundedAccRepository expResult = null;
        FundedAccRepository result = FundedAccRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class FundedAccRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        FundedAcc Facc = null;
        FundedAccRepositoryImpl instance = null;
        FundedAcc expResult = null;
        FundedAcc result = instance.create(Facc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class FundedAccRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String LocationId = "";
        FundedAccRepositoryImpl instance = null;
        FundedAcc expResult = null;
        FundedAcc result = instance.read(LocationId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class FundedAccRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        FundedAcc Facc = null;
        FundedAccRepositoryImpl instance = null;
        FundedAcc expResult = null;
        FundedAcc result = instance.update(Facc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class FundedAccRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String LocationId = "";
        FundedAccRepositoryImpl instance = null;
        instance.delete(LocationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class FundedAccRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        FundedAccRepositoryImpl instance = null;
        Set<FundedAcc> expResult = null;
        Set<FundedAcc> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
