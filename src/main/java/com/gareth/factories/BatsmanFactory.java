package com.gareth.factories;

import com.gareth.model.Batsman;

import java.util.Map;

public class BatsmanFactory {

    public static Batsman getBatsman(Map<String, Object> values)
    {
        Batsman factoryBatsman = new Batsman.Builder()
                .batsmanID((String)values.get("batsmanID"))
                .firstName((String)values.get("firstName"))
                .lastName((String)values.get("lastName"))
                .bowledBy((String)values.get("bowledBy"))
                .totalScore((Integer)values.get("totalScore"))
                .ballsFaced((Integer)values.get("ballsFaced"))
                .isOut((Boolean)values.get("isOut"))
                .build();
    return factoryBatsman;
    }
}
