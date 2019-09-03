/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class StudBudget {
    
    private String BudgetId;
    private int BudgetAmount, Balance, Expenses;
    
    private StudBudget(){}
    
    private StudBudget(Builder builder){
        this.BudgetId = builder.BudgetId;
        this.BudgetAmount = builder.BudgetAmount;
        this.Expenses = builder.Expenses;
        this.Balance = builder.Balance;
    }
    
    public int SetBalance(){
        Balance = BudgetAmount - Expenses;
        return Balance;
    }
    
    public String getBudgetId(){ return BudgetId;}
    public int getBudgetAmount(){return BudgetAmount;}
    public int getExpenses(){return Expenses;}
    public int getBalance(){return Expenses;}
    
    public static class Builder{
        private String BudgetId;
        private int BudgetAmount, Expenses, Balance;
        
        public Builder BudgetId(String BudgetId){
            this.BudgetId = BudgetId;
            return this;
        }
        
        public Builder BudgetAmount(int BudgetAmount){
            this.BudgetAmount = BudgetAmount;
            return this;
        }
        
        public Builder Expenses(int Expenses){
            this.Expenses = Expenses;
            return this;
        }
        
        public Builder Balance(int Balance){
            this.Balance = Balance;
            return this;
        }
        
        public StudBudget build(){ return new StudBudget(this);}
    }
    
    @Override
    public String toString(){
        return "Budget:" +
                "Budget ID:" + BudgetId + '\'' +
                "Budget Amount:" + BudgetAmount + '\'' +
                "Expenses:" + Expenses + '\'' +
                "Balance:" + Balance + '\'' +
                "";
    }
    
}
