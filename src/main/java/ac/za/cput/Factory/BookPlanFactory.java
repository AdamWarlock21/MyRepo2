/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.BookPlan;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class BookPlanFactory {
    
    public static BookPlan getPlanner(String BookName, String BookGenre,int Price ){
        return new BookPlan.Builder()
                .BookName(BookName)
                .BookGenre(BookGenre)
                .Price(Price)
                .BookId(Misc.generateId())
                .build();
                
              
    }
    
}
