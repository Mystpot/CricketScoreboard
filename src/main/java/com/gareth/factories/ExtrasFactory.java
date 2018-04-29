package com.gareth.factories;

import com.gareth.model.Extras;

import java.util.Map;

public class ExtrasFactory {

    public static Extras getExtras(Map<String, Object> values) {
        Extras factoryExtras = new Extras.Builder()
                .totalWides((Integer) values.get("totalWides"))
                .totalByes((Integer) values.get("totalByes"))
                .totalNoballs((Integer) values.get("totalNoballs"))
                .build();
        return factoryExtras;
    }
}
