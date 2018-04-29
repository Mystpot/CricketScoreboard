package com.gareth.services;

import com.gareth.factories.BowlerFactory;
import com.gareth.model.Batsman;
import com.gareth.model.Bowler;
import com.gareth.services.Impl.BowlerServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BowlerServiceTest {

    BowlerService service;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        service = new BowlerServiceImpl();
        values = new HashMap<String, Object>();
        values.put("bowlersID", "1");
        values.put("firstName", "Gareth");
        values.put("lastName", "Dill");
        values.put("totalWickets", 0);
        values.put("runsConceded", 0);
        values.put("oversBowled", 0);

    }

    @Test
    public void create() {
        Bowler bowler = BowlerFactory.getBowler(values);
        service.create(bowler);
        assertEquals("Dill", bowler.getLastName());

    }

    @Test
    public void read() {

        Bowler readBowler = service.read("1");
        assertEquals("Dill", readBowler.getLastName());


    }

    @Test
    public void update() {

        Bowler bowler = service.read("1");
        Bowler newBowler = new Bowler.Builder()
                .bowlersID((String)values.get("bowlersID"))
                .firstName((String)values.get("firstName"))
                .lastName((String)values.get("lastName"))
                .totalWickets((Integer)values.get("totalWickets"))
                .runsConceded((Integer)values.get("runsConceded"))
                .oversBowled((Integer)values.get("oversBowled"))
                .build();
        service.update(newBowler);
        Bowler updateBowler = service.read("1");
        assertEquals("Dill",updateBowler.getLastName());
    }

    @Test
    public void delete() {

        service.delete("1");
        Bowler bowler = service.read("1");
        assertNull(bowler);
    }
}