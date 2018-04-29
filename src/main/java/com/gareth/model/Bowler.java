package com.gareth.model;

import java.io.Serializable;

/**
 *
 */
public class Bowler implements Serializable {

    private String bowlersID;
    private String firstName;
    private String lastName;
    private int totalWickets;
    private int runsConceded;
    private int oversBowled;


    public String getBowlersID() {
        return bowlersID;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public int getRunsConceded() {
        return runsConceded;
    }

    public int getOversBowled() {
        return oversBowled;
    }

    private Bowler() {

    }

    private Bowler(Builder builder)
    {
        this.bowlersID = builder.bowlersID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.totalWickets = builder.totalWickets;
        this.runsConceded = builder.runsConceded;
        this.oversBowled = builder.oversBowled;
    }

    public static class Builder
    {
        private String bowlersID;
        private String firstName;
        private String lastName;
        private int totalWickets;
        private int runsConceded;
        private int oversBowled;

        public Builder bowlersID(String value)
        {
            this.bowlersID = value;
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

        public Builder totalWickets(int value)
        {
            this.totalWickets = value;
            return this;
        }

        public Builder runsConceded(int value)
        {
            this.runsConceded = value;
            return this;
        }

        public Builder oversBowled(int value)
        {
            this.oversBowled = value;
            return this;
        }

        public Builder copy(Bowler value){
            this.bowlersID = value.bowlersID;
            this.firstName= value.firstName;
            this.lastName=value.lastName;
            this.totalWickets = value.totalWickets;
            this.runsConceded = value.runsConceded;
            this.oversBowled = value.oversBowled;
            return this;
        }

        public Bowler build(){
            return new Bowler(this);
        }

    }
}
