/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Accomodation {
    
    private String AccId;
    private int AccAmount;
    
    private Accomodation(){}
    
    private Accomodation(Builder builder){
        this.AccId = builder.AccId;
        this.AccAmount = builder.AccAmount;
    }
    
    public String getAccId(){return AccId;}
    public int setAccAmount(){
        AccAmount = 3000;
        return AccAmount;
    }
    public int getAccAmount(){return AccAmount;}
    
    public static class Builder{
        private String AccId;
        private int AccAmount;
        
        public Builder AccId( String AccId){
            this.AccId = AccId;
            return this;
        }
        
        public Builder AccAmount(int AccAmount){
            this.AccAmount = AccAmount;
            return this;
        }
        
        public Accomodation build(){return new Accomodation(this);}
        
    }
    
    @Override
    public String toString(){
        return "Accomodation:" +
                "Accomodation ID:" + AccId + '\'' +
                "Accomodation Amount:" + AccAmount +'\'' +
                "";
    }
    
    
}
