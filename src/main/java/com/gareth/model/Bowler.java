package com.gareth.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 */
@Entity
public class Bowler implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer bowlersID;
    private String matchID;
    private String firstName;
    private String lastName;
    private String totalWickets;
    private String runsConceded;
    private String oversBowled;

    public String getMatchID() { return matchID; }

    public Integer getBowlersID() {
        return bowlersID;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getTotalWickets() {
        return totalWickets;
    }

    public String getRunsConceded() {
        return runsConceded;
    }

    public String getOversBowled() {
        return oversBowled;
    }

    private Bowler() {

    }

    private Bowler(Builder builder)
    {
        this.bowlersID = builder.bowlersID;
        this.matchID = builder.matchID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.totalWickets = builder.totalWickets;
        this.runsConceded = builder.runsConceded;
        this.oversBowled = builder.oversBowled;
    }

    public static class Builder
    {
        private String matchID;
        private Integer bowlersID;
        private String firstName;
        private String lastName;
        private String totalWickets;
        private String runsConceded;
        private String oversBowled;

        public Builder bowlersID(Integer value)
        {
            this.bowlersID = value;
            return this;
        }

        public Builder matchID(String value)
        {
            this.matchID = value;
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

        public Builder totalWickets(String value)
        {
            this.totalWickets = value;
            return this;
        }

        public Builder runsConceded(String value)
        {
            this.runsConceded = value;
            return this;
        }

        public Builder oversBowled(String value)
        {
            this.oversBowled = value;
            return this;
        }

        public Builder copy(Bowler value){
            this.matchID = value.matchID;
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
