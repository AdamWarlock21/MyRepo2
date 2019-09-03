/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;

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
public class StudPlannerIT {
    
    public StudPlannerIT() {
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
     * Test of getStudCourse method, of class StudPlanner.
     */
    @Test
    public void testGetStudCourse() {
        System.out.println("getStudCourse");
        StudPlanner instance = null;
        String expResult = "";
        String result = instance.getStudCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudSubject method, of class StudPlanner.
     */
    @Test
    public void testGetStudSubject() {
        System.out.println("getStudSubject");
        StudPlanner instance = null;
        String expResult = "";
        String result = instance.getStudSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudTime method, of class StudPlanner.
     */
    @Test
    public void testGetStudTime() {
        System.out.println("getStudTime");
        StudPlanner instance = null;
        String expResult = "";
        String result = instance.getStudTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseId method, of class StudPlanner.
     */
    @Test
    public void testGetCourseId() {
        System.out.println("getCourseId");
        StudPlanner instance = null;
        String expResult = "";
        String result = instance.getCourseId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StudPlanner.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StudPlanner instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
