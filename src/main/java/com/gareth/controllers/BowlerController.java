package com.gareth.controllers;

import com.gareth.model.Bowler;
import com.gareth.services.Impl.BowlerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
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
        public ResponseEntity addBowler(@RequestBody Bowler bowler){
            if(StringUtils.isEmpty(bowler.getMatchID()) || StringUtils.isEmpty(bowler.getFirstName()) || StringUtils.isEmpty(bowler.getLastName()))
            {
                return new ResponseEntity("Need extra information", HttpStatus.NO_CONTENT);

            }
        bowlerService.create(bowler);
            return new ResponseEntity(bowler, HttpStatus.OK);
        }

        @RequestMapping(value="/find/{bowlersID}")
        public @ResponseBody ResponseEntity
        findBowler(@PathVariable("bowlersID") Integer bowlersID)
        {
            Optional<Bowler> bowler = bowlerService.readByID(bowlersID);

            if(!bowler.isPresent())
            {
                return new ResponseEntity("No bowler found for batsman " + bowlersID, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity(bowler, HttpStatus.OK);
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
