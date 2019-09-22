package ac.za.cput.Repository.Impl;

import org.springframework.stereotype.Repository;
import ac.za.cput.Domain.Person;
import ac.za.cput.Repository.PersonRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("PersonInMemory")
public class PersonRepositoryImpl implements PersonRepository {

    private static PersonRepositoryImpl repository = null;
    private Set<Person> persons;

    public PersonRepositoryImpl(){
        persons = new HashSet<>();
    }


    public static PersonRepositoryImpl getRepository() {

        if(repository == null){
            return new PersonRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Person create(Person person) {

        persons.add(person);
        return person;
    }

    @Override
    public Person read(String id) {

        return persons.stream().filter(person -> person.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Person update(Person person) {

        Person inDB = read(person.getUserID());

        if(inDB != null){
            persons.remove(inDB);
            persons.add(person);
            return person;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Person inDB = read(id);
        persons.remove(inDB);

    }

    @Override
    public Set<Person> getAll() {
        return persons;
    }

}

