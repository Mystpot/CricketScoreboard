package com.gareth.services.Impl;

import com.gareth.model.Batsman;
import com.gareth.repositories.BatsmanRepository;
import com.gareth.services.BatsmanService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service
public class BatsmanServiceImpl implements BatsmanService {

    @Autowired
    private BatsmanRepository batsmanRepository;

    @Override
    public Batsman create(Batsman batsman)
     {
      return batsmanRepository.save(batsman);
     }

     @Override
    public Optional<Batsman> readByID(Integer batsmanID)
     {
         return batsmanRepository.findById(batsmanID);
     }

     @Override
    public Set<Batsman> readAll()
     {
         Iterable<Batsman> batsmen = batsmanRepository.findAll();
         Set batsmanSet = new HashSet();
         for(Batsman batsman:batsmen)
         {
             batsmanSet.add(batsman);
         }
         return batsmanSet;
     }

     @Override
    public Batsman update(Batsman batsman)
     {
         return batsmanRepository.save(batsman);
     }

     @Override
    public void delete(Batsman batsmanID)
     {
         batsmanRepository.delete(batsmanID);
     }

     @Override
    public void deleteAll()
     {
         batsmanRepository.deleteAll();
     }
}
