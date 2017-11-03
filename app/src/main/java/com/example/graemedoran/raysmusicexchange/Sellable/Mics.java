package com.example.graemedoran.raysmusicexchange.Sellable;

import com.example.graemedoran.raysmusicexchange.Sellable.Playable.String;

/**
 * Created by graemedoran on 03/11/2017.
 */

public class Mics extends Stock{
    private String type;

    public Mics(int Cost, int Retail, int GPM, String type) {
        super(Cost, Retail, GPM);

        this.type = type;
    }
}
