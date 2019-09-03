/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.Job;
import ac.za.cput.Util.Misc;


/**
 *
 * @author BooBoo
 */
public class JobFactory {
    
    public static Job getPlanner(String JobRole, String EmpStat,int hours, int Stipend ){
        return new Job.Builder()
                .JobRole(JobRole)
                .EmpStat(EmpStat)
                .hours(hours)
                .Stipend(Stipend)
                .EmpId(Misc.generateId())
                .build();
                
              
    }
    
}
