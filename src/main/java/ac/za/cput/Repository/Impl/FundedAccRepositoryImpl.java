package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.FundedAcc;
import ac.za.cput.Repository.FundedAccRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("FundedAccRepositoryImpl")
public class FundedAccRepositoryImpl implements FundedAccRepository {

    private static FundedAccRepositoryImpl repository = null;
    private Map<String, FundedAcc> Facc;

    private FundedAccRepositoryImpl() {
        Facc = new HashMap<>();
    }

    public static FundedAccRepository getRepository(){
        if(repository == null) repository = new FundedAccRepositoryImpl();
        return repository;
    }

    @Override
    public FundedAcc create(FundedAcc Facc){
        this.Facc.put(Facc.getLocationId(), Facc);
        return Facc;
    }

    @Override
    public FundedAcc read(String LocationId){
        
        return this.Facc.get(LocationId);
    }

    @Override
    public FundedAcc update(FundedAcc Facc) {
        this.Facc.replace(Facc.getLocationId(), Facc);
        return this.Facc.get(Facc.getLocationId());
    }

    @Override
    public void delete(String LocationId) {
        
        Facc.remove(LocationId);

    }
    
    @Override
    public Set<FundedAcc> getAll(){
        Collection<FundedAcc> location = this.Facc.values();
        return new HashSet<>(location);
    }
}
