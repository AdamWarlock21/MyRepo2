package ac.za.cput.Repository;

import ac.za.cput.Domain.FundedMealPlan;

import java.util.HashSet;
import java.util.Set;

public interface FundedMealPlanRepository extends IRepository<FundedMealPlan, String> {
    Set<FundedMealPlan> getAll();

}