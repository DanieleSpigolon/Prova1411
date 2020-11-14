////////////////////////////////////////////////////////////////////
// [Prova] [Prova] [1100]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillClass implements TakeAwayBill {

    public double getOrderPrice(List<MenuItem> itemsOrdered) 
            throws TakeAwayBillException {
        double totalPrice = 0.0;

        for(MenuItem itemOrdered : itemsOrdered) {
            totalPrice += itemOrdered.getPrice();
        }

        return totalPrice;
    }

}