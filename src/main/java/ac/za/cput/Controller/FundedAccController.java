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

import ac.za.cput.Domain.FundedAcc;
import ac.za.cput.Service.Impl.FundedAccServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/fundedAcc")
public class FundedAccController {
    @Autowired
    @Qualifier("FundedAccServiceImpl")
    private FundedAccServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public FundedAcc create(FundedAcc fundA) {
        return service.create(fundA);
    }

    @PutMapping("/update")
    public FundedAcc update(FundedAcc fundA) {
        return service.update(fundA);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    public FundedAcc read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    public Set<FundedAcc> getAll() {
        return service.getAll();
    }
}
