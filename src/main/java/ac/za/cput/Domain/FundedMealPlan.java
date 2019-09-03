/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class FundedMealPlan {
    
    String Location, LocationId;
    
    private FundedMealPlan(){}
    
    private FundedMealPlan(Builder builder){
        this.Location = builder.Location;
        this.LocationId = builder.LocationId;
    }
    
    public String getLocation(){return Location;}
    public String getLocationId(){return LocationId;}
    
    public static class Builder{
        private String Location, LocationId;
        
        public Builder Location(String Location){
            this.Location = Location;
            return this;
        }
        
        public Builder LocationId(String LocationId){
            this.LocationId = LocationId;
            return this;
        }
        
        public FundedMealPlan build(){ return new FundedMealPlan(this);}
        
    }
    
    @Override
    
    public String toString(){
        return "Accomodation:" +
                "Location ID:" + LocationId + '\'' +
                "Location:" + Location + 
                "";
    }
    
}
