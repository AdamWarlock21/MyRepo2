package ac.za.cput.Repository;

import ac.za.cput.Domain.ExamPlanner;

import java.util.HashSet;
import java.util.Set;

public interface ExamPlanRepository extends IRepository<ExamPlanner, String> {
    Set<ExamPlanner> getAll();

}
