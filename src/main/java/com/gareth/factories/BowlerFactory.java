package com.gareth.factories;

import com.gareth.model.Bowler;

import java.util.Map;

public class BowlerFactory {

    public static Bowler getBowler(Integer bowlerID, String matchID, String firstName, String lastName, String totalWickets,
                                   String runsConceded, String oversBowled) {
        Bowler factoryBowler = new Bowler.Builder()
                .bowlersID(bowlerID)
                .matchID(matchID)
                .firstName(firstName)
                .lastName(lastName)
                .totalWickets(totalWickets)
                .runsConceded(runsConceded)
                .oversBowled(oversBowled)
                .build();
        return factoryBowler;
    }
}
