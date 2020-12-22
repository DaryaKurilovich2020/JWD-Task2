package by.tc.task01.entity;

import java.awt.*;

public class TabletPC extends Appliance {
    private final int BATTERY_CAPACITY;
    private final double DISPLAY_INCHES;
    private final int MEMORY_ROM;
    private final int FLASH_MEMORY_CAPACITY;
    private final String  COLOR;

    public TabletPC(int BATTERY_CAPACITY, double DISPLAY_INCHES, int MEMORY_ROM, int FLASH_MEMORY_CAPACITY, String COLOR) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
        this.MEMORY_ROM = MEMORY_ROM;
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
        this.COLOR = COLOR;
    }

    public int getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public double getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public int getFLASH_MEMORY_CAPACITY() {
        return FLASH_MEMORY_CAPACITY;
    }

    public String getCOLOR() {
        return COLOR;
    }
}
