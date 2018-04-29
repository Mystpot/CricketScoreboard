package com.gareth.services.Impl;

import com.gareth.model.TotalScore;
import com.gareth.repositories.Impl.TotalScoreRepositoryImpl;
import com.gareth.repositories.TotalScoreRepository;
import com.gareth.services.TotalScoreService;

public class TotalScoreServiceImpl implements TotalScoreService {

    private static TotalScoreServiceImpl service = null;

    TotalScoreRepository repository = TotalScoreRepositoryImpl.getInstance();

    public static TotalScoreServiceImpl getInstance(){
        if(service == null)
            service = new TotalScoreServiceImpl();
        return service;
    }

    public TotalScore create(TotalScore totalScore)
    {
        return repository.create(totalScore);
    }

    public TotalScore read(int totalScore)
    {
        return repository.read(totalScore);
    }


    public TotalScore update(TotalScore totalScore)
    {
        return repository.update(totalScore);
    }

    public void delete(int totalScore)
    {
        repository.delete(totalScore);
    }
}
