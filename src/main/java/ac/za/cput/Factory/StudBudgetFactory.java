/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.StudBudget;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class StudBudgetFactory {
    
     public static StudBudget getBudget(int BudgetAmount, int Balance,int Expenses ){
        return new StudBudget.Builder()
                .BudgetAmount(BudgetAmount)
                .Balance(Balance)
                .Expenses(Expenses)
                .BudgetId(Misc.generateId())
                .build();
                
              
    }
    
    
}
