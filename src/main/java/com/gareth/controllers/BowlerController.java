package com.gareth.controllers;

import com.gareth.model.Bowler;
import com.gareth.services.Impl.BowlerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path="/bowler")
public class BowlerController {


    @Autowired
    private BowlerServiceImpl bowlerService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Bowler> getAllBowlers()

    {
        return bowlerService.readAll();
    }

        @RequestMapping(value="/add", method = RequestMethod.POST)
        public void addBowler(@RequestBody Bowler bowler){
            bowlerService.create(bowler);
        }

        @RequestMapping(value="/find")
        public @ResponseBody
        Optional<Bowler> findBowler(Integer bowlerID)
        {
            return bowlerService.readByID(bowlerID);
        }

        @RequestMapping(value="/update", method = RequestMethod.PUT)
        public void updateBowler(@RequestBody Bowler bowler)
        {
            bowlerService.update(bowler);
        }

        @RequestMapping(value="/delete/{bowlerID}", method = RequestMethod.DELETE)
        public void deleteBowler(@PathVariable Bowler bowlerID)
        {
            bowlerService.delete(bowlerID);
        }
}
