package com.gareth.factories;

import com.gareth.model.Bowler;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BowlerFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("bowlerID", "1");
        values.put("firstName", "Gareth");
        values.put("lastName", "Morgan");
        values.put("totalWickets", 0);
        values.put("runsConceded", 0);
        values.put("oversBowled", 0);
    }

    @Test
    public void getBowler() {

        Bowler bowler = BowlerFactory.getBowler(values);
        assertEquals("Gareth", bowler.getFirstName());
    }
}