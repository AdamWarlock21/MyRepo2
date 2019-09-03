/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class ExamPlanner {
    
    private String ExamPlannerId, ExamName, ExamCode, ExamTime;
    
    
    private ExamPlanner(){}
    
    private ExamPlanner(Builder builder){
        this.ExamPlannerId = builder.ExamPlannerId;
        this.ExamName = builder.ExamName;
        this.ExamCode = builder.ExamCode;
        this.ExamTime = builder.ExamTime;
    }
    
    public String getExamPlannerId(){return ExamPlannerId;}
    public String getExamName(){return ExamName;}
    public String ExamCode(){return ExamCode;}
    public String ExamTime(){return ExamTime;}
    
    public static class Builder{
        private String ExamPlannerId, ExamName, ExamCode, ExamTime;
        
        public Builder ExamPlannerId(String ExamPlannerId){
            this.ExamPlannerId = ExamPlannerId;
            return this;
        }
        
        public Builder ExamName(String ExamName){
            this.ExamName = ExamName;
            return this;
        }
        
        public Builder ExamCode(String ExamCode){
            this.ExamCode = ExamCode;
            return this;
        }
        
        public Builder ExamTime(String ExamTime){
            this.ExamTime = ExamTime;
            return this;
        }
        
        public ExamPlanner build(){return new ExamPlanner(this);}
        
        
    }
    
    @Override
    
    public String toString(){
        return "Exam Planner:" +
                "Exam ID:" + ExamPlannerId + '\'' +
                "Exam Name:" + ExamName + '\'' +
                "Exam Code:" + ExamCode + '\'' +
                "Exam Time:" + ExamTime + '\'' +
                "";
    }
    
}
