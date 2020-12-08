////////////////////////////////////////////////////////////////////
// [Samuele] [Sartor] [1187588]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

import java.util.Calendar;

public class User {
    private String name;
    private String surname;
    private int birth;

    public User(String n, String s, int y){
        birth = y;
        name = n;
        surname = s;
    }

    public String getNominative(){
        return name+" "+surname;
    }
    public int getAge(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year-birth;
    }
}
