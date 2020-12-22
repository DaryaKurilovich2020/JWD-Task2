package by.tc.task01.entity;

import java.awt.*;
import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable {
    private int batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private int fleshMemoryCapacity;
    private String color;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFleshMemoryCapacity() {
        return fleshMemoryCapacity;
    }

    public void setFleshMemoryCapacity(int fleshMemoryCapacity) {
        this.fleshMemoryCapacity = fleshMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TabletPC(int batteryCapacity, double displayInches, int memoryRom, int fleshMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.fleshMemoryCapacity = fleshMemoryCapacity;
        this.color = color;
    }

    public TabletPC() {
    }
}
