package com.gareth.services;

import com.gareth.model.Extras;
import com.gareth.model.TotalScore;

import java.util.Optional;
import java.util.Set;

public interface ExtrasService  {


    public Extras create(Extras extras);

    public Optional<Extras> readByID(Integer extrasID);

    public Set<Extras> readAll();

    public Extras update(Extras extras);

    public void delete(Extras extrasID);

}
