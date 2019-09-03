/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class StudPlanner {
    
    private String StudCourse, StudSubject, StudTime, StudCourseId;
    
    
    private StudPlanner(){}
    
    private StudPlanner(Builder builder){
        this.StudCourse = builder.StudCourse;
        this.StudSubject = builder.StudSubject;
        this.StudTime = builder.StudTime;
        this.StudCourseId = builder.StudCourseId;
    } 
    
    public String getStudCourse(){return StudCourse;}
    public String getStudSubject(){return StudSubject;}
    public String getStudTime(){return StudTime;}
    public String getCourseId(){return StudCourseId;}
    
    public static class Builder{
        private String StudSubject, StudCourse, StudTime, StudCourseId;
        
        public Builder StudCourseId(String StudCourseId){
            this.StudCourseId = StudCourseId;
            return this;
        }
       
        public Builder StudSubject(String StudSubject){
            this.StudSubject = StudSubject;
            return this;
        }
        
        public Builder StudCourse(String StudCourse){
            this.StudCourse = StudCourse;
            return this;
        }
        public Builder StudTime(String StudTime){
            this.StudTime = StudTime;
            return this;
        }
        
        public StudPlanner build(){return new StudPlanner( this);}
        
    }
    
    @Override
    
    public String toString(){
        return "Student Planner:" +
                "Course ID:" + StudCourseId + '\'' +
                "Course Enrolled:" + StudCourse + '\'' +
                "Course Subject:" + StudSubject + '\'' +
                "Time:" + StudTime + '\'' +
                "";
    }
   
}
