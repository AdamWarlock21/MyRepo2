/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

/**
 *
 * @author BooBoo
 */
import ac.za.cput.Domain.ExamPlanner;
import ac.za.cput.Service.Impl.ExamPlannerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/examplanner")
public class ExamPlannerController {
     @Autowired
    @Qualifier("ExamPlannerServiceImpl")
    private ExamPlannerServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public ExamPlanner create(ExamPlanner exam) {
        return service.create(exam);
    }

    @PutMapping("/update")
    public ExamPlanner update(ExamPlanner exam) {
        return service.update(exam);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    public ExamPlanner read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    public Set<ExamPlanner> getAll() {
        return service.getAll();
    }
}
