/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service;

import ac.za.cput.Domain.Student;
import ac.za.cput.Service.IService;
import java.util.Set;

public interface StudentService extends IService<Student, String>{

    Student create(Student student);
    Set<Student> getAllStudent();
    Set<Student> getAll();
}
