/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.Transport;
import ac.za.cput.Repository.TransportRepository;
import ac.za.cput.Repository.Impl.TransportRepositoryImpl;
import ac.za.cput.Service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import org.springframework.stereotype.Repository;
/**
 *
 * @author BooBoo
 */
@Repository("TransportServiceImpl")
public class TransportServiceImpl implements TransportService{
    private TransportServiceImpl service = null;
    private TransportRepository repository;

    private TransportServiceImpl(){
        this.repository = TransportRepositoryImpl.getRepository();
    }

    public TransportService getService(){
        if (service == null) service = new TransportServiceImpl();
        return service;
    }


    @Override
    public Transport create(Transport trans) {
        return this.repository.create(trans);
    }

    @Override
    public Transport update(Transport trans) {
        return this.repository.update(trans);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Transport read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Transport> getAllTransport() {
        Set<Transport> transport = getAll();

        return null;
    }

    @Override
    public Set<Transport> getAll() {
        return this.repository.getAll();
    }
}
