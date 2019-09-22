package ac.za.cput.Service;

import ac.za.cput.Domain.Lecturer;
import ac.za.cput.Repository.IRepository;
import ac.za.cput.Service.IService;

import java.util.Set;

public interface LecturerService extends IService<Lecturer, String> {

    Set<Lecturer> getAll();

}