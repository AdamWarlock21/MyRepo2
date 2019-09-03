package ac.za.cput.Repository;

import ac.za.cput.Domain.Transport;

import java.util.HashSet;
import java.util.Set;

public interface TransportRepository extends IRepository<Transport, String> {
    Set<Transport> getAll();

}