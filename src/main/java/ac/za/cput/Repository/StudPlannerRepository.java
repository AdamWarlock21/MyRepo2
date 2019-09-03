package ac.za.cput.Repository;

import ac.za.cput.Domain.StudPlanner;

import java.util.HashSet;
import java.util.Set;

public interface StudPlannerRepository extends IRepository<StudPlanner, String> {
    Set<StudPlanner> getAll();

}

