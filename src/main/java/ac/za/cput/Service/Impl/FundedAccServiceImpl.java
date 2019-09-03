/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.FundedAcc;
import ac.za.cput.Repository.FundedAccRepository;
import ac.za.cput.Repository.Impl.FundedAccRepositoryImpl;
import ac.za.cput.Service.FundedAccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@Service("FundedAccServiceImpl")
public class FundedAccServiceImpl implements FundedAccService{
    private FundedAccServiceImpl service = null;
    private FundedAccRepository repository;

    private FundedAccServiceImpl(){
        this.repository = FundedAccRepositoryImpl.getRepository();
    }

    public FundedAccService getService(){
        if (service == null) service = new FundedAccServiceImpl();
        return service;
    }


    @Override
    public FundedAcc create(FundedAcc fund) {
        return this.repository.create(fund);
    }

    @Override
    public FundedAcc update(FundedAcc fund) {
        return this.repository.update(fund);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public FundedAcc read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<FundedAcc> getAllFundedAcc() {
        Set<FundedAcc> fundedAcc = getAll();

        return null;
    }

    @Override
    public Set<FundedAcc> getAll() {
        return this.repository.getAll();
    }
}
