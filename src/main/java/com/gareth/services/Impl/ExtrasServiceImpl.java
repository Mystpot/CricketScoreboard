package com.gareth.services.Impl;

import com.gareth.model.Extras;
import com.gareth.repositories.ExtrasRepository;


import com.gareth.repositories.Impl.ExtrasRepositoryImpl;
import com.gareth.services.ExtrasService;


public class ExtrasServiceImpl implements ExtrasService {

    private static ExtrasServiceImpl service = null;

    ExtrasRepository repository = ExtrasRepositoryImpl.getInstance();

    public static ExtrasServiceImpl getInstance(){
        if(service == null)
            service = new ExtrasServiceImpl();
        return service;
    }

    public Extras create(Extras extras)
    {
        return repository.create(extras);
    }

    public Extras read(int totalWides)
    {
        return repository.read(totalWides);
    }


    public Extras update(Extras extras)
    {
        return repository.update(extras);
    }

    public void delete(int totalWides)
    {
        repository.delete(totalWides);
    }
}
