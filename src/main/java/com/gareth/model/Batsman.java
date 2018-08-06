package com.gareth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Batsman {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer batsmanID;
    private String matchID;
    private String firstName;
    private String lastName;
    private String bowledBy;
    private String totalScore;
    private String ballsFaced;
    private String isOut;

    public Integer getBatsmanID() {
        return batsmanID;
    }

    public String getMatchID() { return matchID; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBowledBy() {
        return bowledBy;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public String getBallsFaced() {
        return ballsFaced;
    }

    public String getIsOut() {
        return isOut;
    }



    private Batsman() {

    }

    private Batsman(Builder builder)
    {
        this.batsmanID = builder.batsmanID;
        this.matchID = builder.matchID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.bowledBy = builder.bowledBy;
        this.totalScore = builder.totalScore;
        this.ballsFaced = builder.ballsFaced;
        this.isOut = builder.isOut;
    }

    public static class Builder{
        private Integer batsmanID;
        private String matchID;
        private String firstName;
        private String lastName;
        private String bowledBy;
        private String totalScore;
        private String ballsFaced;
        private String isOut;


        public Builder matchID(String value)
        {
            this.matchID = value;
            return this;
        }

        public Builder batsmanID(Integer value)
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

        public Builder totalScore(String value)
        {
            this.totalScore = value;
            return this;
        }

        public Builder ballsFaced(String value)
        {
            this.ballsFaced = value;
            return this;
        }

        public Builder isOut(String value)
        {
            this.isOut = value;
            return this;
        }

        public Batsman build(){
            return new Batsman(this);
        }
    }
}
