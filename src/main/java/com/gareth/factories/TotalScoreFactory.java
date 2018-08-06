package com.gareth.factories;

import com.gareth.model.TotalScore;

import java.util.Map;

public class TotalScoreFactory {


    public static TotalScore getTotalScore(Integer totalScoreID, String matchID, String totalScore, String totalWickets, String totalOvers) {
        TotalScore factoryTotalScore = new TotalScore.Builder()
                .totalScoreID(totalScoreID)
                .matchID(matchID)
                .totalScore(totalScore)
                .totalWickets(totalWickets)
                .totalOvers(totalOvers)
                .build();
        return factoryTotalScore;
    }
}
