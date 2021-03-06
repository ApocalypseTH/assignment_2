////////////////////////////////////////////////////////////////////
// [Samuele] [Sartor] [1187588]
////////////////////////////////////////////////////////////////////


package it.unipd.tos.model;

public class MenuItem {
    public enum items { Gelato, Budino, Bevanda }
    private items itemType;
    private String name;
    private double price;

    public MenuItem(String n, items t, double p){
        itemType=t;
        name=n;
        price=p;
    }

    public String getName(){
        return name;
    }

    public items getType(){
        return itemType;
    }

    public double getPrice(){
        return price;
    }
}
