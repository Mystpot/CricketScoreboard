package com.gareth.repositories;

import com.gareth.model.TotalScore;

public interface TotalScoreRepository {

    TotalScore create(TotalScore totalScore);

    TotalScore read(int totalScore);

    TotalScore update(TotalScore totalScore);

    void delete(int totalScore);
}
