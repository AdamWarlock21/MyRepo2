package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.StudPlanner;
import ac.za.cput.Repository.StudPlannerRepository;
import ac.za.cput.Repository.Impl.StudPlannerRepositoryImpl;
import ac.za.cput.Service.StudPlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import org.springframework.stereotype.Repository;
@Repository("StudPlannerServiceImpl")
public class StudPlannerServiceImpl implements StudPlannerService {

    private StudPlannerServiceImpl service = null;
    private StudPlannerRepository repository;

    private StudPlannerServiceImpl(){
        this.repository = StudPlannerRepositoryImpl.getRepository();
    }

    public StudPlannerService getService(){
        if (service == null) service = new StudPlannerServiceImpl();
        return service;
    }


    @Override
    public StudPlanner create(StudPlanner stud) {
        return this.repository.create(stud);
    }

    @Override
    public StudPlanner update(StudPlanner stud) {
        return this.repository.update(stud);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public StudPlanner read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<StudPlanner> getAllAppDevCourses() {
        Set<StudPlanner> studPlanner = getAll();

        return null;
    }

    @Override
    public Set<StudPlanner> getAll() {
        return this.repository.getAll();
    }
}