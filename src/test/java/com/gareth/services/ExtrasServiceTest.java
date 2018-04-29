package com.gareth.services;

import com.gareth.factories.ExtrasFactory;
import com.gareth.factories.TotalScoreFactory;
import com.gareth.model.Extras;
import com.gareth.model.TotalScore;
import com.gareth.services.Impl.ExtrasServiceImpl;
import com.gareth.services.Impl.TotalScoreServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExtrasServiceTest {

    ExtrasService service;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        service = new ExtrasServiceImpl();
        values = new HashMap<String, Object>();
        values.put("totalWides", 5);
        values.put("totalByes", 0);
        values.put("totalNoballs", 0);

    }

    @Test
    public void create() {
        Extras extras = ExtrasFactory.getExtras(values);
        service.create(extras);
        assertEquals(5, extras.getTotalWides());

    }

    @Test
    public void read() {

        Extras readExtras = service.read(5);
        assertEquals(5, readExtras.getTotalWides());


    }

    @Test
    public void update() {

        Extras extras = service.read(5);
        Extras newExtras = new Extras.Builder()
                .totalWides((Integer)values.get("totalWides"))
                .totalByes((Integer) values.get("totalByes"))
                .totalNoballs((Integer)values.get("totalNoballs"))
                .build();
        service.update(newExtras);
        Extras updateExtras = service.read(5);
        assertEquals(5,updateExtras.getTotalWides());
    }

    @Test
    public void delete() {

        service.delete(5);
        Extras extras = service.read(5);
        assertNull(extras);
    }

}