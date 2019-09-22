/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.BookPlan;
import ac.za.cput.Repository.BookPlanRepository;
import ac.za.cput.Repository.Impl.BookPlanRepositoryImpl;
import ac.za.cput.Service.BookPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@Repository("BookPlanServiceImpl")
public class BookPlanServiceImpl implements BookPlanService{
    
    private BookPlanServiceImpl service = null;
    private BookPlanRepository repository;

    private BookPlanServiceImpl(){
        this.repository = BookPlanRepositoryImpl.getRepository();
    }

    public BookPlanService getService(){
        if (service == null) service = new BookPlanServiceImpl();
        return service;
    }


    @Override
    public BookPlan create(BookPlan book) {
        return this.repository.create(book);
    }

    @Override
    public BookPlan update(BookPlan book) {
        return this.repository.update(book);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public BookPlan read(String s) {
        return this.repository.read(s);
    }

 
    @Override
    public Set<BookPlan> getAllBookPlan() {
        Set<BookPlan> bookplan = getAll();

        return null;
    }

    @Override
    public Set<BookPlan> getAll() {
        return this.repository.getAll();
    }
    
}
