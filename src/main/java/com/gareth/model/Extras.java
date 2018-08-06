package com.gareth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Extras implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer extrasID;
    private String matchID;
    private String totalWides;
    private String totalByes;
    private String totalNoballs;


    public Integer getExtrasID() {
        return extrasID;
    }

    public String getMatchID() {
        return matchID;
    }
    public String getTotalWides() {
        return totalWides;
    }

    public String getTotalByes() {
        return totalByes;
    }

    public String getTotalNoballs() {
        return totalNoballs;
    }

    private Extras ()
    {

    }

    private Extras(Builder builder)
    {
        this.extrasID = builder.extrasID;
        this.matchID = builder.matchID;
        this.totalWides = builder.totalWides;
        this.totalByes = builder.totalByes;
        this.totalNoballs = builder.totalNoballs;
    }


    public static class Builder
    {
        private Integer extrasID;
        private String matchID;
        private String totalWides;
        private String totalByes;
        private String totalNoballs;

        public Builder extrasID(Integer value)
        {
            this.extrasID = value;
            return this;
        }

        public Builder matchID(String value)
        {
            this.matchID = value;
            return this;
        }

        public Builder totalWides(String value)
        {
            this.totalWides = value;
            return this;
        }

        public Builder totalByes(String value)
        {
            this.totalByes = value;
            return this;
        }

        public Builder totalNoballs(String value)
        {
            this.totalNoballs = value;
            return this;
        }

        public Extras build() {
            return new Extras(this);
        }
    }
}
