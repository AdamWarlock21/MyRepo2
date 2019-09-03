/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.FundedMealPlan;
import ac.za.cput.Repository.FundedMealPlanRepository;
import ac.za.cput.Repository.Impl.FundedMealRepositoryImpl;
import ac.za.cput.Service.FundedMealPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@Service("FundedMealPlanServiceImpl")
public class FundedMealPlanServiceImpl implements FundedMealPlanService{
    private FundedMealPlanServiceImpl service = null;
    private FundedMealPlanRepository repository;

    private FundedMealPlanServiceImpl(){
        this.repository = FundedMealRepositoryImpl.getRepository();
    }

    public FundedMealPlanService getService(){
        if (service == null) service = new FundedMealPlanServiceImpl();
        return service;
    }


    @Override
    public FundedMealPlan create(FundedMealPlan fund) {
        return this.repository.create(fund);
    }

    @Override
    public FundedMealPlan update(FundedMealPlan fund) {
        return this.repository.update(fund);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public FundedMealPlan read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<FundedMealPlan> getAllFundedMealPlan() {
        Set<FundedMealPlan> fundedM = getAll();

        return null;
    }

    @Override
    public Set<FundedMealPlan> getAll() {
        return this.repository.getAll();
    }
}
