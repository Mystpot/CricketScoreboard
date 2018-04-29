package com.gareth.model;

import java.io.Serializable;

public class Extras implements Serializable {

    private int totalWides;
    private int totalByes;
    private int totalNoballs;


    public int getTotalWides() {
        return totalWides;
    }

    public int getTotalByes() {
        return totalByes;
    }

    public double getTotalNoballs() {
        return totalNoballs;
    }

    private Extras ()
    {

    }

    private Extras(Builder builder)
    {
        this.totalWides = builder.totalWides;
        this.totalByes = builder.totalByes;
        this.totalNoballs = builder.totalNoballs;
    }

    public static class Builder
    {
        private int totalWides;
        private int totalByes;
        private int totalNoballs;

        public Builder totalWides(int value)
        {
            this.totalWides = value;
            return this;
        }

        public Builder totalByes(int value)
        {
            this.totalByes = value;
            return this;
        }

        public Builder totalNoballs(int value)
        {
            this.totalNoballs = value;
            return this;
        }

        public Extras build() {
            return new Extras(this);
        }
    }
}
