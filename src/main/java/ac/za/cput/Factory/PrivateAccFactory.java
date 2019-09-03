/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.PrivateAcc;
import ac.za.cput.Util.Misc;


/**
 *
 * @author BooBoo
 */
public class PrivateAccFactory {
    
    public static PrivateAcc getAccStat(String Location ){
        return new PrivateAcc.Builder()
                .Location(Location)
                .LocationId(Misc.generateId())
                .build();
                
              
    }
    
}
