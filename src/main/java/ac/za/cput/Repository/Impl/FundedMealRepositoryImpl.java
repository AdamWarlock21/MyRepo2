package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.FundedMealPlan;
import ac.za.cput.Repository.FundedMealPlanRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

public class FundedMealRepositoryImpl implements FundedMealPlanRepository{
    private static FundedMealRepositoryImpl repository = null;
    private Map<String, FundedMealPlan> FMealPlan;

    private FundedMealRepositoryImpl() {
        FMealPlan = new HashMap<>();
    }

    public static FundedMealRepositoryImpl getRepository(){
        if(repository == null) repository = new FundedMealRepositoryImpl();
        return repository;
    }

    @Override
    public FundedMealPlan create(FundedMealPlan FMealPlan){
        this.FMealPlan.put(FMealPlan.getLocationId(), FMealPlan);
        return FMealPlan;
    }

    @Override
    public FundedMealPlan read(String LocationId){
        
        return this.FMealPlan.get(LocationId);
    }

    @Override
    public FundedMealPlan update(FundedMealPlan FMealPlan) {
        
        this.FMealPlan.replace(FMealPlan.getLocationId(), FMealPlan);
        return this.FMealPlan.get(FMealPlan.getLocationId());
    }

    @Override
    public void delete(String LocationId) {
        FMealPlan.remove(LocationId);

    }

    @Override
    public Set<FundedMealPlan> getAll(){
       Collection<FundedMealPlan> mealP = this.FMealPlan.values();
        return new HashSet<>(mealP);
    } 
}
