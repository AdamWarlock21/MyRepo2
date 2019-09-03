package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Transport;
import ac.za.cput.Repository.TransportRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("TransportRepositoryImpl")
public class TransportRepositoryImpl implements TransportRepository {

    private static TransportRepositoryImpl repository = null;
    private Map<String, Transport> Bplan;

    private TransportRepositoryImpl() {
        Bplan = new HashMap<>();
    }

    public static TransportRepository getRepository(){
        if(repository == null) repository = new TransportRepositoryImpl();
        return repository;
    }

    @Override
    public Transport create(Transport Bplan){
        this.Bplan.put(Bplan.getTransId(),Bplan);
        return Bplan;
    }

    @Override
    public Transport read(String transId){
        
        return this.Bplan.get(transId);
    }

    @Override
    public Transport update(Transport Bplan) {
        this.Bplan.replace(Bplan.getTransId(), Bplan);
        return this.Bplan.get(Bplan.getTransId());
    }

    @Override
    public void delete(String transId) {
        this.Bplan.remove(transId);

    }

    @Override
    public Set<Transport> getAll(){
        Collection<Transport> trans = this.Bplan.values();
        return new HashSet<>(trans);
    }
}
