package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.PrivateAcc;
import ac.za.cput.Repository.PrivateAccRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("PrivateAccRepositoryImpl")
public class PrivateAccRepositoryImpl implements PrivateAccRepository{
private static PrivateAccRepositoryImpl repository = null;
    private Map<String,PrivateAcc> Acc;

    private PrivateAccRepositoryImpl() {
        Acc = new HashMap<>();
    }

    public static PrivateAccRepository getRepository(){
        if(repository == null) repository = new PrivateAccRepositoryImpl();
        return repository;
    }

    @Override
    public PrivateAcc create(PrivateAcc Acc){
        this.Acc.put(Acc.getLocationId(), Acc);
        return Acc;
    }

    @Override
    public PrivateAcc read(String AccId){
        
        return this.Acc.get(AccId);
    }

    @Override
    public PrivateAcc update(PrivateAcc Acc) {
        this.Acc.replace(Acc.getLocationId(), Acc);
        return this.Acc.get(Acc.getLocationId());
    }

    @Override
    public void delete(String AccId) {
        
        Acc.remove(AccId);

    }

    @Override
    public Set<PrivateAcc> getAll(){
       Collection<PrivateAcc> priv = this.Acc.values();
        
        return new HashSet<>(priv);
    }    
}
