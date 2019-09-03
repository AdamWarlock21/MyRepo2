/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.Job;
import ac.za.cput.Service.Impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/Job")
public class JobController {
    @Autowired
    @Qualifier("JobServiceImpl")
    private JobServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public Job create(Job job) {
        return service.create(job);
    }

    @PostMapping("/update")
    @ResponseBody
    public Job update(Job job) {
        return service.update(job);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Job read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Job> getAll() {
        return service.getAll();
    }
}
