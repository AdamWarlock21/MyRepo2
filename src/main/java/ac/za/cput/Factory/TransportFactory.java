package ac.za.cput.Factory;

import ac.za.cput.Domain.Transport;
import ac.za.cput.Util.Misc;

public class TransportFactory {

    public static Transport getTransport(String transDestination, String transPickUp, String transTime){
        return new Transport.Builder().transPickUp(transPickUp)
                .transId(Misc.generateId())
                .transDestination(transDestination)
                .transTime(transTime)
                .build();
    }
}
