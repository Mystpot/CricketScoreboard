package com.gareth.controllers;

import com.gareth.model.Extras;
import com.gareth.services.Impl.ExtrasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping(path="/extras")
public class ExtrasController {

    @Autowired
    private ExtrasServiceImpl extrasService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Extras> getAllExtras()

    {
        return extrasService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ResponseEntity addExtras(@RequestBody Extras extras){

        if(StringUtils.isEmpty(extras.getMatchID()) || StringUtils.isEmpty(extras.getTotalWides()) || StringUtils.isEmpty(extras.getTotalNoballs()))
        {
            return new ResponseEntity("Need extra information", HttpStatus.NO_CONTENT);

        }
        extrasService.create(extras);
        return new ResponseEntity(extras, HttpStatus.OK);
    }

    @RequestMapping(value="/find/{totalScoreID}")
    public @ResponseBody ResponseEntity
        /*Optional<Batsman>*/ findExtras(@PathVariable("extrasID") Integer extrasID)
    {
        Optional<Extras> extras = extrasService.readByID(extrasID);

        if(!extras.isPresent())
        {
            return new ResponseEntity("No extras found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(extras, HttpStatus.OK);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public ResponseEntity updateExtras(@RequestBody Extras extras)
    {
        if(StringUtils.isEmpty(extras.getExtrasID()) || StringUtils.isEmpty(extras.getMatchID()) || StringUtils.isEmpty(extras.getTotalNoballs()) || StringUtils.isEmpty(extras.getTotalWides()))
        {
            return new ResponseEntity("Need extra information", HttpStatus.NO_CONTENT);
        }
        extrasService.update(extras);
        return new ResponseEntity(extras, HttpStatus.OK);
    }

    @RequestMapping(value="/delete/{extrasID}", method = RequestMethod.DELETE)
    public void deleteExtras(@PathVariable Extras extrasID)
    {
        extrasService.delete(extrasID);
    }
}
