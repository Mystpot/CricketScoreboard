package com.gareth.repositories.Impl;

import com.gareth.model.TotalScore;
import com.gareth.repositories.TotalScoreRepository;

import java.util.HashMap;
import java.util.Map;

public class TotalScoreRepositoryImpl implements TotalScoreRepository {

    private static TotalScoreRepositoryImpl repository = null;

    private Map<Integer, TotalScore> totalScoreTable;

    private TotalScoreRepositoryImpl() {
        totalScoreTable = new HashMap<Integer, TotalScore>();
    }

    public static TotalScoreRepositoryImpl getInstance() {
        if(repository == null)
            repository = new TotalScoreRepositoryImpl();
        return repository;
    }

    public TotalScore create (TotalScore totalScore) {
        totalScoreTable.put(totalScore.getTotalScore(),totalScore);
        TotalScore dbTotalScore = totalScoreTable.get(totalScore.getTotalScore());
        return dbTotalScore;
    }

    public TotalScore read(int totalScore)
    {
        TotalScore tscore = totalScoreTable.get(totalScore);
        return tscore;
    }

    public TotalScore update(TotalScore totalScore)
    {
        totalScoreTable.put(totalScore.getTotalScore(),totalScore);
        TotalScore dbTotalScore = totalScoreTable.get(totalScore.getTotalScore());
        return dbTotalScore;
    }

    public void delete(int totalScore)
    {
        totalScoreTable.remove(totalScore);
    }
}
