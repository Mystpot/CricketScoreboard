package com.gareth.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class TotalScore implements Serializable {

    @Id
    private Integer totalScoreID;
    private String matchID;
    private String totalScore;
    private String totalWickets;
    private String totalOvers;


    public Integer getTotalScoreID() {
        return totalScoreID;
    }

    public String getMatchID() {
        return matchID;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public String getTotalWickets() {
        return totalWickets;
    }

    public String getTotalOvers() {
        return totalOvers;
    }

    private TotalScore ()
    {

    }

    private TotalScore(Builder builder)
    {
        this.totalScoreID = builder.totalScoreID;
        this.matchID = builder.matchID;
        this.totalScore = builder.totalScore;
        this.totalOvers = builder.totalOvers;
        this.totalWickets = builder.totalWickets;
    }

    public static class Builder
    {
        private Integer totalScoreID;
        private String matchID;
        private String totalScore;
        private String totalWickets;
        private String totalOvers;


        public Builder totalScoreID(Integer value)
        {
            this.totalScoreID = value;
            return this;
        }

        public Builder matchID(String value)
        {
            this.matchID = value;
            return this;
        }


        public Builder totalScore(String value)
        {
            this.totalScore = value;
            return this;
        }

        public Builder totalWickets(String value)
        {
            this.totalWickets = value;
            return this;
        }

        public Builder totalOvers(String value)
        {
            this.totalOvers = value;
            return this;
        }

        public TotalScore build() {
            return new TotalScore(this);
        }
    }
}
