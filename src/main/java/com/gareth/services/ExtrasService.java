package com.gareth.services;

import com.gareth.model.Extras;
import com.gareth.model.TotalScore;

public interface ExtrasService  {


    Extras create(Extras extras);

    Extras read(int totalWides);

    Extras update(Extras extras);

    void delete(int totalWides);
}
