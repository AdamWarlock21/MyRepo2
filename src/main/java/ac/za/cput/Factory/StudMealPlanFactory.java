/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.StudMealPlan;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class StudMealPlanFactory {
    
    public static StudMealPlan getPlanner(String MealName, int MealPrice){
        return new StudMealPlan.Builder()
                .MealName(MealName)
                .MealPrice(MealPrice)
                .MealPlanId(Misc.generateId())
                .build();
                
              
    }
    
}
