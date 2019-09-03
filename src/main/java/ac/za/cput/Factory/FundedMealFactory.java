/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.FundedMealPlan;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class FundedMealFactory {
    
    public static FundedMealPlan getAccStat(String Location ){
        return new FundedMealPlan.Builder()
                .Location(Location)
                .LocationId(Misc.generateId())
                .build();
                
              
    }
    
}
