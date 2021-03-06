package ac.za.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ac.za.cput.Domain.Lecturer;
import ac.za.cput.Service.Impl.LecturerServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {

    @Autowired
    @Qualifier("LecturerServiceImpl")
    private LecturerServiceImpl service;

    @PostMapping("/new")
    public Lecturer create(@RequestBody Lecturer lecturer){

        return service.create(lecturer);
    }

    @GetMapping(path = "/find/{id}")
    public Lecturer findById(@PathVariable String id){

        Lecturer lecturer = service.read(id);

        return lecturer;
    }

    @PutMapping("/update")
    public void update(@RequestBody Lecturer lecturer){

        service.update(lecturer);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Lecturer> getAll(){
        return service.getAll();
    }

}
