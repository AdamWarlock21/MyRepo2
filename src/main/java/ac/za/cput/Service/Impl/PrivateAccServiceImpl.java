/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.PrivateAcc;
import ac.za.cput.Repository.PrivateAccRepository;
import ac.za.cput.Repository.Impl.PrivateAccRepositoryImpl;
import ac.za.cput.Service.PrivateAccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import org.springframework.stereotype.Repository;
/**
 *
 * @author BooBoo
 */
@Repository("PrivateAccServiceImpl")
public class PrivateAccServiceImpl implements PrivateAccService{
    private PrivateAccServiceImpl service = null;
    private PrivateAccRepository repository;

    private PrivateAccServiceImpl(){
        this.repository = PrivateAccRepositoryImpl.getRepository();
    }

    public PrivateAccService getService(){
        if (service == null) service = new PrivateAccServiceImpl();
        return service;
    }


    @Override
    public PrivateAcc create(PrivateAcc privacc) {
        return this.repository.create(privacc);
    }

    @Override
    public PrivateAcc update(PrivateAcc privacc) {
        return this.repository.update(privacc);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PrivateAcc read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<PrivateAcc> getAllPrivateAcc() {
        Set<PrivateAcc> privacc = getAll();

        return null;
    }

    @Override
    public Set<PrivateAcc> getAll() {
        return this.repository.getAll();
    }
}
