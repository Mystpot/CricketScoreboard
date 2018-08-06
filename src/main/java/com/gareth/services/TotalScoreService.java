package com.gareth.services;

import com.gareth.model.TotalScore;

import java.util.Optional;
import java.util.Set;

public interface TotalScoreService  {

    public TotalScore create(TotalScore totalScore);

    public Optional<TotalScore> readByID(Integer totalScoreID);

    public Set<TotalScore> readAll();

    public TotalScore update(TotalScore totalScore);

    public void delete(TotalScore totalScoreID);

}
