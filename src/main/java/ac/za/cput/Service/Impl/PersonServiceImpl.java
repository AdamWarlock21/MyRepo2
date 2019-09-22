package ac.za.cput.Service.Impl;

import org.springframework.stereotype.Repository;
import ac.za.cput.Domain.Person;
import ac.za.cput.Repository.PersonRepository;
import ac.za.cput.Repository.Impl.PersonRepositoryImpl;
import ac.za.cput.Service.PersonService;

import java.util.HashSet;
import java.util.Set;

@Repository("PersonServiceImpl")
public class PersonServiceImpl implements PersonService {

    private PersonServiceImpl service = null;
    private PersonRepository repository;

    public PersonServiceImpl() {
        repository = PersonRepositoryImpl.getRepository();
    }

    public PersonServiceImpl getService(){

        if(service == null){
            return new PersonServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Person> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Person create(Person person) {
        return repository.create(person);
    }

    @Override
    public Person read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Person update(Person person) {
        return repository.update(person);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

