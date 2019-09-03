/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class TravelPlan {
    
    private String PlanId;
    private int TravelAmount, TravelExp, TravelBal;
    
    
    private TravelPlan(){}
    
    private TravelPlan(Builder builder){
        this.PlanId = builder.PlanId;
        this.TravelAmount = builder.TravelAmount;
        this.TravelExp = builder.TravelExp;
        this.TravelBal = builder.TravelBal;
    }
    
    public String getPlanId(){return PlanId;}
    
    public int setBalance(){
        TravelBal = TravelAmount - TravelExp;
        return TravelBal;
    }
    
    public int getTravelAmount(){return TravelAmount;}
    public int getTravelExp(){return TravelExp;}
    public int TravelBal(){return TravelBal;}
    
    public static class Builder{
        private String PlanId;
        private int TravelAmount, TravelExp, TravelBal;
        
        public Builder PlanId(String PlanId){
            this.PlanId = PlanId;
            return this;
        }
        
        public Builder TravelAmount(int TravelAmount){
            this.TravelAmount = TravelAmount;
            return this;
        }
        
        public Builder TravelExp(int TravelExp){
            this.TravelExp = TravelExp;
            return this;
        }
        
        public Builder TravelBal(int TravelBal){
            this.TravelBal = TravelBal;
            return this;
        }
        
        public TravelPlan build(){return new TravelPlan(this);}
        
    }
    
    @Override
    public String toString(){
        return "Travel Plan:" +
                "Travel Plan ID:" + PlanId +'\'' +
                "Travel Amount:" + "R" + TravelAmount + '\'' +
                "Travel Expenses:" +"R"+ TravelExp + '\'' +
                "Travel Balance:" +"R"+ TravelBal + 
                "";
    }
    
}
