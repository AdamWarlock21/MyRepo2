package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Transport {

    private String  transId, transDestination, transPickUp, transTime;


    private Transport(){}

    private Transport(Builder builder){
        this.transId = builder.transId;
        this.transDestination = builder.transDestination;
        this.transPickUp = builder.transPickUp;
        this.transTime = builder.transTime;
    }
    
    public String getTransId(){return transId;}
    public String getTransDestination(){return transDestination;}
    public String getTransPickUp(){ return transPickUp;}
    public String getTransTime(){ return transTime;}

    public static class Builder{
        private String transDestination, transPickUp, transTime, transId;

        public Builder transId(String transId){
            this.transId = transId;
            return this;
        }
        
        public Builder transDestination(String transDestination) {
            this.transDestination = transDestination;
            return this;
        }

        public Builder transPickUp(String transPickUp) {
            this.transPickUp = transPickUp;
            return this;
        }
        
        public Builder transTime(String transTime){
            this.transTime = transTime;
            return this;
        }

        public Transport build() {return new Transport( this);}

        }

        @Override
    public String toString(){
        return "Transport:" +
                "Transport ID: '" + transId + '\'' +
                "Transport Pick Up: '" + transPickUp +'\''+
                "Transport Destination:  '" + transDestination + '\'' +
                "Transport Depart Time:  '" + transTime + '\'' 
                + "";
    }
}
