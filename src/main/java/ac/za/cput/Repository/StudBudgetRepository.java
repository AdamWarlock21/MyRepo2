package ac.za.cput.Repository;

import ac.za.cput.Domain.StudBudget;

import java.util.HashSet;
import java.util.Set;

public interface StudBudgetRepository extends IRepository<StudBudget, String> {
    Set<StudBudget> getAll();

}

