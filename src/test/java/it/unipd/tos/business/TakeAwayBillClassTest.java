////////////////////////////////////////////////////////////////////
// [Prova] [Prova] [1100]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

import it.unipd.tos.model.MenuItem;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.ItemType;

public class TakeAwayBillClassTest {

    private TakeAwayBillClass takeAwayBillClass;

    @Before
    public void before() {
        takeAwayBillClass = new TakeAwayBillClass();
    }

    @Test
    public void testStandardOrderPriceCalculation() {
        List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
        for(int i = 0; i < 3; ++i) {
            itemsOrdered.add(new MenuItem(ItemType.Bevande, "LemonSoda", 3.0));
        }

        try {
            assertEquals(9.0, takeAwayBillClass.getOrderPrice(itemsOrdered), 0);
        } catch (TakeAwayBillException e) {
            fail("TakeAwayBillException thrown");
        }
    }

}