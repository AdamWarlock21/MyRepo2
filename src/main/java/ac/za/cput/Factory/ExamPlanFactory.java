/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.ExamPlanner;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class ExamPlanFactory {
    
      public static ExamPlanner getPlanner(String ExamName, String ExamCode,String ExamTime ){
        return new ExamPlanner.Builder()
                .ExamName(ExamName)
                .ExamCode(ExamCode)
                .ExamTime(ExamTime)
                .ExamPlannerId(Misc.generateId())
                .build();
                
              
    }
    
}
