/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.Transport;
import ac.za.cput.Service.Impl.TransportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/Transport")
public class TransportController {
    @Autowired
    @Qualifier("TransportServiceImpl")
    private TransportServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public Transport create(Transport trans) {
        return service.create(trans);
    }

    @PostMapping("/update")
    @ResponseBody
    public Transport update(Transport trans) {
        return service.update(trans);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Transport read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Transport> getAll() {
        return service.getAll();
    } 
}
