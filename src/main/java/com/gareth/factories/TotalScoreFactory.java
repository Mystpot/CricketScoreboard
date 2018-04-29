package com.gareth.factories;

import com.gareth.model.TotalScore;

import java.util.Map;

public class TotalScoreFactory {


    public static TotalScore getTotalScore(Map<String, Object> values) {
        TotalScore factoryTotalScore = new TotalScore.Builder()
                .totalScore((Integer) values.get("totalScore"))
                .totalWickets((Integer) values.get("totalWickets"))
                .totalOvers((Integer) values.get("totalOvers"))
                .build();
        return factoryTotalScore;
    }
}
