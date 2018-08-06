package com.gareth.services;

import com.gareth.model.Bowler;

import java.util.Optional;
import java.util.Set;

public interface BowlerService {

    public Bowler create(Bowler bowler);

    public Optional<Bowler> readByID(Integer bowlerID);

    public Set<Bowler> readAll();

    public Bowler update(Bowler bowler);

    public void delete(Bowler bowlerID);
}
