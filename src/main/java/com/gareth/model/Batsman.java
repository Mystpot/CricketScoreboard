package com.gareth.model;

import java.io.Serializable;

public class Batsman implements Serializable {

    private String batsmanID;
    private String firstName;
    private String lastName;
    private String bowledBy;
    private int totalScore;
    private int ballsFaced;
    private boolean isOut;

    public String getBatsmanID() {
        return batsmanID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBowledBy() {
        return bowledBy;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public boolean getIsOut() {
        return isOut;
    }



    private Batsman() {

    }

    private Batsman(Builder builder)
    {
        this.batsmanID = builder.batsmanID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.bowledBy = builder.bowledBy;
        this.totalScore = builder.totalScore;
        this.ballsFaced = builder.ballsFaced;
        this.isOut = builder.isOut;
    }



    public static class Builder{
        private String batsmanID;
        private String firstName;
        private String lastName;
        private String bowledBy;
        private int totalScore;
        private int ballsFaced;
        private boolean isOut;

        public Builder batsmanID(String value)
        {
            this.batsmanID = value;
            return this;
        }

        public Builder firstName(String value)
        {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value)
        {
            this.lastName = value;
            return this;
        }

        public Builder bowledBy(String value)
        {
            this.bowledBy = value;
            return this;
        }

        public Builder totalScore(int value)
        {
            this.totalScore = value;
            return this;
        }

        public Builder ballsFaced(int value)
        {
            this.ballsFaced = value;
            return this;
        }

        public Builder isOut(boolean value)
        {
            this.isOut = value;
            return this;
        }

        public Batsman build(){
            return new Batsman(this);
        }
    }
}
