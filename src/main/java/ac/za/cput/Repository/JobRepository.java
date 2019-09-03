package ac.za.cput.Repository;

import ac.za.cput.Domain.Job;

import java.util.HashSet;
import java.util.Set;

public interface JobRepository extends IRepository<Job, String> {
    Set<Job> getAll();

}

