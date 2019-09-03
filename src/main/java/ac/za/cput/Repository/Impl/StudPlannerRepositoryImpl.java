package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudPlanner;
import ac.za.cput.Repository.StudPlannerRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("StudPlannerRepositroyImpl")
public class StudPlannerRepositoryImpl implements StudPlannerRepository{

private static StudPlannerRepositoryImpl repository = null;
    private Map<String, StudPlanner> Mplan;

    private StudPlannerRepositoryImpl() {
        Mplan = new HashMap<>();
    }

    public static StudPlannerRepository getRepository(){
        if(repository == null) repository = new StudPlannerRepositoryImpl();
        return repository;
    }

    @Override
    public StudPlanner create(StudPlanner Mplan){
        this.Mplan.put(Mplan.getCourseId(), Mplan);
        return Mplan;
    }

    @Override
    public StudPlanner read(String StudCourseId){
        return this.Mplan.get(StudCourseId);
    }

    @Override
    public StudPlanner update(StudPlanner Mplan) {
       this.Mplan.replace(Mplan.getCourseId(), Mplan);
        return this.Mplan.get(Mplan.getCourseId());
    }

    @Override
    public void delete(String StudCourseId) {
        this.Mplan.remove(StudCourseId);
        

    }

    @Override
    public Set<StudPlanner> getAll(){
        Collection<StudPlanner> studP = this.Mplan.values();
        return new HashSet<>(studP);
    }    
}
