/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.Student;
import ac.za.cput.Repository.StudentRepository;
import ac.za.cput.Repository.Impl.StudentRepositoryImpl;
import ac.za.cput.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import org.springframework.stereotype.Repository;
/**
 *
 * @author BooBoo
 */
@Repository("StudentServiceImpl")
public class StudentServiceImpl implements StudentService{
    private StudentServiceImpl service = null;
    private StudentRepository repository;

    private StudentServiceImpl(){
        this.repository = StudentRepositoryImpl.getRepository();
    }

    public StudentService getService(){
        if (service == null) service = new StudentServiceImpl();
        return service;
    }


    @Override
    public Student create(Student stud) {
        return this.repository.create(stud);
    }

    @Override
    public Student update(Student stud) {
        return this.repository.update(stud);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Student read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Student> getAllStudent() {
        Set<Student> student = getAll();

        return null;
    }

    @Override
    public Set<Student> getAll() {
        return this.repository.getAll();
    }
}
