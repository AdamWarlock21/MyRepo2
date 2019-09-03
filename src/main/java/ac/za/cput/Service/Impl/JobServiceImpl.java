/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.Job;
import ac.za.cput.Repository.JobRepository;
import ac.za.cput.Repository.Impl.JobRepositoryImpl;
import ac.za.cput.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@Service("JobServiceImpl")
public class JobServiceImpl implements JobService{
    private JobServiceImpl service = null;
    private JobRepository repository;

    private JobServiceImpl(){
        this.repository = JobRepositoryImpl.getRepository();
    }

    public JobService getService(){
        if (service == null) service = new JobServiceImpl();
        return service;
    }


    @Override
    public Job create(Job job) {
        return this.repository.create(job);
    }

    @Override
    public Job update(Job job) {
        return this.repository.update(job);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Job read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Job> getAllJob() {
        Set<Job> job = getAll();

        return null;
    }

    @Override
    public Set<Job> getAll() {
        return this.repository.getAll();
    }
}
