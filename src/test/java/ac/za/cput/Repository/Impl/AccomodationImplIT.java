/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Accomodation;
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
public class AccomodationImplIT {
    
    public AccomodationImplIT() {
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
     * Test of getRepository method, of class AccomodationImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        AccomodationImpl expResult = null;
        AccomodationImpl result = AccomodationImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccomodationImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Accomodation accom = null;
        AccomodationImpl instance = null;
        Accomodation expResult = null;
        Accomodation result = instance.create(accom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AccomodationImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String AccId = "";
        AccomodationImpl instance = null;
        Accomodation expResult = null;
        Accomodation result = instance.read(AccId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccomodationImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Accomodation accom = null;
        AccomodationImpl instance = null;
        Accomodation expResult = null;
        Accomodation result = instance.update(accom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccomodationImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String AccId = "";
        AccomodationImpl instance = null;
        instance.delete(AccId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class AccomodationImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AccomodationImpl instance = null;
        Set<Accomodation> expResult = null;
        Set<Accomodation> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
