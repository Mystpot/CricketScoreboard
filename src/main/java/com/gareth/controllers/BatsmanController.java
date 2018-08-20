package com.gareth.controllers;

import com.gareth.model.Batsman;
import com.gareth.services.Impl.BatsmanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
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
    public ResponseEntity addBatsman(@RequestBody Batsman batsman){

        if(StringUtils.isEmpty(batsman.getMatchID()) || StringUtils.isEmpty(batsman.getFirstName()) || StringUtils.isEmpty(batsman.getLastName()))
        {
            return new ResponseEntity("Need extra information", HttpStatus.NO_CONTENT);

        }
        batsmanService.create(batsman);
        return new ResponseEntity(batsman, HttpStatus.OK);

    }

    @RequestMapping(value="/find/{batsmanID}")
    public @ResponseBody ResponseEntity
    /*Optional<Batsman>*/ findBatsman(@PathVariable("batsmanID") Integer batsmanID)
    {
       Optional<Batsman> batsman = batsmanService.readByID(batsmanID);

       if(!batsman.isPresent())
       {
           return new ResponseEntity("No batsman found for batsman " + batsmanID, HttpStatus.NOT_FOUND);
       }
        return new ResponseEntity(batsman, HttpStatus.OK);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public ResponseEntity updateBatsman(@RequestBody Batsman batsman)
    {
        if(StringUtils.isEmpty(batsman.getBatsmanID()) || StringUtils.isEmpty(batsman.getMatchID()) || StringUtils.isEmpty(batsman.getFirstName()) || StringUtils.isEmpty(batsman.getLastName())
                || StringUtils.isEmpty(batsman.getBowledBy()) || StringUtils.isEmpty(batsman.getTotalScore()) || StringUtils.isEmpty(batsman.getBallsFaced()) || StringUtils.isEmpty(batsman.getIsOut()))
        {
            return new ResponseEntity("Need extra information", HttpStatus.NO_CONTENT);
        }


        batsmanService.update(batsman);
        return new ResponseEntity(batsman, HttpStatus.OK);
    }

    @RequestMapping(value="/delete/{batsmanID}", method = RequestMethod.DELETE)
    public void deleteBatsman(@PathVariable Batsman batsmanID)
    {
        batsmanService.delete(batsmanID);
    }

    @RequestMapping(value="/deleteAll", method = RequestMethod.DELETE)

        public void deleteAllBatsman()
        {
            batsmanService.deleteAll();
        }

}


