/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.PrivateAcc;
import ac.za.cput.Repository.PrivateAccRepository;
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
public class PrivateAccRepositoryImplIT {
    
    public PrivateAccRepositoryImplIT() {
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
     * Test of getRepository method, of class PrivateAccRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        PrivateAccRepository expResult = null;
        PrivateAccRepository result = PrivateAccRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PrivateAccRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PrivateAcc Acc = null;
        PrivateAccRepositoryImpl instance = null;
        PrivateAcc expResult = null;
        PrivateAcc result = instance.create(Acc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PrivateAccRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String AccId = "";
        PrivateAccRepositoryImpl instance = null;
        PrivateAcc expResult = null;
        PrivateAcc result = instance.read(AccId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PrivateAccRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        PrivateAcc Acc = null;
        PrivateAccRepositoryImpl instance = null;
        PrivateAcc expResult = null;
        PrivateAcc result = instance.update(Acc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PrivateAccRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String AccId = "";
        PrivateAccRepositoryImpl instance = null;
        instance.delete(AccId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PrivateAccRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PrivateAccRepositoryImpl instance = null;
        Set<PrivateAcc> expResult = null;
        Set<PrivateAcc> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
