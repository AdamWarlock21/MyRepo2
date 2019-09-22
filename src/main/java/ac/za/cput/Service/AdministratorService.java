package ac.za.cput.Service;

import ac.za.cput.Domain.Administrator;
import ac.za.cput.Repository.IRepository;
import ac.za.cput.Service.IService;

import java.util.Set;

public interface AdministratorService extends IService<Administrator, String> {

    Set<Administrator> getAll();

}