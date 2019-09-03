/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.TravelPlan;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class TravelPlannerFactory {
    
    public static TravelPlan getTravelPlanner(int TravelAmount, int TravelExp,int TravelBal ){
        return new TravelPlan.Builder()
                .TravelAmount(TravelAmount)
                .TravelExp(TravelExp)
                .TravelBal(TravelBal)
                .PlanId(Misc.generateId())
                .build();
                
    
}

}