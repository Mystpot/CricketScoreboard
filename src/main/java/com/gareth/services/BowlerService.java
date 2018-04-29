package com.gareth.services;

import com.gareth.model.Bowler;

public interface BowlerService {
    Bowler create(Bowler bowler);

    Bowler read(String bowlerID);

    Bowler update(Bowler bowler);

    void delete(String bowlerID);
}
