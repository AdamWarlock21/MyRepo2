/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;


import ac.za.cput.Domain.Student;
import ac.za.cput.Service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public Student create(Student student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Student update(Student student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Student read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Student> getAll() {
        return service.getAll();
    }

}

