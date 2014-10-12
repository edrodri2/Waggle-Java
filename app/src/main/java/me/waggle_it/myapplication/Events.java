package me.waggle_it.myapplication;

/**
 * Created by Elliott on 10/11/2014.
 */

public class Events{

    private String location = getLocation(), time = getTime(), name = getName(), type = getType();
    private boolean hasFood = getFood();
    private double priceDollars = getPrice();
    public Event(String l, String ti, boolean food, double price, String n, String t)
    {
        location = l;
        time = ti;
        name = n;
        type = t;
        hasFood = food;
        priceDollars = price;
    }
    public Event()
    {
        location = "";
        time = "";
        name = "";
        type = "";
        hasFood = false;
        priceDollars = 0.00;
    }
    public String getLocation(){
        return location;
    }
    public String getTime(){
        return time;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public boolean getFood(){
        return hasFood;
    }
    public double getPrice(){
        return priceDollars;
    }

}

