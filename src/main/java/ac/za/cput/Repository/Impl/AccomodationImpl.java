package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Accomodation;
import ac.za.cput.Repository.AccomRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("AccomodationImpl")
public class AccomodationImpl implements AccomRepository {

    private static AccomodationImpl repository = null;
    private Map<String, Accomodation> accom;

    private AccomodationImpl() {
        accom = new HashMap<>();
    }

    public static AccomodationImpl getRepository(){
        if(repository == null) repository = new AccomodationImpl();
        return repository;
    }

    @Override
    public Accomodation create(Accomodation accom){
        this.accom.put(accom.getAccId(),accom);
        return accom;
    }

    @Override
    public Accomodation read(String AccId){
      return  this.accom.get(AccId); 
    }

    @Override
    public Accomodation update(Accomodation accom) {
        this.accom.replace(accom.getAccId(), accom);
       return this.accom.get(accom.getAccId());
    }

    @Override
    public void delete(String AccId) {
        accom.remove(AccId);
        

    }

    @Override
    public Set<Accomodation> getAll(){
       //return a set to eliminate any duplicates
        Collection<Accomodation> students = this.accom.values();

        return new HashSet<>(students);
    }
}

