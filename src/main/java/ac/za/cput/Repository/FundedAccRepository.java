package ac.za.cput.Repository;

import ac.za.cput.Domain.FundedAcc;

import java.util.HashSet;
import java.util.Set;

public interface FundedAccRepository extends IRepository<FundedAcc, String> {
    Set<FundedAcc> getAll();

}
