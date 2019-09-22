package ac.za.cput.Service;

import ac.za.cput.Domain.Person;
import ac.za.cput.Repository.IRepository;
import ac.za.cput.Service.IService;

import java.util.Set;

public interface PersonService extends IService<Person, String> {

    Set<Person> getAll();

}