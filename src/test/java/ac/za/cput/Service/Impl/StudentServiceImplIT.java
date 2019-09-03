/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.Student;
import ac.za.cput.Service.StudentService;
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
public class StudentServiceImplIT {
    
    public StudentServiceImplIT() {
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
     * Test of getService method, of class StudentServiceImpl.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        StudentServiceImpl instance = null;
        StudentService expResult = null;
        StudentService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudentServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Student stud = null;
        StudentServiceImpl instance = null;
        Student expResult = null;
        Student result = instance.create(stud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudentServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Student stud = null;
        StudentServiceImpl instance = null;
        Student expResult = null;
        Student result = instance.update(stud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudentServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String s = "";
        StudentServiceImpl instance = null;
        instance.delete(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudentServiceImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String s = "";
        StudentServiceImpl instance = null;
        Student expResult = null;
        Student result = instance.read(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllStudent method, of class StudentServiceImpl.
     */
    @Test
    public void testGetAllStudent() {
        System.out.println("getAllStudent");
        StudentServiceImpl instance = null;
        Set<Student> expResult = null;
        Set<Student> result = instance.getAllStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudentServiceImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudentServiceImpl instance = null;
        Set<Student> expResult = null;
        Set<Student> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
