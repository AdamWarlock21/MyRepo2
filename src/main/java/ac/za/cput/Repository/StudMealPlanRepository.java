package ac.za.cput.Repository;

import ac.za.cput.Domain.StudMealPlan;

import java.util.HashSet;
import java.util.Set;

public interface StudMealPlanRepository extends IRepository<StudMealPlan, String> {
    Set<StudMealPlan> getAll();

}

