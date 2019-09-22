package ac.za.cput.Repository;

import ac.za.cput.Domain.Administrator;
import ac.za.cput.Repository.IRepository;

import java.util.Set;

public interface AdministratorRepository extends IRepository<Administrator, String> {

    Set<Administrator> getAll();

}