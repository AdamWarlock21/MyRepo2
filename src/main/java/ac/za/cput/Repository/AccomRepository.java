package ac.za.cput.Repository;

import ac.za.cput.Domain.Accomodation;

import java.util.HashSet;
import java.util.Set;

public interface AccomRepository extends IRepository<Accomodation, String> {
    Set<Accomodation> getAll();

}
