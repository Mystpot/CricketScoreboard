package com.gareth.services.Impl;

import com.gareth.factories.ExtrasFactory;
import com.gareth.model.Extras;
import com.gareth.repositories.ExtrasRepository;
import com.gareth.services.ExtrasService;
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
public class ExtrasServiceImpl implements ExtrasService {

    @Autowired
    private ExtrasRepository extrasRepository;

    @Override
    public Extras create(Extras extras)
    {
        return extrasRepository.save(extras);
    }

    @Override
    public Optional<Extras> readByID(Integer extrasID)
    {
        return extrasRepository.findById(extrasID);
    }

    @Override
    public Set<Extras> readAll()
    {
        Iterable<Extras> extrass = extrasRepository.findAll();
        Set extrasSet = new HashSet();
        for(Extras extras:extrass)
        {
            extrasSet.add(extras);
        }
        return extrasSet;
    }

    @Override
    public Extras update(Extras extras)
    {
        return extrasRepository.save(extras);
    }

    @Override
    public void delete(Extras extrasID)
    {
        extrasRepository.delete(extrasID);
    }
}
