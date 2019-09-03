/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.StudBudget;
import ac.za.cput.Repository.StudBudgetRepository;
import ac.za.cput.Repository.Impl.StudBudgetRepositoryImpl;
import ac.za.cput.Service.StudBudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@Service("StudBudgetServiceImpl")
public class StudBudgetServiceImpl implements StudBudgetService{
    private StudBudgetServiceImpl service = null;
    private StudBudgetRepository repository;

    private StudBudgetServiceImpl(){
        this.repository = StudBudgetRepositoryImpl.getRepository();
    }

    public StudBudgetService getService(){
        if (service == null) service = new StudBudgetServiceImpl();
        return service;
    }


    @Override
    public StudBudget create(StudBudget budg) {
        return this.repository.create(budg);
    }

    @Override
    public StudBudget update(StudBudget budg) {
        return this.repository.update(budg);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public StudBudget read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<StudBudget> getAllStudBudget() {
        Set<StudBudget> studbudget = getAll();

        return null;
    }

    @Override
    public Set<StudBudget> getAll() {
        return this.repository.getAll();
    }
}
