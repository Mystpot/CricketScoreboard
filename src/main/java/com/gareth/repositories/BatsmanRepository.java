package com.gareth.repositories;

import com.gareth.model.Batsman;

public interface BatsmanRepository {

    Batsman create(Batsman batsman);

    Batsman read(String batsmanID);

    Batsman update(Batsman batsman);

    void delete(String batsmanID);
}
