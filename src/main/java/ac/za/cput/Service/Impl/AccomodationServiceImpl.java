package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.Accomodation;
import ac.za.cput.Repository.AccomRepository;
import ac.za.cput.Repository.Impl.AccomodationImpl;
import ac.za.cput.Service.AccomodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository("AccomodationServiceImpl")
public class AccomodationServiceImpl implements AccomodationService {

    private AccomodationServiceImpl service = null;
    private AccomRepository repository;

    private AccomodationServiceImpl(){
        this.repository = AccomodationImpl.getRepository();
    }

    public AccomodationService getService(){
        if (service == null) service = new AccomodationServiceImpl();
        return service;
    }


    @Override
    public Accomodation create(Accomodation accom) {
        return this.repository.create(accom);
    }

    @Override
    public Accomodation update(Accomodation accom) {
        return this.repository.update(accom);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Accomodation read(String s) {
        return this.repository.read(s);
    }

 
    @Override
    public Set<Accomodation> getAllAccomodation() {
        Set<Accomodation> accomodation = getAll();

        return null;
    }

    @Override
    public Set<Accomodation> getAll() {
        return this.repository.getAll();
    }
}