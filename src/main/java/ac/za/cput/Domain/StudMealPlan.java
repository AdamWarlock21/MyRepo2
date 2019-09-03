/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class StudMealPlan {
    
    
    private String MealPlanId, MealName;
    private int MealPrice;
    
    
    private StudMealPlan(){}
    
    private StudMealPlan(Builder builder){
        this.MealPlanId = builder.MealPlanId;
        this.MealName = builder.MealName;
        this.MealPrice = builder.MealPrice;
    }
    
    
    public String getMealPlanId(){return MealPlanId;}
    public String getMealName(){return MealName;}
    public int getMealPrice(){return MealPrice;}
    
    
    public static class Builder{
        private String MealPlanId, MealName;
        private int MealPrice;
        
        public Builder MealPlanId(String MealPlanId){
            this.MealPlanId = MealPlanId;
            return this;
            
        }
        
        public Builder MealName(String MealName){
            this.MealName = MealName;
            return this;
        }
        
        public Builder MealPrice(int MealPrice){
            this.MealPrice = MealPrice;
            return this;
        }
        
        public StudMealPlan build(){ return new StudMealPlan(this);}
        
    }
    
    @Override
    
    public String toString(){
       return "Meal Plan:" +
               "Meal Plan ID: '" + MealPlanId + '\'' +
               "Meal Name: '" + MealName + '\'' +
               "Meal Price: '" + "R" +  MealPrice + '\'' +
               "";
        
    }
      
}
