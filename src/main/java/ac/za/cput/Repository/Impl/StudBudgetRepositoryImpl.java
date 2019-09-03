package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudBudget;
import ac.za.cput.Repository.StudBudgetRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("StudBudgetRepositoryImpl")
public class StudBudgetRepositoryImpl implements StudBudgetRepository{

private static StudBudgetRepositoryImpl repository = null;
    private Map<String ,StudBudget> StudB;

    private StudBudgetRepositoryImpl() {
        this.StudB = new HashMap<>();
    }

    public static StudBudgetRepository getRepository(){
        if(repository == null) repository = new StudBudgetRepositoryImpl();
        return repository;
    }

    @Override
    public StudBudget create(StudBudget StudB){
        this.StudB.put(StudB.getBudgetId(), StudB);
        return StudB;
    }

    @Override
    public StudBudget read(String BudgetId){
        
        return this.StudB.get(BudgetId);
    }

    @Override
    public StudBudget update(StudBudget StudB) {
        this.StudB.replace(StudB.getBudgetId(), StudB);
        return this.StudB.get(StudB.getBudgetId());
    }

    @Override
    public void delete(String BudgetId) {
        this.StudB.remove(BudgetId);

    }
 
    @Override
    public Set<StudBudget> getAll(){
        Collection<StudBudget> budget = this.StudB.values();
        return new HashSet<>(budget);
    }    
}
