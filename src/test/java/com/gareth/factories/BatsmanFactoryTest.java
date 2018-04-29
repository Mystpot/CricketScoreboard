package com.gareth.factories;

import com.gareth.model.Batsman;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BatsmanFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("batsmanID", "1");
        values.put("firstName", "Gareth");
        values.put("lastName", "Morgan");
        values.put("bowledBy", "Bob");
        values.put("totalScore", 0);
        values.put("ballsFaced", 0);
        values.put("isOut", false);
    }

    @Test
    public void getBatsman() {

        Batsman batsman = BatsmanFactory.getBatsman(values);
        assertEquals("Gareth", batsman.getFirstName());
    }
}