/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.PrivateAcc;
import ac.za.cput.Service.Impl.PrivateAccServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/PrivateAcc")
public class PrivateAccController {
   @Autowired
    @Qualifier("PrivateAccServiceImpl")
    private PrivateAccServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public PrivateAcc create(PrivateAcc privA) {
        return service.create(privA);
    }

    @PostMapping("/update")
    @ResponseBody
    public PrivateAcc update(PrivateAcc privA) {
        return service.update(privA);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PrivateAcc read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PrivateAcc> getAll() {
        return service.getAll();
    } 
}
