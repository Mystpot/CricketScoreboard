package com.gareth.services.Impl;

import com.gareth.factories.TotalScoreFactory;
import com.gareth.model.TotalScore;
import com.gareth.repositories.TotalScoreRepository;
import com.gareth.services.TotalScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class TotalScoreServiceImpl implements TotalScoreService {

    @Autowired
    private TotalScoreRepository totalScoreRepository;

    @Override
    public TotalScore create(TotalScore extras)
    {
        return totalScoreRepository.save(extras);
    }

    @Override
    public Optional<TotalScore> readByID(Integer extrasID)
    {
        return totalScoreRepository.findById(extrasID);
    }

    @Override
    public Set<TotalScore> readAll()
    {
        Iterable<TotalScore> extrass = totalScoreRepository.findAll();
        Set extrasSet = new HashSet();
        for(TotalScore extras:extrass)
        {
            extrasSet.add(extras);
        }
        return extrasSet;
    }

    @Override
    public TotalScore update(TotalScore extras)
    {
        return totalScoreRepository.save(extras);
    }

    @Override
    public void delete(TotalScore extrasID)
    {
        totalScoreRepository.delete(extrasID);
    }
}


