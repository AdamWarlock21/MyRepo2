/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.StudPlanner;
import ac.za.cput.Service.Impl.StudPlannerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/StudPlanner")
public class StudPlannerController {
    @Autowired
    @Qualifier("StudPlannerServiceImpl")
    private StudPlannerServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public StudPlanner create(StudPlanner studP) {
        return service.create(studP);
    }

    @PostMapping("/update")
    @ResponseBody
    public StudPlanner update(StudPlanner studP) {
        return service.update(studP);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public StudPlanner read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StudPlanner> getAll() {
        return service.getAll();
    }
}
