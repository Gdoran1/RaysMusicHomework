package com.example.graemedoran.raysmusicexchange.Sellable;

import com.example.graemedoran.raysmusicexchange.Sellable.Playable.StringInstrument;

/**
 * Created by graemedoran on 03/11/2017.
 */

public class GuitarStrings extends Stock{
    private StringInstrument type;
    public GuitarStrings( int cost, int retail, StringInstrument type) {
        super(cost, retail);

        this.type = type;

    }
}
