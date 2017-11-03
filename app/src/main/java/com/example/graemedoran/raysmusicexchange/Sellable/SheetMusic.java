package com.example.graemedoran.raysmusicexchange.Sellable;

import com.example.graemedoran.raysmusicexchange.Sellable.Playable.StringInstrument;

/**
 * Created by graemedoran on 03/11/2017.
 */

public class SheetMusic extends Stock {
    public StringInstrument genre;
    public SheetMusic(int cost, int retail, StringInstrument genre) {
        super(cost, retail);

        this.genre = genre;

    }
}
