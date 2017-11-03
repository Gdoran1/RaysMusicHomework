package com.example.graemedoran.raysmusicexchange.Sellable;

/**
 * Created by graemedoran on 03/11/2017.
 */

public abstract class Stock {

    int cost;
    int retail;
    int GPM;

    public Stock(int Cost, int Retail, int GPM) {

        this.cost = cost;
        this.retail = retail;
        this.GPM = GPM;
    }

    public int getCost() {return this.cost; }

    public int getRetail(){
        return this.retail;
    }

    public int getGPM(){
        return this.GPM;
    }

}
