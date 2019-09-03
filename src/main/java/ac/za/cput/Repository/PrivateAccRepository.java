package ac.za.cput.Repository;

import ac.za.cput.Domain.PrivateAcc;

import java.util.HashSet;
import java.util.Set;

public interface PrivateAccRepository extends IRepository<PrivateAcc, String> {
    Set<PrivateAcc> getAll();

}

