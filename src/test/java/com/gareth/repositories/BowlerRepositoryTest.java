package com.gareth.repositories;

import com.gareth.factories.BowlerFactory;
import com.gareth.model.Bowler;
import com.gareth.repositories.Impl.BowlerRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BowlerRepositoryTest {

    Map<String, Object> values;
    BowlerRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = BowlerRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("bowlersID", "1");
        values.put("firstName", "Gareth");
        values.put("lastName", "Morgan");
        values.put("totalWickets", 0);
        values.put("runsConceded", 0);
        values.put("oversBowled", 0);
    }

    @Test
    public void create() {
        Bowler bowler = BowlerFactory.getBowler(values);
        repository.create(bowler);
        assertEquals(0, bowler.getOversBowled());
    }

    @Test
    public void read() {
        Bowler readBowler = repository.read("1");
        assertEquals("Morgan", readBowler.getLastName());
    }

    @Test
    public void update() {

        Bowler bowler = repository.read("1");
        Bowler newBowler = new Bowler.Builder()
                .bowlersID((String)values.get("bowlersID"))
                .firstName((String)values.get("firstName"))
                .lastName((String)values.get("lastName"))
                .totalWickets((Integer)values.get("totalWickets"))
                .runsConceded((Integer)values.get("runsConceded"))
                .oversBowled((Integer)values.get("oversBowled"))
                .build();
        repository.update(newBowler);
        Bowler updateBowler = repository.read("1");
        assertEquals("Morgan", updateBowler.getLastName());
    }

    @Test
    public void delete() {
        repository.delete("1");
        Bowler bowler = repository.read("1");
        assertNull(bowler);
    }
}