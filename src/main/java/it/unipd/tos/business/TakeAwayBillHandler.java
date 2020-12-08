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
        double iceCreamsAndPuddings = 0;

        for (MenuItem menuItem : itemsOrdered) {
            if (menuItem.getType() == MenuItem.items.Gelato) {
                nIceCreams++;

                if(iceCreamLessExp>menuItem.getPrice()){
                    iceCreamLessExp= menuItem.getPrice();
                }
            }

            if (menuItem.getType() == MenuItem.items.Gelato || menuItem.getType() == MenuItem.items.Budino){
                iceCreamsAndPuddings += menuItem.getPrice();
            }

            total+=menuItem.getPrice();
        }

        if (nIceCreams>5){
            total-=iceCreamLessExp/2;
        }
        if (iceCreamsAndPuddings>50){
            total*=0.9;
        }

        return total;
    }
}
