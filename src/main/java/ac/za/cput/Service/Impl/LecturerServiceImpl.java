package ac.za.cput.Service.Impl;

import org.springframework.stereotype.Repository;
import ac.za.cput.Domain.Lecturer;
import ac.za.cput.Repository.LecturerRepository;
import ac.za.cput.Repository.Impl.LecturerRepositoryImpl;
import ac.za.cput.Service.LecturerService;

import java.util.HashSet;
import java.util.Set;

@Repository("LecturerServiceImpl")
public class LecturerServiceImpl implements LecturerService {

    private LecturerServiceImpl service = null;
    private LecturerRepository repository;

    public LecturerServiceImpl() {
        repository = LecturerRepositoryImpl.getRepository();
    }

    public LecturerServiceImpl getService(){

        if(service == null){
            return new LecturerServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Lecturer> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Lecturer create(Lecturer lecturer) {
        return repository.create(lecturer);
    }

    @Override
    public Lecturer read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Lecturer update(Lecturer lecturer) {
        return repository.update(lecturer);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

