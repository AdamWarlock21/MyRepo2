/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

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
public class AccomodationControllerIT {
    
    public AccomodationControllerIT() {
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
     * Test of create method, of class AccomodationController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Accomodation accom = null;
        AccomodationController instance = new AccomodationController();
        Accomodation expResult = null;
        Accomodation result = instance.create(accom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccomodationController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Accomodation accom = null;
        AccomodationController instance = new AccomodationController();
        Accomodation expResult = null;
        Accomodation result = instance.update(accom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccomodationController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        AccomodationController instance = new AccomodationController();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AccomodationController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String id = "";
        AccomodationController instance = new AccomodationController();
        Accomodation expResult = null;
        Accomodation result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class AccomodationController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AccomodationController instance = new AccomodationController();
        Set<Accomodation> expResult = null;
        Set<Accomodation> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
