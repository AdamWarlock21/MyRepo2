package ac.za.cput.Repository;

import ac.za.cput.Domain.Lecturer;
import ac.za.cput.Repository.IRepository;

import java.util.Set;

public interface LecturerRepository extends IRepository<Lecturer, String> {

    Set<Lecturer> getAll();

}