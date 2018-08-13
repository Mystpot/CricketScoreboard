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
    public TotalScore create(TotalScore totalScore)
    {
        return totalScoreRepository.save(totalScore);
    }

    @Override
    public Optional<TotalScore> readByID(Integer totalScoreID)
    {
        return totalScoreRepository.findById(totalScoreID);
    }

    @Override
    public Set<TotalScore> readAll()
    {
        Iterable<TotalScore> totalScores = totalScoreRepository.findAll();
        Set tsSet = new HashSet();
        for(TotalScore totalScore:totalScores)
        {
            tsSet.add(totalScore);
        }
        return tsSet;
    }

    @Override
    public TotalScore update(TotalScore totalScore)
    {
        return totalScoreRepository.save(totalScore);
    }

    @Override
    public void delete(TotalScore totalScore)
    {
        totalScoreRepository.delete(totalScore);
    }
}


