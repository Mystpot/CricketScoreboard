package com.gareth.controllers;

import com.gareth.model.Extras;
import com.gareth.services.Impl.ExtrasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public void addExtras(@RequestBody Extras extras){
        extrasService.create(extras);
    }

    @RequestMapping(value="/find")
    public @ResponseBody
    Optional<Extras> findExtras(Integer extrasID)
    {
        return extrasService.readByID(extrasID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateExtras(@RequestBody Extras extras)
    {
        extrasService.update(extras);
    }

    @RequestMapping(value="/delete/{extrasID}", method = RequestMethod.DELETE)
    public void deleteExtras(@PathVariable Extras extrasID)
    {
        extrasService.delete(extrasID);
    }
}
