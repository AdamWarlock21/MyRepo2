package ac.za.cput.Repository;

import ac.za.cput.Domain.Person;
import ac.za.cput.Repository.IRepository;

import java.util.Set;

public interface PersonRepository extends IRepository<Person, String> {

    Set<Person> getAll();

}