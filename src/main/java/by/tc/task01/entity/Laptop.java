package by.tc.task01.entity;

public class Laptop extends Appliance {
    private final double BATTERY_CAPACITY;
    private final String OS;
    private final int MEMORY_ROM;
    private final int SYSTEM_MEMORY;
    private final double CPU;
    private final double DISPLAY_INCHES;

    public Laptop(double BATTERY_CAPACITY, String OS, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, double DISPLAY_INCHES) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
    }

    public double getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public String getOS() {
        return OS;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public int getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public double getCPU() {
        return CPU;
    }

    public double getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }
}


