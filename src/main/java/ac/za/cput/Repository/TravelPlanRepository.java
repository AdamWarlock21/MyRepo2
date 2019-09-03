package ac.za.cput.Repository;

import ac.za.cput.Domain.TravelPlan;

import java.util.HashSet;
import java.util.Set;

public interface TravelPlanRepository extends IRepository<TravelPlan, String> {
    Set<TravelPlan> getAll();

}

