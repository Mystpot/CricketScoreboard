package com.gareth.controllers;

import com.gareth.model.TotalScore;
import com.gareth.services.Impl.TotalScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping(path="/totalscore")
public class TotalScoreController {

    @Autowired
    private TotalScoreServiceImpl totalScoreService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<TotalScore> getAllTotalScore()
    {
        return totalScoreService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addTotalScore(@RequestBody TotalScore totalScore){
        totalScoreService.create(totalScore);
    }

    @RequestMapping(value="/find")
    public @ResponseBody
    Optional<TotalScore> findTotalScore(Integer totalScoreID)
    {
        return totalScoreService.readByID(totalScoreID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateTotalScore(@RequestBody TotalScore totalScore)
    {
        totalScoreService.update(totalScore);
    }

    @RequestMapping(value="/delete/{totalScoreID}", method = RequestMethod.DELETE)
    public void deleteTotalScore(@PathVariable TotalScore totalScoreID)
    {
        totalScoreService.delete(totalScoreID);
    }
}
