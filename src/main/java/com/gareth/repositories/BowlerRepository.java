package com.gareth.repositories;

import com.gareth.model.Bowler;

public interface BowlerRepository {

    Bowler create(Bowler bowler);

    Bowler read(String bowlersID);

    Bowler update(Bowler bowler);

    void delete(String bowlersID);
}
