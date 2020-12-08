////////////////////////////////////////////////////////////////////
// [Samuele] [Sartor] [1187588]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.Bills;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TakeAwayBillHandler implements TakeAwayBill{
    @Override
    public double getOrderPrice(List<MenuItem> itemsOrdered,  User user) throws TakeAwayBillException {
        double total=0;
        int nIceCreams=0;
        double iceCreamLessExp=Double.MAX_VALUE;
        double iceCreamsAndPuddings = 0;
        int nItems=0;

        for (MenuItem menuItem : itemsOrdered) {
            nItems++;
            if(nItems>30) {
                throw new TakeAwayBillException("Non puoi ordinare piu` di 30 articoli");
            }
            if (menuItem.getType() == MenuItem.items.Gelato) {
                nIceCreams++;

                if(iceCreamLessExp>menuItem.getPrice()) {
                    iceCreamLessExp = menuItem.getPrice();
                }
            }

            if (menuItem.getType() == MenuItem.items.Gelato || menuItem.getType() == MenuItem.items.Budino) {
                iceCreamsAndPuddings += menuItem.getPrice();
            }
            total+=menuItem.getPrice();
        }

        if (nIceCreams>5) {
            total -= iceCreamLessExp / 2;
        }
        if (iceCreamsAndPuddings>50) {
            total *= 0.9;
        }
        if(total<10) {
            total += 0.5;
        }

        return total;
    }

    public List<Bills> getFreeBills(List<Bills> bills){

        List<Bills> free = new ArrayList<Bills>();

        for (int i = 0; i < bills.size(); i++) {
            if(bills.get(i).getUser().getAge()<18 &&
                    !free.contains(bills.get(i)) &&
                    bills.get(i).getTime()==18)
            {
                free.add(bills.get(i));
            }
        }

        if(free.size()>10){
            long seed = System.nanoTime();
            Collections.shuffle(free, new Random(seed));

            free = free.subList(0, 10);
            for (Bills i : free) {
                i.setPrice(0.0);
            }
        }

        return free;
    }
}
