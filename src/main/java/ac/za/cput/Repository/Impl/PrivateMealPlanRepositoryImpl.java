package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.PrivateMealPlan;
import ac.za.cput.Repository.PrivateMealPlanRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("PrivateMealRepositoryImpl")
public class PrivateMealPlanRepositoryImpl implements PrivateMealPlanRepository{
    
     private static PrivateMealPlanRepositoryImpl repository = null;
    private Map<String,PrivateMealPlan> PrivMeal;

    private PrivateMealPlanRepositoryImpl() {
        PrivMeal = new HashMap<>();
    }

    public static PrivateMealPlanRepository getRepository(){
        if(repository == null) repository = new PrivateMealPlanRepositoryImpl();
        return repository;
    }

    @Override
    public PrivateMealPlan create(PrivateMealPlan PrivMeal){
        this.PrivMeal.put(PrivMeal.getLocationId(), PrivMeal);
        return PrivMeal;
    }

    @Override
    public PrivateMealPlan read(String LocationId){
        
        return this.PrivMeal.get(LocationId);
    }

    @Override
    public PrivateMealPlan update(PrivateMealPlan PrivMeal) {
        this.PrivMeal.replace(PrivMeal.getLocationId(), PrivMeal);
        return this.PrivMeal.get(PrivMeal.getLocationId());
    }

    @Override
    public void delete(String LocationId) {
        
        this.PrivMeal.remove(LocationId);

    }

    @Override
    public Set<PrivateMealPlan> getAll(){
        Collection<PrivateMealPlan> privM = this.PrivMeal.values(); 
        return new HashSet<>(privM);
    }
}
