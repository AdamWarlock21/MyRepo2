/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.Accomodation;
import ac.za.cput.Service.Impl.AccomodationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/accomodation")
public class AccomodationController {
    @Autowired
    @Qualifier("AccomodationServiceImpl")
    private AccomodationServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public Accomodation create(Accomodation accom) {
        return service.create(accom);
    }
     @GetMapping(path = "/find/{id}")
    public Accomodation findById(@PathVariable String id){

        Accomodation accom = service.read(id);
        return accom;
    }

    @PostMapping("/update")
    @ResponseBody
    public Accomodation update(Accomodation accom) {
        return service.update(accom);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Accomodation read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Accomodation> getAll() {
        return service.getAll();
    }
}
