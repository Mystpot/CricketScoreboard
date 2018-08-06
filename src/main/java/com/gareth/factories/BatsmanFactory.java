package com.gareth.factories;

import com.gareth.model.Batsman;

import java.util.Map;

public class BatsmanFactory {

    public static Batsman getBatsman(Integer batsmanID, String matchID, String firstName, String lastName, String bowledBy, String totalScore,
                                     String ballsFaced, String isOut)
    {
        Batsman factoryBatsman = new Batsman.Builder()
                .batsmanID(batsmanID)
                .matchID(matchID)
                .firstName(firstName)
                .lastName(lastName)
                .bowledBy(bowledBy)
                .totalScore(totalScore)
                .ballsFaced(ballsFaced)
                .isOut(isOut)
                .build();
    return factoryBatsman;
    }
}
