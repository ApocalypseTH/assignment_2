////////////////////////////////////////////////////////////////////
// [Samuele] [Sartor] [1187588]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ModelsTest {

    @Test
    public void ModelsTest() {
        List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
        User p1 = new User("Stirpio", "Capussi", 1923);
        MenuItem soap = new MenuItem("Sovrasta Scalpi", MenuItem.items.Gelato, 694.20);

        itemsOrdered.add(soap);

        Bills b= new Bills(itemsOrdered, p1, 11, 2);

        assertEquals("Stirpio Capussi", p1.getNominative());
        assertEquals(694.20, soap.getPrice(), 0.0);
        assertEquals("Sovrasta Scalpi", soap.getName());
        assertEquals(97, p1.getAge(), 0.0);
    }
}
