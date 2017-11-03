package com.example.graemedoran.raysmusicexchange.Sellable.Playable;

/**
 * Created by graemedoran on 03/11/2017.
 */

public class Brass extends Instrument{

    public Brass(int Cost, int Retail) {
        super(Cost, Retail);
    }
    public String sound(){
        return "fanfare";
    }

}
