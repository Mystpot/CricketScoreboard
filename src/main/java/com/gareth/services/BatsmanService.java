package com.gareth.services;

import com.gareth.model.Batsman;

public interface BatsmanService {

    Batsman create(Batsman batsman);
    Batsman read(String batsmanID);
    Batsman update(Batsman batsman);
    void delete (String batsmanID);
}
