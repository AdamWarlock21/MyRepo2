package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Job;
import ac.za.cput.Repository.JobRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


public class JobRepositoryImpl implements JobRepository {
 
    private static JobRepositoryImpl repository = null;
    private Map<String, Job> job;

    private JobRepositoryImpl() {
        job = new HashMap<>();
    }

    public static JobRepository getRepository(){
        if(repository == null) repository = new JobRepositoryImpl();
        return repository;
    }

    @Override
    public Job create(Job job){
        this.job.put(job.getEmpId(), job);
        return job;
    }

    @Override
    public Job read(String BookId){
        
        return this.job.get(BookId);
    }

    @Override
    public Job update(Job job) {
        
        this.job.replace(job.getEmpId(), job);
        return this.job.get(job.getEmpId());
    }

    @Override
    public void delete(String BookId) {
        
        job.remove(BookId); 

    }

    @Override
    public Set<Job> getAll(){
        Collection<Job> studJob = this.job.values();
        return new HashSet<>(studJob);
    }   
}
