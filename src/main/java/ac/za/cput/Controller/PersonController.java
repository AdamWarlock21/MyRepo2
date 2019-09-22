package ac.za.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ac.za.cput.Domain.Person;
import ac.za.cput.Service.Impl.PersonServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    @Qualifier("PersonServiceImpl")
    private PersonServiceImpl service;

    @PostMapping("/new")
    public Person create(@RequestBody Person person){

        return service.create(person);
    }

    @GetMapping(path = "/find/{id}")
    public Person findById(@PathVariable String id){

        Person person = service.read(id);

        return person;
    }

    @PutMapping("/update")
    public void update(@RequestBody Person person){

        service.update(person);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Person> getAll(){
        return service.getAll();
    }

}
