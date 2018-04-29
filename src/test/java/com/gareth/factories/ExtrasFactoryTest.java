package com.gareth.factories;

import com.gareth.model.Extras;
import com.gareth.model.TotalScore;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExtrasFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("totalWides", 0);
        values.put("totalByes", 0);
        values.put("totalNoballs", 0);
    }

    @Test
    public void getExtras() {

        Extras extras = ExtrasFactory.getExtras(values);
        assertEquals(0, extras.getTotalWides());
    }
}