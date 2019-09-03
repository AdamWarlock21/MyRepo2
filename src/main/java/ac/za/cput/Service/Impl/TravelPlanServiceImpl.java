/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service.Impl;

import ac.za.cput.Domain.TravelPlan;
import ac.za.cput.Repository.TravelPlanRepository;
import ac.za.cput.Repository.Impl.TravelPlanRepositoryImpl;
import ac.za.cput.Service.TravelPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
/**
 *
 * @author BooBoo
 */
@Service("TravelPlanServiceImpl")
public class TravelPlanServiceImpl implements TravelPlanService{
    private TravelPlanServiceImpl service = null;
    private TravelPlanRepository repository;

    private TravelPlanServiceImpl(){
        this.repository = TravelPlanRepositoryImpl.getRepository();
    }

    public TravelPlanService getService(){
        if (service == null) service = new TravelPlanServiceImpl();
        return service;
    }


    @Override
    public TravelPlan create(TravelPlan travel) {
        return this.repository.create(travel);
    }

    @Override
    public TravelPlan update(TravelPlan travel) {
        return this.repository.update(travel);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public TravelPlan read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<TravelPlan> getAllTravelPlan() {
        Set<TravelPlan> travelP = getAll();

        return null;
    }

    @Override
    public Set<TravelPlan> getAll() {
        return this.repository.getAll();
    }
}
