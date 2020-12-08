////////////////////////////////////////////////////////////////////
// [Samuele] [Sartor] [1187588]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;

import java.util.List;

public class TakeAwayBillHandler implements TakeAwayBill{
    @Override
    public double getOrderPrice(List<MenuItem> itemsOrdered,  User user) throws TakeAwayBillException {
        double total=0;

        for (MenuItem menuItem : itemsOrdered) {

            total+=menuItem.getPrice();
        }


        return total;
    }
}
