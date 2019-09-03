package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Student;
import ac.za.cput.Repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("StudentRepositoryImpl")
public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository = null;
    private Map<String, Student> students;

    private StudentRepositoryImpl() {
        students = new HashMap<>();
    }

    public static StudentRepository getRepository(){
        if(repository == null) repository = new StudentRepositoryImpl();
        return repository;
    }

    @Override
    public Student create(Student students){
        this.students.put(students.getStudentId(), students);
        return students;
    }

    @Override
    public Student read(String studentId){
        //find the student in the set and return it if it exist
        return this.students.get(studentId);
    }

    @Override
    public Student update(Student students) {
        // find the student, update it and return the updated student
        this.students.replace(students.getStudentId(), students);
        return this.students.get(students.getStudentId());
    }

    @Override
    public void delete(String studentId) {
        //find the student and delete it if it exists
        this.students.remove(studentId);

    }

    @Override
    public Set<Student> getAll(){
        Collection<Student> stud = this.students.values();
        return new HashSet<>(stud);
    }
}
