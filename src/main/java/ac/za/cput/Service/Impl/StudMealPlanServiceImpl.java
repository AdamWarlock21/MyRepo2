/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.StudMealPlan;
import ac.za.cput.Repository.StudMealPlanRepository;
import ac.za.cput.Repository.Impl.StudMealPlanRepositoryImpl;
import ac.za.cput.Service.StudMealPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@Service("StudMealPlanServiceImpl")
public class StudMealPlanServiceImpl implements StudMealPlanService{
    private StudMealPlanServiceImpl service = null;
    private StudMealPlanRepository repository;

    private StudMealPlanServiceImpl(){
        this.repository = StudMealPlanRepositoryImpl.getRepository();
    }

    public StudMealPlanService getService(){
        if (service == null) service = new StudMealPlanServiceImpl();
        return service;
    }


    @Override
    public StudMealPlan create(StudMealPlan sMeal) {
        return this.repository.create(sMeal);
    }

    @Override
    public StudMealPlan update(StudMealPlan sMeal) {
        return this.repository.update(sMeal);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public StudMealPlan read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<StudMealPlan> getAllStudMealPlan() {
        Set<StudMealPlan> studMeal = getAll();

        return null;
    }

    @Override
    public Set<StudMealPlan> getAll() {
        return this.repository.getAll();
    }
}
