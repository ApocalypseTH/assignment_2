////////////////////////////////////////////////////////////////////
// [Samuele] [Sartor] [1187588]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import it.unipd.tos.business.TakeAwayBillHandler;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.Bills;
import it.unipd.tos.model.MenuItem;

import static org.junit.Assert.assertEquals;

import it.unipd.tos.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TakeAwayHndlrTest {
    @Test
    public void BasicSumOfItemsTest(){
        List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
        TakeAwayBillHandler testBill = new TakeAwayBillHandler();
        User p1 = new User("Stirpio", "Capussi", 1923);

        itemsOrdered.add(new MenuItem("Coppa Stracciatella mistica", MenuItem.items.Gelato, 5.00));
        itemsOrdered.add(new MenuItem("Coca cola", MenuItem.items.Bevanda, 1.50));
        itemsOrdered.add(new MenuItem("Torre tentennante di Brema", MenuItem.items.Budino, 4.20));

        try{
            assertEquals(10.7, testBill.getOrderPrice(itemsOrdered, p1), 0.0);
        }
        catch (TakeAwayBillException exc){
            exc.getMessage();
        }
    }
    @Test
    public void IceCreams5ForAllTest() {
        List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
        TakeAwayBillHandler testBill = new TakeAwayBillHandler();
        User p1 = new User("Stirpio", "Capussi", 1923);
        itemsOrdered.add(new MenuItem("Tiramisu`", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Panna", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Nutella", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Pistacchio", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Parmigiana", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Canapy", MenuItem.items.Gelato, 1.00));

        try{
            assertEquals(6.0, testBill.getOrderPrice(itemsOrdered, p1), 0.0);
        }
        catch (TakeAwayBillException exc){
            exc.getMessage();
        }
    }

    @Test
    public void Over50IceCreamsPuddingsTest() {
        List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
        TakeAwayBillHandler testBill = new TakeAwayBillHandler();
        User p1 = new User("Stirpio", "Capussi", 1923);
        itemsOrdered.add(new MenuItem("Annichilisci Meningi", MenuItem.items.Gelato, 25.00));
        itemsOrdered.add(new MenuItem("Tonnellata Freezzante", MenuItem.items.Budino, 35.00));
        itemsOrdered.add(new MenuItem("Tonica 1lt", MenuItem.items.Bevanda, 5.00));

        try{
            assertEquals(58.5, testBill.getOrderPrice(itemsOrdered, p1), 0.0);
        }
        catch (TakeAwayBillException exc){
            exc.getMessage();
        }
    }

    @Test
    public void Over30ElementsTest() {
        List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
        TakeAwayBillHandler testBill = new TakeAwayBillHandler();
        User p1 = new User("Stirpio", "Capussi", 1923);
        itemsOrdered.add(new MenuItem("Tiramisu`", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Panna", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Nutella", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Pistacchio", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Parmigiana", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Canapy", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));
        itemsOrdered.add(new MenuItem("Random", MenuItem.items.Gelato, 1.00));

        try{
            assertEquals(30.0, testBill.getOrderPrice(itemsOrdered, p1), 0.0);
        }
        catch (TakeAwayBillException exc){
            exc.getMessage();
        }
    }

    @Test
    public void TheFamous10RandomTest() {
        List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
        List<Bills> history = new ArrayList<Bills>();
        TakeAwayBillHandler testBill = new TakeAwayBillHandler();
        MenuItem soap = new MenuItem("Sovrasta Scalpi", MenuItem.items.Gelato, 694.20);

        User p1 = null;
        for (int i = 0; i < 12; i++) {
            p1 = new User("Stirpio", "Capussi", 2005);
            try {
                history.add(new Bills(itemsOrdered, p1,  18, testBill.getOrderPrice(itemsOrdered, p1)));
            } catch (TakeAwayBillException e) {
                e.printStackTrace();
            }
        }

        List<Bills> ordinazioniFree = testBill.getFreeBills(history);

        assertEquals(10, ordinazioniFree.size());

        for (Bills i : ordinazioniFree) {
            assertEquals(0.0, i.getPrice(),0.01);
        }
    }
}