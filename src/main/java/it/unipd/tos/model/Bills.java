////////////////////////////////////////////////////////////////////
// [Samuele] [Sartor] [1187588]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;
import java.util.List;

public class Bills {
    private List<MenuItem> list;
    private User user;
    private int hour;
    private double price;

    public Bills(List<MenuItem> list, User user, int time, double price) {
        this.list = list;
        this.user = user;
        hour = time;
        this.price = price;
    }



    public User getUser() {
        return user;
    }

    public int getTime() {
        return hour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double p) {
        price = p;
    }
}
