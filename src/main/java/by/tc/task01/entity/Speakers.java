package by.tc.task01.entity;

import java.io.Serializable;

public class Speakers extends Appliance implements Serializable {
    private  int powerConsumption;
    private  int numberOfSpeakers;
    private double cordLength;
    private  String frequencyRange;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, double cordLength, String frequencyRange) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
        this.frequencyRange = frequencyRange;
    }

    public Speakers() {
    }
}
