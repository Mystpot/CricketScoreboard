package com.gareth.repositories.Impl;

import com.gareth.model.Bowler;
import com.gareth.repositories.BowlerRepository;

import java.util.HashMap;
import java.util.Map;

public class BowlerRepositoryImpl implements BowlerRepository
{
    private static BowlerRepositoryImpl repository = null;

    private Map<String, Bowler> bowlerTable;

    private BowlerRepositoryImpl() {
        bowlerTable = new HashMap<String, Bowler>();
    }

    public static BowlerRepositoryImpl getInstance() {
        if(repository == null)
            repository = new BowlerRepositoryImpl();
        return repository;
    }

    public Bowler create (Bowler bowler) {
        bowlerTable.put(bowler.getBowlersID(),bowler);
        Bowler dbBowler = bowlerTable.get(bowler.getBowlersID());
        return dbBowler;
    }

    public Bowler read(String bowlersID)
    {
        Bowler bowler = bowlerTable.get(bowlersID);
        return bowler;
    }

    public Bowler update(Bowler bowler)
    {
        bowlerTable.put(bowler.getBowlersID(),bowler);
        Bowler dbBowler = bowlerTable.get(bowler.getBowlersID());
        return dbBowler;
    }

    public void delete(String bowlerID)
    {
        bowlerTable.remove(bowlerID);
    }




}
