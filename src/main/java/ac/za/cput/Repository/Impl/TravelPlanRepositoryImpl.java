package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.TravelPlan;
import ac.za.cput.Repository.TravelPlanRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("TravelPlanRepositoryImpl")
public class TravelPlanRepositoryImpl implements TravelPlanRepository {

    private static TravelPlanRepositoryImpl repository = null;
    private Map<String,TravelPlan> Bplan;

    private TravelPlanRepositoryImpl() {
        Bplan = new HashMap<>();
    }

    
    public static TravelPlanRepository getRepository(){
        if(repository == null) repository = new TravelPlanRepositoryImpl();
        return repository;
    }

    @Override
    public TravelPlan create(TravelPlan Bplan){
        this.Bplan.put(Bplan.getPlanId(), Bplan);
        return Bplan;
    }

    @Override
    public TravelPlan read(String PlanId){
        
        return this.Bplan.get(PlanId);
    }

    @Override
    public TravelPlan update(TravelPlan Bplan) {
        this.Bplan.replace(Bplan.getPlanId(), Bplan);
        return this.Bplan.get(Bplan.getPlanId());
    }

    @Override
    public void delete(String PlanId) {
        
        this.Bplan.remove(PlanId);

    }

    @Override
    public Set<TravelPlan> getAll(){
        Collection <TravelPlan> travelPlan = this.Bplan.values();
        return new HashSet<>(travelPlan);
    }
}