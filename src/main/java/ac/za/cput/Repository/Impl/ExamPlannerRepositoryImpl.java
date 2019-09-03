package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.ExamPlanner;
import ac.za.cput.Repository.ExamPlanRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository("ExamPlannerRepositoryImpl")
public class ExamPlannerRepositoryImpl implements ExamPlanRepository {

    private static ExamPlannerRepositoryImpl repository = null;
    private Map<String, ExamPlanner> Eplan;

    private ExamPlannerRepositoryImpl() {
        Eplan = new HashMap<>();
    }

    public static ExamPlanRepository getRepository(){
        if(repository == null) repository = new ExamPlannerRepositoryImpl();
        return repository;
    }

     @Override
    public ExamPlanner create(ExamPlanner Eplan){
        this.Eplan.put(Eplan.getExamPlannerId(), Eplan);
        return Eplan;
    }

     @Override
    public ExamPlanner read(String ExamId){
        
        return this.Eplan.get(ExamId);
    }

     @Override
    public ExamPlanner update(ExamPlanner Eplan) {
        this.Eplan.replace(Eplan.getExamPlannerId(), Eplan);
        return this.Eplan.get(Eplan.getExamPlannerId());
    }

     @Override
    public void delete(String ExamId) {
        Eplan.remove(ExamId);

    }

     @Override
    public Set<ExamPlanner> getAll(){
       Collection<ExamPlanner> exam = this.Eplan.values();
       
       return new HashSet<>(exam);
    }
}
