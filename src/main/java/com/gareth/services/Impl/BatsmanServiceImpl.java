package com.gareth.services.Impl;

import com.gareth.model.Batsman;
import com.gareth.repositories.BatsmanRepository;
import com.gareth.repositories.Impl.BatsmanRepositoryImpl;
import com.gareth.services.BatsmanService;

public class BatsmanServiceImpl implements BatsmanService {

    private static BatsmanServiceImpl service = null;

    BatsmanRepository repository = BatsmanRepositoryImpl.getInstance();

    public static BatsmanServiceImpl getInstance() {
        if(service == null)
            service = new BatsmanServiceImpl();
        return service;
    }

    public Batsman create(Batsman batsman)
    {
        return repository.create(batsman);
    }

    public Batsman read(String batsmanID)
    {
        return repository.read(batsmanID);
    }

    public Batsman update(Batsman batsman)
    {
        return repository.update(batsman);
    }

    public void delete(String batsmanID)
    {
        repository.delete(batsmanID);
    }


}
