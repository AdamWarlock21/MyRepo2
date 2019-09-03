/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.TravelPlan;
import ac.za.cput.Service.Impl.TravelPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/TravelPlan")
public class TravelPlanController {
  @Autowired
    @Qualifier("TravelPlanServiceImpl")
    private TravelPlanServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public TravelPlan create(TravelPlan travel) {
        return service.create(travel);
    }

    @PostMapping("/update")
    @ResponseBody
    public TravelPlan update(TravelPlan travel) {
        return service.update(travel);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TravelPlan read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<TravelPlan> getAll() {
        return service.getAll();
    }  
}
