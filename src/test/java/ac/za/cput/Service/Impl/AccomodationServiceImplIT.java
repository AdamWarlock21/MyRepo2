/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.Accomodation;
import ac.za.cput.Service.AccomodationService;
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
public class AccomodationServiceImplIT {
    
    public AccomodationServiceImplIT() {
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
     * Test of getService method, of class AccomodationServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        AccomodationServiceImpl instance = null;
        AccomodationService expResult = null;
        AccomodationService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccomodationServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Accomodation accom = null;
        AccomodationServiceImpl instance = null;
        Accomodation expResult = null;
        Accomodation result = instance.create(accom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccomodationServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Accomodation accom = null;
        AccomodationServiceImpl instance = null;
        Accomodation expResult = null;
        Accomodation result = instance.update(accom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccomodationServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        AccomodationServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AccomodationServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        AccomodationServiceImpl instance = null;
        Accomodation expResult = null;
        Accomodation result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccomodation method, of class AccomodationServiceImpl.
     */
    @Test
    public void testGetAllAccomodation() {
        System.out.println("getAllAccomodation");
        AccomodationServiceImpl instance = null;
        Set<Accomodation> expResult = null;
        Set<Accomodation> result = instance.getAllAccomodation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class AccomodationServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AccomodationServiceImpl instance = null;
        Set<Accomodation> expResult = null;
        Set<Accomodation> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
