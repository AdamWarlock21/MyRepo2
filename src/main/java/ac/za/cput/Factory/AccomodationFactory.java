/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Factory;
import ac.za.cput.Domain.Accomodation;
import ac.za.cput.Util.Misc;

/**
 *
 * @author BooBoo
 */
public class AccomodationFactory {
    
    public static Accomodation getAccom(int AccAmount ){
        return new Accomodation.Builder()
                .AccAmount(AccAmount)
                .AccId(Misc.generateId())
                .build();
    
}

}