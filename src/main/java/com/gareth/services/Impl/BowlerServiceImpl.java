package com.gareth.services.Impl;

import com.gareth.model.Bowler;
import com.gareth.repositories.BowlerRepository;
import com.gareth.repositories.Impl.BowlerRepositoryImpl;
import com.gareth.services.BowlerService;

public class BowlerServiceImpl implements BowlerService {

    private static BowlerServiceImpl service = null;

    BowlerRepository repository = BowlerRepositoryImpl.getInstance();

    public static BowlerServiceImpl getInstance(){
        if(service == null)
        service = new BowlerServiceImpl();
        return service;
    }

    public Bowler create(Bowler bowler)
    {
        return repository.create(bowler);
    }

    public Bowler read(String bowlerID)
    {
        return repository.read(bowlerID);
    }


   public Bowler update(Bowler bowler)
   {
       return repository.update(bowler);
   }

   public void delete(String bowlerID)
    {
         repository.delete(bowlerID);
    }
}
