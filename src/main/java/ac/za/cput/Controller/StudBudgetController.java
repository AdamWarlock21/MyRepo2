/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.StudBudget;
import ac.za.cput.Service.Impl.StudBudgetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/StudBudget")
public class StudBudgetController {
    @Autowired
    @Qualifier("StudBudgetServiceImpl")
    private StudBudgetServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public StudBudget create(StudBudget studB) {
        return service.create(studB);
    }

    @PostMapping("/update")
    @ResponseBody
    public StudBudget update(StudBudget studB) {
        return service.update(studB);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public StudBudget read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StudBudget> getAll() {
        return service.getAll();
    }
}
