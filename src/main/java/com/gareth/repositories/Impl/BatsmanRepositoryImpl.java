package com.gareth.repositories.Impl;

import com.gareth.model.Batsman;
import com.gareth.repositories.BatsmanRepository;

import java.util.HashMap;
import java.util.Map;

public class BatsmanRepositoryImpl implements BatsmanRepository {

    private static BatsmanRepositoryImpl repository = null;

    private Map<String,Batsman> batsmanTable;

    private BatsmanRepositoryImpl() {
        batsmanTable = new HashMap<String, Batsman>();
    }

    public static BatsmanRepositoryImpl getInstance() {
        if(repository == null)
            repository = new BatsmanRepositoryImpl();
        return repository;
    }

    public Batsman create (Batsman batsman) {
        batsmanTable.put(batsman.getBatsmanID(),batsman);
        Batsman dbBatsman = batsmanTable.get(batsman.getBatsmanID());
        return dbBatsman;
    }

    public Batsman read(String batsmanID)
    {
        Batsman batsman = batsmanTable.get(batsmanID);
        return batsman;
    }

    public Batsman update(Batsman batsman)
    {
        batsmanTable.put(batsman.getBatsmanID(),batsman);
        Batsman dbBatsman = batsmanTable.get(batsman.getBatsmanID());
        return dbBatsman;
    }

    public void delete(String batsmanID)
    {
        batsmanTable.remove(batsmanID);
    }



}
