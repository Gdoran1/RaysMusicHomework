package com.example.graemedoran.raysmusicexchange.Sellable;

/**
 * Created by graemedoran on 03/11/2017.
 */

public abstract class Stock {
    String name;
    int cost;
    int retail;
    int GPM;

    public Stock(String name, int Cost, int Retail, int GPM) {
        this.name = name;
        this.cost = cost;
        this.retail = retail;
        this.GPM = GPM;
    }

    public String getName() {return this.name; }

    public int getCost() {return this.cost; }

    public int getRetail(){
        return this.retail;
    }

    public int getGPM(){
        return this.GPM;
    }

}
