package com.gareth.controllers;

import com.gareth.factories.TotalScoreFactory;
import com.gareth.model.TotalScore;
import com.gareth.services.Impl.TotalScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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
    public ResponseEntity addTotalScore(@RequestBody TotalScore totalScore){

        if(StringUtils.isEmpty(totalScore.getMatchID()) || StringUtils.isEmpty(totalScore.getTotalScore()) || StringUtils.isEmpty(totalScore.getTotalWickets()) || StringUtils.isEmpty(totalScore.getTotalOvers()))
        {
            return new ResponseEntity("Need extra information", HttpStatus.NO_CONTENT);

        }
        totalScoreService.create(totalScore);
        return new ResponseEntity(totalScore, HttpStatus.OK);
    }

    @RequestMapping(value="/find/{totalScoreID}")
    public @ResponseBody ResponseEntity
        /*Optional<Batsman>*/ findBatsman(@PathVariable("totalScoreID") Integer totalScoreID)
    {
        Optional<TotalScore> totalScore = totalScoreService.readByID(totalScoreID);

        if(!totalScore.isPresent())
        {
            return new ResponseEntity("No total score found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(totalScore, HttpStatus.OK);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public ResponseEntity updateTotalScore(@RequestBody TotalScore totalScore)
    {

        if(StringUtils.isEmpty(totalScore.getTotalScoreID()) || StringUtils.isEmpty(totalScore.getMatchID()) || StringUtils.isEmpty(totalScore.getTotalScore()) || StringUtils.isEmpty(totalScore.getTotalOvers())
                || StringUtils.isEmpty(totalScore.getTotalWickets()))
        {
            return new ResponseEntity("Need extra information", HttpStatus.NO_CONTENT);
        }

        totalScoreService.update(totalScore);
        return new ResponseEntity(totalScore, HttpStatus.OK);
    }

    @RequestMapping(value="/delete/{totalScoreID}", method = RequestMethod.DELETE)
    public void deleteTotalScore(@PathVariable TotalScore totalScore)
    {
        totalScoreService.delete(totalScore);

    }
}
