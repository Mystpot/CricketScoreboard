package com.gareth.services.Impl;

import com.gareth.factories.BatsmanFactory;
import com.gareth.factories.BowlerFactory;
import com.gareth.model.Bowler;
import com.gareth.repositories.BowlerRepository;
import com.gareth.services.BowlerService;
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
public class BowlerServiceImpl implements BowlerService {

    @Autowired
    private BowlerRepository bowlerRepository;

    @Override
    public Bowler create(Bowler batsman)
    {
        return bowlerRepository.save(batsman);
    }

    @Override
    public Optional<Bowler> readByID(Integer bowlerID)
    {
        return bowlerRepository.findById(bowlerID);
    }

    @Override
    public Set<Bowler> readAll()
    {
        Iterable<Bowler> bowlers = bowlerRepository.findAll();
        Set bowlerSet = new HashSet();
        for(Bowler bowler:bowlers)
        {
            bowlerSet.add(bowler);
        }
        return bowlerSet;
    }

    @Override
    public Bowler update(Bowler bowler)
    {
        return bowlerRepository.save(bowler);
    }

    @Override
    public void delete(Bowler bowlerID)
    {
        bowlerRepository.delete(bowlerID);
    }
    }