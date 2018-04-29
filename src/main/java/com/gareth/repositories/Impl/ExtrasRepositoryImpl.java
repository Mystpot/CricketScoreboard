package com.gareth.repositories.Impl;

import com.gareth.model.Extras;
import com.gareth.model.TotalScore;
import com.gareth.repositories.ExtrasRepository;
import com.gareth.repositories.TotalScoreRepository;

import java.util.HashMap;
import java.util.Map;

public class ExtrasRepositoryImpl implements ExtrasRepository {

    private static ExtrasRepositoryImpl repository = null;

    private Map<Integer, Extras> extrasTable;

    private ExtrasRepositoryImpl() {
        extrasTable = new HashMap<Integer, Extras>();
    }

    public static ExtrasRepositoryImpl getInstance() {
        if(repository == null)
            repository = new ExtrasRepositoryImpl();
        return repository;
    }

    public Extras create (Extras extras) {
        extrasTable.put(extras.getTotalWides(),extras);
        Extras dbExtras = extrasTable.get(extras.getTotalWides());
        return dbExtras;
    }

    public Extras read(int totalWides)
    {
        Extras extras = extrasTable.get(totalWides);
        return extras;
    }

    public Extras update(Extras extras)
    {
        extrasTable.put(extras.getTotalWides(),extras);
        Extras dbExtras = extrasTable.get(extras.getTotalWides());
        return dbExtras;
    }

    public void delete(int totalWides)
    {
        extrasTable.remove(totalWides);
    }
}
