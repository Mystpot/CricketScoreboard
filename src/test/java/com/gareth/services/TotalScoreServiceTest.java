package com.gareth.services;

import com.gareth.factories.TotalScoreFactory;
import com.gareth.model.TotalScore;
import com.gareth.services.Impl.TotalScoreServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TotalScoreServiceTest {

    TotalScoreService service;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        service = new TotalScoreServiceImpl();
        values = new HashMap<String, Object>();
        values.put("totalScore", 5);
        values.put("totalWickets", 0);
        values.put("totalOvers", 0);

    }

    @Test
    public void create() {
        TotalScore tScore = TotalScoreFactory.getTotalScore(values);
        service.create(tScore);
        assertEquals(5, tScore.getTotalScore());

    }

    @Test
    public void read() {

        TotalScore readTotalScore = service.read(5);
        assertEquals(5, readTotalScore.getTotalScore());


    }

    @Test
    public void update() {

        TotalScore tScore = service.read(5);
        TotalScore newTScore = new TotalScore.Builder()
                .totalScore((Integer)values.get("totalScore"))
                .totalWickets((Integer) values.get("totalWickets"))
                .totalOvers((Integer)values.get("totalOvers"))
                .build();
        service.update(newTScore);
        TotalScore updateTScore = service.read(5);
        assertEquals(5,updateTScore.getTotalScore());
    }

    @Test
    public void delete() {

        service.delete(5);
        TotalScore tScore = service.read(5);
        assertNull(tScore);
    }

}