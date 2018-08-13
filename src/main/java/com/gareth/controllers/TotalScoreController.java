package com.gareth.controllers;

import com.gareth.factories.TotalScoreFactory;
import com.gareth.model.TotalScore;
import com.gareth.services.Impl.TotalScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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

    //@RequestMapping(value="/add", method = RequestMethod.GET)
    @GetMapping(path="/add")
    public @ResponseBody String addTotalScore(@RequestParam Integer totalScoreID, @RequestParam String matchID, @RequestParam String totalScore,
                                             @RequestParam String totalWickets, @RequestParam String totalOvers){

        TotalScore tScore = TotalScoreFactory.getTotalScore(totalScoreID, matchID, totalScore, totalWickets, totalOvers);

        totalScoreService.create(tScore);

        return "Total Score added at row: " + tScore.getTotalScoreID();
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
    public void deleteTotalScore(@PathVariable TotalScore totalScore)
    {
        totalScoreService.delete(totalScore);

    }
}
