/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author BooBoo
 */
public class StudAppIT {
    
    public StudAppIT() {
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
     * Test of restTemplate method, of class StudApp.
     */
    @Test
    public void testRestTemplate() {
        System.out.println("restTemplate");
        StudApp instance = new StudApp();
        RestTemplate expResult = null;
        RestTemplate result = instance.restTemplate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class StudApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
