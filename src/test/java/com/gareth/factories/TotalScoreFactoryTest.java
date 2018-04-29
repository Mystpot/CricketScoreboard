package com.gareth.factories;

import com.gareth.model.TotalScore;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TotalScoreFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("totalScore", 0);
        values.put("totalWickets", 0);
        values.put("totalOvers", 0);
    }

    @Test
    public void getTotalScore() {

        TotalScore tScore = TotalScoreFactory.getTotalScore(values);
        assertEquals(0, tScore.getTotalScore());
    }
}