package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudMealPlan;
import ac.za.cput.Repository.StudMealPlanRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("StudMealPlanRepositoryImpl")
public class StudMealPlanRepositoryImpl implements StudMealPlanRepository{

private static StudMealPlanRepositoryImpl repository = null;
    private Map<String, StudMealPlan> Mplan;

    private StudMealPlanRepositoryImpl() {
        Mplan = new HashMap<>();
    }

    public static StudMealPlanRepository getRepository(){
        if(repository == null) repository = new StudMealPlanRepositoryImpl();
        return repository;
    }

    @Override
    public StudMealPlan create(StudMealPlan Mplan){
        this.Mplan.put(Mplan.getMealPlanId(), Mplan);
        return Mplan;
    }

    @Override
    public StudMealPlan read(String MealPlanId){
        
        return this.Mplan.get(MealPlanId);
    }

    @Override
    public StudMealPlan update(StudMealPlan Mplan) {
        this.Mplan.replace(Mplan.getMealPlanId(), Mplan);
        return this.Mplan.get(Mplan.getMealPlanId());
    }

    @Override
    public void delete(String MealPlanId) {
         
        this.Mplan.remove(MealPlanId);

    }

    @Override
    public Set<StudMealPlan> getAll(){
        Collection<StudMealPlan> studM = this.Mplan.values();
        return new HashSet<>(studM);
    }    
}
