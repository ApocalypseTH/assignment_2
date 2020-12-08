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
        int nIceCreams=0;
        double iceCreamLessExp=Double.MAX_VALUE;

        for (MenuItem menuItem : itemsOrdered) {
            if (menuItem.getType() == MenuItem.items.Gelato) {
                nIceCreams++;

                if(iceCreamLessExp>menuItem.getPrice()){
                    iceCreamLessExp= menuItem.getPrice();
                }
            }
            total+=menuItem.getPrice();
        }

        if (nIceCreams>5){
            total-=iceCreamLessExp/2;
        }

        return total;
    }
}
