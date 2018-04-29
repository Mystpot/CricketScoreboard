package com.gareth.services;

import com.gareth.model.TotalScore;

public interface TotalScoreService  {

    TotalScore create(TotalScore totalScore);

    TotalScore read(int totalScore);

    TotalScore update(TotalScore totalScore);

    void delete(int totalScore);
}
