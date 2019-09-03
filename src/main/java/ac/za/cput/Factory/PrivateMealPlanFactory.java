/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.PrivateMealPlan;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class PrivateMealPlanFactory {
    
    
    public static PrivateMealPlan getAccStat(String Location ){
        return new PrivateMealPlan.Builder()
                .Location(Location)
                .LocationId(Misc.generateId())
                .build();
                
              
    }
    
}
