package com.gareth.services;

import com.gareth.factories.BatsmanFactory;
import com.gareth.model.Batsman;
import com.gareth.services.Impl.BatsmanServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BatsmanServiceTest {
    BatsmanService service;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        service = new BatsmanServiceImpl();
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
        service.create(batsman);
        assertEquals("Morgan", batsman.getLastName());

    }

    @Test
    public void read() {

        Batsman readBatsman = service.read("1");
        assertEquals("Dill", readBatsman.getLastName());


    }

    @Test
    public void update() {

        Batsman batsman = service.read("1");
        Batsman newBatmsan = new Batsman.Builder()
                .batsmanID((String)values.get("batsmanID"))
                .firstName((String)values.get("firstName"))
                .lastName("Dill")
                .bowledBy((String)values.get("bowledBy"))
                .totalScore((Integer)values.get("totalScore"))
                .ballsFaced((Integer)values.get("ballsFaced"))
                .isOut((Boolean)values.get("isOut"))
                .build();
        service.update(newBatmsan);
        Batsman updateBatsman = service.read("1");
        assertEquals("Dill",updateBatsman.getLastName());
    }

    @Test
    public void delete() {

        service.delete("1");
        Batsman batsman = service.read("1");
        assertNull(batsman);
    }
}