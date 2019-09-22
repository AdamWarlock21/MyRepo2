/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.ExamPlanner;
import ac.za.cput.Repository.ExamPlanRepository;
import ac.za.cput.Repository.Impl.ExamPlannerRepositoryImpl;
import ac.za.cput.Service.ExamPlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 *
 * @author BooBoo
 */
@Repository("ExamPlannerServiceImpl")
public class ExamPlannerServiceImpl implements ExamPlannerService{
    
    private ExamPlannerServiceImpl service = null;
    private ExamPlanRepository repository;

    private ExamPlannerServiceImpl(){
        this.repository = ExamPlannerRepositoryImpl.getRepository();
    }

    public ExamPlannerService getService(){
        if (service == null) service = new ExamPlannerServiceImpl();
        return service;
    }


    @Override
    public ExamPlanner create(ExamPlanner exmplner) {
        return this.repository.create(exmplner);
    }

    @Override
    public ExamPlanner update(ExamPlanner exmplner) {
        return this.repository.update(exmplner);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public ExamPlanner read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<ExamPlanner> getAllExamPlanner() {
        Set<ExamPlanner> examplanner = getAll();

        return null;
    }

    @Override
    public Set<ExamPlanner> getAll() {
        return this.repository.getAll();
    }
    
}
