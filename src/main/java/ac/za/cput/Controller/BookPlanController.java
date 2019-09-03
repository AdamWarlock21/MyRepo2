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
import ac.za.cput.Domain.BookPlan;
import ac.za.cput.Service.Impl.BookPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/bookplan")
public class BookPlanController {
    @Autowired
    @Qualifier("BookPlanServiceImpl")
    private BookPlanServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public BookPlan create(BookPlan book) {
        return service.create(book);
    }

    @PostMapping("/update")
    @ResponseBody
    public BookPlan update(BookPlan book) {
        return service.update(book);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BookPlan read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BookPlan> getAll() {
        return service.getAll();
    }
}
