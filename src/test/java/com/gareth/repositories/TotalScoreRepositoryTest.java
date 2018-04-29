package com.gareth.repositories;

import com.gareth.factories.TotalScoreFactory;
import com.gareth.model.TotalScore;
import com.gareth.repositories.Impl.TotalScoreRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TotalScoreRepositoryTest {


    Map<String, Object> values;
    TotalScoreRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = TotalScoreRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("totalScore", 0);
        values.put("totalWickets", 0);
        values.put("totalOvers", 0);
    }

    @Test
    public void create() {
        TotalScore tScore = TotalScoreFactory.getTotalScore(values);
        repository.create(tScore);
        assertEquals(0, tScore.getTotalScore());
    }

    @Test
    public void read() {
        TotalScore readTScore = repository.read(0);
        assertEquals(0, readTScore.getTotalScore());
    }

    @Test
    public void update() {

        TotalScore tScore = repository.read(0);
        TotalScore newTScore = new TotalScore.Builder()
                .totalScore((Integer)values.get("totalScore"))
                .totalWickets((Integer)values.get("totalWickets"))
                .totalOvers((Integer)values.get("totalOvers"))
                .build();
        repository.update(newTScore);
        TotalScore updateTScore = repository.read(0);
        assertEquals(0, updateTScore.getTotalScore());
    }

    @Test
    public void delete() {
        repository.delete(0);
        TotalScore tScore = repository.read(0);
        assertNull(tScore);
    }
}