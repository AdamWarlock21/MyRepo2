/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.FundedAcc;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class FundedAccFactory {
    
     public static FundedAcc getAccStat(String Location ){
        return new FundedAcc.Builder()
                .Location(Location)
                .LocationId(Misc.generateId())
                .build();
                
              
    }
    
}
