package com.gareth.model;

import java.io.Serializable;

public class TotalScore implements Serializable {

    private int totalScore;
    private int totalWickets;
    private double totalOvers;


    public int getTotalScore() {
        return totalScore;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public double getTotalOvers() {
        return totalOvers;
    }

    private TotalScore ()
    {

    }

    private TotalScore(Builder builder)
    {
        this.totalScore = builder.totalScore;
        this.totalOvers = builder.totalOvers;
        this.totalWickets = builder.totalWickets;
    }

    public static class Builder
    {
        private int totalScore;
        private int totalWickets;
        private double totalOvers;

        public Builder totalScore(int value)
        {
            this.totalScore = value;
            return this;
        }

        public Builder totalWickets(int value)
        {
            this.totalWickets = value;
            return this;
        }

        public Builder totalOvers(double value)
        {
            this.totalOvers = value;
            return this;
        }

        public TotalScore build() {
            return new TotalScore(this);
        }
    }
}
