package com.gareth.repositories;

import com.gareth.model.Extras;

public interface ExtrasRepository {

    Extras create(Extras extras);

    Extras read(int totalWides);

    Extras update(Extras extras);

    void delete(int totalWides);
}
