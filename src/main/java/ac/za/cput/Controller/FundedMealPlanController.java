/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Controller;

import ac.za.cput.Domain.FundedMealPlan;
import ac.za.cput.Service.Impl.FundedMealPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@RestController
@RequestMapping("/fundedMealPlan")
public class FundedMealPlanController {
    @Autowired
    @Qualifier("FundedMealPlanServiceImpl")
    private FundedMealPlanServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public FundedMealPlan create(FundedMealPlan fundM) {
        return service.create(fundM);
    }

    @PutMapping("/update")
    public FundedMealPlan update(FundedMealPlan fundM) {
        return service.update(fundM);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    public FundedMealPlan read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    public Set<FundedMealPlan> getAll() {
        return service.getAll();
    }
}
