package com.gareth.controllers;

import com.gareth.model.Batsman;
import com.gareth.services.Impl.BatsmanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path="/batsman")
public class BatsmanController {

    @Autowired
    private BatsmanServiceImpl batsmanService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Batsman> getAllBatsman()
    {
        return batsmanService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addBatsman(@RequestBody Batsman batsman){
        batsmanService.create(batsman);
    }

    @RequestMapping(value="/find")
    public @ResponseBody
    Optional<Batsman> findBatsman(Integer batsmanID)
    {
        return batsmanService.readByID(batsmanID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateBatsman(@RequestBody Batsman batsman)
    {
        batsmanService.update(batsman);
    }

    @RequestMapping(value="/delete/{batsmanID}", method = RequestMethod.DELETE)
    public void deleteBatsman(@PathVariable Batsman batsmanID)
    {
        batsmanService.delete(batsmanID);
    }
}


