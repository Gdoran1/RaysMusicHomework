package com.example.graemedoran.raysmusicexchange.Sellable;

/**
 * Created by graemedoran on 03/11/2017.
 */

public abstract class Stock implements Sellable {

    int cost;
    int retail;


    public Stock(int Cost, int Retail) {

        this.cost = cost;
        this.retail = retail;

    }

    public int getCost() {return this.cost; }

    public int getRetail(){
        return this.retail;
    }

    public int calculategpm(){
        return this.retail - cost;
    }

}
