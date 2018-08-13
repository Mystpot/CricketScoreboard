package com.gareth.services;

import com.gareth.model.Batsman;

import java.util.Optional;
import java.util.Set;

public interface BatsmanService {

    public Batsman create(Batsman batsman);

    public Optional<Batsman> readByID(Integer batsmanID);

    public Set<Batsman> readAll();

    public Batsman update(Batsman batsman);

    public void delete(Batsman batsmanID);

    public void deleteAll();


}
