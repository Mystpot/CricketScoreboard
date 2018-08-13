package com.gareth.factories;

import com.gareth.model.Extras;

import java.util.Map;

public class ExtrasFactory {

    public static Extras getExtras(Integer extrasID, String matchID, String totalWides, String totalNoballs) {
        Extras factoryExtras = new Extras.Builder()
                .extrasID(extrasID)
                .matchID(matchID)
                .totalWides(totalWides)
                .totalNoballs(totalNoballs)
                .build();
        return factoryExtras;
    }
}
