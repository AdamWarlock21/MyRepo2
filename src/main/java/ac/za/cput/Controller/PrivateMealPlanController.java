/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.PrivateMealPlan;
import ac.za.cput.Service.Impl.PrivateMealPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/PrivateMealPlan")
public class PrivateMealPlanController {
    @Autowired
    @Qualifier("PrivateMealPlanServiceImpl")
    private PrivateMealPlanServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public PrivateMealPlan create(PrivateMealPlan privA) {
        return service.create(privA);
    }

    @PostMapping("/update")
    @ResponseBody
    public PrivateMealPlan update(PrivateMealPlan privA) {
        return service.update(privA);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PrivateMealPlan read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PrivateMealPlan> getAll() {
        return service.getAll();
    }
}
