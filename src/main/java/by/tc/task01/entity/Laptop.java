package by.tc.task01.entity;

public class Laptop extends Appliancable {
    private final int BATTERY_CAPACITY;
    private final OS OS;
    private final int MEMORY_ROM;
    private final int SYSTEM_MEMORY;
    private final double CPU;
    private final int DISPLAY_INCHES;

    public Laptop(int BATTERY_CAPACITY, by.tc.task01.entity.OS OS, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, int DISPLAY_INCHES) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
    }
}

enum OS {
    WINDOWS,
    MACOS,
    LINUX;
}
