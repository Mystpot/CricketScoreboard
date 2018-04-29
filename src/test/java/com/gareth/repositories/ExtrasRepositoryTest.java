package com.gareth.repositories;

import com.gareth.factories.ExtrasFactory;
import com.gareth.factories.TotalScoreFactory;
import com.gareth.model.Extras;
import com.gareth.model.TotalScore;
import com.gareth.repositories.Impl.ExtrasRepositoryImpl;
import com.gareth.repositories.Impl.TotalScoreRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExtrasRepositoryTest {


    Map<String, Object> values;
    ExtrasRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = ExtrasRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("totalWides", 0);
        values.put("totalByes", 0);
        values.put("totalNoballs", 0);
    }

    @Test
    public void create() {
        Extras extras = ExtrasFactory.getExtras(values);
        repository.create(extras);
        assertEquals(0, extras.getTotalWides());
    }

    @Test
    public void read() {
        Extras readExtras = repository.read(0);
        assertEquals(0, readExtras.getTotalWides());
    }

    @Test
    public void update() {

        Extras extras = repository.read(0);
        Extras newExtras = new Extras.Builder()
                .totalWides((Integer)values.get("totalWides"))
                .totalByes((Integer)values.get("totalByes"))
                .totalNoballs((Integer)values.get("totalNoballs"))
                .build();
        repository.update(newExtras);
        Extras updateExtras = repository.read(0);
        assertEquals(0, updateExtras.getTotalWides());
    }

    @Test
    public void delete() {
        repository.delete(0);
        Extras extras = repository.read(0);
        assertNull(extras);
    }
}