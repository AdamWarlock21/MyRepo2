package ac.za.cput.Repository;

import ac.za.cput.Domain.PrivateMealPlan;

import java.util.HashSet;
import java.util.Set;

public interface PrivateMealPlanRepository extends IRepository<PrivateMealPlan, String> {
    Set<PrivateMealPlan> getAll();

}
