package com.gareth.repositories;

import com.gareth.factories.BatsmanFactory;
import com.gareth.model.Batsman;
import com.gareth.repositories.Impl.BatsmanRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BatsmanRepositoryTest {

    Map<String, Object> values;
    BatsmanRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = BatsmanRepositoryImpl.getInstance();
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
    public void create() {
        Batsman batsman = BatsmanFactory.getBatsman(values);
        repository.create(batsman);
        assertEquals(0, batsman.getTotalScore());
    }

    @Test
    public void read() {
        Batsman readBatsman = repository.read("1");
        assertEquals(0, readBatsman.getTotalScore());
    }

    @Test
    public void update() {
        Batsman batsman = repository.read("1");
        Batsman newBatsman = new Batsman.Builder()
                .batsmanID((String)values.get("batsmanID"))
                .firstName((String)values.get("firstName"))
                .lastName((String)values.get("lastName"))
                .bowledBy((String)values.get("bowledBy"))
                .totalScore((Integer)values.get("totalScore"))
                .ballsFaced((Integer)values.get("ballsFaced"))
                .isOut((Boolean)values.get("isOut"))
                .build();
        repository.update(newBatsman);
        Batsman updateBatsman = repository.read("1");
        assertEquals("Morgan", updateBatsman.getLastName());
    }

    @Test
    public void delete() {

        repository.delete("1");
        Batsman batsman = repository.read("1");
        assertNull(batsman);
    }
}