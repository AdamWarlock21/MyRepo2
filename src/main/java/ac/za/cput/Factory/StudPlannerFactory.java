/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.StudPlanner;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class StudPlannerFactory {
    
    public static StudPlanner getPlanner(String StudCourse, String StudSubject,String StudTime ){
        return new StudPlanner.Builder()
                .StudCourse(StudCourse)
                .StudSubject(StudSubject)
                .StudTime(StudTime)
                .StudCourseId(Misc.generateId())
                .build();
                
              
    }
    
}
