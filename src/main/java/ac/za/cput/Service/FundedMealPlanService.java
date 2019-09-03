/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service;

import ac.za.cput.Domain.FundedMealPlan;
import ac.za.cput.Service.IService;
import java.util.Set;
/**
 *
 * @author BooBoo
 */
public interface FundedMealPlanService extends IService<FundedMealPlan, String> {
    
    FundedMealPlan create(FundedMealPlan fundedmealplan);
    Set<FundedMealPlan> getAllFundedMealPlan();
    Set<FundedMealPlan> getAll();
}
