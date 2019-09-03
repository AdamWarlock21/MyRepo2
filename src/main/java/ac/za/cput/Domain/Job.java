/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Job {
    
    
    private String EmpId, JobRole, EmpStat;
    private int Stipend;
    private int hours;
    
    
    private Job(){}
    
    private Job(Builder builder){
        this.EmpStat = builder.EmpStat;
        this.EmpId = builder.EmpId;
        this.JobRole = builder.JobRole;
        this.Stipend = builder.Stipend;
        this.hours = builder.hours;
        
    }
        
        public String getEmpStat(){return EmpStat;}
        public String getEmpId(){return EmpId;}
        public String getJobRole(){return JobRole;}
        public int getHours(){return hours;}
        public int setStipend(){
            Stipend = 24 * hours;
            return Stipend;
        }
        public int getStipend(){return Stipend;}
        
        public static class Builder{
            private String EmpId, JobRole, EmpStat;
            private int Stipend;
            private int hours;
            
            public Builder EmpStat(String EmpStat){
                this.EmpStat = EmpStat;
                return this;
            }
            
            public Builder EmpId(String EmpId){
                this.EmpId = EmpId;
                return this;
            }
            
            public Builder JobRole(String JobRole){
                this.JobRole = JobRole;
                return this;
            }
            
            public Builder hours( int hours){
                this.hours = hours;
                return this;
            }
            
            public  Builder Stipend( int Stipend){
                this.Stipend = Stipend;
                return this;
            }
            
            public Job build(){ return new Job(this);}
            
        }
        @Override
        public String toString(){
            return "Job Status:" +
                    "Employed:" + EmpStat + '\'' +
                    "Employee ID:" + EmpId + '\'' +
                    "Employee Role:" + JobRole + '\'' +
                    "Employee Hours:" + hours + '\'' +
                    "Stipend:" +"R" + Stipend +
                    "";
        }
        
    }
    

