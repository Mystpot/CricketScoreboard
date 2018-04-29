package com.gareth.factories;

import com.gareth.model.Bowler;

import java.util.Map;

public class BowlerFactory {

    public static Bowler getBowler(Map<String, Object> values) {
        Bowler factoryBowler = new Bowler.Builder()
                .bowlersID((String) values.get("bowlersID"))
                .firstName((String) values.get("firstName"))
                .lastName((String) values.get("lastName"))
                .totalWickets((Integer) values.get("totalWickets"))
                .runsConceded((Integer) values.get("runsConceded"))
                .oversBowled((Integer) values.get("oversBowled"))
                .build();
        return factoryBowler;
    }
}
