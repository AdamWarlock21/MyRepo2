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
public class ExamPlannerIT {
    
    public ExamPlannerIT() {
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
     * Test of getExamPlannerId method, of class ExamPlanner.
     */
    @Test
    public void testGetExamPlannerId() {
        System.out.println("getExamPlannerId");
        ExamPlanner instance = null;
        String expResult = "";
        String result = instance.getExamPlannerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExamName method, of class ExamPlanner.
     */
    @Test
    public void testGetExamName() {
        System.out.println("getExamName");
        ExamPlanner instance = null;
        String expResult = "";
        String result = instance.getExamName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExamCode method, of class ExamPlanner.
     */
    @Test
    public void testExamCode() {
        System.out.println("ExamCode");
        ExamPlanner instance = null;
        String expResult = "";
        String result = instance.ExamCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExamTime method, of class ExamPlanner.
     */
    @Test
    public void testExamTime() {
        System.out.println("ExamTime");
        ExamPlanner instance = null;
        String expResult = "";
        String result = instance.ExamTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ExamPlanner.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ExamPlanner instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
