package by.tc.task01.entity;

public class Oven extends Appliance {
   private final int POWER_CONSUMPTION;
   private final double WEIGHT;
   private final int CAPACITY;
   private final double DEPTH;
   private final double HEIGHT;
   private final double WIDTH;

    public Oven(int POWER_CONSUMPTION, double WEIGHT, int CAPACITY, double DEPTH, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.CAPACITY = CAPACITY;
        this.DEPTH = DEPTH;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }
}
