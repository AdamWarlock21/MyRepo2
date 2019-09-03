/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Student;
import ac.za.cput.Repository.StudentRepository;
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
public class StudentRepositoryImplIT {
    
    public StudentRepositoryImplIT() {
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
     * Test of getRepository method, of class StudentRepositoryImpl.
     */
    @Test
    public void testGetRepository() {
        System.out.println("getRepository");
        StudentRepository expResult = null;
        StudentRepository result = StudentRepositoryImpl.getRepository();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class StudentRepositoryImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Student students = null;
        StudentRepositoryImpl instance = null;
        Student expResult = null;
        Student result = instance.create(students);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class StudentRepositoryImpl.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String studentId = "";
        StudentRepositoryImpl instance = null;
        Student expResult = null;
        Student result = instance.read(studentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudentRepositoryImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Student students = null;
        StudentRepositoryImpl instance = null;
        Student expResult = null;
        Student result = instance.update(students);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudentRepositoryImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String studentId = "";
        StudentRepositoryImpl instance = null;
        instance.delete(studentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class StudentRepositoryImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudentRepositoryImpl instance = null;
        Set<Student> expResult = null;
        Set<Student> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
