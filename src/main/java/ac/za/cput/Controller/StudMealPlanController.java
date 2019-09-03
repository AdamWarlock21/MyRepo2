/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.StudMealPlan;
import ac.za.cput.Service.Impl.StudMealPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/StudMealPlan")
public class StudMealPlanController {
    @Autowired
    @Qualifier("StudMealPlanServiceImpl")
    private StudMealPlanServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public StudMealPlan create(StudMealPlan studM) {
        return service.create(studM);
    }

    @PostMapping("/update")
    @ResponseBody
    public StudMealPlan update(StudMealPlan studM) {
        return service.update(studM);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public StudMealPlan read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StudMealPlan> getAll() {
        return service.getAll();
    }  
}
