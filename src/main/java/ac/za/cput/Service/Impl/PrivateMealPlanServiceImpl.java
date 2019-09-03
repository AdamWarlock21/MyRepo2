/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.PrivateMealPlan;
import ac.za.cput.Repository.PrivateMealPlanRepository;
import ac.za.cput.Repository.Impl.PrivateMealPlanRepositoryImpl;
import ac.za.cput.Service.PrivateMealPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@Service("PrivateMealPlanServiceImpl")
public class PrivateMealPlanServiceImpl implements PrivateMealPlanService{
    private PrivateMealPlanServiceImpl service = null;
    private PrivateMealPlanRepository repository;

    private PrivateMealPlanServiceImpl(){
        this.repository = PrivateMealPlanRepositoryImpl.getRepository();
    }

    public PrivateMealPlanService getService(){
        if (service == null) service = new PrivateMealPlanServiceImpl();
        return service;
    }


    @Override
    public PrivateMealPlan create(PrivateMealPlan meal) {
        return this.repository.create(meal);
    }

    @Override
    public PrivateMealPlan update(PrivateMealPlan meal) {
        return this.repository.update(meal);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PrivateMealPlan read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<PrivateMealPlan> getAllPrivateMealPlan() {
        Set<PrivateMealPlan> privMeal = getAll();

        return null;
    }

    @Override
    public Set<PrivateMealPlan> getAll() {
        return this.repository.getAll();
    }
}
