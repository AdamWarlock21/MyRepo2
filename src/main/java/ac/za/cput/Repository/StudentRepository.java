package ac.za.cput.Repository;

import ac.za.cput.Domain.Student;

import java.util.HashSet;
import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Student> getAll();

}
