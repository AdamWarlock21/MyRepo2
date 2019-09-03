/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service;

import ac.za.cput.Domain.StudPlanner;
import ac.za.cput.Service.IService;
import java.util.Set;

public interface StudPlannerService extends IService<StudPlanner, String> {

    Set<StudPlanner> getAllAppDevCourses();
    Set<StudPlanner> getAll();
}
